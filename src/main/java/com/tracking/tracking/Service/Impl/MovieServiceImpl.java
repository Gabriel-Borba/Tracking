package com.tracking.tracking.Service.Impl;

import com.tracking.tracking.Api.MoviesApi;
import com.tracking.tracking.Factory.MovieFactory;
import com.tracking.tracking.Model.DTO.MovieDTO;
import com.tracking.tracking.Model.DTO.ResponseDto;
import com.tracking.tracking.Repository.MovieRepository;
import com.tracking.tracking.Service.MovieService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static org.slf4j.LoggerFactory.getLogger;

@Service
public class MovieServiceImpl implements MovieService {
    private static Logger logger = getLogger(MovieServiceImpl.class);

    private MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository moviesRepository) {
        this.movieRepository = moviesRepository;
    }

    @Override
    public ResponseDto saveMovie(MovieDTO movieDTO) {
        logger.info("Saving entity into database");
        try {
            movieDTO.setIdMovie((int) (Math.random() * 10000));
            movieRepository.save(MovieFactory.buildMovieEntity(movieDTO));
        } catch (DataAccessException data) {
            logger.error("Error saving entity into database");
            logger.error(data.getMessage());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        return ResponseDto.builder().message("Movie added successfully").build();
    }


    @Override
    public ResponseDto deleteMovie(Integer idMovie) {
        logger.info("Deleting movie id " + - idMovie) ;
        try {
            movieRepository.deleteById(idMovie);
        } catch (DataAccessException data) {
            logger.error("Error deleting entity into database");
            logger.error(data.getMessage());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        return ResponseDto.builder().message("Movie deleted successfully").build();


    }
}
