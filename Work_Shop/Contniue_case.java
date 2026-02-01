public class Contniue_case {
    public static void main(String[] args) {
    int i = 0;
    while (i < 10) {
      if (i == 3) {
        i++;
        continue;
      }
      System.out.println(i);
      i++;
    }  
  }
}
