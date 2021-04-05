package ru.bspb.lesson8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


public class Less8 {

    public static void main(String[] args) throws IOException {
        Path dir = Path.of("dockler");
        Files.find(dir, 1, (file, atribute) -> file.toString().endsWith(".log"))
              .forEach(System.out::println);

        List<LogEntry> fileString = new ArrayList<>();
        Path file1 = Path.of("dockler/application.log");
        String delimetr = " - ";
        List<String> files1 = Files.readAllLines(file1);

            for (String line : files1) {
                String[] subLine = line.split(delimetr);
                for (int i = 0; i < subLine.length; i++) {
                    String timestamp = subLine[i++];
                    String level = subLine[i++];
                    String message = subLine[i++];
                    String[] levelNew = level.split("  ");
                    fileString.add(new LogEntry(timestamp, levelNew[0], message));
                }
            }



//        List<LogEntry> fileStringNew = fileString.stream()
//                .filter(client -> client.getLevel().toString().equals("WARN"))
//                .distinct().collect(Collectors.toList());
//        fileString.forEach (out::println);

            for (LogEntry client : fileString) {
                if (client.getLevel().equals("WARN")) {
                    System.out.println(client.toString());
                }
            }
        }
    }
