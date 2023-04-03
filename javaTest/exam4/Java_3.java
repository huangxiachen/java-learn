//*********Found********
public class Java_3 ____________________{
    static RegistrationAgent agent;
    static boolean timetoquit=false;

    public static void main(String[] args){
        agent = new RegistrationAgent();
        Thread[] t= new Thread[3];
        for (int i=0; i<3; i++){
            t[i] = new Java_3();
            //*********Found********
            ____________________;
        }
    }

    public void run( ){   
        //*********Found********
        while (________________){
            boolean r = agent.reg();  
            if (!r) 
                timetoquit = true;
            try{
                Thread.sleep(2);
            }catch(Exception e){}
        }
    }
}

class RegistrationAgent {
    private int quota = 0;
    public boolean reg(){
        synchronized(this){
            if( quota < 10){
                //*********Found********
                _________________;
                System.out.print(Thread.currentThread().getName());
                System.out.println( " Registered one student, and total " + quota 
                                   +" students registered.");
                return true;
            }
            else
                //*********Found********
                ______________;
        }
    } 
}
