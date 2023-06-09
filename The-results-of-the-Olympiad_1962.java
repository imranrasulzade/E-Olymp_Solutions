import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    TreeMap<Integer, ArrayList<Integer>> t = new TreeMap<Integer, ArrayList<Integer>>();
    int n = in.nextInt();
    while(n-- > 0) {
      int id = in.nextInt(), v = in.nextInt();
      if(!t.containsKey(v)) t.put(v, new ArrayList<Integer>());
      t.get(v).add(id);
    }

    for(int k : t.descendingKeySet()) {
      ArrayList<Integer> v = t.get(k);
      Collections.sort(v);
      for(int vv : v) System.out.println(vv + " " + k);
    }
  }
}