package fi.haagahelia.course.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fi.haagahelia.course.domain.Friend;

@Controller
public class FriendController {

    private List<Friend> friends = new ArrayList<>();

    @GetMapping("/kaverilista")
    public String friendList(Model model) {

        if (friends.isEmpty()) {
            Friend friend1 = new Friend();
            friend1.setFirstName("Samu");
            friend1.setLastName("Kekkonen");
            friends.add(friend1);

            Friend friend2 = new Friend();
            friend2.setFirstName("Konsta");
            friend2.setLastName("Lyytikäinen");
            friends.add(friend2);

            Friend friend3 = new Friend();
            friend3.setFirstName("Jani");
            friend3.setLastName("Kinnunen");
            friends.add(friend3);
        }

        model.addAttribute("friends", friends);
        model.addAttribute("friend", new Friend());
        return "kaverit";
    }

    @PostMapping("/addfriend")
    public String addFriendSubmit(@ModelAttribute Friend friend) {
        friends.add(friend);
        return "redirect:/kaverilista";
    }
}
