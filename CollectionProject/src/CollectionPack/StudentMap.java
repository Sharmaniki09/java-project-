package CollectionPack;

import java.util.HashMap;
import java.util.Set;

public class StudentMap {

	public static void main(String[] args) {
HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(101,"Nikita");
		hm.put(102,"Niharika");
		hm.put(103,"Manish");
		hm.put(104,"Komal");
		hm.put(105,"Rubal");
		Set<Integer> keys=hm.keySet();
		for(Integer e:keys)
		{
			if(e.intValue()>103)
			{
				System.out.println(hm.get(e));
			}
		}
		
	}


	}


