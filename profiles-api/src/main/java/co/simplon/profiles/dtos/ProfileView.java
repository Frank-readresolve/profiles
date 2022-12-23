package co.simplon.profiles.dtos;

import java.time.LocalDateTime;

public interface ProfileView {

    Long getId();

    String getFirstName();

    String getLastName();

    LocalDateTime getCreatedAt();
}
