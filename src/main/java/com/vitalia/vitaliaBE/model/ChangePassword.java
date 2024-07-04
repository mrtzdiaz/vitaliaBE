package com.vitalia.vitaliaBE.model;

public class ChangePassword {
	private String password;
	private String newPassword;
	
	public ChangePassword() {}
	
	public ChangePassword(String password, String newPassword) {
		this.password = password;
		this.newPassword = newPassword;
	}
	
	public String getPassword() {
		return password;
	}

	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	@Override
	public String toString() {
		return "ChangePassword [password=" + password + ", newPassword=" + newPassword + "]";
	}
}
