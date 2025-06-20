import java.util.Arrays;
 class Array7
 {
    public static int[] insertElement(int[] arr, int index, int value)
   {
        if (index < 0 || index > arr.length) 
       {
            throw new IllegalArgumentException("Invalid index");
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++)
        {
            if (i == index)
           {
                newArr[i] = value;
            }
             else
            {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }

    public static void main(String args[]) 
   {
        int[] numbers = {2, 3, 6, 1, 4};
        int index = 3;
        int value = 7;
        int[] result = insertElement(numbers, index, value);
        System.out.println("After inserting " + value + " at index " + index + ": " + Arrays.toString(result));
    }
}