import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MappingTest {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>(4);
        list.add("Upasana");
        list.add("Upasana");
        list.add("Rahul");
        list.add("Simran");
        System.out.println(list);        
        Iterator<String> itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());            
        }
		
		
	}

}
