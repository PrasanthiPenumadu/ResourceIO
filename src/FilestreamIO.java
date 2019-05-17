
import java.io.*;
public class FilestreamIO {
    public static void main(String args[]){
        int i;
        FileInputStream fin=null;
        FileOutputStream fou=null;
        if(args.length!=2){
                       System.out.println("Usage : Copy  a file from file1 to file2 ");
            return;
        }
        try{
            fin=new FileInputStream(args[0]);
            fou=new FileOutputStream(args[1]);
            do{
                i=fin.read();
                if(i!=-1) fou.write(i);
            }while (i!=-1);
        }catch (IOException e){
            System.out.println("Error " +e);
        }
        finally {
            try{
               if(fin!=null)fin.close();
            }catch (IOException e){
                System.out.println("Error closing fin file ");
            }
            try{
                if(fou!=null)fou.close();
            }catch (IOException e){
                System.out.println("Error closing fou ");
            }

        }
    }
}









