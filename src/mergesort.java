
public class mergesort {

    public static void main(String[] args) {
        int[] input = {10,2,20,456,4984,11,2,3,6};
        mergeSort(input);
        
        
        for(int number : input)
            System.out.print(number+" ");
        
        
    }
    public static void mergeSort(int[] array) {
        if(array.length <= 1) return;
        int rightLength = (array.length / 2);
        int leftLength = array.length - rightLength;
        
        
        int[] right = new int[rightLength];
        int[] left = new int[leftLength];
        
        
        for(int i = 0 ; i < rightLength ; i++)
            right[i] = array[i];
        for(int i = 0 ; i < leftLength ; i++)
            left[i] = array[rightLength + i];
        
        mergeSort(right);
        mergeSort(left);
        merge(array, right, left);
    }
    public static void merge(int[] data , int[] right , int[] left) {
        int index = 0;
        int r = 0;
        int l = 0;
        int[] temp = new int[data.length];
        
        while(r >= 0 && r <=right.length-1 && l >=0 && l<=left.length-1) {
            if(right[r] < left[l]) {
                temp[index] = right[r];
                r++;
            }
            else {
                temp[index] = left[l];
                l++;
            }
            index++;
        }
        
        
        while(r <= right.length-1) {
            temp[index] = right[r];
            r++;
            index++;
        }
        while(l <= left.length-1) {
            temp[index] = left[l];
            l++;
            index++;
        }
        
        for(int i = 0 ; i < data.length ; i++) {
            data[i] = temp[i];
        }

        
    }

}
