package bubble.sort;
public class BubbleSort {
        static void bubbleSort(int[] myArray) {  
        int a = myArray.length;  
        int x = 0;  
         for(int i=0; i < a; i++){  
                 for(int j=1; j < (a-i); j++){  
                          if(myArray[j-1] > myArray[j]){  
                                 //swapping elements  
                                 x = myArray[j-1];  
                                 myArray[j-1] = myArray[j];  
                                 myArray[j] = x;  
                            }        
                        }  
                }        
        }  
        public static void main(String[] args) {  
                int myArray2[] ={2,4,60,10,20,30,50};  
                 
                System.out.println("Before Bubble Sort original number: ");  
                for(int i=0; i < myArray2.length; i++){  
                        System.out.print(myArray2[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(myArray2);//sorting array elements using bubble sort  
                 
                System.out.println("After Bubble Sort: ");  
                for(int i=0; i < myArray2.length; i++){  
                        System.out.print(myArray2[i] + " ");  
                }  
        }  
}  

