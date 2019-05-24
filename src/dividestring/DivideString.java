/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dividestring;

import java.util.Scanner;

/**
 * Java Program to divide a string in 'N' equal parts.
Here, our task is to divide the string S into n equal parts. We will print an error message if the string cannot be divisible into n equal parts otherwise all the parts need to be printed as the output of the program.
 *
 * @author MCSD
 */
public class DivideString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter charecter : ");    
         String str = sc.next();
        int len = str.length(); 
        System.out.println("Enter number you want to Divide : ");
        int n = sc.nextInt();  
        int temp = 0, chars = len/n;  
        String[] equalStr = new String [n];  
        if(len % n != 0) {  
            System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");  
        }  
        else {  
            for(int i = 0; i < len; i = i+chars) {  
                //Dividing string in n equal part using substring()  
                String part = str.substring(i, i+chars);  
                equalStr[temp] = part;  
                temp++;  
            }  
    System.out.println(n + " equal parts of given string are ");  
            for(int i = 0; i < equalStr.length; i++) {  
                System.out.println(equalStr[i]);  
                }  
            }  
    }
    
}
