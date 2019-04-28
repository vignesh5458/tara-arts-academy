package com.organization.tara.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;


public class Event {

	@Id
	private int eventId;
	
	private String eventName;
	
	private String eventDescription;
	
	private Date eventDate;
	
	private String typeOfEvent;
	
	private String venue;
	
	private boolean registrationOpen;
	
	private String eventGuidelines;

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public String getTypeOfEvent() {
		return typeOfEvent;
	}

	public void setTypeOfEvent(String typeOfEvent) {
		this.typeOfEvent = typeOfEvent;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public boolean isRegistrationOpen() {
		return registrationOpen;
	}

	public void setRegistrationOpen(boolean registrationOpen) {
		this.registrationOpen = registrationOpen;
	}

	public String getEventGuidelines() {
		return eventGuidelines;
	}

	public void setEventGuidelines(String eventGuidelines) {
		this.eventGuidelines = eventGuidelines;
	}
	
}
