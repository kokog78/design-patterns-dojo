package dojo.patterns.messenger;

public abstract class User {
	
	public abstract String getName();
	
	// TODO nem létező felhasználóhoz használható üres objektum (nobody) megírása singleton mintával
	// TODO isNobody statikus metódus megírása
	
	public static final User EVERYBODY = byName("EVERYBODY");
	
	public static boolean isEverybody(User user) {
		return user == EVERYBODY;
	}
	
	public static User byName(String name) {
		return new User() {
			@Override
			public String getName() {
				return name;
			}
		};
	}

}
