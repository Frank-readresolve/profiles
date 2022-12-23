package co.simplon.profiles.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.profiles.dtos.ProfileView;
import co.simplon.profiles.entities.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

    Collection<ProfileView> findAllProjectedBy();
}
