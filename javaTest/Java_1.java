public class Java_1 {
    public static void main(String[] args) {
        //*********Found********
        int []f= new int [10];
        f[0]=f[1]=1;
        //*********Found********
        for (int i =2;i<10;i++)
            f[i]=f[i-1]+f[i-2];
        //*********Found********
        for (int i=0;i<f.length;i++)
        //*********Found********
            System.out.print(f[i]+"  ");
    }
    
}