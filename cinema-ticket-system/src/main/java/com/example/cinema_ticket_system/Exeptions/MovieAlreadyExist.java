package com.example.cinema_ticket_system.Exeptions;

public class MovieAlreadyExist extends RuntimeException {
	private static final long serialVersionUID = 87214071728310561L;

	public MovieAlreadyExist() {
		super("Movie is already exists with same name and language");
	}
}
