class Array4
 {
    public static boolean containsValue(int[] arr, int value)
   {
        for (int num : arr)
       {
            if (num == value) 
{
return true;
}
        }
        return false;
    }

    public static void main(String args[]) 
   {
        int[] numbers = {2, 3, 6, 1, 4};
        int value = 6;
        System.out.println("Array contains " + value + "....? " + containsValue(numbers, value));
    }
}