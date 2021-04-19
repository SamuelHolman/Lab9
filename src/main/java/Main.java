
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sem
 */

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        LandTract LandTract1 = new LandTract();
        LandTract LandTract2 = new LandTract();
        
        System.out.println("Enter the length of the first land tract.");
        double length1 = keyboard.nextDouble();
        
        System.out.println("Enter the width of the first land tract.");
        double width1 = keyboard.nextDouble();
        
        LandTract1.setLength(length1);
        LandTract1.setWidth(width1);
        
        System.out.println("Enter the length of the second land tract.");
        double length2 = keyboard.nextDouble();
        
        System.out.println("Enter the width of the second land tract.");
        double width2 = keyboard.nextDouble();
        
        LandTract2.setLength(length2);
        LandTract2.setWidth(width2);
        
        System.out.println("The area of the first LandTract is " + LandTract1.GetArea());
        System.out.println("The area of the second LandTract is " + LandTract2.GetArea());
        
        if (LandTract1.equals(LandTract2) == true) {
            System.out.println("The two land tracts are equal.");
        } else {
            System.out.println("The two land tracts are not equal.");
        }
    }
}
