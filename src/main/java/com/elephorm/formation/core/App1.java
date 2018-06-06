package com.elephorm.formation.core;

import com.elephorm.formation.core.controller.DefaultFilmController;
import com.elephorm.formation.core.entity.Film;

public class App1 {

	public static void main(String[] args) {
		Film film = new Film();
		System.out.println("Projet maven film !");

		DefaultFilmController defaultFilmController = new DefaultFilmController();
		defaultFilmController.registreFilmConsoleImput(film);
		defaultFilmController.listerFilmer();

	}

}
