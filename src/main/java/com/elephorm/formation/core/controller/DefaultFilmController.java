package com.elephorm.formation.core.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.elephorm.formation.core.entity.Film;
import com.elephorm.formation.core.service.FilmService;

public class DefaultFilmController {

	/*
	 * Le controleur Intancie les nos differents objet de Bean ensuite il fait
	 * appelle aux servic pour la creation des
	 */

	public void registreFilmConsoleImput(Film film) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le titre");
		String titre = sc.nextLine();
		System.out.println("Veuillez saisir le genre");
		String genre = sc.nextLine();
		System.out.println("Veuillez saisir nombre d'exemplaire !");
		int nbExple = sc.nextInt();
		// ====Extension le Film====

		film.setTitre(titre);
		film.setGenre(genre);
		film.setNbreExplaire(nbExple);
		// film.setNbExemplaire(nbExple);
		// Extension du servicc
		FilmService filmService = new FilmService();
		filmService.registerFilm(film);

	}

	public void listerFilmer() {

		// Lire le fichier

		try {
			FileReader fileRd = new FileReader("E:\\javaEE\\workspace\\core\\src\\main\\resources\\Film.txt");
			BufferedReader bis = new BufferedReader(fileRd);
			String line = bis.readLine();

			while (line != null) {
				System.out.println(line);
				line = bis.readLine();
			}
			bis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
