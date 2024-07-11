package com.vitalia.vitaliaBE.dto;


public class Token {
     private final String accessToken;
     private final String username;
     
     public Token(String accessToken, String username) {
    	 this.accessToken = accessToken;
    	 this.username = username;
     }//contructor
	
	public String getAccessToken() {
		return accessToken;
	}//getacces

	public String getUsername() {
		return username;
	}
	
}//classtoken
