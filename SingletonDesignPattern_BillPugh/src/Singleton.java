
public class Singleton {
   
    
    private Singleton()
    {
    	
    }
    
    private static class SingletonHolder
    {
    	private static final Singleton INSTANCE=new Singleton();
    }
    
    public static Singleton getSingleton()
    {
    	return SingletonHolder.INSTANCE;
    }
}
