//**********Found**********
class MyException extends Exception {
    private static final long serialVersionUID = 1L;
 
    public MyException() {
 
   }
 
    public MyException(String msg) {
	super(msg);
    }
 
    public MyException(String msg, int x) {
	super(msg);
	i = x;
    }
        
    //**********Found**********
    public int val() {
	return i;
    }
    
    //**********Found**********
    private int i;
}
 
public class Java_2 {
    //**********Found**********
    public static void a() throws MyException {
	System.out.println("Throwing MyException from a()");
	throw new MyException();
    }
 
    public static void b() throws MyException {
	System.out.println("Throwing MyException from b()");
	throw new MyException("Originated in b()");
    }
 
    public static void c() throws MyException {
	System.out.println("Throwing MyException from c()");
	//**********Found**********
        throw new MyException("Throwing MyException ic c()", 47);
    }
 
    public static void main(String[] args) {
	try {
	    a();
	//**********Found**********
        } catch (MyException e) {
	    e.getMessage();
	}
		
        try {
	    b();
	} catch (MyException e) {
	    e.toString();
	}
		
        try {
	    c();
	} catch (MyException e) {
	    e.printStackTrace();
	    System.out.println("error code: " + e.val());
	}
    }
}