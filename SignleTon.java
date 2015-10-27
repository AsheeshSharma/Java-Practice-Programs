package myPack;

public class SignleTon {

	    private static SignleTon t;
	    static
	    {
	        t=new SignleTon();
	    };
	    private SignleTon()
	    {
	        
	    }
	    public static SignleTon getIns()
	    {
	        return t;
	    }
	    public void test()
	    {
	        System.out.println("Hi");
	    }
	    public static void main(String[] args) {
	    	SignleTon y=getIns();
	        y.test();
	    }
	}

