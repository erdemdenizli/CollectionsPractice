import java.util.*;

public class _04_ListView_SubList {

	public static void main(String[] args) {
		
		List<Double> list = new ArrayList<>(Arrays.asList(1d,2d,3d,4d,5d,6d));
		
		System.out.println("list: " + list);
		
		List<Double> listView = list.subList(1, 6);
		
		System.out.println("listView: " + listView);
		
		listView.addAll(2, Arrays.asList(1d,1d,1d));
		
		System.out.println("listView: " + listView);
		System.out.println("list: " + list);
		
	}

}
