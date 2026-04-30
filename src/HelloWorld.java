// Plik: HelloWorld.java
// Cel: Weryfikacja że środowisko działa poprawnie
public class HelloWorld {
    public static void main(String[] args) {
// System.out.println = wypisz do konsoli i przejdź do nowej linii
        System.out.println("Hello, Java Kurs!");
// Wypisz wersję Javy - przydatne do weryfikacji
        String javaVersion = System.getProperty("java.version");
        System.out.println("Java version: " + javaVersion);
// Sprawdzenie czy to JDK 17+
        int major = Integer.parseInt(javaVersion.split("\\.")[0]);
        if (major >= 17) {
            System.out.println("OK: Używamy Java " + major + " — wszystkie funkcje dostepne" + "funkconalnosc A" + "conflict");
        } else {
            System.out.println("UWAGA: Za stara wersja Java. Wymagana: 17+");
        }
    }
}
