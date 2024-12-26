package com.techiesbytes.entities;

import java.util.Date;

public class Ticket {
	private String ticketId;
	private String UserId;
	private String source;
	private String destination;
	private String dateOfTravel;
	private Train train;
	
    public String getTicketInfo(){
        return String.format("Ticket ID: %s belongs to User %s from %s to %s on %s", ticketId, UserId, source, destination, dateOfTravel);
    }
	
	public Ticket() {
		super();
	}
	public Ticket(String ticketId, String userId, String source, String destination, String dateOfTravel, Train train) {
		super();
		this.ticketId = ticketId;
		UserId = userId;
		this.source = source;
		this.destination = destination;
		this.dateOfTravel = dateOfTravel;
		this.train = train;
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDateOfTravel() {
		return dateOfTravel;
	}
	public void setDateOfTravel(String dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}
	public Train getTrain() {
		return train;
	}
	public void setTrain(Train train) {
		this.train = train;
	}
	
	
}
