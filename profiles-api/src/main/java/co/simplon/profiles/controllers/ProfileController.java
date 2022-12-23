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
 * 
 * Une classe dite "controller" car c'est le point d'entree de l'API et qu'elle
 * controle directement ou indirectement l'acces aux services de l'API.
 * <p>
 * On y retrouve la declaration des endpoints qui seront accessibles apres
 * demarrage de l'application.
 * <p>
 * 
 *
 */
// Indique a Spring que cette classe est un controller Rest:
@RestController
// Specifie le segment racine du chemin des endpoints de ce controller:
@RequestMapping("/profiles")
@CrossOrigin // Temporaire
public class ProfileController {

    private ProfileService service;

    public ProfileController(ProfileService service) {
	this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void create(@Valid @RequestBody ProfileCreateDto inputs) {
	service.create(inputs);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@RequestBody ProfileUpdateDto inputs,
	    @PathVariable("id") Long id) {
	service.update(inputs, id);
    }

    @GetMapping
    public Collection<ProfileView> getAll() {
	return service.getAll();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
	service.delete(id);
    }
}
