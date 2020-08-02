
public class MyThread implements Runnable
{

	@Override
	public void run() {
		Singleton object=Singleton.getSingleton();
		System.out.println(Thread.currentThread().getName()+" "+object);
	}

}
