import java.util.*;

public class _05_ListIterator {

	public static void main(String[] args) {
		
		List<Double> list = new ArrayList<>(Arrays.asList(1d,2d,3d,4d,5d,6d));
		
		ListIterator<Double> listIter = list.listIterator();
		
		System.out.println(listIter.hasNext());
		System.out.println(listIter.nextIndex());
		System.out.println(listIter.nextIndex());
		
		while(listIter.hasNext()) {
						
			System.out.print("index " + listIter.nextIndex() + ": ");
			
			Double item = listIter.next();

			System.out.println(item);
			
			if(item%2 != 1d) {
				listIter.remove();
			}
			
		}
		
		System.out.println(list);
		
	}

}
