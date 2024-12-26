package com.techiesbytes.entities;

import java.util.List;

public class User {
	private String name;
	private String password;
	private String hashPasswd;
	private List<Ticket> bookedTickets;
	private String userId;
	
	public User() {
		super();
	}
	public User(String name, String password, String hashPasswd, List<Ticket> bookedTickets, String userId) {
		super();
		this.name = name;
		this.password = password;
		this.hashPasswd = hashPasswd;
		this.bookedTickets = bookedTickets;
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHashPasswd() {
		return hashPasswd;
	}
	public void setHashPasswd(String hashPasswd) {
		this.hashPasswd = hashPasswd;
	}
	public List<Ticket> getBookedTickets() {
		return bookedTickets;
	}
	public void setBookedTickets(List<Ticket> bookedTickets) {
		this.bookedTickets = bookedTickets;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
    public List<Ticket> getTicketsBooked() {
        return bookedTickets;
    }

    public void printTickets(){
        for (int i = 0; i<bookedTickets.size(); i++){
            System.out.println(bookedTickets.get(i).getTicketInfo());
        }
    }
}
