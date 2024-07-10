package org.example.core;

public class SelectionStatements {

    public static void main(String[] args) {

        String spices = "Curry Leaves";

        if(spices == "Curry Leaves"){
            System.out.println("Curry Leaves");
        } else if (spices == "Silver Leaves"){
            System.out.println("Silver Leaves");
        } else if (spices == "Golden Leaves"){
            System.out.println("Golden Leaves");
        }

        switch (spices) {
            case "Curry Leaves":
                System.out.println("Curry Leaves");
                break;
            case "Silver Leaves":
                System.out.println("Silver Leaves");
                break;
            default:
                System.out.println("Nothing");
        }
    }
}
