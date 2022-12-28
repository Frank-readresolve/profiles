package co.simplon.profiles.controllers;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.profiles.dtos.ProfileCreateDto;
import co.simplon.profiles.dtos.ProfileUpdateDto;
import co.simplon.profiles.dtos.ProfileView;
import co.simplon.profiles.services.ProfileService;

/**
 * Le controller qui expose tous les endpoints pour acceder aux services
 * associes a la collection de ressources de type "Profile".
 * <p>
 * Par convention, le nom du segment racine du chemin des endpoints du
 * controller est "profiles", autrement dit le type de ressource en minuscule et
 * au pluriel (car collection).
 * <p>
 * Typiquement un controller "injecte" un service correspondant. On le declare
 * par constructeur, c'est Spring qui instancie le service puis le controller
 * avec le service en parametre.
 * <p>
 * Chaque endpoint est associe par annotation a une methode Java. Le endpoint
 * est accessible en respectant le verbe HTTP (indique par annotation
 * "@XxxMapping") et le chemin declares, le chemin commence par le segment
 * racine puis, le cas echeant, le chemin specifique. Dans l'ensemble de
 * l'application, les endpoints doivent être uniques (endpoint = verbe +
 * chemin).
 * <p>
 * Par defaut spring retourne "200 OK" quand un service est rendu avec succes,
 * on peut specifier un autre statut si besoin avec l'annotation
 * "@ResponseStatus", comme par exemple une reponse qui ne contient pas de corps
 * doit avoir un status "204 NO CONTENT".
 * <p>
 * Les endpoints qui attendent une variable de chemin declarent la variable dans
 * le chemin de l'annotation "@XxxMapping" entre accolades et en argument de la
 * methode en respectant le type Java de la valeur attendue et precedee de
 * l'annotation "@PathVariable" avec en parametre le nom de la variable dans le
 * chemin.
 * <p>
 * Si les inputs qui sont envoyes par le client le sont dans le corps de la
 * requete HTTP, il faut l'indiquer en annotant l'argument avec "@RequestBody".
 * Un endpoint qui attend des inputs avec des contraintes de validation doit
 * activer la validation sur ces memes inputs. On doit annoter l'argument "DTO"
 * (inputs) avec "@Valid" sinon les ontraintes posees dans le DTO ne sont pas
 * verifiees.
 */
@RestController
@RequestMapping("/profiles")
@CrossOrigin // Temporaire
public class ProfileController {

    private ProfileService service;

    /**
     * Construit un objet {@code ProfileController} avec le service associe.
     * 
     * @param service le service a injecter dans ce controller
     */
    public ProfileController(ProfileService service) {
	this.service = service;
    }

    /**
     * Endpoint qui permet de creer un "Profile" si les inputs en arguments sont
     * valides.
     * <p>
     * En cas de succes retourne une reponse sans corps avec le statut HTTP "204
     * NO CONTENT".
     * 
     * @param inputs le DTO regroupant les inputs
     */
    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void create(@Valid @RequestBody ProfileCreateDto inputs) {
	service.create(inputs);
    }

    /**
     * Endpoint qui permet de modifier un "Profile" dont l'identifiant (id) est
     * specifie, et si les inputs en arguments sont valides.
     * <p>
     * En cas de succes retourne une reponse sans corps avec le statut HTTP "204
     * NO CONTENT".
     * 
     * @param inputs le DTO regroupant les inputs
     * @param id     l'identifiant unique du "Profile" a modifier
     */
    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@Valid @RequestBody ProfileUpdateDto inputs,
	    @PathVariable("id") Long id) {
	service.update(inputs, id);
    }

    /**
     * Retourne une collection de tous les "Profile". Chaque "Profile" est une
     * vue avec certaines proprietes de projetees.
     * 
     * @return une vue de l'ensemble des "Profile"
     */
    @GetMapping
    public Collection<ProfileView> getAll() {
	return service.getAll();
    }

    /**
     * Endpoint qui permet de supprimer le "Profile" dont l'identifiant (id) est
     * specifie.
     * <p>
     * En cas de succes retourne une reponse sans corps avec le statut HTTP "204
     * NO CONTENT".
     * 
     * @param id l'identifiant unique du "Profile" a supprimer
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
	service.delete(id);
    }
}
