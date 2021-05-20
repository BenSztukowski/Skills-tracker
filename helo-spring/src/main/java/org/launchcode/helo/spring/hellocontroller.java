package org.launchcode.helo.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class hellocontroller {

//    //Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

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
    @GetMapping("goodbye")
    public String goodbye(){
        return "Goodbye, Spring";
    }

    // lives at /hello/hello
    //handles request of the form /hello?name-LaunchCode
    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST})
    public String hellowithQueryParam(@RequestParam String name, @RequestParam String lang) {
        if(lang.equals("French")){
            return "Bonjour, " + name + "!";
        } else if (lang.equals("Japanese")) {
            return "Konnichiwa, " + name;
        } else if (lang.equals("English")) {
            return "Hello, " + name;
        } else if (lang.equals("Spanish")) {
            return "Que Pasa, " + name;
        } else {
            return "Hey, fool";
        }

    }

    //handles requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String hellowWithPathParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }

    //lives at /hello/form
    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='/hello' method='post'>" + //submit a request to /hello
                "<input type= 'text' name='name'>" +
                "<input type ='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
