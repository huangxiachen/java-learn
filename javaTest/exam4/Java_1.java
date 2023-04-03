public class Java_1{
 
    public static void main(String[] args){

        //*********Found********
        
        int [] ages = {35,43,28,39,62,57,48,29,54,46}; 
        int sum = 0, avg = 0; 
        int tt = 0,fot = 0,fit = 0,st = 0; 

        for (int i=0; i<ages.length; i++){
            if (ages[i] <=40 )
                tt++;
            else if (ages[i] >40 && ages[i]<=50)
                fot++;
            else if (ages[i] >50 && ages[i]<=60)
                //*********Found********
                fit++;
            else 
                st++;
        }
   
        //*********Found********
        for (int i = 0; i<ages.length; i++)
            //*********Found********
            sum += ages[i];
        avg = sum/ages.length;

        System.out.println("<=40: "+tt+"     41-50: " +fot+"     51-60: " 
                            + fit +"     >=61: " + st);
    }
}
