import java.util.Scanner;


public class Recursao {
    
    public static boolean isPalindrome(String str)  {
        if (str.length() <= 1) {
            return true;
        }
       return str.charAt(0) == str.charAt(str.length()-1) && isPalindrome(str.substring(1,str.length()-1)); 
    }
    
    public static void man(String[] args) {
                  
        String str = "rsotor";
        //isPalindrome(str);
        System.out.println(isPalindrome(str));
        
        //int tam = nome.length();  
        
        
        
        

        
        
        
    }
}