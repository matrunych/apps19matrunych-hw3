package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Base array for decorators
public class BaseArray implements SmartArray {
    private Object[] myArr;

    public BaseArray(Object[] arr) {
        this.myArr = arr;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(myArr, myArr.length);
    }

    @Override
    public String operationDescription() {
        return "Base array";
    }

    @Override
    public int size() {
        return myArr.length;
    }


}
