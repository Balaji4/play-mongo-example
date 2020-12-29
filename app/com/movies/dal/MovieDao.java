package com.movies.dal;

import  com.movies.mongo.MorphiaUtil;
import  com.movies.entities.Movie;
import java.util.List;
import java.util.ArrayList;
import org.bson.types.ObjectId;

public class MovieDao {

  public static List<Movie> all() {
    if (MorphiaUtil.getDatastore() != null) {
      return MorphiaUtil.getDatastore().find(Movie.class).asList();
    } else {
      //throw new RuntimeException("Not working");
      return new ArrayList<Movie>();
    }
  }

  public static Movie getMovieById(String movieId) {
    //ObjectId objectId = new ObjectId(movieId);
    //return MorphiaUtil.getDatastore().get(Movie.class, objectId);
    return MorphiaUtil.getDatastore().get(Movie.class, movieId);
  }

  public static void create(Movie movie) {
    MorphiaUtil.getDatastore().save(movie);
  }

  public static void delete(String movieId) {
    //ObjectId objectId = new ObjectId(movieId);
    Movie movieToDelete = MorphiaUtil.getDatastore().get(Movie.class, movieId);
    if (movieToDelete != null) {
      MorphiaUtil.getDatastore().delete(movieToDelete);
    } else {
      //Logger.debug("ID No Found: " + movieId);
    }
  }
}
