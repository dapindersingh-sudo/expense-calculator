package com.ds;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Please select what action you want to perform-:");
        System.out.println("1. To add you'r expense amount");
        System.out.println("2. To delete amount from you'r expenses");
        int wallet = 0;
        int amount;
        int choice;
        Scanner obj = new Scanner(System.in);
        choice = obj.nextInt();
        if((choice>2) && (choice<1))
         {
            System.out.println("Please enter valid amount");
         }
        while (choice == 1) {
            Scanner obj1 = new Scanner(System.in);
            amount = obj1.nextInt();
            wallet = wallet + amount;
            System.out.println("You'r total expenses are- " + wallet);
            System.out.println("Press '1' if you want to enter some amount again");
            System.out.println("Press '2' if you want to delte some amount");
            Scanner obj2 = new Scanner(System.in);
            choice = obj2.nextInt();
        }
        while (choice == 2) {
            if (wallet <= 0) {
                System.out.println("You'r wallet is empty,sorry you can't delete");
                break;
            } else {
                Scanner obj3 = new Scanner(System.in);
                amount = obj3.nextInt();
                wallet = wallet - amount;
                System.out.println("You'r total expenses are- " + wallet);
                System.out.println("Press '2' if you want to delte some amount again");
                Scanner obj2 = new Scanner(System.in);
                choice = obj2.nextInt();
             }
        }
    }
}

