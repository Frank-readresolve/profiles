package co.simplon.profiles.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class ProfileCreateDto {

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotEmpty
    @Email
    private String email;

    private boolean trainer;

    private Long preferredLanguageId;

    public ProfileCreateDto() {
	super();
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public boolean isTrainer() {
	return trainer;
    }

    public void setTrainer(boolean trainer) {
	this.trainer = trainer;
    }

    public Long getPreferredLanguageId() {
	return preferredLanguageId;
    }

    public void setPreferredLanguageId(Long preferredLanguageId) {
	this.preferredLanguageId = preferredLanguageId;
    }

    @Override
    public String toString() {
	return "{firstName=" + firstName + ", lastName=" + lastName + ", email="
		+ email + ", trainer=" + trainer + ", preferredLanguageId="
		+ preferredLanguageId + "}";
    }
}
