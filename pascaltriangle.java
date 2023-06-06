import java.util.*;
public class pascaltriangle {


    //2nd problem of the day tada
    
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> finallist = new ArrayList<>();
    for (int i = 1; i <= numRows; i++) {
      List<Integer> al = new ArrayList<>();
      if (i == 1) al.add(1); else if (i == 2) {
        al.add(1);
        al.add(1);
      } else {
        al.add(1);
        for (int j = 1; j < i - 1; j++) al.add(
          finallist.get(i - 2).get(j - 1) + finallist.get(i - 2).get(j)
        );
        al.add(1);
      }
      finallist.add(al);
    }
    return finallist;
  }
}
