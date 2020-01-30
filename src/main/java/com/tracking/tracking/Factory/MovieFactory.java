package com.tracking.tracking.Factory;

import com.tracking.tracking.Model.DTO.MovieDTO;
import com.tracking.tracking.Model.Entity.MovieEntity;

public class MovieFactory {
   public static MovieEntity buildMovieEntity(MovieDTO movieDTO){
      MovieEntity movieEntity = new MovieEntity();
      movieEntity.setIdMovie(movieDTO.getIdMovie());
      movieEntity.setActors(movieDTO.getActors());
      movieEntity.setAwards(movieDTO.getAwards());
      movieEntity.setBoxoffice(movieDTO.getBoxoffice());
      movieEntity.setCountry(movieDTO.getCountry());
      movieEntity.setDirector(movieDTO.getDirector());
      movieEntity.setDvd(movieDTO.getDvd());
      movieEntity.setGenre(movieDTO.getDvd());
      movieEntity.setIdMovie(movieDTO.getIdMovie());
      movieEntity.setImdbid(movieDTO.getImdbid());
      movieEntity.setImdbrating(movieDTO.getImdbrating());
      movieEntity.setImdbvotes(movieDTO.getImdbvotes());
      movieEntity.setLanguage(movieDTO.getLanguage());
      movieEntity.setMetascore(movieDTO.getMetascore());
      movieEntity.setPlot(movieDTO.getPlot());
      movieEntity.setPoster(movieDTO.getPoster());
      movieEntity.setTitle(movieDTO.getTitle());
      movieEntity.setYear(movieDTO.getYear());
      movieEntity.setRated(movieDTO.getRated());
      movieEntity.setRuntime(movieDTO.getRuntime());
      movieEntity.setReleased(movieDTO.getReleased());
      movieEntity.setRuntime(movieDTO.getRuntime());
      movieEntity.setProduction(movieDTO.getProduction());
      movieEntity.setWriter(movieDTO.getWriter());
      movieEntity.setWebsite(movieDTO.getWebsite());

      return movieEntity;
   }

}
