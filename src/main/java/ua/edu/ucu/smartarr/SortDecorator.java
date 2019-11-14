package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {
    private MyComparator comparator;

    public SortDecorator(SmartArray arr, MyComparator cmp) {
        super(arr);
        this.comparator = cmp;
    }

    @Override
    public Object[] toArray() {
        Object[] newArr = smartArray.toArray();
        Arrays.sort(newArr, comparator);
        return newArr;
    }

    @Override
    public String operationDescription() {
        return "Sorted " + smartArray.operationDescription();
    }

    @Override
    public int size() {
        return this.toArray().length;
    }
}
