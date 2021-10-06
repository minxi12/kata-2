package kata02_44;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata02_44 {
    public static void main(String[]args) {
        int data[] = {0,15,0,0,8,1,68,5,6,1,4,5,8,7,9,1};
        
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }        
    }
}



