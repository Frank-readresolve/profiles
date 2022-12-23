package co.simplon.profiles.services;

import java.util.Collection;

import co.simplon.profiles.dtos.ProfileCreateDto;
import co.simplon.profiles.dtos.ProfileUpdateDto;
import co.simplon.profiles.dtos.ProfileView;

public interface ProfileService {

    void create(ProfileCreateDto inputs);

    void update(ProfileUpdateDto inputs, Long id);

    Collection<ProfileView> getAll();

    void delete(Long id);
}
