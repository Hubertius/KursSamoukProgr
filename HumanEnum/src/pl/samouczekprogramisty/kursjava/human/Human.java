package pl.samouczekprogramisty.kursjava.human;

import pl.samouczekprogramisty.kursjava.Eyes;
import pl.samouczekprogramisty.kursjava.Hair;

public class Human {
    private String name;
    private int age;
    private Eyes eyes;
    private Hair hairs;

    public Human(String name, int age, Eyes eyes, Hair hairs) {
        this.name = name;
        this.age = age;
        this.eyes = eyes;
        this.hairs = hairs;
    }

    public String hairColor() {
        if(this.hairs == Hair.Blonde) {
            return "blonde";
        } else if(this.hairs == Hair.Dark) {
            return "dark";
        } else if(this.hairs == Hair.Brown) {
            return "brown";
        } else if(this.hairs == Hair.Green) {
            return "green";
        }
        return "red";
    }

    public String eyesColor() {
        if(this.eyes == Eyes.Green) {
            return "green";
        } else if(this.eyes == Eyes.Brown) {
            return "brown";
        } else if(this.eyes == Eyes.Dark) {
            return "dark";
        }
        return "blue";


    }

    @Override
    public String toString() {
        return this.name + " with age of " + this.age + " is having " + this.hairColor() + " hairs with " +  this.eyesColor() + " eyes.";
    }

}
