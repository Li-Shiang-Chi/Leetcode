
public class InversionCount {
    
    
    public static void main(String[] args){
        int arr[] = {4,5,6,1,2,3};
        System.out.println(invCount(arr));
    }
    
    public static int invCount(int[] array) {
        if(array.length <= 1) {return 0;}
        int rightLength = (array.length / 2);
        int leftLength = array.length - rightLength;
        
        int[] right = new int[rightLength];
        int[] left = new int[leftLength];
        
        for(int i = 0 ; i < rightLength ; i++)
            right[i] = array[i];
        for(int i = 0 ; i < leftLength ; i++)
            left[i] = array[i+rightLength];
        
        int rightInvCount = invCount(right);
        int leftInvCount = invCount(left);
        int count = merge(array, right, left);
        
        return rightInvCount+leftInvCount+count;
        
        
    }

    public static int merge(int[] data ,int[] right , int[] left) {
        int r = 0;
        int l = 0;
        int index = 0;
        int invCount = 0;
        
        int[] temp = new int[data.length];
        
        while(r >=0 && r < right.length && l >=0 && l < left.length) {
            if(right[r] < left[l]) 
            {
                temp[index] = right[r];
                r++;
                invCount += left.length- l;
            }
            else 
            {
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
        return invCount;
    }
}
