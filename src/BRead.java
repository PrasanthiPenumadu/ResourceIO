import java.io.*;//reading char and strings
public class BRead {
    public static void main(String args[])throws IOException{
      char c;
        String str;
        String s[]=new String[10];
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter q to quit");
        System.out.println("Enter text and stop to quit");
      do{
          c=(char) br.read();
          System.out.println(c);
      }while(c!='q');
      do {
          str=br.readLine();
          System.out.println(str);
      }while(!str.equals("stop"));

        System.out.println("Enter array of 10 lines text and stop to quit");
        for(int i=0;i<10;i++) {
            s[i] = br.readLine();
            if (s[i].equals("stop")) break;
        }
        System.out.println("Your array is here: ");
        for(int i=0;i<10;i++){
            if (s[i].equals("stop")) break;
            System.out.println(s[i]);
        }

    }
}
