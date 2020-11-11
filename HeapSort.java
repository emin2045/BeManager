public class HeapSort {

	public void sort(Player arr[]) {
		int n = arr.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);

		// One by one extract an element from heap
		for (int i = n - 1; i >= 0; i--) {
			// Move current root to end
			Player temp = arr[0];			
			
			arr[0] = arr[i];			
		    arr[i] = temp;
			

			// call max heapify on the reduced heap
			heapify(arr, i, 0);
		}
	}

	

	void heapify(Player[] arr, int n, int i) {
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2

		// If left child is larger than root
		if (l < n && arr[l].getFiyatPerf() > arr[largest].getFiyatPerf())
			largest = l;

		// If right child is larger than largest so far
		if (r < n && arr[r].getFiyatPerf() > arr[largest].getFiyatPerf())
			largest = r;

		// If largest is not root
		if (largest != i) {
			Player swap = arr[i];
			arr[i] = arr[largest];
			//arr[i].setFiyatPerf(arr[largest].getFiyatPerf());
			
			arr[largest] = swap;
			//arr[largest].setFiyatPerf(swap);

			// Recursively heapify the affected sub-tree
			heapify(arr, n, largest);
		}
	}
}