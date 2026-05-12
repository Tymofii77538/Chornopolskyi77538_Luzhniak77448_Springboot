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
1. **Generowanie projektu:** Użycie Spring Initializr pozwoliło na błyskawiczne przygotowanie szkieletu aplikacji z odpowiednimi wersjami zależności.
2. **Integracja z GitHub:** Połączenie repozytorium z Railway było intuicyjne (wymagało jedynie konfiguracji dostępu przez GitHub App).
3. **Automatyzacja:** Największym ułatwieniem był brak konieczności ręcznego kopiowania plików na serwer – wszystko działo się automatycznie po wysłaniu kodu do repozytorium.

### Co było trudne?
1. **Struktura katalogów:** Na początku Railpack (narzędzie budujące Railway) nie mógł wykryć aplikacji, ponieważ pliki projektu znajdowały się w podfolderze. Rozwiązaniem było przeniesienie `pom.xml` do katalogu głównego repozytorium.
2. **Zgodność pakietów (Packages):** Pojawiły się błędy kompilacji wynikające z rozbieżności między strukturą folderów w VS Code a deklaracją `package` w kodzie Java. Wymagało to ręcznej korekty plików źródłowych.
3. **Konfiguracja DNS:** Ustawienie własnej domeny `chornopolskyi77538.com` wymagało poprawnego dodania rekordów CNAME i TXT u rejestratora, co wiązało się z oczekiwaniem na rozgłoszenie zmian w sieci.

### Co warto wybrać dalej?
Dla dalszego rozwoju projektu, szczególnie przy dodawaniu bazy danych (część 2 zadania), warto pozostać przy **Railway**. Platforma ta oferuje łatwe dodawanie baz PostgreSQL/MySQL za pomocą jednego kliknięcia i automatyczne wstrzykiwanie zmiennych środowiskowych, co jest znacznie prostsze niż ręczna konfiguracja serwerów VPS.
