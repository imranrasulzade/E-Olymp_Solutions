import java.util.*;

class MyTime
{
  int hour;
  int min;
  int sec;
  public MyTime(int hour, int min, int sec)
  {
    this.hour = hour;
    this.min = min;
    this.sec = sec;
  }
}

public class Main
{
  public static class MyFun implements Comparator<MyTime>
  {
    public int compare(MyTime a, MyTime b)
    {
      if (a.hour == b.hour && a.min == b.min) return a.sec - b.sec;
      if (a.hour == b.hour) return a.min - b.min;
      return a.hour - b.hour;
    }
  }

  public static void main(String[] args)
  {
    Scanner con = new Scanner(System.in);
    int n = con.nextInt();
    
    ArrayList<MyTime> tm = new ArrayList<MyTime>();   

    for (int i = 0; i < n; i++)

      tm.add(new MyTime(con.nextInt(), con.nextInt(), con.nextInt()));

 
    Collections.sort(tm, new MyFun());   

 
    for (int i = 0; i < n; i++)

      System.out.println(tm.get(i).hour + " " + tm.get(i).min + " " +  tm.get(i).sec);

    con.close();
  }
}