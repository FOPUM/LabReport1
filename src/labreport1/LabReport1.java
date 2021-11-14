/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labreport1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ming
 */
public class LabReport1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        // Question 1
//        System.out.println("Enter length of each side of triangle. ");
//        System.out.print("side 1: ");
//        double s1 = s.nextDouble();
//        System.out.print("side 2: ");
//        double s2 = s.nextDouble();
//        System.out.print("side 3: ");
//        double s3 = s.nextDouble();
//        
//        if (s1 + s2 <= s3 || s1 + s3 <= s2 || s2 + s3 <= s1){
//            System.out.println("Invalid triangle");
//        }else if ( s1 == s2 && s1 == s3){
//            System.out.println("Equilateral triangle");
//        }else if ( s1 == s2 || s1 == s3 || s2 == s3){
//            System.out.println("Isoscles triangle");
//        }else{
//            System.out.println("Scalene triangle");
//        }
        
        
        // Question 2
        
        int c1 = r.nextInt(4) + 1;
        int n1 = r.nextInt(10) + 1;
        int c2 = r.nextInt(4) + 1;
        int n2 = r.nextInt(10) + 1;
        String color1 = "";
        String color2 = "";
        
        switch(c1){
            case 1:
                color1 = "Yellow";
                break;
            case 2:
                color1 = "Green";
                break;
            case 3:
                color1 = "Blue";
                break;
            case 4:
                color1 = "Red";
                break;
        }
        
        switch(c2){
            case 1:
                color2 = "Yellow";
                break;
            case 2:
                color2 = "Green";
                break;
            case 3:
                color2 = "Blue";
                break;
            case 4:
                color2 = "Red";
                break;
        }
        
        System.out.println("Card 1 : " + color1 + " " + String.valueOf(n1));
        System.out.println("Card 2 : " + color2 + " " + String.valueOf(n2));
        
        if (n2 > n1 && n1 != 1){
            System.out.println("Card 2 is bigger");
        } else if (n1 > n2 && n2 != 1){
            System.out.println("Card 1 is bigger");
        } else if (n1 == n2){
            if (c2 > c1){
                System.out.println("Card 2 is bigger");
            }else if(c1> c2){
                System.out.println("Card 1 is bigger");
            }else{
            System.out.println("They are the same");
            }
        }
        
        
        // Question 3
        System.out.print("Enter Quadratic equation: ");
        String eq = s.nextLine();
//        String eq = "-x2 + x + 1";
        while(!eq.contains("x") || !eq.contains("x2")){
        System.out.println("This is not a valid quadratic equation please enter again!");
        System.out.print("Enter Quadratic equation: ");
        eq = s.nextLine();
        }
        // Remove whitespace
        eq = eq.replaceAll(" ","");
//        System.out.println(eq);
        char eqray[] = eq.toCharArray();
        int j =0;
        int xnum = 1;
        int max = eqray.length;
        String astring = "";
        String bstring = "";
         String cstring = "";
        
            for(int i = 0; i < eq.length(); i++){
            if(eqray[i] == '+' || eqray[i] == '-'){
                if(xnum == 1){
                    while(j < i){
                        if(((j-1) == -1) && eqray[j] == 'x'){
                        astring += 1;
                        }
                    astring = astring + eqray[j];
                    j++;   
                    
                    }
                xnum++;
                i++;
                System.out.println("i: " +i);
                }
            }
            if(eqray[i] == '+' || eqray[i] == '-'){
                if(xnum==2){
                    
                    while(j<i){
                        bstring = bstring + eqray[j];
                        j++;
                    }
                    xnum++;
                    i++;
                    System.out.println("j: " +j);
                    System.out.println("i: " +i);
                }
            }
                if(xnum==3){
                    
                    while(j<max){
                        cstring = cstring + eqray[j];
                        j++;
                        System.out.println("j: " +j);
                    }
                    
                }
        }
        
        astring = astring.replace("x2", "");
        bstring = bstring.replace("x","");
        
        
        System.out.println("astring: " +astring);
        System.out.println("bstring: " +bstring);
        System.out.println("cstring: " +cstring);
        
        int a = Integer.parseInt(astring);
        int b = Integer.parseInt(bstring);
        int c = Integer.parseInt(cstring);
        
        System.out.println("a: " +a);
        System.out.println("b: " +b);
        System.out.println("c: " +c);
        
        double x1 = 0;
        double x2 = 0;
        double d = b*b - 4.0*a*c;
        if (d == 0){
            x1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The quadratic equation has 1 root");
            System.out.println("x = " + x1);
        }else if (d > 0){
            x1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            x2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The quadratic equation has 2 roots");
            System.out.println("x = " + x1);
            System.out.println("x = " + x2);
        } else if (d < 0){
            System.out.println("The quadratic equation has 0 root");
            System.out.println("No solution");
        }   
    
        
        // Initialise the variable
//        int previousX = 0;
//        int lasXindex = 0;
//        int lasXindex2 = 0;
//        String a1String = "";
//        String a2String = "";
//        String a3String = "";
//        
//        // Solve for a
//        for (int i = 0; i < eq.length(); i ++){
//            // Check for the index of x square
//            if (eqray[i] == '2' && eqray[previousX] == 'x'){
//                // Check if x2 is +1 
//                if (i - 1 == 0){
//                    a1String = "1";
//                    lasXindex = 2;
//                    break;
//                }
//                // Sub the values of a into a1String
//                for (int j = 0; j < i-1; j ++){
//                    a1String += eqray[j];
//                }
//                lasXindex += i;
//            }
//            previousX = i;
//        }
//        // If a is -1
//        if(a1String.equals("-")){
//            a1String += "1";
//            lasXindex = 3;
//        }
//        
//        
//        // Check for the index of b
//        for (int i = 0; i < eq.length(); i ++){
//            // Check for the location of x and update r2String
//            if (eqray[previousX] == 'x'){
//                for (int j = lasXindex; j < i-1; j ++){
//                    a2String += eqray[j];
//                }
//                lasXindex2 = i;
//            }
//            previousX = i;
//        }
//        // Check if r2String is equals to +1 or -1
//        if(a2String.equals("-")){
//            a2String += "1";
//            lasXindex2 = lasXindex + 2;
//        }else if (a2String.equals("+")){
//            a2String = "1";
//            lasXindex2 = lasXindex + 2;
//        }
//
//        // Update the value of r3String
//        for (int i = eq.length()-1; i >= lasXindex2; i --){
//            if (lasXindex2 - 1 == eq.length()){
//                a3String = "0";
//                break;
//            }
//            a3String = eqray[i] + a3String;
//        }
//        
//        /*System.out.println(a1String);
//        System.out.println(a2String);
//        System.out.println(a3String);*/
//        
//        int a = Integer.parseInt(a1String);
//        int b = Integer.parseInt(a2String);
//        int c = Integer.parseInt(a3String);
//        
//        // System.out.println(a + " " + b + " " + c);
//        
//        double x1 = 0;
//        double x2 = 0;
//        double d = b*b - 4.0*a*c;
//        
//        if (d == 0){
//            x1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
//            System.out.println("The quadratic equation has 1 root");
//            System.out.println("x = " + x1);
//        }else if (d > 0){
//            x1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
//            x2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
//            System.out.println("The quadratic equation has 2 roots");
//            System.out.println("x = " + x1);
//            System.out.println("x = " + x2);
//        } else if (d < 0){
//            System.out.println("The quadratic equation has 0 root");
//            System.out.println("No solution");
//        }   
    }   
}
