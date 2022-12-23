package co.simplon.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * Clase dite "application" car elle declare la methode main pour lancer
 * l'application.
 * <p>
 * On y ajoute rarement du code meme si c'est techniquement possible et parfois
 * justifie.
 *
 */
@SpringBootApplication
public class ProfilesApplication {

    public static void main(String[] args) {
	SpringApplication.run(ProfilesApplication.class, args);
    }
}
