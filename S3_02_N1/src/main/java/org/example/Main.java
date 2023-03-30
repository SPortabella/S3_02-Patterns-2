package org.example;

import org.example.domain.Observer;
import org.example.domain.Subject;

import javax.swing.*;
import java.util.Optional;
import java.util.Scanner;

import static org.example.utils.Scan.askForInt;
import static org.example.utils.Scan.askForString;

public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();
        Boolean exit = false;

        do {
            try {
                int option = askForInt("Enter option:\n 1-Create Observer\n 2-Delete Observer\n 3-List Observers \n 4-Notify Observers \n 5-Exit");
                switch (option) {
                    case 1:
                        String name = askForString("Enter observer name:");
                        subject.createObserver(name);
                        break;
                    case 2:
                        subject.listObservers();
                        String name1 = askForString("Enter observer to delete:");
                        subject.deleteObserver(name1);
                        break;
                    case 3:
                        subject.listObservers();
                        break;
                    case 4:
                        subject.notifyObservers();
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Incorrect option");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Incorrect option");
            }
        } while (!exit);

    }

}