package co.simplon.profiles.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.profiles.entities.Language;

/**
 * Un "repository" dedie a l'acces a l'entite "Language" dont la clef primaire
 * est de type "Long".
 */
@Repository // Optional because JpaRepository already a "@Repository"
public interface LanguageRepository extends JpaRepository<Language, Long> {
    //
}
