package com.elephorm.formation.core.service;

import com.elephorm.formation.core.entity.Film;
import com.elephorm.formation.core.repository.FileFilmDao;

public class FilmService {

	/*
	 * Elle permet la creation des diff�rente service qui font appelles a la
	 * repository pour la persistance des donn�es
	 * 
	 */

	public void registerFilm(Film film) {
		FileFilmDao fileFilmDao = new FileFilmDao();
		fileFilmDao.save(film);
		System.out.println("Enregistrement du film !");

	}

}
