package ua.edu.ucu.smartarr;

import java.util.ArrayList;


// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {
    public DistinctDecorator(SmartArray smartArr) {
        super(smartArr);
    }

    public Object[] toArray() {
        Object[] objects = smartArray.toArray();
        ArrayList<Object> arr = new ArrayList<Object>();
        for (int i = 0; i < objects.length; i++) {
            arr.add(objects[i]);
        }
        for (int j = 0; j < arr.size(); j++) {
            for (int k = j + 1; k < arr.size(); k++) {
                if (arr.get(k).toString().equals(arr.get(j).toString())) {
                    arr.remove(j);
                }
            }
        }

        Object[] final_objects = new Object[arr.size()];
        for (int j = 0; j < arr.size(); j++) {
            final_objects[j] = arr.get(j);
        }
        return final_objects;
    }

    @Override
    public String operationDescription() {
        return "Distincted " + smartArray.operationDescription();
    }

    @Override
    public int size() {
        return this.toArray().length;
    }

}
