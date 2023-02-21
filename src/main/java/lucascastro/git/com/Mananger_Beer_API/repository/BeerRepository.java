package lucascastro.git.com.Mananger_Beer_API.repository;


import lucascastro.git.com.Mananger_Beer_API.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer,Long> {

    Optional<Beer> findByName(String name);
}
