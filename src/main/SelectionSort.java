package main;

import java.util.Scanner;

public class SelectionSort {
  private long[] array;
  private int numElements;

  public SelectionSort(int n){
    array=new long[n];
    numElements=0;
  }

  public void insert(long value){
      array[numElements]=value;
      numElements++;
  }

  public void display(){
      for (int i = 0; i < numElements; i++) {
          System.out.print(array[i]+" ");
      }
      System.out.println(" ");
  }

  public void sort(){
      int min;
      for (int i = 0; i <numElements-1 ; i++) {
          min=1;
          for (int j = 0; j < numElements; j++) {
              if(array[j]<array[min]){
                  min=j;
                  swap(i,min);
              }
          }
      }
  }
  private void swap(int one,int two){
      long temp=array[one];
      array[one]=array[two];
      array[two]=temp;
  }

    public static void main(String[] args) {
        System.out.println("Enter the number of elements:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        SelectionSort s=new SelectionSort(n);
        System.out.println("Enter the values for the array");
        for (int i = 0; i < n; i++) {
            s.insert(scanner.nextLong());
        }
        System.out.println("The values before sorting");
        s.display();
        s.sort();
        System.out.println("The values after sorting");
        s.display();
    }
}
