public class ArrayProblems {

    static void getAverage(int[] arr){

        int sum = 0;
        int total = arr.length;
        for(int i : arr){
            sum = sum + i;
        }

        int avg = sum / total;
        System.out.println(avg);

    }

    static void MultiplyByTen(int[] arr){

        for(int i : arr){
            System.out.println(i + " = " +i*10);
        }
    }

    static boolean SearchElement(int[] arr, int target){

        for(int i : arr){
            if(i == target){
                return true;
            }
        }
        return false;
    }

    static int FindMax(int[] arr){
        int num = arr[0];

        for(int i : arr){
            if(num < i){
                num = i;
            }
        }
        return num;
    }

    static void SumOfNums(int[] arr){
        int positive = 0;
        int negative = 0;

        for(int i : arr){
            if(i > 0){
                positive = positive + i;
            }
            else{
                negative = negative + i;
            }
        }

        System.out.println("Sum of positive numbers : "+positive);
        System.out.println("Sum of negative numbers : "+negative);
    }

    static int FindUnsortedElement(int[] arr){
        int num = arr[0];


        for(int i : arr){
            if(i < num){
                num = i;
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] arr2 = {2,1,7,5,0};
        int[] arr3 = {1,-1,2,-2,3,-3};
        int[] arr4 = {2,3,4,5};
        getAverage(arr);

        MultiplyByTen(arr);

        System.out.println(SearchElement(arr, 10));

        System.out.println(FindMax(arr2));

        SumOfNums(arr3);

        System.out.println(FindUnsortedElement(arr4));
    }

}
