package ntub;

class MSort{
	int[] data;
	void show() {
		for(int d : data)
			System.out.print(d + " ");
		System.out.println();
	}
	void quicksort(int start, int end) {
		if(start >= end) return;
		int mid = data[(start+end)/2];
		int left = start;
		int right = end;
		while(left < right) {
			while((left<end) && (data[left] < mid))
				left++;
			while((right>start) && (data[right] > mid))
				right--;
			if(left<=right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
				show();
			}
			quicksort(start, right);
			quicksort(left, end);
		}
	}
}
public class MySort {

	public static void main(String[] args) {
		int[] data = {11, 3, 9, 8, 5, 6, 7, 4, 10};
		MSort sort = new MSort();
		sort.data = data;
		sort.quicksort(0, data.length-1);
	}

}
