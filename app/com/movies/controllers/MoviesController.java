package com.movies.controllers;

import play.mvc.*;
import com.movies.entities.Movie;
import com.movies.dal.MovieDao;
import play.libs.Json;
import java.util.List;
import java.util.ArrayList;

/**
 * This controller contains actions to handle API requests for movies
 */
public class MoviesController extends Controller {

  /**
   * An action that returns all movies
   */
  public Result getMovies() {
    List<Movie> movies = MovieDao.all();
    return ok(Json.toJson(movies));
  }

  /**
   * An action that returns the movie corresponding to given id
   */
  public Result getMovieById(final String movieId) {
    Movie movie = MovieDao.getMovieById(movieId);
    return ok(Json.toJson(movie));
  }

}
