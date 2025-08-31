package august._30_08_25;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ListIntegerA {
    public static void main(String[] args) {
        //a
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.removeIf(integer -> integer < 10 && integer % 2 == 0);
        System.out.println(integers);
        //b
        List<String> words = new ArrayList<>();
        words.add("red");
        words.add("blue");
        words.add("black");
        words.add("white");
        words.add("yellow");
        words.replaceAll(string -> {
            String firstLetter = string.substring(0, 1);
            String otherWordPart = string.substring(1);
            firstLetter = firstLetter.toUpperCase();
            return firstLetter + otherWordPart;
        });
        System.out.println(words);
        //c
        List<String> wordsC = new ArrayList<>();
        wordsC.add("boby");
        wordsC.add("wrong");
        wordsC.add("to");
        wordsC.add("machine");
        wordsC.add("tor");
        wordsC.sort((o1, o2) -> {
            if (o1.length() > o2.length()) {
                return 1;
            } else if (o1.length() == o2.length()) {
                return 0;
            }
            return -1;
        });
        System.out.println(wordsC);
        //d
        HashMap<String, Integer> productCount = new HashMap<>();
        productCount.put("toys", 5);
        productCount.put("bananas", 3);
        productCount.put("tomatoes", 8);
        productCount.replaceAll((_, count) -> count + 5);
        System.out.println(productCount.toString());
        //e
        HashMap<String, Double> products = new HashMap<>();
        products.put("cars", 120.0);
        products.put("bags", 30.0);
        products.put("apples", 140.0);
        products.put("shoes", 50.0);
        products.forEach((product, count) -> {
         if (count > 100) {
             System.out.print(product + " ");
         }
        });
        System.out.println();
        //f
        HashMap<String, Integer> examResults = new HashMap<>();
        examResults.put("ivan", 50);
        examResults.put("alex", 0);
        examResults.put("sarah", 0);
        examResults.put("borya", 120);
        examResults.forEach((name, result) -> {
            if (result > 0) {
                result += 10;
            }
            System.out.println(name + ": " + result);
        });
        //g
        HashMap<String, Integer> order = new HashMap<>();
        order.put("pens", 5);
        addOrder(order, "toys");
        System.out.println(order);
        //h
        List<String> strings = new ArrayList<>();
        strings.add("ivjo");
        strings.add("ijvcdwi");
        strings.add("duinc");
        strings.add("oijvwi");
        strings.add("pkv");
        
        strings.forEach(string -> {
        });
    }
    public static void addOrder(HashMap<String, Integer> hashMap, String name) {
        if (hashMap.containsKey(name)) {
            int currentCount = hashMap.get(name);//hashMap.get(name) += in.nextInt();
            currentCount++;
            hashMap.replace(name, currentCount);
        } else {
            hashMap.put(name, 1);
        }
    }
}
