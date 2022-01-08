package com.company;

public class Cat {
    private String name;
    private int Age;
    private int hunger;
    private int mood;
    private int health;
    private boolean actionDone = false;

    public Cat(String name, int age, int hunger, int mood, int health) {
        this.name = name;
        Age = age;
        this.hunger = hunger;
        this.mood = mood;
        this.health = health;
    }

    public boolean isActionDone() {
        return actionDone;
    }

    public void setActionDone(boolean actionDone) {
        this.actionDone = actionDone;
    }

    public int averageLevel(){
        return (getMood() + getHealth() + getHunger())/3;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }

    public int getHunger() {
        return hunger;
    }

    public int getMood() {
        return mood;
    }

    public int getHealth() {
        return health;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
