package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(n->n*3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        HashMap<Integer, String> numLetterMap = new HashMap<>();
        List<String> mapLetter = new ArrayList<>();
        for (String letter : letterList) {
            numLetterMap.put(letterList.indexOf(letter)+1, letter);
        }
        array.forEach(e-> {
            if (numLetterMap.containsKey(e)) mapLetter.add(numLetterMap.get(e));
        });
        return mapLetter;
    }

    public List<String> mapLetters() {
        throw new NotImplementedException();
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted().collect(Collectors.toList());
    }
}
