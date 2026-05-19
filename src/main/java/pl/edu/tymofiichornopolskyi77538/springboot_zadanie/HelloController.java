package pl.edu.tymofiichornopolskyi77538.springboot_zadanie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String home() {
        return "Serwer działa poprawnie! "
            "Tymofii Chornopolskyi ID: 77538"
            "Volodymyr Luzhniak ID: 77448";
    }

    @GetMapping("/api/status")
    public String getStatus() {
        return "Status: OK. Aplikacja gotowa do hostingu publicznego.";
    }
}
