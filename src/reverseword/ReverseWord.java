/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverseword;

import java.util.Scanner;

/**
 *
 * @author shar1348
 */
public class ReverseWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    String word = input.next();
    //need char array to store each characters of word
    char[] reverse = new char[word.length()];
    for(int i = 0; i<word.length();i++)
    {
       reverse[i]=word.charAt(i);
    }
    
    for(int i=reverse.length-1; i>=0; i--)
    {
        System.out.println(reverse[i]);
    }
        }
    
    
}