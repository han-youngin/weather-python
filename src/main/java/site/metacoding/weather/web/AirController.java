package site.metacoding.weather.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.weather.domain.Air;
import site.metacoding.weather.domain.AirRepository;

@RequiredArgsConstructor
@Controller
public class AirController {

    @Autowired
    private AirRepository airRepository;

    @GetMapping("/")
    public String main(Model model) {
        List<Air> airs = airRepository.findAll();

        model.addAttribute("airs", airs);

        return "/main";
    }

}
