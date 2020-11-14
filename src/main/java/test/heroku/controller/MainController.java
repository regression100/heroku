package test.heroku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import test.heroku.model.Jonny;
import test.heroku.service.JonnyService;

@Controller
public class MainController {
    private final JonnyService jonnyService;

    public MainController(JonnyService jonnyService) {
        this.jonnyService = jonnyService;
    }

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("JonnyList",jonnyService.findAll());
        return "main";
    }

    @GetMapping("/add")
    public String add(){
        return "add";
    }

    @PostMapping("/add")
    public String add(@RequestParam("ism") String ism){
        Jonny jonny=new Jonny();
        jonny.setIsm(ism);
        jonnyService.save(jonny);
        return "redirect:/main";
    }



}
