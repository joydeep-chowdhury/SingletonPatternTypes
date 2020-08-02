
public class Client {
  public static void main(String args[])
  {
	  Singleton bp1=Singleton.getSingleton();
	  Singleton bp2=Singleton.getSingleton();
	  Singleton bp3=Singleton.getSingleton();
	  System.out.println(bp1);
	  System.out.println(bp2);
      System.out.println(bp3);
  }
}
