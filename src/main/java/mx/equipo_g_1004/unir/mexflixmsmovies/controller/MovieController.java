package mx.equipo_g_1004.unir.mexflixmsmovies.controller;

import mx.equipo_g_1004.unir.mexflixmsmovies.model.Movie;
import mx.equipo_g_1004.unir.mexflixmsmovies.service.MovieService;
import mx.equipo_g_1004.unir.mexflixmsmovies.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("")
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/all")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

//    @PostMapping("/save")
//    public Movie createMovie(@RequestBody Movie movie) {
//        return movieService.save(movie);
//    }
}