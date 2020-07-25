package com.google.ssadm.homework.w43;

// Implement a method that will display a list of all directories
// that "lie" in the directory that will be a parameter to this method.

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListFolders {
    public static void main(String[] args) {
        String path = "/Users/ssadm";
        listFolders(path);
    }

    private static void listFolders(String path) {
        File fileOne = new File(path);
        File[] arrayFile = fileOne.listFiles();
        if(arrayFile!=null) {
            List<File> folderList = Arrays.stream(arrayFile)
                    .filter(File::isDirectory)
                    .sorted()
                    .collect(Collectors.toList());
            if(folderList.isEmpty()) {
                System.out.printf("Directory %s contains no other directories.", path);
            } else {
                folderList.forEach(System.out::println);
            }
        } else {
            System.out.printf("Directory %s is empty." , path);
        }
    }
}
