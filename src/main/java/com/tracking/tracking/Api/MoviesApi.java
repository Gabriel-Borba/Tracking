package com.tracking.tracking.Api;

import com.tracking.tracking.Model.DTO.MovieDTO;
import com.tracking.tracking.Model.DTO.ResponseDto;
import com.tracking.tracking.Service.MovieService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import static org.slf4j.LoggerFactory.getLogger;

@RestController
@RequestMapping(path = "/movies")
public class MoviesApi {
    private static Logger logger = getLogger(MoviesApi.class);

    @Autowired
    private MovieService movieService;


    @PostMapping
    public ResponseEntity<?> createMovie(@RequestBody MovieDTO movieDTO) {
        logger.info("Saving Movie entity  " + movieDTO.toString());
        try {
            return ResponseEntity.ok(movieService.saveMovie(movieDTO));
        } catch (ResponseStatusException response) {
            logger.error("Error saving entity " + response.getMessage());
            logger.error(response.getReason());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ResponseDto.builder().message(response.getMessage()).build());
        }
    }

    @DeleteMapping(path = "/{idMovie}")
    public ResponseEntity<?> deleteMovie(@PathVariable Integer idMovie) {
        try {
            return ResponseEntity.ok(movieService.deleteMovie(idMovie));
        } catch (ResponseStatusException response) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ResponseDto.builder().message(response.getMessage()).build());

        }
    }


}
