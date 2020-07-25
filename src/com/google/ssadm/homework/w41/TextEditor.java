package com.google.ssadm.homework.w41;

// Create a console "text editor" with the ability to save the typed text to a file.

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextEditor {
    public static void main(String[] args) {
        System.out.println("Start writing, to finish just press enter");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("Save entered text to file? Y/N");
        String save = sc.nextLine();
        if(save.toLowerCase().equals("y")){
            System.out.println("Please enter file name (file.txt etc.)");
            String fileName = sc.nextLine();
            try(PrintWriter printWriter = new PrintWriter(fileName)){
                printWriter.println(text);
                System.out.printf("File %s with your text created, bye!", fileName);
            } catch (FileNotFoundException e) {
                System.out.println("ERROR FILE WRITE");
            }
        } else {
            System.out.println("Good bye...");
        }

    }
}
