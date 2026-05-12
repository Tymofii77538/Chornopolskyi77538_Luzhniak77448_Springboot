# Dokumentacja Zadania: Hosting Aplikacji Spring Boot
**Student:** Tymofii Chornopolskyi
**ID:** 77538

## Opis sprawdzonych platform

W ramach zadania sprawdzono i przetestowano platformę **Railway** jako środowisko do hostingu aplikacji Java/Spring Boot.

### Railway
- **Charakterystyka:** Platforma typu PaaS (Platform as a Service), która automatycznie wykrywa technologię projektu na podstawie plików w repozytorium (np. `pom.xml` dla Maven).
- **Zalety:** Bardzo szybka integracja z GitHubem, automatyczny proces Build & Deploy po każdym `git push`, przejrzysty panel kontrolny i logi serwerowe.
- **Konfiguracja:** Wykorzystano wsparcie dla Javy 17 oraz pakowanie do formatu JAR, co pozwoliło na uruchomienie aplikacji z wbudowanym serwerem Tomcat.

## Wnioski

### Co było łatwe?
1. **Początkowa konfiguracja:** Dzięki narzędziu Spring Initializr przygotowanie bazy projektu nie wymagało znajomości skomplikowanych struktur plików XML czy Maven – wystarczyło zaznaczyć odpowiednie opcje w generatorze.
2. **Pisanie prostego kodu:** Sam sposób tworzenia endpointów za pomocą adnotacji (np. `@RestController`) okazał się bardzo czytelny i łatwy do zrozumienia, nawet bez wcześniejszego doświadczenia w Javie.
3. **Automatyczny proces wdrożenia:** Po poprawnym skonfigurowaniu połączenia z GitHubem, proces publikacji aplikacji w internecie odbywał się samoczynnie, co oszczędziło czas na ręczną konfigurację serwera.

### Co było trudne (Problemy osoby początkującej)?
1. **Zrozumienie struktury pakietów Java:** Największym problemem była ścisła zależność między strukturą folderów a deklaracją `package` w kodzie. Jako osoba nowa w Spring Boot, nie spodziewałem się, że błąd w jednej linijce na samej górze pliku uniemożliwi uruchomienie całej aplikacji.

### Co warto wybrać dalej?
Dla dalszego rozwoju projektu, szczególnie przy dodawaniu bazy danych (część 2 zadania), warto pozostać przy **Railway**. Platforma ta oferuje łatwe dodawanie baz PostgreSQL/MySQL za pomocą jednego kliknięcia i automatyczne wstrzykiwanie zmiennych środowiskowych, co jest znacznie prostsze niż ręczna konfiguracja serwerów VPS.
