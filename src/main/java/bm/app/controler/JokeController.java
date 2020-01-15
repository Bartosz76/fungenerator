package bm.app.controler;


import bm.app.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JokeController {

    @Autowired
    JokeService jokeService;

    @RequestMapping(value = "/chuck", method = RequestMethod.GET)
    public String landingPage(){return "chuck";}

    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String secondPage(){return "result";}

    @RequestMapping(value = "/chuck", method = RequestMethod.POST)
    public String resultPage(Model model){
        String generatedJoke = jokeService.generateAJoke();
        model.addAttribute("generatedJoke", generatedJoke);
        return "result";
    }

}
