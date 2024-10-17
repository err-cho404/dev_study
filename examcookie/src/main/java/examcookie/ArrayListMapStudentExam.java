package examcookie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListMapStudentExam {

   public static void main(String[] args) {
      Student [] arrSts = new Student[3];
      arrSts[0] = new Student(); arrSts[1] = new Student(); arrSts[2] = new Student(); 
      
      List<Student> lis = new ArrayList<>();
      lis.add(new Student()); lis.add(new Student()) ; lis.add(new Student());
      
      Map<Integer, Student> map1 = new HashMap<>();
      map1.put(0, new Student()); map1.put(1, new Student()); map1.put(3, new Student());
      
      Map<String, Student> map2 = new HashMap<String, Student>();
      map2.put("1bun", new Student()); map2.put("2bun", new Student()); map2.put("3bun", new Student());
      
      System.out.println( arrSts[0] + ",    " + lis.get(0)  + ",    " + map1.get(0)  + ",    " + map2.get("삼백")  );
      

   }

}