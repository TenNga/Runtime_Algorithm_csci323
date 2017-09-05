//Name:Tenzin ngawang
//Date: 10th April,2017
//RadixSort with using countingSort
//Class: CSCI:323
public class radixSort {
	int count =0;
    private int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
 
    private void countSort(int arr[], int n, int digit)
    {
        int B[] = new int[n]; // output array
        int i;
        int C[] = new int[10];

        for(int x=0;x<C.length;x++){
            C[x] = 0;

        }

        for (i = 0; i < n; i++)
            C[ (arr[i]/digit)%10 ]++;

        for (i = 1; i < 10; i++)
            C[i] += C[i - 1];
 
        for (i = n - 1; i >= 0; i--)
        {
        	count++;
            B[C[ (arr[i]/digit)%10 ] - 1] = arr[i];
            C[ (arr[i]/digit)%10 ]--;
        }

        for (i = 0; i < n; i++)
            arr[i] = B[i];
    }

    public void radixsort(int arr[], int n)
    {
        int m = getMax(arr, n);
 
        for (int exp = 1; m/exp > 0; exp *= 10)
            countSort(arr, n, exp);
        toPrint(arr);
    }
 
    public void toPrint(int []b){
    	System.out.print("RadixSort Output: ");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println("\nRadix Count: "+count);
        count=0;

    }
}