package com.google.ssadm.homework.w45;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LetterAnalysis {
    public static final String file = "src/com/google/ssadm/homework/w45/input.txt";

    public static void main(String[] args) {
        String result = getStringFromFile(file);

        Map<Character, Integer> myMap = result.toLowerCase()
                .chars()
                .filter(Character::isAlphabetic)
                .boxed()
                .collect(Collectors.toMap(
                        k -> (char) k.intValue() ,
                        v -> 1 ,
                        Integer::sum
                ));
        // we can't sort HashMap by value, and we use List of values to sort and then to print Map "sorted by values"
        List<Integer> count = myMap.values().stream()
                .sorted()
                .collect(Collectors.toList());
        //this is not optimal solution, find your own :)
        IntStream.iterate(count.size() - 1 , i -> i >= 0 , i -> i - 1)
                .forEach(i -> myMap.forEach((key , value) -> {
                    if (count.get(i).equals(value)) {
                    System.out.println(key + " " + value);
                }
        }));
    }

    private static String getStringFromFile(String file) {
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            System.out.println("\n\nOK Start reading...");
            br.lines().forEach(strCurrentLine -> {
                System.out.println(strCurrentLine);
                sb.append(strCurrentLine);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
