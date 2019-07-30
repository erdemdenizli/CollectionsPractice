import java.util.*;

public class _02_Iteration {

	public static void main(String[] args) {
		
		Collection<Integer> coll = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		
		//can't be used for removing
//		for(Integer each : coll) {
//			coll.remove(each);
//			System.out.println(coll);
//		}
		
		Iterator<Integer> myIter = coll.iterator();
		
		System.out.println(myIter.hasNext());
		
		myIter.next();
				
		myIter.remove();

		//myIter.remove();//can't do it this way, will point an empty spot and will throw exception
				
		myIter.next(); //gets the iterator back on track!
		
		myIter.remove();
		
		System.out.println(coll);
		
		myIter.next();
		
		System.out.println(myIter.next());

	}

}
