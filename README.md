# Selenium-scaffold

Wprowadzenie do testowania aplikacji webowych z użyciem biblioteki Selenium WebDriver.

=== ZANIM ZACZNIESZ ===
Zainstaluj Javę - środowisko uruchomieniowe JRE (Java Runtime Environment).
Zainstaluj IDE - środowisko deweloperskie - używam IntelliJ IDEA Community Edition.
Instalując w/w środowisko, zainstalujesz także zestaw narzędzi programistycznych JDK (Java Development Kit).

=== ĆWICZENIE ===
1. Uruchom środowisko programistyczne i utwórz w nim nowy projekt w oparciu o Gradle.

2. W strukturze plików projektu odnajdź i otwórz plik 'build.gradle.kts' - posiada on sekcję 'dependencies'. Dodaj do niej wpis pozwalający zaciągnąć do projektu bibliotekę WebDriver: 'testImplementation("org.seleniumhq.selenium:selenium-java:4.10.0")'. Sprawdź w repozytorium Mavena (Gradle i Maven korzystają z tego samego repozytorium) czy jest nowsza wersja WebDrivera - jeśli tak, to wskaż jej numer.
3. Przebuduj Gradle - zrobisz to klikając w automatycznie wyskakującą w prawym-górnym okienku pliku ikonkę w pliku 'build.gradle.kts'.
4. W katalogu 'src -> test -> java' utwóz plik klasy o dowolnej nazwie - np. 'test.java'.
5. W pliku dodaj funkcję main - wpisz 'psvm' i wciśnij Enter.
6. W nagłówku dokonaj importu WebDrivera: 'import org.openqa.selenium.WebDriver;'.
7. Utwórz obiekt: 'WebDriver driver = new FirefoxDriver();' - w tym momencie do nagłówka samo dociągnie się: 'import org.openqa.selenium.firefox.FirefoxDriver;'.
8. Możesz zacząć testować dowolną stronę internetową.
