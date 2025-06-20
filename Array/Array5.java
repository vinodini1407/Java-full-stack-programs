import java.util.Arrays;
class Array5
{
    public static int[] removeElement(int[] arr, int value) {
        int count = 0;
        for (int num : arr) 
        {
            if (num == value) 
            {
             count++;
             }
         }
        if (count == 0) 
        {
         return arr;
         }

        int[] newArr = new int[arr.length - count];
        int index = 0;
        for (int num : arr)
         {
            if (num != value)
            {
                newArr[index++] = num;
            }
        }
        return newArr;
    }

    public static void main(String args[])
   {
        int[] numbers = {2, 3, 6, 1, 9, 4};
        int value = 3;
        int[] result = removeElement(numbers, value);
        System.out.println("Array after removing " + value + ": " + Arrays.toString(result));
    }
}