package sorting;
/*
 * Just easier to print the steps here
 */
public class Everything {

	public static void main(String[] args) {
		Integer[] arr = new Integer[10];
		HeapSort<Integer> h = new HeapSort<>();
		QuickSort<Integer> q = new QuickSort<>();
		SelectionSort<Integer> s = new SelectionSort<>();
		MergeSort<Integer> m = new MergeSort<>();
		InsertionSort<Integer> i = new InsertionSort<>();
		
		
		h.sort(fillArray(arr));
		System.out.println();
		q.sort(fillArray(arr));
		System.out.println();
		s.sort(fillArray(arr));
		System.out.println();
		m.sort(fillArray(arr));
		System.out.println();
		i.sort(fillArray(arr));
	}
	
	public static Integer[] fillArray(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}
		return arr;
	}

}
