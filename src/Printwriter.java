import java.io.*;
public class Printwriter {
    public static void main(String args[]){
        PrintWriter pw=new PrintWriter(System.out,true);
        pw.println("hello");
        int i=1000;
        pw.println(i);
        double d=99.99;
        pw.println(d);
    }
}
