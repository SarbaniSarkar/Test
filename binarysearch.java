public class binarysearch {
    public static int binary(int numbers[],int key){
       int start = 0 ; 
       int end = numbers.length -1;

        while(start<=end){

            int mid = (start + end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }
            else{
                start = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,5,7,13};
        int key = 5;
        System.out.println("the index is: " +binary(numbers, key));
    }
}
