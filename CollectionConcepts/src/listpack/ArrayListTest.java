package listpack;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		Logger logger=Logger.getLogger(ArrayListTest.class);
		
		String log4jconfigfile=System.getProperty("user.dir")+File.separator+"log4j.properties";
		
		PropertyConfigurator.configure(log4jconfigfile);
		
		ArrayList<String> a=new ArrayList<>();
		
		a.add("Hello");
		
		a.add(log4jconfigfile);
		
		a.clear();
		
		a.add("HI");
		
		a.addAll(a);
		
		a.add(1, "He");
		
		Iterator<String> itr=a.iterator();
		
		while(itr.hasNext()) {
			
			logger.info(itr.next());
			
		}
		
	}

}
