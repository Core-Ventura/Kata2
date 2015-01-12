package kata2;

import java.util.HashMap;
public class Kata2 {
  
    public static void main(String[] args) {
        
        System.out.println("ENUNCIADO CAMPUS VIRTUAL");
        System.out.println("");
        
        int[] vectorKata2 = {1,4,7,1,1,8,4,1,4,9};
        HashMap<Integer,Integer> frecKata2 = new HashMap<>();
        
        for (int i = 0; i < vectorKata2.length; i++) {
            if(frecKata2.containsKey(vectorKata2[i]) == false ){
                frecKata2.put(vectorKata2[i],1);
            } else {
                frecKata2.put(vectorKata2[i],frecKata2.get(vectorKata2[i])+1);
            }
        }
        
        for (int n : frecKata2.keySet()) {
            System.out.println(n + "->" + frecKata2.get(n));
        }
        
        System.out.println("");
        System.out.println("ENUNCIADO KATA 2");
        System.out.println("");
        
        int[] vectorEnunciadoKata2 = {2,2,11,4,2,6,11,2,3,5,11,5};
        HashMap<Integer,Integer> frecEnunciadoKata2 = new HashMap<>();
        
        for (int i = 0; i < vectorEnunciadoKata2.length; i++) {
            if(frecEnunciadoKata2.containsKey(vectorEnunciadoKata2[i]) == false ){
                frecEnunciadoKata2.put(vectorEnunciadoKata2[i],1);
            } else {
                frecEnunciadoKata2.put(vectorEnunciadoKata2[i],frecEnunciadoKata2.get(vectorEnunciadoKata2[i])+1);
            }
        }
        
        for (int n : frecEnunciadoKata2.keySet()) {
            System.out.println(n + "->" + frecEnunciadoKata2.get(n));
        }
    } 
    
}
