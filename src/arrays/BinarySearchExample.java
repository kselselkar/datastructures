package arrays;


//Runtime complexity O (logn) Memory complexity O(logn)<recursive> O(1) if iterative

public class BinarySearchExample {

    static int findIndex(int key,int a[],int low,int high){
        if(low > high) return -1;
        int mid = (low + high)/2;
        if(a[mid] == key){
            return mid;
        }else if(a[mid] > key){
            return findIndex(key,a,low,mid-1);
        }else if(a[mid] < key){
            return findIndex(key,a,mid+1,high);
        }
        return -1;
    }

    public static void main(String[] args) {
        //int a[]={1,2,3,4,5,6,7,8,9};
        int a[]={9,8,7,6,5,4,3};
        System.out.println(findIndex(3,a,0,a.length-1));

    }

}
