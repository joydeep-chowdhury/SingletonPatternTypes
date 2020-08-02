
public class Client {
  public static void main(String args[])
  {
	  Singleton static_obj=Singleton.getSingleton();
	  Singleton static_obj2=Singleton.getSingleton();
	  Singleton static_obj3=Singleton.getSingleton();
	  System.out.println(static_obj);
	  System.out.println(static_obj2);
      System.out.println(static_obj3);
  }
}
