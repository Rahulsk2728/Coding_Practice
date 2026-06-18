package practice;

public class Reverse {

     public static void main(String[] args) {



      System.out.println(reverseWords("This is it by Micheal jackson"));


     }

     public static String reverseWords( String sentence) {

      String [] revWords = sentence.trim().split("\\s+");

      StringBuilder revresed = new StringBuilder();

      for ( int i= revWords.length-1; i>=0;i--) {

        revresed= revresed.append(revWords[i]);
        if( i >=0) {
            revresed.append(" ");
        }
      }
   return revresed.toString();


     } 

    
}
