package org.example;
import java.util.HashMap;

/*
In the main-method create a new HashMap<String,String> object.
Store the names and nicknames of the following people in this hashmap so,
that the name is the key and the nickname is the value.
Use only lower case letters.
*/
public class Nicknames {
    public static void main(String[] args) {
        HashMap<String,String> hashmap = new HashMap<>();
        hashmap.put("matthew","matt");
        hashmap.put("michael","mix");
        hashmap.put("arthur", "artie");
        // Get matthew's nickname from hashmap and print it.
        String nickname = hashmap.get("matthew");
        System.out.println(nickname);
    }
}
