package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.Arrays;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    private MyPredicate predicate;

    public FilterDecorator(SmartArray arr, MyPredicate predicate) {
        super(arr);
        this.predicate = predicate;
    }

    @Override
    public Object[] toArray() {
        Object[] arr = smartArray.toArray();
        Object[] tmp = new Object[arr.length];

        int count = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (predicate.test(arr[i])) {
                tmp[count] = arr[i];
                count++;
            }
        }
        return Arrays.copyOf(tmp, count);
    }

    @Override
    public String operationDescription() {
        return "Filtered " + smartArray.operationDescription();
    }

    @Override
    public int size() {
        return this.toArray().length;
    }


}
