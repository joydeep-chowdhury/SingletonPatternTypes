import java.io.Serializable;

public class Singleton implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static  Singleton INSTANCE=null;
    
    private Singleton()
    {
    	
    }
    
    static {
    	try
    	{
    		if(INSTANCE==null)
    			INSTANCE=new Singleton();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    public static Singleton getSingleton()
    {
    	return INSTANCE;
    }
    
    private Object readResolve()
    {
    	return getSingleton();
    }
}
