package kata02_44;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Histogram {
    private int data[];
    
    public Histogram(int[] data){
        this.data = data;
    }
    
    public int[] getData(){
        return this.data;
    }
    
    public Map getHistogram(){
        Map<Integer, Integer>histogram = new HashMap<Integer, Integer>();
        for (int key : this.data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        return histogram;
    }
}
