
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Singleton s1=Singleton.GETINSTANCE;
        Singleton s2=Singleton.GETINSTANCE;
        
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
	}

}
