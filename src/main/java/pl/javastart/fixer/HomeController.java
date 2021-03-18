package pl.javastart.fixer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    FixerService fixerService;

    public HomeController(FixerService fixerService) {
        this.fixerService = fixerService;
    }

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("currencyValue", fixerService.getCurrencyValues());
        return "home";
    }
}
