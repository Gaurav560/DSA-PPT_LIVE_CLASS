package Arrays;

public class find_min_max_in_an_array_with_min_comparison {

    //making a method to find min max.it takes an array as an argument and its length
    static int[] getMinMax(int arr[],int n){

        int max=0;
        int min=0;

        //if array is empty
        if (n==0){
            return new int[]{min,max};
        }

        //if array has one element
        if (n==1){
            min=arr[0];
            max=arr[0];
            return new int[]{min,max};
        }

        //if array has more than single elements
        if (arr[0]>arr[1]){
            max=arr[0];
            min=arr[1];
        }else {
            max=arr[1];
            min=arr[0];
        }

        //now checking from 3rd element and comparing min and max simultaneously

        for (int i = 2; i <n ; i++) {
            if (arr[i]>max)
            {
                max=arr[i];
            }else {
               if (arr[i]<min){
                   min=arr[i];
               }
            }

        }

return  new int[]{min,max};
    }



    //Driver program to test other function
    public static void main(String[] args) {

        int arr[]={1,-6,353,67564,-333};
        int n= arr.length;
        int[] minMax=getMinMax(arr,n);
        System.out.println("min element is:"+minMax[0]+"  max element is :"+minMax[1]);

    }
}
