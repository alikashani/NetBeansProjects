package btree;

public class Btree {
    
    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = a[mid];
            
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else 
                return mid; // key found
        }
        return -(low + 1); // key not found
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 12, 4, 11, 1};
        int oranges = binarySearch(arr, 11);
        
        
        String firstName = "Franklin";
        String middleName = "Delano";
        String lastName = "Roosevelt";
        
        System.out.println(firstName.substring(0, 1) + middleName.substring(0, 1) +
                lastName.substring(0, 1));
       
        
        
        //System.out.println(oranges);
        
    }   
    
}

