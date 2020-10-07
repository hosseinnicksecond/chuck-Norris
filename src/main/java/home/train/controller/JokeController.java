package home.train.controller;

import home.train.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService service;

    @Autowired
    public JokeController(JokeService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String getJoke(Model model){

        model.addAttribute("Joke",service.getRandomJoke());
        return "norrisJoke";
    }
}
