package ru.fishbalka.ex6_1;

import ru.fishbalka.ex4_2.gifts.TreeGift;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/file.txt");
        Pattern pattern = Pattern.compile("[\\w\\(\\)\\{\\}\",;\\-=\\/:\\.\\?\\&\\*\\+!'\\\\@\\[\\]]+");

        try {
            String file = readFile(path);
            List<String> list = parseFile(file, pattern);
            Collections.sort(list);
            // printList(list);
            Map<String, Integer> stat = getStat(list);
            LinkedHashMap<String, Integer> map = stat.entrySet().parallelStream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                    LinkedHashMap::new));

            Map.Entry<String, Integer> entry = map.entrySet().iterator().next();
            System.out.println("Самое интенсивное: " + entry.getValue() + " " + entry.getKey());

            printMap(map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> el : map.entrySet()) {
            System.out.printf("%3d %s\n", el.getValue(), el.getKey());
        }
    }

    public static <K, V> void printList(List<V> list) {
        for (V el : list) {
            System.out.println(el);
        }
    }

    public static List<String> parseFile(String file, Pattern pattern) {
        List<String> list = new ArrayList<>();
        Matcher matcher = pattern.matcher(file);
        while (matcher.find()) {
            list.add(matcher.group());
        }
        return list;
    }

    public static Map<String, Integer> getStat(List<String> list) {
        Map<String, Integer> map = new TreeMap<>();
        for (String s : list) {
            Integer val = map.get(s);
            map.put(s, val == null ? 1 : ++val);
        }
        return map;
    }

    public static String readFile(Path path) throws IOException {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

}


