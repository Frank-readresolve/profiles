package co.simplon.profiles.dtos;

public class ProfileUpdateDto {

    private String firstName;

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
	return "{firstName=" + firstName + ", lastName="
		+ lastName + ", trainer=" + trainer + "}";
    }

}
