import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        
        int place = 0; 
		int x = 0; 
		
		for(int i = 0; i < list.size(); i++) {
			place = list.get(i); 
			x = i - 1; 
            
            while(x >= 0 && list.get(x) > place) {
				list.set(x + 1, list.get(x));
				x--; 
			}
			list.set(x + 1, place); 
        }
        return list;
	}
 

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        
        int[] SortedArr = new int[arr1.length + arr2.length];
        int a = 0;
        int b = 0;
        int c = 0;

        while (a < arr1.length && b < arr2.length){
            if (arr1[a] < arr2[b]) {
                SortedArr[c] = arr1[a];
                a++;
            }
            else {
                SortedArr[c] = arr2[b];
                b++;
            }
            c++;
        }

        while (a < arr1.length) {
            SortedArr[c] = arr1[a];
            a++;
            c++;
        }

        while (b < arr2.length) {
            SortedArr[c] = arr2[b];
            b++;
            c++;
        }

        return SortedArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> TesterArr = new ArrayList<Integer>();
        TesterArr.add(3);
        TesterArr.add(6);
        TesterArr.add(9);
        TesterArr.add(2);
        TesterArr.add(4);
        System.out.println(insertionSort(TesterArr));
        int[] arr1 = new int[]{ 1,2,3,4 };
        int[] arr2 = new int[]{ 5,6,7,8 };
        System.out.println(merge(arr1, arr2));
    }
}
