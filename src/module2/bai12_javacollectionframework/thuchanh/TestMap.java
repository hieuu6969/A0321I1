package module2.bai12_javacollectionframework.thuchanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        //creat HashMap to store Student's name and age
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        //create TreeMap to store key in descending order of key
        Map<String, Integer> treeMap = new TreeMap<> (hashMap);
        System.out.println("Display entries in descending order of key");
        System.out.println(treeMap);

        //create LinkedHashMap to store Students' info and display them
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 30);
        linkedHashMap.put("Lewis", 30);
        linkedHashMap.put("Cook", 30);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
