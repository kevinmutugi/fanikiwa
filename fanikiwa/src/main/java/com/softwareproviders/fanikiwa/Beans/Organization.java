package com.softwareproviders.fanikiwa.Beans;

public class Organization {
	/*
	 *
	 * */
	private int OrganizationID;
	private String Name;
	private String Email;
	private String Address;
	
    public String getName() {
        return Name;
    }

    public void setName(String data) {
    	Name = data;
    }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String data) {
    	Email = data;
    }
    
    public String getAddress() {
        return Address;
    }

    public void setAddress(String data) {
    	Address = data;
    }

}
