package test.heroku.service;

import org.springframework.stereotype.Service;
import test.heroku.model.Jonny;
import test.heroku.repo.JonnyRepo;

import java.util.List;

@Service
public class JonnyService {

    private final JonnyRepo jonnyRepo;

    public JonnyService(JonnyRepo jonnyRepo) {
        this.jonnyRepo = jonnyRepo;
    }

    public List<Jonny> findAll(){
        return jonnyRepo.findAll();
    }

    public Jonny save(Jonny jonny){
        return jonnyRepo.save(jonny);
    }

}
