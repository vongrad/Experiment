/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package experiment1;

import java.util.Arrays;

/**
 *
 * @author adamv_000
 */
public class Toolkit {
    
   public static String reverseStringRecursion(String text){
       return text.length() == 0 ? "" : reverseStringRecursion(text.substring(1)) + text.charAt(0);
   }
   
   public static String reverseStringNormal(String text){
       
       String tmp;
       String[] charArr = text.split("");
       
       
       for (int i = 0; i < charArr.length / 2; i++) {
           tmp = charArr[i];
           charArr[i] = charArr[charArr.length -1 - i];
           charArr[charArr.length - 1 - i] = tmp;
       }
       return Arrays.toString(charArr);
   }
   

    
    
    
    
}
