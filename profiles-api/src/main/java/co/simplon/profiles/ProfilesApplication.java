package co.simplon.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe dite "application" car elle declare la methode main pour lancer
 * l'application.
 * <p>
 * On y ajoute rarement du code meme si c'est techniquement possible et parfois
 * justifie pour des elements de confirguration par exemple.
 * <p>
 * L'annotation "@SpringBootApplication" declenche un ensemble de traitements au
 * demarrage de l'application, comme le scan des packages et sous-packages.
 */
@SpringBootApplication
public class ProfilesApplication {

    public static void main(String[] args) {
	SpringApplication.run(ProfilesApplication.class, args);
    }
}
