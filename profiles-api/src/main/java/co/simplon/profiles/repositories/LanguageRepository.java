package co.simplon.profiles.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.profiles.entities.Language;

public interface LanguageRepository extends JpaRepository<Language, Long> {
    //
}
