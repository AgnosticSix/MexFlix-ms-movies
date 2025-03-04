package mx.equipo_g_1004.unir.mexflixmsmovies.repository;

import mx.equipo_g_1004.unir.mexflixmsmovies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
