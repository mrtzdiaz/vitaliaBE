package com.vitalia.vitaliaBE.dto;


public class Token {
     private final String accessToken;
     
     public Token(String accessToken) {
    	 this.accessToken = accessToken;
     }//contructor
	
	public String getAccessToken() {
		return accessToken;
	}//getacces
	
}//classtoken
