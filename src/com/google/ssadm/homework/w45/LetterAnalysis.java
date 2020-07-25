package com.google.ssadm.homework.w45;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LetterAnalysis {
    public static String file = "src/com/google/ssadm/homework/w45/input.txt";

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
        List<Integer> count = myMap.values().stream()
                .sorted()
                .collect(Collectors.toList());

        for (int i = count.size() - 1; i >= 0; i--) {
            for(var c: myMap.entrySet()){
                if(count.get(i).equals(c.getValue())){
                    System.out.println(c.getKey() + " " + c.getValue());
                }
            }
        }
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
