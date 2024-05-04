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
import java.util.HashMap;
import java.util.Map;

public class HomeWork44 {
    public static void main(String[] args) {
        Map<String, Integer> userMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("transaktion.txt"));
             FileWriter lessWriter = new FileWriter("less.txt");
             FileWriter moreWriter = new FileWriter("more.txt")) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                String userName = parts[0];
                int amount = Integer.parseInt(parts[1]);
                Integer sum = userMap.get(userName);
                if (sum == null) {
                    userMap.put(userName, 0);
                    sum = 0;
                }
                userMap.put(userName,sum + amount);
            }

            for (String userName : userMap.keySet()) {
                Integer useMoney = userMap.get(userName);
                if (useMoney < 2000) {
                    lessWriter.write(userName + ":" + String.valueOf(useMoney) + "\n");
                } else {
                    moreWriter.write(userName + ":" + String.valueOf(useMoney) + "\n");
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("Input file not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading or writing file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + e.getMessage());
        }
    }
}
