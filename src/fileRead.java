//Name:Tenzin Ngawang
//Date: 10th April,2017
//File reader, read input file and insert in linked list.
//Class: CSCI:323
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.LinkedList;

public class fileRead {
	int[] array;
	LinkedList aList = new LinkedList();
        public int[] Reader(int p) throws FileNotFoundException{
        	
                String file1 = "Num//Num"+p+".txt"; //read file using 'p' as a integer
                Scanner scanner = new Scanner(new File(file1));

                while(scanner.hasNext()){
                    int input = scanner.nextInt();
                    aList.add(input);
                }   //scanner while

                array = new int[aList.size()]; //array with size of arrayList

                for(int k=0;k<aList.size();k++){ //copy arrayList data in Array
                    array[k]=(int) aList.get(k);
                } //input arraylist in array[int]
                aList.clear(); //clear list after each used
                scanner.close();
            
            return array;
        }//reader
        
        public int[] ArrayToArray(int[]target, int[]source){
        	for(int i=0;i<source.length;i++){
        		target[i] = source[i];
        	}
        	return target;
        }//arrayToArray
        public int max(int[] x){
        	int max=0;
        	for(int i=0;i<x.length;i++){
        		if(max<x[i])
        			max = x[i];
        	}
        	return max;
        }//max
        
}//class
