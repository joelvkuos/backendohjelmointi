package fi.haagahelia.course.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import fi.haagahelia.course.domain.Message;
import fi.haagahelia.course.domain.Viesti;

@Controller
public class ViestiController {

    @RequestMapping(value = "/kaverilista", method = RequestMethod.GET)
    public String hello(Model model) {

        List<Viesti> viestit = new ArrayList<>();
        Viesti viesti1 = new Viesti();
        viesti1.setSisalto("Ruokalassa oli kanaa!");
        viestit.add(viesti1);
        Viesti viesti2 = new Viesti();
        viesti2.setSisalto("Tänään on maanantai!");

        model.addAttribute("viesti", new Viesti());
        return "form"; // form.html
    }

}
