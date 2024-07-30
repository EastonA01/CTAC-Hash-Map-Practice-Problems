package org.example;
import java.util.HashMap;

public class IOU {
    HashMap<String,java.lang.Double> hashmap;

    // constructor public IOU() creates a new IOU
    public IOU() {
        this.hashmap = new HashMap<>();
    }

    // saves the amount owed and the person owed to- to the IOU.
    public void setSum(String toWhom, double amount){
        this.hashmap.put(toWhom, amount);
    }

    // returns the amount owed to the person whose name is given as a
    // parameter. If the person cannot be found, it returns 0.
    public double howMuchDoIOweTo(String toWhom){
        for ( String key : hashmap.keySet()){
            if (toWhom.equals(key)){
                return hashmap.get(key);
            }
        }
        return 0;
    }


    public static void main(String[] args){
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}
