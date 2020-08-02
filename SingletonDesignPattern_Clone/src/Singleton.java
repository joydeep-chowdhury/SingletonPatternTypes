
public class Singleton implements Cloneable{
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

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
//		return super.clone();
		throw new CloneNotSupportedException("Cannot create clone of singleton");
	}
    
    
}
