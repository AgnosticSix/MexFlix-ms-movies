package mx.equipo_g_1004.unir.mexflixmsmovies.service;

import mx.equipo_g_1004.unir.mexflixmsmovies.model.Movie;
import mx.equipo_g_1004.unir.mexflixmsmovies.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

}
