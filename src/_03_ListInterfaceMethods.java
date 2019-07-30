import java.util.*;

public class _03_ListInterfaceMethods {
	
	public static void main(String[] args) {
		
		List<Double> list = new LinkedList<>(Arrays.asList(1d,2d,3d,4d,5d,6d));
		
		list.add(1,5d);
		
		System.out.println(list);
		
		list.set(0, 12d);
		
		System.out.println(list.indexOf(5d));
		System.out.println(list.lastIndexOf(5d));
		System.out.println(list.indexOf(5));
		System.out.println(list.indexOf(100d));
		
		list.addAll(2, Arrays.asList(1d,2d,3d,4d,5d));
		
		System.out.println(list);
		
		System.out.println(list.remove(1d));
		System.out.println(list.remove(1));
		
		list.replaceAll(each -> each*2);
		System.out.println(list);

		list.replaceAll(each -> each+10);
		System.out.println(list);
		
		//list.replaceAll(each -> 1d);
		//System.out.println(list);
		
		list.sort(Comparator.naturalOrder());
		System.out.println(list);

		list.sort(null);//does the same thing as above
		System.out.println(list);

		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		
	}

}
