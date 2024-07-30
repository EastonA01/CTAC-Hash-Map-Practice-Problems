package org.example;
import java.util.HashMap;

/*
Create a class Abbreviations for managing common abbreviations.
The class must have a constructor, which does not take any parameters.
The class must also provide the following methods:
*/

public class Abbreviations {
    HashMap<String,String> abbreviations;

    Abbreviations() {
        abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        abbreviations.put(abbreviation,explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        return abbreviations.containsKey(abbreviation);
    }
    // finds the explanation for an abbreviation;
    // returns null if the abbreviation has not been added yet.
    public String findExplanationFor(String abbreviation){
        if (abbreviations.containsKey(abbreviation)){
            return abbreviations.get(abbreviation);
        }
        return null;
    }

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }
}
