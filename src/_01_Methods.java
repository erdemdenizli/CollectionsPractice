import java.util.*;

public class _01_Methods {

	public static void main(String[] args) {
		
		Collection<Integer> coll = new ArrayList<>();
		
		coll.addAll(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
		
		System.out.println(coll);
		
		System.out.println(coll.removeAll(Arrays.asList(2,3,10)));
		
		System.out.println(coll);
		
		//System.out.println(coll.retainAll(Arrays.asList(20,5)));
		
		//System.out.println(coll);
		
		coll.removeIf(each -> each<5);
		
		System.out.println(coll);
		
		//coll.replaceAll(each -> each+10); //works if coll is a List type
		
		System.out.println(coll);
		
		Integer[] arr = coll.toArray(new Integer[10]);
		
		System.out.println(Arrays.toString(arr));
		
		coll.add(5);
		
		System.out.println(coll);
		
		System.out.println(Arrays.toString(arr));
		

		
	}

}
