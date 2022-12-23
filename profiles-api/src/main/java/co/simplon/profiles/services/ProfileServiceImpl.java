package co.simplon.profiles.services;

import java.time.LocalDateTime;
import java.util.Collection;

import org.springframework.stereotype.Service;

import co.simplon.profiles.dtos.ProfileCreateDto;
import co.simplon.profiles.dtos.ProfileUpdateDto;
import co.simplon.profiles.dtos.ProfileView;
import co.simplon.profiles.entities.Language;
import co.simplon.profiles.entities.Profile;
import co.simplon.profiles.repositories.LanguageRepository;
import co.simplon.profiles.repositories.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService {

    private ProfileRepository profiles;

    private LanguageRepository languages;

    public ProfileServiceImpl(ProfileRepository profiles,
	    LanguageRepository languages) {
	this.profiles = profiles;
	this.languages = languages;
    }

    @Override
    public void create(ProfileCreateDto inputs) {
	Profile profile = new Profile(); // entity / destination
	// Copy data from inputs to profile:
	String firstName = inputs.getFirstName();
	profile.setFirstName(firstName);
	profile.setLastName(inputs.getLastName());
	profile.setEmail(inputs.getEmail());
	profile.setTrainer(inputs.isTrainer());
	Long preferredLanguageId = inputs.getPreferredLanguageId();
	Language language = languages.getReferenceById(preferredLanguageId);
	profile.setPreferredLanguage(language);
	// Business logic, backend side:
	LocalDateTime createdAt = LocalDateTime.now();
	profile.setCreatedAt(createdAt); // void
	this.profiles.save(profile);
    }

    @Override
    public void update(ProfileUpdateDto inputs, Long id) {
	System.out.println("Updating profile with id=" + id);
	System.out.println("Inputs=" + inputs);
	//
	Profile entity = profiles.findById(id).get();
	System.out.println("Entity=" + entity);
	entity.setFirstName(inputs.getFirstName());
	entity.setLastName(inputs.getLastName());
	entity.setTrainer(inputs.isTrainer());
	LocalDateTime now = LocalDateTime.now();
	entity.setLastUpdatedAt(now);
	System.out.println("Entity=" + entity);
	profiles.save(entity);
    }

    @Override
    public Collection<ProfileView> getAll() {
	return profiles.findAllProjectedBy();
    }

    @Override
    public void delete(Long id) {
	profiles.deleteById(id);
    }
}
