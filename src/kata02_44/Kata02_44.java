package kata02_44;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata02_44 {
    public static void main(String[]args) {
        int data[] = {0,15,0,0,8,1,68,5,6,1,4,5,8,7,9,1};
        
        Map<Integer,Integer> histogram = new HashMap<Integer, Integer>();

        
        /*for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }*/
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{
                histogram.put(data[i], 1);
            }   
        }
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }        
                
/*


        //Map<Integer, Integer> data = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 123);
        map.put(2, 123);
        map.put(3, 123);
        map.put(4, 123);
        map.put(5, 125);
        map.put(6, 126);
        map.put(4, 42);
        map.put(5, 42);
        // Metodo 1

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println ("M1: Key = " + entry.getKey () +  ", Value = " + entry.getValue());
        }
        // Metodo 2
        //iterar solo sobre claves
        for (Integer key : map.keySet()) {
            System.out.println("M2: Key = " + key);
        }
        //iterar solo sobre valores
        for (Integer value : map.values()) {
            System.out.println("M2: Value = " + value);
        }
        // Metodo 3
        Iterator<Map.Entry<Integer, Integer>> entries1 = map.entrySet().iterator();
        while (entries1.hasNext()) {
            Map.Entry<Integer, Integer > entry = entries1.next();
            System.out.println("M3a: Key = " + entry.getKey () +  ", Value = " + entry.getValue());
        }
        Iterator entries2 = map.entrySet().iterator();

        while (entries2.hasNext()) {
            Map.Entry entry = (Map.Entry) entries2.next();
            Integer key = (Integer) entry.getKey();
            Integer value = (Integer) entry.getValue();
            System.out.println("M3b: Key = " + key + ", Value = " + value);
        }
        // Metodo 4
        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("M4: Key = " + key + ", Value = " + value);
        }*/
    }
}



