package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return arrayList.stream().max(Integer::compare).get();
    }

    public double getMinimum() {
        return arrayList.stream().min(Integer::compare).get();
    }

    public double getAverage() {
        return (double) arrayList.stream().reduce(0, Integer::sum)/arrayList.size();
    }

    public double getOrderedMedian() {
        if (arrayList.size() % 2 == 0) {
            int sumOfMiddleElements = arrayList.get(arrayList.size() / 2) + arrayList.get(arrayList.size() / 2 - 1);
            return ((double) sumOfMiddleElements) / 2;
        } else {
            return (double) arrayList.get(arrayList.size() / 2);
        }
    }

    public int getFirstEven() {
        return arrayList.stream().filter(f->f%2==0).findFirst().get();
    }

    public int getIndexOfFirstEven() {
        return arrayList.indexOf(arrayList.stream().filter(f->f%2==0).findFirst().get());
    }

    public boolean isEqual(List<Integer> arrayList) {
        return this.arrayList == arrayList;
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        if (arrayList.size()%2==0) {
            int sumOfMiddleElements = arrayList.get(arrayList.size() / 2) + arrayList.get(arrayList.size() / 2 - 1);
            return ((double) sumOfMiddleElements) / 2;
        } else {
            return (double) arrayList.get(arrayList.size() / 2);
        }
    }

    public int getLastOdd() {
        return arrayList.stream().reduce((first, second) -> second).orElse(-1);
    }

    public int getIndexOfLastOdd() {
        return arrayList.indexOf(arrayList.stream().reduce((first, second) -> second).orElse(-1));
    }
}
