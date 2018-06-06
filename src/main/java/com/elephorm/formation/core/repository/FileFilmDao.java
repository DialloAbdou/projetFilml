package com.elephorm.formation.core.repository;

import java.io.File;
import java.io.FileWriter;

import com.elephorm.formation.core.entity.Film;

public class FileFilmDao {

	public void save(Film film) {

		try {
			// Persistance des donnée en format fichier

			File file = new File("E:\\javaEE\\workspace\\core\\src\\main\\resources\\Film.txt");// Creation des fichier
			FileWriter writer = new FileWriter(file);
			writer.write(film.getTitre() + " " + film.getGenre() + " " + film.getNbreExplaire());
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
