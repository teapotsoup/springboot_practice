package r2ware.practice2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/greetings")
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "서정우");
        return  "greetings"; 
        //templates/greetings.mustache -> 브라우저로 전송
    }


    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("username", "서정우");
        return  "goodbye";
        //templates/greetings.mustache -> 브라우저로 전송
    }
}
