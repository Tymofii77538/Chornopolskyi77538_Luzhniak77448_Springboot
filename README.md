# Dokumentacja Projektu: Backend Spring Boot
**Skład zespołu:** Tymofii Chornopolskyi  
**ID Studenta:** 77538

## Krótki opis aplikacji
Aplikacja stanowi prosty backend zbudowany w technologii Spring Boot, który służy jako wprowadzenie do komunikacji frontendu z serwerem. Głównym celem projektu było stworzenie działającego punktu końcowego (endpointu), który zwraca dane identyfikacyjne studenta poza lokalną przeglądarką użytkownika.

## Informacje o wdrożeniu
- **Endpoint do sprawdzenia:** `https://chornopolskyi77538.up.railway.app/hello` 
- **Publiczny URL:** `chornopolskyi77538springboot-production.up.railway.app`
- **Sprawdzone platformy:** Railway, GitHub

## Instrukcja uruchomienia lokalnego
1. Sklonuj repozytorium z GitHub.
2. Otwórz projekt w środowisku VS Code lub IntelliJ IDEA.
3. Upewnij się, że masz zainstalowane JDK 17.
4. Uruchom aplikację za pomocą komendy `./mvnw spring-boot:run` lub bezpośrednio z pliku `SpringbootZadanieApplication.java`.
5. Aplikacja będzie dostępna pod adresem `http://localhost:8080/hello`.

## Wnioski (Perspektywa początkującego)

### Co się udało (Co było łatwe)?
- **Szybki start:** Dzięki generatorowi Spring Initializr, proces tworzenia szkieletu aplikacji był bezproblemowy nawet bez wcześniejszego doświadczenia.
- **Logika endpointów:** Tworzenie prostych odpowiedzi tekstowych za pomocą adnotacji `@GetMapping` okazało się bardzo intuicyjne i łatwe do zrozumienia od strony programistycznej.

### Co się nie udało (Co było trudne)?
- **Błędy w strukturze projektu:** Jako osoba początkująca, nie wiedziałem, że platforma Railway wymaga plików konfiguracyjnych (`pom.xml`) bezpośrednio w katalogu głównym repozytorium. Umieszczenie ich w podfolderze zablokowało pierwszą próbę budowania aplikacji.


### Podsumowanie i wybór platformy
Biorąc pod uwagę zerowe doświadczenie ze Spring Bootem przed tym zadaniem, uważam, że **Railway** jest najlepszą platformą do kontynuowania nauki. Mimo trudności z początkową konfiguracją i logami, automatyzacja, którą oferuje, jest znacznie bardziej przystępna niż ręczne zarządzanie serwerem.
