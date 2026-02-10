package it.mypckg.sampleapp;
import static java.lang.System.out;

/**
 * Monolitic application that fetches movie rates.
 */
public final class AppLauncher {
    private AppLauncher() { }

    /**
     * Launches the application.
     *
     * @param args a string with the movie/series name.
     */
    public static void main(final String[] args) {
        out.println("Hello, world!");
    }
}
