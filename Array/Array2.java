class Array2
 {
    public static double avgArray(int[] arr)
   {
  
   if (arr.length == 0) 
  {
    return 0;
   }
      int sum = 0;
        for (int num : arr)
        {
            sum += num;
         }
        return (double) sum / arr.length;
     }
 
    public static void main(String[] args) 
     {
        int[] numbers = {2, 3, 6, 1, 4};

        System.out.println("Average: " + avgArray(numbers));
     }
 }