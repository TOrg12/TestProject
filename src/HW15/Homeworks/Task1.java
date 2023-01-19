package HW15.Homeworks;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("C:/Users/Serhii Bodnar/IdeaProjects/Test1/src/HW15/file1.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = null;
            List<String> list = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                list.add(line);
            }
            String[] lines = list.toArray(new String[0]);
            int count = 0;
            int maxSymbols = 0;
            String longestLine = "";
            StringBuilder sb;
            for (int i = 0; i < lines.length; i++) {
                count++;
                sb = new StringBuilder(lines[i]);
                if (maxSymbols < sb.capacity()) {
                    maxSymbols = sb.capacity();
                    longestLine = lines[i];
                }
            }

            List<String> resultList = new ArrayList<>();
            resultList.add("There is " + count + " lines in file1.txt");
            resultList.add("The longest line is: " + longestLine);
            resultList.add("My name - Serhii Bodnar, my birthday date - 01/21/1991");
            Path path = Paths.get("C:/Users/Serhii Bodnar/IdeaProjects/Test1/src/HW15/file2.txt");
            Files.write(path, resultList, StandardCharsets.UTF_8, StandardOpenOption.WRITE);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

