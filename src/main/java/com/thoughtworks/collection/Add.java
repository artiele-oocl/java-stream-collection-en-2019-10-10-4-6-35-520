package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

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

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
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

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
