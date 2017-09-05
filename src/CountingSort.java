//Name:Tenzin Ngawang
//Date: 10th April,2017
//Counting Sort implementation
//Class: CSCI:323
public class CountingSort {
    int count =0;
    public void countingSort(int[]A,int[]B,int k){

        int  [] C = new int[k+1];

        for(int i=0;i<=k;i++){ // initialize everyone element to zero
            C[i] = 0;
        }
        for(int j=0;j<A.length;j++){
            C[A[j]] = C[A[j]]+1;
        }
        for(int i=1;i<=k;i++ ){ //System.out.println("HERE");
            C[i] = C[i]+C[i-1];
        }
        for(int j =(A.length-1);j>=0;j--){
            int temp =A[j]; //  System.out.println(j);
        	count++;
               B[C[temp]-1] = temp;
               C[temp] = C[temp] -1;
        }
        toPrint(B);

    } //countingSort
    public int getMax(int arr[], int n) //return maximum value
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
    public void toPrint(int []b){
    	System.out.print("CountingSort Output: ");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println("\nCounting Count: "+count);
        count=0;
    }

}