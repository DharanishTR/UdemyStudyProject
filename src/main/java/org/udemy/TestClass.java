package org.udemy;

/**
 * @author : tcs
 */
public class TestClass { 
 
    public static void main(String[] args) {
        System.out.println("Hello udemy");

        String check = "dog";

        switch (check){
            case "dog":
                System.out.println("dog");
                break;
            case "cat":
                System.out.println("cat");
                break;
            case "chicken":
                System.out.println("chicken");
                break;
            default:
                System.out.println("unknown");
        }
    }

}
