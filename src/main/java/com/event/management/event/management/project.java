package com.event.management.event.management;

public class project {
	private String name;
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int i) {
		this.id =i ;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	private String type;
	private String date;
	private String venue;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
