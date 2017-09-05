//Name:Tenzin Ngawang
//Date: 10th April,2017
//This project implements three sorting algorithms, Counting, Radix and Bucket sort. 
//Class: CSCI:323
import java.io.FileNotFoundException;

public class project2 {
    public static void main(String[] args) throws FileNotFoundException {
    	 int[] A ;
    	 int[] B;
    	 int k ;
        CountingSort cSort = new CountingSort();
        BucketSort bSort = new BucketSort();
        radixSort rSort = new radixSort();
        fileRead fReader = new fileRead();
        System.out.print("SORTING ALGORITHMS (COUNTING, RADIX, BUCKET).\n\n");
        for(int p=8;p<257;p=p*2){ // loop through each NUM files
        	System.out.println("FILENAME: Num"+p+".txt");
        	int[] inputArr = new int[fReader.Reader(p).length]; //same size as file Num.txt
        	fReader.ArrayToArray(inputArr, fReader.Reader(p)); //transfer num.txt to inputArr
        	
        	A = new int[inputArr.length]; // same size and input Num.txt
        	B = new int[A.length];
        	
        	fReader.ArrayToArray(A, inputArr); //transfer inputArr to 'A'
        	k = fReader.max(A); // returns max from given array
        	
        	//Three sorting Algorithms --->
        	cSort.countingSort(A, B, k);
        	rSort.radixsort(A, A.length);
        	bSort.sort(A, k); // do bucket Sort

        } //forloop 

    }//main
 
}//class
