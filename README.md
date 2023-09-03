# Selenium-scaffold

Totalny początek przygody z Selenium w Javie

=== ZANIM ZACZNIESZ ===

W celu wykonania tej lekcji, musisz mieć zainstalowane środowisko programistyczne - używam IntelliJ IDEA Community Edition z https://www.jetbrains.com/idea/download/?section=windows Musisz także mieć skonfigurowane środowisko do pracy z Javą - tzw. Java Runtime Environment (JRE) - to pozwala uruchamiać programy napisane w Javie. Instalując w/w środowisko, zainstalujesz także zestaw narzędzi programistycznych o nazwie Java Development Kit (JDK).

Musisz także mieć pobraną bibliotekę Selenium WebDriver - dla Windowsa ze strony https://www.selenium.dev/downloads/ pobierz wersję Java. Rozpakuj pobrane archiwum - zobaczysz zestaw bibliotek (są to pliki osobne dla platformy i przeglądarki). Wrócimy do tego w kroku 2-gim poniższego ćwiczenia.

=== ĆWICZENIE ===

    Uruchom środowisko programistyczne i utwórz w nim nowy projekt w oparciu o Gradle.

    W utworzonej strukturze katalogów projektu odnajdź ścieżkę 'src -> test -> resources'. Tam umieść plik WebDrivera dla Twojej przeglądarki - będzie to Firefox dla Windowsa, a zatem z rozpakowanego wcześniej archiwum przerzuć tam plik 'selenium-firefox-driver-4.12.0'.

    W strukturze plików projektu odnajdź i otwórz plik 'build.gradle.kts' - posiada on sekcję 'dependencies'. Dodaj do niej wpis pozwalający zaciągnąć przerzuconą do projektu bibliotekę WebDriver: 'testImplementation("org.seleniumhq.selenium:selenium-java:4.10.0")'. Tu numer wersji musi być zgodny z tym z dysku.

    Przebuduj Gradle - zrobisz to klikając w automatycznie wyskakującą w prawym-górnym okienku pliku ikonkę w pliku 'build.gradle.kts'.

    W katalogu 'src -> test -> java' utwóz plik klasy o dowolnej nazwie - np. 'test.java'.

    W pliku dodaj funkcję main - wpisz 'psvm' i wciśnij Enter.

    W nagłówku dokonaj importu WebDrivera: 'import org.openqa.selenium.WebDriver;'.

    Utwórz obiekt: 'WebDriver driver = new FirefoxDriver();' - w tym momencie do nagłówka samo dociągnie się: 'import org.openqa.selenium.firefox.FirefoxDriver;'.

    Możesz zacząć testować dowolną stronę internetową.
