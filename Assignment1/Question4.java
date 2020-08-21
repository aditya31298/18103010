
package com.company;
import java.util.Scanner;
import java.util.*;

public class Question4 {

    public static void main(String[] args) {
	 
        Scanner scanner = new Scanner(System.in); 
       
        System.out.print("input string1: ");
        String s = scanner.next();
        System.out.print("input string2: ");
        String r = scanner.next();
 
        if(s.length()!=r.length()) {
            System.out.println("strings are not anagrams");
        }
        else {
            char[] temp1 = s.toCharArray();
            Arrays.sort(temp1);
            s = new String(temp1);

            char[] temp2 = r.toCharArray();
            Arrays.sort(temp2);
            r = new String(temp2);

          
            boolean same = true;
            for(int i=0;i<s.length();++i)
            {
                if(s.charAt(i) != r.charAt(i))
                {
                    same = false;
                    break;
                }
            }
          
            if(same){
                System.out.println("given strings are anagrams!");
            }
            else {
                System.out.println("given strings are not anagrams!");
            }
        }
    }
}
