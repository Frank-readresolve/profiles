package co.simplon.profiles.dtos;

import java.time.LocalDateTime;

/**
 * DTO qui represente la projection souhaitee pour se representer un "Profile".
 * <p>
 * Il s'agit d'une caracteristique de "Spring data", qui permet de declarer dans
 * une interface les proprietes de l'entite que l'on souhaite dans le resultat
 * de la requete.
 * <p>
 * Il faut respecter les conventions sur les "getters", donc prefixer la methode
 * par "get" ou "is" si c'est un booleen. Aussi les types et noms de proprietes
 * doivent correspondre aux types et noms des proprietes de l'entite qui sont
 * projetees.
 * <p>
 * Il n'est pas necessaire d'ecrire une classe concrete correspondante, c'est le
 * framework qui va ecrire une classe concrete a la volee, une classe qui
 * implemente cette interface.
 */
public interface ProfileView {

    Long getId();

    String getFirstName();

    String getLastName();

    LocalDateTime getCreatedAt();
}
