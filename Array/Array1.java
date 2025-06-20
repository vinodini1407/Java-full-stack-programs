class Array1
{
    public static int sumArray(int[] arr)
{
        int sum = 0;
        for (int num : arr)
{
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 1, 7, 4};
        System.out.println("Sum: " + sumArray(numbers));
    }
}