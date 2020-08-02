
public class Client {
  public static void main(String args[])
  {
	  Singleton eager=Singleton.getSingleton();
	  Singleton eager2=Singleton.getSingleton();
	  Singleton eager3=Singleton.getSingleton();
	  System.out.println(eager);
	  System.out.println(eager2);
      System.out.println(eager3);
  }
}
