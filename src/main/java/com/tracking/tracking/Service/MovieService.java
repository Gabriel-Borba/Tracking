package com.tracking.tracking.Service;

import com.tracking.tracking.Model.DTO.MovieDTO;
import com.tracking.tracking.Model.DTO.ResponseDto;
import org.springframework.stereotype.Service;


public interface MovieService {
    public ResponseDto saveMovie(MovieDTO movieDTO);
    public ResponseDto deleteMovie(Integer movieId);

}
