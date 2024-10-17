package examcookie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListMapExam {

   public static void main(String[] args) {
      int [] arr = new int[3];
      arr[0] = 100; arr[1] = 200; arr[2] = 300; // int [] arr = {100,200,300};
      
      List<Integer> lis = new ArrayList<Integer>();
      lis.add(100); lis.add(200) ; lis.add(300);
      
      Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
      map1.put(0, 100); map1.put(1, 200); map1.put(3, 300);
      
      Map<String, Integer> map2 = new HashMap<String, Integer>();
      map2.put("백", 100); map2.put("이백", 200); map2.put("삼백", 300);
      
      System.out.println( arr[0] + ",    " + lis.get(0)  + ",    " + map1.get(0)  + ",    " + map2.get("삼백")  );

   }

}