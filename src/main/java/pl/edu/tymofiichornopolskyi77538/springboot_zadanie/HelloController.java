package pl.edu.tymofiichornopolskyi77538.springboot_zadanie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        // Komentarz: Strona główna aplikacji
        return "Serwer działa poprawnie! ID: 77538";
    }

    @GetMapping("/api/status")
    public String getStatus() {
        // Komentarz: Dodatkowy endpoint sprawdzający status
        return "Status: OK. Aplikacja gotowa do hostingu publicznego.";
    }
}