package assingmentAccount;

public class ArraysWork {

    public static void main(String[] args) {
        // call methods of ArraysWork class
         int arr[] = {15,19,6,3,74,84,62,100,20,38,415,3,74,16,15,9,650,67};
         getRepeatedValues(arr);
    }



    public static void getRepeatedValues(int arr[])
    {
        // code to return arr[] containing only duplicate values, such as 15,3 etc
        String str="";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    str=str+","+arr[i];
                }
            }


        }
        System.out.println(str);
    }

    public short getSum(int arr[])
    {
        // code to return the total of all values;
        short i=3;
        return i;
    }

    public static void getUniqueValues(int arr[])
    {
        // code to return arr[] containing all unique values only;
    }

}



