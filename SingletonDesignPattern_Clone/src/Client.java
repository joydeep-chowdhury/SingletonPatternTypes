
public class Client {
  public static void main(String args[]) throws CloneNotSupportedException
  {
	  Singleton single=Singleton.getSingleton();
	  Singleton clone=(Singleton)single.clone();
	  System.out.println(single);
	  System.out.println(clone);
  }
}
