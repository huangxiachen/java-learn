import java.io.*;
public class Java_2 {
    public static void main(String[] args) {
         try {
            //**********found**********
            FileInputStream in = new FileInputStream("in.txt");
            FileOutputStream out = new FileOutputStream("out.txt");
            BufferedInputStream bufferedIn = new BufferedInputStream(in);
            //**********found**********
            BufferedOutputStream bufferedOut = new BufferedOutputStream(out);
            //**********found**********
            byte[] data = new byte[1];
            //**********found**********
            while(bufferedIn.read(data) != -1) {
                  bufferedOut.write(data);
            }
            bufferedOut.flush();
            bufferedIn.close();
            //**********found**********
            bufferedOut.close();
        //**********found**********
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
