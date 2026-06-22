package practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

    public static void main(String[] args) {



        String sentence = "thisisthebestworldcup";

        HashMap<Character, Integer> map = new HashMap<>();

        for( char str : sentence.toLowerCase().toCharArray()) {

            map.put(str , map.getOrDefault(str ,0)+1);

        }

        System.out.println("The duplicate characters in a string are");

        for(Map.Entry<Character , Integer> entry: map.entrySet()) {

                if ( entry.getValue() >1)
            System.out.println(entry.getKey()+ " "+ entry.getValue());

        }


    }


}
