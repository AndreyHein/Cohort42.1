package lesson44;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #44
 *
 * @version 29-Apr-24
 */
public class Lesson44 {
    public static void main(String[] args) {
        File file = new File("file.bin");
        System.out.println(file.exists());

        // byte array input stream
        byte[] buf = {1, 2, 3, 4, 5, 6}; //{65, 66, 67};
        ByteArrayInputStream is = new ByteArrayInputStream(buf);
        int x;
        while ((x = is.read()) != -1) {
            System.out.print(x + " ");
        }

        // file output stream
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // file input stream
        int bufSize = Long.valueOf(file.length()).intValue();
        byte[] inputBuffer = new byte[bufSize];

        try (FileInputStream fis = new FileInputStream(file)) {
            fis.read(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(inputBuffer));

        String[] text = {"line1", "line2", "line3"};
        File textFile = new File("filetxt.txt");

        // write: file reader
        try (FileWriter writer = new FileWriter(textFile)) {
            for (String str : text) {
                writer.write(str + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int charBufSize = Long.valueOf(textFile.length()).intValue();
        char[] charBuf = new char[charBufSize];

        //read file reader
        try (FileReader reader = new FileReader(textFile)) {
            reader.read(charBuf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(new String(charBuf));

        // read by line using package NIO
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get("components.txt"));
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // process components
        for (String line : lines) {
            String[] fields = line.split(",");
            System.out.println(Arrays.toString(fields));
        }
    }
}
