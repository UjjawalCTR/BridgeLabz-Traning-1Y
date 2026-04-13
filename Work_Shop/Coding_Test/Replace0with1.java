package Assignment;
public class Replace0with1 {
    public static  void main (String[] args){
        int a = 409400875;
        String sample = Integer.toString(a);
        String s = "";
        for ( int i = 0 ; i < sample.length() ; i++ ){
            if ( sample.charAt(i) == '0'){
                s+='1';
            }
            else {
                s+=sample.charAt(i);
            }
        }
        System.out.println(s);
    }
}