//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map <String,Integer> myMap= new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            myMap.put(name,phone);
            // Write code here
        }
        while(in.hasNext()){
             
        String name = in.next();
            if (myMap.containsKey(name)) {
                int phone = myMap.get(name);
                System.out.println(name + "=" + phone);
            } else System.out.println("Not found");
        }
        in.close();
    }
}
