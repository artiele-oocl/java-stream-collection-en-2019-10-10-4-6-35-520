package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sumOfEvens = 0;
        int start = leftBorder;
        int end = rightBorder;
        if (leftBorder > rightBorder) {
            start = rightBorder;
            end = leftBorder;
        }
       for(int i = start; i <= end; i++){
           if(i % 2 == 0)  sumOfEvens += i;
       }
       return sumOfEvens;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sumOfEvens = 0;
        int start = leftBorder;
        int end = rightBorder;
        if (leftBorder > rightBorder) {
            start = rightBorder;
            end = leftBorder;
        }
        for(int i = start; i <= end; i++){
            if(i % 2 != 0)  sumOfEvens += i;
        }
        return sumOfEvens;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
       return arrayList.stream()
               .reduce(0, (subtotal, element) -> subtotal + (element * 3) + 2);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream()
                .map(num -> num%2!=0 ? 2+(num*3) : num)
                .collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream()
                .filter(f -> f%2 != 0)
                .reduce(0,(subtotal, element)-> subtotal + (element * 3) + 5);
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        Collections.sort(arrayList);
        double median;
        int totalElements = arrayList.size();
        // check if total number of scores is even
        if (totalElements % 2 == 0) {
            int sumOfMiddleElements = arrayList.get(totalElements / 2) + arrayList.get(totalElements / 2 - 1);
            // calculate average of middle elements
            median = ((double) sumOfMiddleElements) / 2;
        } else {
            // get the middle element
            median = (double) arrayList.get(arrayList.size() / 2);
        }
        return median;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        List<Integer> even = new ArrayList<>();
        arrayList.forEach((n) -> {
            if (n%2==0) even.add(n);
        });
        return even.stream().reduce(0,(total, element)-> total + element)/even.size();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrayList.size()-1; i++) {
            result.add(3*(arrayList.get(i) + arrayList.get(i + 1)));
        }
        return result;
    }
}
