public class sortingAlgorithms {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static class MergeSort {
        public void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                // Find the middle
                int mid = (left + right) / 2;

                // Recursively sort the array by dividing in two halves
                mergeSort(arr, left, mid); // Sort left array
                mergeSort(arr, mid + 1, right); // Sort right array

                merge(arr, left, mid, right);
            }
        }

        void merge(int[] arr, int left, int mid, int right) {
            // Size of sub-arrays
            int n1 = mid - left + 1;
            int n2 = right - mid;

            // Make new subarrays
            int[] L = new int[n1];
            int[] R = new int[n2];

            // Transfer elements into temp sub-arrays
            for (int i = 0; i < n1; i++) {
                L[i] = arr[left + i];
            }
            for (int j = 0; j < n2; j++) {
                R[j] = arr[mid + 1 + j];
            }

            // Merge left and right sub-arrays
            int i = 0, j = 0, k = left;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            // Add leftover elements
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }
            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }
    }

    static class QuickSort {
        public void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                int pi = partition(arr, low, high);
                quickSort(arr, low, pi - 1);
                quickSort(arr, pi + 1, high);
            }
        }

        int partition(int[] arr, int low, int high) {
            int pivot = arr[high]; // choosing last element as pivot
            int i = low - 1; // index of smaller element
            for (int j = low; j < high; j++) {
                if (arr[j] <= pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[high];
            arr[high] = arr[i + 1];
            arr[i + 1] = temp;

            return i + 1;
        }
    }

    static class HeapSort {
        public void heapSort(int[] arr) {
            int n = arr.length;
            // Build a max heap
            for (int i = n / 2 - 1; i >= 0; i--) {
                heapify(arr, n, i);
            }
            // Heap Sort
            for (int i = n - 1; i >= 0; i--) {
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                heapify(arr, i, 0);
            }
        }

        public void heapify(int[] arr, int n, int i) {
            int largest = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < n && arr[left] > arr[largest]) {
                largest = left;
            }
            if (right < n && arr[right] > arr[largest]) {
                largest = right;
            }

            if (largest != i) {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;

                heapify(arr, n, largest);
            }
        }
    }

    public static void main(String arg[]) {
        int myArr[] = { 9, 2, 1, 2, 5, 4, 7, 7, 7, 0 };
        // bubbleSort(myArr);
        // selectionSort(myArr);
        // insertionSort(myArr);
        // MergeSort mS = new MergeSort();
        // mS.mergeSort(myArr, 0, myArr.length - 1);
        // QuickSort qS = new QuickSort();
        // qS.quickSort(myArr, 0, myArr.length - 1);
        // HeapSort hS = new HeapSort();
        // hS.heapSort(myArr);

        for (int x : myArr) {
            System.out.print(x + "  ");
        }
    }
}