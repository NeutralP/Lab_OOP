package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "alice29.txt";
        byte[] inputBytes;
        {
            // It reads the file and stores it in the inputBytes array.
            try {
                inputBytes = Files.readAllBytes(Paths.get(filename));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        long startTime = System.currentTimeMillis();
        StringBuilder outputStringBuilder = new StringBuilder();
        for(byte b : inputBytes) {
            outputStringBuilder.append((char)b);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
