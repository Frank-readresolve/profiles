package co.simplon.profiles.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.profiles.dtos.ProfileView;
import co.simplon.profiles.entities.Profile;

/**
 * Un "repository" dedie a l'acces a l'entite "Profile" dont la clef primaire
 * est de type "Long".
 */
@Repository // Optional because JpaRepository already a "@Repository"
public interface ProfileRepository extends JpaRepository<Profile, Long> {

    // findAll = prefixe pour exprimer "je veux tout"
    // ProjectedBy = suffixe conventionnel, leve l'ambiguite car findAll tout
    // existe deja dans la hierachie de JpaRepository
    /**
     * Une methode qui retourne une projection de tous les "Profile".
     * <p>
     * Retourne une collection de "ProfileView" et non de "Profile", le
     * framework sait grace au type de retour de la methode qu'il faut proceder
     * a une projection telle que definie dans l'interface et non de toutes les
     * colonnes de la table "profiles".
     * 
     * @return une vue des "Profile"
     */
    Collection<ProfileView> findAllProjectedBy();
}
