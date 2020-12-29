package com.movies.mongo;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

import com.mongodb.MongoClient;
import com.typesafe.config.ConfigFactory;

public class MorphiaUtil {
  private static Mongo mongo;
  private static Morphia morphia;
  private static Datastore datastore;

  public static Datastore getDatastore() {
    if (datastore == null) {
      initDatastore();
    }
    return datastore;
  }

  public static void initDatastore() {
    final Morphia morphia = new Morphia();
    // Tell Morphia where to find our models
    morphia.map(com.movies.entities.Movie.class);

    MongoClient mongoClient = new MongoClient(
        ConfigFactory.load().getString("mongodb.host"),
        ConfigFactory.load().getInt("mongodb.port"));

    datastore = morphia.createDatastore(
    mongoClient, ConfigFactory.load().getString("mongodb.database"));
  }

}
