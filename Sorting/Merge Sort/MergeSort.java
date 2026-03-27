import java.util.Arrays;

//time complexity =>O(n logn)
//n for merging this is the work done at each level
//logn this is the no of level 

//space complexity =>  O(n)
//as we need an auxillary array to store elements while merging
/*
Even normal Merge Sort uses:
log(n) stack space Because of recursion.
So real space is : O(n) + O(log n) ≈ O(n
Still O(n).
*/
/*
An auxiliary array is a temporary extra array that is used to help perform an operation on the main array — especially in sorting, merging, and rearranging.                       ❓Q1: Is auxiliary array always needed?

❌ No.
Only when algorithm requires extra storage.

Example: Bubble Sort → No auxiliary array.

❓Q2: Is auxiliary array counted in space complexity?

✔ Yes.
It is part of auxiliary space.

❓Q3: Why Merge Sort needs auxiliary array?

✔ Because merging two sorted parts in same array is complex.

❓Q4: Can we avoid auxiliary array in Merge Sort?

✔ Possible, but code becomes very complex and slow.                                                 When merge() finishes:

✔ temp variable is destroyed
✔ No reference to array remains
*/
class MergeSort {
  static void mergeSort(int[] arr, int si, int ei) {
    // base condition happens when there is single element means our si=ei
    if (si >= ei) {
      return;
    }

    // int mid = (si+ei)/2;
    int mid = si + (ei - si) / 2;
    mergeSort(arr, si, mid);
    mergeSort(arr, mid + 1, ei);

    merge(arr, si, mid, ei);

  }

  static void merge(int[] arr, int si, int mid, int ei) {
    int[] temp = new int[ei - si + 1];
    // why not we do like new int[ei+1] as we start from 0 so we just increse it by
    // one
    // because our si and ei vary each time the merge is call so we need that
    // we cannot assume that our si=0 and ei=arr.length-1;

    int i = si;// iterator for left part
    int j = mid + 1;// iterator for right part this is the reason behind why we pass mid to merge
                    // to find the start index of right part we need mid
    int k = 0;// iterator for our current array when we add element we move it

    // as our left part start from si and end at mid so we do i=si and i<=mid
    // as our right part start from mid+1 and end at ei => j=mid+1 j<=ei
    while (i <= mid && j <= ei) {
      // now we compare the elements from both parts
      // whichever element have less value we simply put it in out temp array
      if (arr[i] < arr[j]) {
        temp[k++] = arr[i++]; // first we assign value then incrementing it i.e post increment
      } else {// this means arr[i]>=arr[j]
        temp[k++] = arr[j++];
      }
    }

    // here we come when our one part is covered and other part is remaining to add
    // in temp
    // here we not need to compare because comaprison happens already in first while
    // we just need to put remaining elements in temp
    while (i <= mid) { // this means left part is remaining
      temp[k++] = arr[i++];
    }

    while (j <= ei) {// this means our right part is remaining
      temp[k++] = arr[j++];
    }

    // here our all elements are covered and added in temp array
    // now we copy our temp array in original array

    // here i=si not i=0
    for (k = 0, i = si; k < temp.length; k++, i++) {
      arr[i] = temp[k];
    }

  }

  public static void main(String[] args) {
    int[] arr = { 60,50,40,30,20,20,-1,-100,1000000000 };
    System.out.println(Arrays.toString(arr));
    mergeSort(arr, 0, arr.length - 1);
    System.out.print(Arrays.toString(arr));
  }
}