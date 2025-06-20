class Array8
{
    public static int[] findMinMax(int[] arr)
  {
        if (arr.length == 0)
         {
         throw new IllegalArgumentException("Array is empty");
         }
        int min = arr[0], max = arr[0];
        for (int num : arr)
         {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) 
  {
        int[] numbers = {5, 3, 9, 1, 6};
        int[] minMax = findMinMax(numbers);
        System.out.println("Minimum: " + minMax[0]);
        System.out.println("Maximum: " + minMax[1]);
    }
}