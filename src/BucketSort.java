//Name:Tenzin Ngawang
//Date: 10th April,2017
//Bucket Sort implementation
//Class: CSCI:323
public class BucketSort {
	int count =0;
	int[] sorted_sequence;
	public void sort(int[] sequence, int maxValue) 
    {
        // Bucket Sort
        int[] Bucket = new int[maxValue + 1];
        sorted_sequence = new int[sequence.length];
 
        for (int i = 0; i < sequence.length; i++)
            Bucket[sequence[i]]++;
 
        int outPos = 0;
        for (int i = 0; i < Bucket.length; i++)
            for (int j = 0; j < Bucket[i]; j++){
            	count++;  
                sorted_sequence[outPos++] = i;
            }
        PrintBucket();
    }
    public void PrintBucket(){
    	System.out.print("BucketSort Output: ");
        for(int i=0;i<sorted_sequence.length;i++){
            System.out.print(sorted_sequence[i]+" ");
        }
        System.out.println("\nBucket Count: "+count+"\n");
        count=0;

    }
}
