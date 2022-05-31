package oop.patternsdesign.behavioral.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profile {

	private String name;
	private String email;
	private Map<String, List<String>> contacs = new HashMap<String, List<String>>();
	
	public Profile(String email, String name, String... contacts) {
		this.email = email;
		this.name = name;
		
		for (String contact : contacts) {
			String[] parts = contact.split(":");
			String contactType = "friend",contactEmail;
			if(parts.length == 1)
				contactEmail = parts[0];
			else {
				contactType = parts[0];
				contactEmail = parts[1];
			}
			if(!this.contacs.containsKey(contactType))
				this.contacs.put(contactType, new ArrayList<String>());
			this.contacs.get(contactType).add(contactEmail);
		}
	}
	
	public String getEmail() {
		return email;
	}
		
	public String getName() {
		return name;
	}

	public List<String> getContacts(String contactType) {
		if(!this.contacs.containsKey(contactType))
			this.contacs.put(contactType, new ArrayList<String>());
		return contacs.get(contactType);
	}
}
