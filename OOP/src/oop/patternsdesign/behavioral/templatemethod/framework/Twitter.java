package oop.patternsdesign.behavioral.templatemethod.framework;

public class Twitter extends Network {

	public Twitter(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	@Override
	boolean logIn(String userName, String password) {
		System.out.println("\nChecking user's parameters");
		System.out.println("Name: "+this.userName);
		System.out.println("Password: ");
		for (int i = 0; i < this.password.length(); i++) {
			System.out.print("*");
		}
		simulateNetworkLatency();
		System.out.println("\n\nLogind sucess on Twitter");
		return true;
	}

	@Override
	boolean sendData(byte[] data) {
		boolean messagePosted = true;
		if(messagePosted)
			System.out.println("Message: '"+new String(data)+"' was posted on Twitter");
		
		return messagePosted;
	}

	@Override
	void logOut() {
		System.out.println("User: '"+userName+"' was logged out from Twitter");
	}

	private void simulateNetworkLatency() {
		try {
			int i = 0;
			System.out.println();
			while (i < 10) {
				System.out.print(".");
				Thread.sleep(500);
				i++;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}