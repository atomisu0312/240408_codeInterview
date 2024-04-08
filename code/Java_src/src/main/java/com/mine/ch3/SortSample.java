package main.java.com.mine.ch3;

public class SortSample {
  private static void mergeSort(int[] first, int[] second, int[] a)
  {
     int iFirst = 0; 
     int iSecond = 0;
     int j = 0; 
  
     while (iFirst < first.length && iSecond < second.length)
     {
        if (first[iFirst] < second[iSecond])
        {
           a[j] = first[iFirst]; 
           iFirst++;
        }
        else
        {
           a[j] = second[iSecond];
           iSecond++;
        }
        j++;
     }
  
     while (iFirst < first.length)
     {
        a[j] = first[iFirst];
        iFirst++;
        j++;
     }
     while (iSecond < second.length)
     {
        a[j] = second[iSecond];
        iSecond++;
        j++;
     }
  }
  public static void main(String[] args) {
    int[] a = {3, 5, 6, 9, 2, 4, 7, 8};
    int[] first = {3, 5, 6, 9};
    int[] second = {2, 4, 7, 8};
    mergeSort(first, second, a);
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
      System.out.print(",");
    }    
  }
}
