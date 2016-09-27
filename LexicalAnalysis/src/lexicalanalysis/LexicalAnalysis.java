/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicalanalysis;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author April
 */
public class LexicalAnalysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lexAnalysis();
    }
    
    public static void lexAnalysis(){
        String str = null;
        try {
            Scanner input;
            input = new Scanner(new File("C:\\Users\\April\\Documents\\NetbeansProjects\\LexicalAnalysis\\src\\lexicalanalysis\\input.txt"));
            str = input.nextLine();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LexicalAnalysis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        for (int i = 0; i<str.length(); i++){
            switch(str.charAt(i)){
            case '-':
                System.out.println("-   Minus\n");
                break;
            case '+':
                System.out.println("+   Plus\n");
                break;
            case '*':
                System.out.println("*   Times\n");
                break;
            case '/':
                System.out.println("/   Divide\n");
                break;
            case '=':
                System.out.println("=   Equals\n");
                break;
            case '(':
                System.out.println("(   LParen\n");
                break;
            case ')':
                System.out.println(")   RParen\n");
                break;
            default:
                if (isDigit(str.charAt(i))){
                    System.out.println(str.charAt(i)+"   Number\n"); 
                }
                else if (isLetter(str.charAt(i))){
                    System.out.println(str.charAt(i)+"   Identifier\n");
                }
            
            }
        }
        
    }
    
}
