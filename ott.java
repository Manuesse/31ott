import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ScriviFile {
    public static void main(String[] args) {
        // Creazione del BufferedReader per leggere l'input da console
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter writer = new PrintWriter(new FileWriter("output.txt"))) {

            String linea;
            System.out.println("Inserisci le linee da scrivere nel file. Premi Invio su una linea vuota per terminare.");

            // Ciclo per leggere le linee fino a quando non si incontra una linea vuota
            while (true) {
                linea = reader.readLine(); // Legge una linea da console
                if (linea.isEmpty()) { // Controlla se la linea è vuota
                    break; // Esce dal ciclo se la linea è vuota
                }
                writer.println(linea); // Scrittura della linea nel file
            }

            System.out.println("Le linee sono state scritte nel file 'output.txt'.");

        } catch (Exception e) {
            e.printStackTrace(); // Gestione delle eccezioni
        }
    }
}
