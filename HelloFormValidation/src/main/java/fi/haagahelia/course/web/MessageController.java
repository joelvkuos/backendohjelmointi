package fi.haagahelia.course.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.haagahelia.course.domain.Message;
import jakarta.validation.Valid;

@Controller
public class MessageController {

    @RequestMapping(value="/newmessage", method=RequestMethod.GET)
    public String greetingForm(Model model) {
    	model.addAttribute("message", new Message());
        return "form"; // form.html
    }

    @RequestMapping(value="/newmessage", method=RequestMethod.POST)
    public String greetingSubmit(@Valid Message msg, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
        	return "form"; // form.html
        }
        
    	model.addAttribute("message", msg);
        return "result";  // result.html
    }

}