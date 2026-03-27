public class LastOccurrenceInArray {

  static int lastOccurrence(int[] arr,int key, int i){
    if(i==arr.length){
      return -1;
    }

    int isFound=lastOccurrence(arr,key,i+1);
    if(isFound==-1 && arr[i]==key){
      return i;
    }

    return isFound;
  }
  public static void main(String[] args){
    int[] arr={1,3,5,6,7,5,4,4,5};
    int key=5;
    System.out.println(lastOccurrence(arr,key,0));
  }
}
