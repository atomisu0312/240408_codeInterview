package main.java.com.mine.ch1;

public class MinMax {
  // そう、この方法は非効率的である
  // なぜなら走査しないとだめだかんね
  public static int showMax(int[] numbers){
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
    }
    return max;
  }
  // こっちの方が効率的だよね
  // なぜなら、一回の走査で最大値と最小値を取得できるから
  // 見つからない場合にはhighとlowが逆転するに注意
  // https://www.interactivities.ws/ebook-bjeo-7-ch14-sec06-algosim-1.xhtml
  public int search(int[] a, int value)
  {
     int low = 0;
     int high = a.length - 1;
     while (low <= high)
     {
        int mid = (low + high) / 2;
        if (a[mid] == value)
        {
           int result = mid;
           return result;
        }
        else if (a[mid] < value )
        {
           low = mid + 1;
        }
        else
        {
           high = mid - 1;
        }
     }
     int result = -1;
     return result;
  }

  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
