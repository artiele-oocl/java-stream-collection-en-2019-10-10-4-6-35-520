package com.thoughtworks.collection;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> getListByInterval = new ArrayList<>();
        for (int i = Math.min(left,right); i <= Math.max(left,right) ; i++) {
            getListByInterval.add(i);
        }
        if (left >= right) getListByInterval.sort(Comparator.reverseOrder());
        return getListByInterval;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> getEvenListByIntervals = new ArrayList<>();
        for (int i = Math.min(left,right); i <= Math.max(left,right) ; i++) {
            if (i%2==0) getEvenListByIntervals.add(i);
        }
        if (left >= right) getEvenListByIntervals.sort(Comparator.reverseOrder());
        return getEvenListByIntervals;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> popEvenElments = new ArrayList<Integer>();
        List<Integer> intList = new ArrayList<Integer>();
        for (int i : array) intList.add(i);
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.addAll(intList);
        while (!ll.isEmpty()) {
            Integer num = ll.pop();
            if (num%2 == 0) popEvenElments.add(num);
        }
        return popEvenElments;
    }

    public int popLastElment(int[] array) {
        List<Integer> intList = new ArrayList<Integer>();
        for (int i : array) intList.add(i);
        Stack<Integer> stack = new Stack<Integer>();
        stack.addAll(intList);
        return stack.pop();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> firstList = new ArrayList<Integer>();
        for (int i : firstArray) firstList.add(i);
        List<Integer> secondList = new ArrayList<Integer>();
        for (int i : secondArray) secondList.add(i);
        return firstList.stream()
                .distinct()
                .filter(secondList::contains)
                .collect(Collectors.toList());
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> firstList = new ArrayList<Integer>();
        for (int i : firstArray) firstList.add(i);
        List<Integer> secondList = new ArrayList<Integer>();
        for (int i : secondArray) secondList.add(i);
        secondList.forEach((i)-> {
            if (!firstList.contains(i)) firstList.add(i);
        });
        return firstList;
    }
}
