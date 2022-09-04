//逢7过
public class basic01_2 {
    public static void main(String[] args){
        for (int i = 1; i <= 100 ; i++) {
            int ten = i/10;
            int ge = i%10;
            if(i%7==0||ten==7||ge==7) {
                System.out.print(" "+"过");
                continue;
            }
            System.out.print(" "+i);
        }

    }
}
