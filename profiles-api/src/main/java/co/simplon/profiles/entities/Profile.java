package co.simplon.profiles.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "profiles")
public class Profile {

    // primary key
    @Id
    // how the value is generated
    // identity = handled by database (auto-incremented)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "trainer")
    private boolean trainer;

    @JoinColumn(name = "preferred_language_id")
    // One Language to Many Profiles
    // Many Profiles To One Language
    // One Profile To One Language
    @ManyToOne
    private Language preferredLanguage;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "last_updated_at")
    private LocalDateTime lastUpdatedAt;

    public Profile() {
	//
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
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

    public Language getPreferredLanguage() {
	return preferredLanguage;
    }

    public void setPreferredLanguage(Language preferredLanguage) {
	this.preferredLanguage = preferredLanguage;
    }

    public LocalDateTime getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
	this.createdAt = createdAt;
    }

    public LocalDateTime getLastUpdatedAt() {
	return lastUpdatedAt;
    }

    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
	this.lastUpdatedAt = lastUpdatedAt;
    }

    @Override
    public String toString() {
	return "{id=" + id + ", firstName=" + firstName + ", lastName="
		+ lastName + ", email=" + email + ", trainer=" + trainer
		+ ", preferredLanguage=" + preferredLanguage + ", createdAt="
		+ createdAt + ", lastUpdatedAt=" + lastUpdatedAt + "}";
    }
}
