
public class Singleton {
    private static  Singleton INSTANCE=null;
    
    private Singleton()
    {
    	
    }
    
    public static Singleton getSingleton()
    {
    	if(INSTANCE==null)
			INSTANCE=new Singleton();
    	return INSTANCE;
    }
}
