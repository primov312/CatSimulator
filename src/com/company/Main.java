package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Vasya", r.nextInt(17)+1, r.nextInt(75) + 25, r.nextInt(75) + 25, r.nextInt(75) + 25));
        cats.add(new Cat("Petya", r.nextInt(17)+1, r.nextInt(75) + 25, r.nextInt(15) + 59, r.nextInt(75) + 25));
        cats.add(new Cat("Barsik", r.nextInt(17)+1, r.nextInt(75) + 25, r.nextInt(15) + 59, r.nextInt(75) + 25));
        while (true) {
            makeTable(cats);
            Integer action = ChooseAction();

            if (action==1){
                System.out.println("choose cat " + 1 + "-"+ (cats.size()));
                int catChoose = chooseCat(cats);
                if (cats.get(catChoose-1).isActionDone()==false) {
                    System.out.println("You fed the cat " + cats.get(catChoose - 1).getName() + " which has age " + cats.get(catChoose - 1).getAge());
                    if (cats.get(catChoose - 1).getAge() < 6) {
                        cats.get(catChoose - 1).setHunger(cats.get(catChoose - 1).getHunger() + 7);
                        cats.get(catChoose - 1).setMood(cats.get(catChoose - 1).getMood() + 7);
                        cats.get(catChoose - 1).setActionDone(true);
                    } else if (cats.get(catChoose - 1).getAge() >= 6 && cats.get(catChoose - 1).getAge() < 10) {
                        cats.get(catChoose - 1).setHunger(cats.get(catChoose - 1).getHunger() + 5);
                        cats.get(catChoose - 1).setMood(cats.get(catChoose - 1).getMood() + 5);
                        cats.get(catChoose - 1).setActionDone(true);
                    } else if (cats.get(catChoose - 1).getAge() > 11) {
                        cats.get(catChoose - 1).setHunger(cats.get(catChoose - 1).getHunger() + 4);
                        cats.get(catChoose - 1).setMood(cats.get(catChoose - 1).getMood() + 4);
                        cats.get(catChoose - 1).setActionDone(true);
                    }
                }else{
                    System.out.println("Action done before with this cat");
                }
            }else if (action==2){
                System.out.println("choose cat " + 1 + "-"+ (cats.size()));
                int catChoose = chooseCat(cats);
                if (cats.get(catChoose-1).isActionDone()==false) {
                    System.out.println("You played " + cats.get(catChoose - 1).getName() + " which has age " + cats.get(catChoose - 1).getAge());
                    if (cats.get(catChoose - 1).getAge() < 6) {
                        cats.get(catChoose - 1).setMood(cats.get(catChoose - 1).getMood() + 7);
                        cats.get(catChoose - 1).setHealth(cats.get(catChoose - 1).getHealth() + 7);
                        cats.get(catChoose - 1).setHunger(cats.get(catChoose - 1).getHunger() - 3);
                        cats.get(catChoose - 1).setActionDone(true);
                    } else if (cats.get(catChoose - 1).getAge() >= 6 && cats.get(catChoose - 1).getAge() < 10) {
                        cats.get(catChoose - 1).setMood(cats.get(catChoose - 1).getMood() + 5);
                        cats.get(catChoose - 1).setHealth(cats.get(catChoose - 1).getHealth() + 5);
                        cats.get(catChoose - 1).setHunger(cats.get(catChoose - 1).getHunger() - 5);
                        cats.get(catChoose - 1).setActionDone(true);
                    } else if (cats.get(catChoose - 1).getAge() > 11) {
                        cats.get(catChoose - 1).setMood(cats.get(catChoose - 1).getMood() + 4);
                        cats.get(catChoose - 1).setHealth(cats.get(catChoose - 1).getHealth() + 4);
                        cats.get(catChoose - 1).setHunger(cats.get(catChoose - 1).getHunger() - 6);
                        cats.get(catChoose - 1).setActionDone(true);
                    }
                }else{
                    System.out.println("Action done before with this cat");
                }

            }else if(action==3){

                System.out.println("choose cat " + 1 + "-"+ (cats.size()));
                int catChoose = chooseCat(cats);
                if(cats.get(catChoose-1).isActionDone()) {
                    System.out.println("You healed the cat " + cats.get(catChoose - 1).getName() + " which has age " + cats.get(catChoose - 1).getAge());
                    if (cats.get(catChoose - 1).getAge() < 6) {
                        cats.get(catChoose - 1).setHealth(cats.get(catChoose - 1).getHealth() + 7);
                        cats.get(catChoose - 1).setHunger(cats.get(catChoose - 1).getHunger() - 3);
                        cats.get(catChoose - 1).setActionDone(true);
                    } else if (cats.get(catChoose - 1).getAge() >= 6 && cats.get(catChoose - 1).getAge() < 10) {
                        cats.get(catChoose - 1).setHealth(cats.get(catChoose - 1).getHealth() + 5);
                        cats.get(catChoose - 1).setHunger(cats.get(catChoose - 1).getHunger() - 5);
                        cats.get(catChoose - 1).setActionDone(true);
                    } else if (cats.get(catChoose - 1).getAge() > 11) {
                        cats.get(catChoose - 1).setHealth(cats.get(catChoose - 1).getHealth() + 4);
                        cats.get(catChoose - 1).setHunger(cats.get(catChoose - 1).getHunger() - 6);
                        cats.get(catChoose - 1).setActionDone(true);
                    }
                }else{
                    System.out.println("Action done before with this cat");
                }

            }else if (action ==4){
                addCat(cats);

            }else if(action == 5){
                for (int i = 0; i < cats.size(); i++){
                    cats.get(i).setHealth(cats.get(i).getHealth()+r.nextInt(6)-3);
                    cats.get(i).setMood(cats.get(i).getMood()+r.nextInt(6)-3);
                    cats.get(i).setHunger(cats.get(i).getHunger()+r.nextInt(4)+1);
                    cats.get(i).setActionDone(false);
                }

            }else{
                System.out.println("there is no such action");
            }


        }
    }
    static void makeTable(ArrayList<Cat> cats){

        cats.sort(Comparator.comparing(Cat::averageLevel).reversed());
        System.out.println("---+---------+-------+---------+---------+---------+--------------+");
        System.out.printf("|%2s| %7s | %5s | %7s | %7s | %7s | %13s|", "#", "Name", "Age", "Health", "Mood", "Hunger", "Average Level");
        System.out.println();
        System.out.println("---+---------+-------+---------+---------+---------+--------------+");
        for (int i = 0; i < cats.size(); i++) {
            System.out.printf("|%2s| %7s | %5s | %7s | %7s | %7s | %11s  |", i + 1, cats.get(i).getName(), cats.get(i).getAge(), cats.get(i).getHealth(), cats.get(i).getMood(), cats.get(i).getHunger(), cats.get(i).averageLevel());
            System.out.println();
        }
    }
    static void addCat(ArrayList<Cat> cat){
        Random r = new Random();
        System.out.println("Write the name of the cat");
        Boolean na = true;
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        while(na == true){
            if (!name.matches("[a-zA-Z]+")) {
                System.out.println("Write something please");
                name = s.nextLine();
            }else{
                na = false;
            }
        }
        int age = setAgeOfCat();

        cat.add(new Cat( name, age, r.nextInt(60) +20 , r.nextInt(60) + 20, r.nextInt(60) + 20));
    }
    static int setAgeOfCat(){
        System.out.println("Set the age of cat");
        Scanner sc = new Scanner(System.in);
        int b = 0;
        try {
            b = sc.nextInt();
            if(b <= 0){
                throw  new ErrorException();
            }
            if (b>18){
                throw new ErrorException();
            }
        }
        catch (ErrorException| InputMismatchException | NullPointerException ae){
            System.out.println("Write the age of your cat");
            b = setAgeOfCat();
        }

        return b;
    }
    static int ChooseAction(){
        System.out.println("Choose action \n 1.feed \n 2.play \n 3.go to Vet \n 4- add new cat \n 5. next day");
        Scanner sc = new Scanner(System.in);
        int b = 0;
        try {
            b = sc.nextInt();
            if(b <= 0){
                throw  new ErrorException();
            }
            if (b>5){
                throw new ErrorException();
            }
        }
        catch (ErrorException| InputMismatchException | NullPointerException ae){
            System.out.println("Choose action \n 1.feed \n 2.play \n 3.go to Vet \n 4- add new cat");
            b = ChooseAction();
        }

        return b;
    }
    static int chooseCat(ArrayList<Cat> cats){
        Scanner sc = new Scanner(System.in);
        int b = 0;
        try {
            b = sc.nextInt();
            if(b <= 0){
                throw  new ErrorException();
            }
            if (b>cats.size()){
                throw new ErrorException();
            }
        }
        catch (ErrorException| InputMismatchException | NullPointerException ae){
            System.out.println("Choose cat from 1 to " + cats.size());
            b = chooseCat(cats);
        }
        return b;
    }

}
