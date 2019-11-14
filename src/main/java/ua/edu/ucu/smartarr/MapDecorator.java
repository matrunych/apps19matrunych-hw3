package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    final private MyFunction func;

    public MapDecorator(SmartArray arr, MyFunction func) {
        super(arr);
        this.func = func;
    }

    @Override
    public Object[] toArray() {
        Object[] arr = smartArray.toArray();
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = func.apply(arr[i]);
        }
        return arr;
    }

    @Override
    public String operationDescription() {
        return "Maped " + smartArray.operationDescription();
    }

    @Override
    public int size() {
        return this.toArray().length;
    }
}
