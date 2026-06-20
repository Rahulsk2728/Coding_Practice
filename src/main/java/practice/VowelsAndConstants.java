package practice;

import java.util.HashMap;
import java.util.Map;

public class VowelsAndConstants {
    
    public static void main(String[] args) {

        String name = "Rahul";

        String words = name.toLowerCase();

        int vowels = 0;
        int constants = 0;

        for (int i = 0; i < words.length(); i++) {

            Character ch = words.charAt(i);

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'i' || ch == 'o' || ch == 'u') {

                    vowels++;
                } else {
                    constants++;
                }


            }


        }
        System.out.println(" the number of cons are" + constants);
        System.out.println(" the number of vowels are" + vowels);


    }
}
