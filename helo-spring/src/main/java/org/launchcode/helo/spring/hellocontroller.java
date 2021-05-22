package org.launchcode.helo.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class hellocontroller {

    //Handles request at path /hello
    @RequestMapping(value="hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String name, Model model){
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    @ResponseBody
    @GetMapping("exercise")
    public String greetInOtherLanguages(){
        return "<html>" +
                "<body>" +
                "<form action='/hello' method='post'>" +
                "<input type= 'text' name='name'>" +
                "<label for='lang-select'>language: </label>" +
                "<select name='lang' id='lang-select'" +
                "   <option value=''>--choose a language--</option>" +
                "<option value='French'>French</option>" +
                "<option value='Japanese'>Japanese</option>" +
                "<option value='English'>English</option>" +
                "<option value='Spanish'>Spanish</option>" +
                "</select>"+
                "<input type ='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }



    //Handles request at path /hello/goodbye
    @ResponseBody
    @GetMapping("goodbye")
    public String goodbye(){
        return "Goodbye, Spring";
    }

    // lives at /hello/hello
    //handles request of the form /hello?name-LaunchCode
//    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST})
//    public String hellowithQueryParam(@RequestParam String name, @RequestParam String lang) {
//        if(lang.equals("French")){
//            return "Bonjour, " + name + "!";
//        } else if (lang.equals("Japanese")) {
//            return "Konnichiwa, " + name;
//        } else if (lang.equals("English")) {
//            return "Hello, " + name;
//        } else if (lang.equals("Spanish")) {
//            return "Hola, " + name;
//        } else {
//            return "Hey, fool";
//        }
//
//    }

    //handles requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String hellowWithPathParam(@PathVariable String name, Model model){
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    //lives at /hello/form
    @GetMapping("form")
    public String helloForm(){
        return "form";
    }

    @GetMapping("hellonames")
    public String helloNames(Model model){
        List<String> names = new ArrayList<>();
        names.add("Launchcode");
        names.add("Nugget");
        names.add("Floor");
        model.addAttribute("names", names);
        return "hellolist";
    }
}
