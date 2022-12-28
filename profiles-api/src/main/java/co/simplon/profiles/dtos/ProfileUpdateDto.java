package co.simplon.profiles.dtos;

import javax.validation.constraints.NotEmpty;

/**
 * DTO qui represente les inputs pour modifier un "Profile" avec ses contraintes
 * de validation.
 */
public class ProfileUpdateDto {

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    private boolean trainer;

    public ProfileUpdateDto() {
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

    public boolean isTrainer() {
	return trainer;
    }

    public void setTrainer(boolean trainer) {
	this.trainer = trainer;
    }

    @Override
    public String toString() {
	return "{firstName=" + firstName + ", lastName=" + lastName
		+ ", trainer=" + trainer + "}";
    }
}
