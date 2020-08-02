import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {
  public static void main(String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
  {
	  Singleton inst1=Singleton.getSingleton();
	  Singleton inst2=Singleton.getSingleton();
	  Singleton inst3=null;
	  Constructor<?>[] constructors=Singleton.class.getDeclaredConstructors();
	  for(Constructor<?> cons:constructors)
	  {
		  cons.setAccessible(true);
		  Object obj=cons.newInstance();
		  inst3=(Singleton)obj;
	  }
	  System.out.println(inst1);
	  System.out.println(inst2);
	  System.out.println(inst3);
  }
}
