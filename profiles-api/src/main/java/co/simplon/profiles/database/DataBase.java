package co.simplon.profiles.database;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import co.simplon.profiles.entities.Profile;

public class DataBase {

    private static Long profileId = 0L;

    // K = type of key (Long)
    // V = type of value (Profile)
    private static final Map<Long, Profile> PROFILES = new HashMap<>();

    public static void saveProfile(Profile profile) {
	profileId++; // 1
	profile.setId(profileId);
	PROFILES.put(profileId, profile);
    }

    public static Collection<Profile> findAll() {
	return PROFILES.values();
    }

}
