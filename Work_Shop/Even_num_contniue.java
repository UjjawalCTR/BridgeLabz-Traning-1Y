public class Even_num_contniue {
    public static void main(String[] args) {
    int i = 0;
    while (i <= 20) {
      if (i%2==0) {
        i++;
        continue;
      }
      System.out.println(i);
      i++;
    }  
  }
}
