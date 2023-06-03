/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eighteenconvert;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author nikka
 */
public class EighteenConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //let the user input 4 integers and convert it into letters. Given the intArray with elements
        //{0,1,2,3} and stringArray {'A','B','C','D'} where element 0 = A, 1 = B, 2 = C, and 3 = D
        //return a new 4-element array with the converted integers as its elements
        // if the number is not in the given array, return "X"
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter four numbers: ");
    int[] userNumbers = new int[4];
    
    String[] theLetters = {"A","B","C","D"};
    for (int i = 0; i < 4; i++) {
        userNumbers[i] = scan.nextInt();
}
    
    String[] convertedLetters = new String[4];
    for (int i = 0; i < 4; i++) {
        int num = userNumbers[i];
            if (num >= 0 && num < theLetters.length) {
            convertedLetters[i] = theLetters[num];
        } 
            else {
        convertedLetters[i] = "X";
        }
}
System.out.println(Arrays.toString(convertedLetters));
    
    }
}
    