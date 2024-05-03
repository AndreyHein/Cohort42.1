package lesson44.homework;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 44
 * @author Andrey Hein
 * @version 03-May-2024
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork44 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("transaktion.txt"));
            FileWriter lessWriter = new FileWriter("less.txt");
            FileWriter moreWriter = new FileWriter("more.txt");

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                int amount = Integer.parseInt(parts[1]);

                if (amount < 2000) {
                    lessWriter.write(line + "\n");
                } else {
                    moreWriter.write(line + "\n");
                }
            }

            reader.close();
            lessWriter.close();
            moreWriter.close();

        } catch (FileNotFoundException e) {
            System.err.println("Input file not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading or writing file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + e.getMessage());
        }
    }
}
