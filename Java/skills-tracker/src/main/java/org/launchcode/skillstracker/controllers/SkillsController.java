package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @RequestMapping(value="")
    public String hello(){
        return "<h1>Skills Tracker</h1>" +
                "<h2>Programming languages to learn<h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping(value="form")
    @PostMapping(value = "")
    public String form(){
        return "<form method='post'>" +
                "<div>" +
                "<label for='name'>Enter your name</label>" +
                "<input type='text' name='name'>" +
                "</div>" +
                "<div>" +
                "<label for ='lang1'>Choose your favorite language<select name='lang1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</label>" +
                "</div>"+
                "<div>" +
                "<label for ='lang2'>Choose your second favorite language" +
                "<select name='lang2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</label>" +
                "</div>"+
                "<div>" +
                "<label for ='lang3'>Choose your third favorite language<select name='lang3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</label>" +
                "</div>" +
                "<button>Submit</button>" +
                "</form>";
    }

    @RequestMapping(value="form", method = RequestMethod.POST )
    public String showthing(@RequestParam String name, String lang1, String lang2, String lang3){
        return "<h1>" + name + "</h1>"+
                "<ul>" +
                "<li>"+ lang1 +"</li>" +
                "<li>"+ lang2 +"</li>" +
                "<li>"+ lang3 +"</li>"+
                "</ul>";
    }

}
