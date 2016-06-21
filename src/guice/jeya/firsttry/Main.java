package guice.jeya.firsttry;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
	
	public static void main(String[]args)
	{
		MyModule module = new MyModule();
		Injector injector = Guice.createInjector(module);
		Jeya jeya = injector.getInstance(JeyaImpl.class);
		jeya.print();
		
		// should create at least one object of each type using injector. 
		// Then only able to get object.
	}
}