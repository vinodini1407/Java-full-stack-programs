import java.util.Arrays;
public class Array6 
{
    public static int[] copyArray(int[] arr)
   {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) 
        {
            copy[i] = arr[i];
        }
        return copy;
    }

    public static void main(String args[])
   {
        int[] numbers = {2, 3,6, 1, 4};
        int[] copied = copyArray(numbers);
        System.out.println("Original: " + Arrays.toString(numbers));
        System.out.println("Copied: " + Arrays.toString(copied));
    }
}