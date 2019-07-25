//basic execution of 'binarysearching' an element x given a sorted array[n]
//assumption: array of ints given. Can be tweaked to search an array of objects
public class binarysearch {

    /*
    *@start: the beginning of the array
    *@end: end of the array
    *the method returns an int
    */
    private int binarySearching(int [] arr, int start, int end, int x) {
        
        if (end >= start) {
            int mid =  (end-start) / 2;
            
            if (arr[mid] == x) {
                return mid;
            }
                           
            else if (arr[mid] > x) {
                return binarySearching(arr, start, mid-1, x);
            }

            else {
                return binarySearching(arr, mid+1, end, x);
            }
        }

        return -1;
    }

    public static void main(String [] args) {

        //a test
        binarysearch ob = new binarysearch();
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int x = 5;
        int result = ob.binarySearching(arr, 0, n, x);
        if (result == -1) 
            System.out.println("The element was not found");
        else
            System.out.println("The element was found at index " + result);
        
    }


}