package test.heroku.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.heroku.model.Jonny;

@Repository
public interface JonnyRepo extends JpaRepository<Jonny,Long> {
}
