/*Author: Shivam Kumar (2021MTCSE003)
Central University of Rajasthan
Date: 19-01-2023
*/

package strings;
import java.util.Scanner;

public class passwordGuess {

    //reverse string
    public static String reverseString(String str){
        String reversedString = "";
        for(int i = 0; i < str.length(); i++){
            reversedString = str.charAt(i) + reversedString;
        }

        return reversedString;
    }

    //change to uppercase
    public static String toUpperCase(String str){
        String upperCaseString =  "";
        for(int i = 0; i<str.length(); i ++){
            upperCaseString += Character.toUpperCase(str.charAt(i));
            }
        return upperCaseString;
        }

    //change to lowercase
    public static String toLowerCase(String str){
        String lowerCaseString =  "";
        for(int i = 0; i<str.length(); i ++){
            lowerCaseString += Character.toLowerCase(str.charAt(i));
        }
        return lowerCaseString;
    }

    //leet
    public static String leetCase(String str){

        str = str.replace('a', '@');
        str = str.replace('s', '&');
        str = str.replace('E', '3');
        str = str.replace('i', '!');
        str = str.replace('S', '$');
        str = str.replace('o', '0');
        str = str.replace('O', '0');
        str = str.replace('I', '|');
        str = str.replace('l', '/');
        str = str.replace('L', '1');
        str = str.replace('H', '#');
        str = str.replace('C', '(');
        str = str.replace('A', '^');
        str = str.replace('P', '?');
        str = str.replace('x', '*');
        str = str.replace('T', '7');
        return str;
        }

    //toggle string case
    public static String toggleCharsInString(String str){
        String toggledString =  "";
        int n = str.length();
        for(int i = 0; i<n; i ++){
            if(Character.isUpperCase(str.charAt(i))){
                toggledString += Character.toLowerCase(str.charAt(i));
            }
            else{
                toggledString += Character.toUpperCase(str.charAt(i));
            }
        }
        return toggledString;
    }

    // add @numbers at the end
    public static String addNumAtEnd(String str){
        String newString = str+"@123";
        return newString;
    }

    // add numbers@ at the beginning
    public static String addNumAtBeginning(String str){
        String newString = "123@"+str;
        return newString;
    }

    // swap half string
    public static String swap(String str){
        String swapString = "";
        int n = str.length();
        for(int i = n/2; i < n; i++){
            swapString += str.charAt(i);
        }
        for(int i = 0; i < n/2; i++){
            swapString += str.charAt(i);
        }
        return swapString;
    }

    // sequential alternative keys
    public static String seqAltKey(String str) {
        str = str.replace('0', ')');
        str = str.replace('1', '!');
        str = str.replace('2', '@');
        str = str.replace('3', '#');
        str = str.replace('4', '$');
        str = str.replace('5', '%');
        str = str.replace('6', '^');
        str = str.replace('7', '&');
        str = str.replace('8', '*');
        str = str.replace('9', '(');
        return str;
    }

    // main function
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Password Guessing Code");
        System.out.print("Enter a password:");
        String str = s.nextLine();

        //function calls
        String password1 = reverseString(str);
        String password2 = toUpperCase(str);
        String password3 = leetCase(str);
        String password4 = toggleCharsInString(str);
        String password5 = addNumAtEnd(str);
        String password6 = swap(str);
        String password7 = seqAltKey(str);
        String password8 = addNumAtBeginning(str);
        String password9 = toLowerCase(str);

        //output statements
        System.out.println("Possible passwords are: ");
        System.out.println("Password 1: "+password1);
        System.out.println("Password 2: "+password2);
        System.out.println("Password 3: "+password3);
        System.out.println("Password 4: "+password4);
        System.out.println("Password 5: "+password5);
        System.out.println("Password 6: "+password6);
        System.out.println("Password 7: "+password7);
        System.out.println("Password 8: "+password8);
        System.out.println("Password 9: "+password9);
    }

}
