package com.movies.entities;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

@Entity
public class Movie {

@Id
private String movieId;
private String overview;
private Set<String> genres;
private double popularity;
private String moviePictureUrl;

  public String getMovieId() {
    return movieId;
  }

  public String getOverview() {
    return overview;
  }

  public Set<String> getGenres() {
    return genres;
  }

  public double getPopularity() {
    return popularity;
  }

  public String getMoviePictureUrl() {
    return moviePictureUrl;
  }

  public void setMovieId(String movieId) {
    this.movieId = movieId;
  }

  public void setGenres(Set<String> genres) {
    this.genres = genres;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }

  public void setPopularity(double popularity) {
    this.popularity = popularity;
  }

  public void setMoviePictureUrl(String moviePictureUrl) {
    this.moviePictureUrl = moviePictureUrl;
  }

}
