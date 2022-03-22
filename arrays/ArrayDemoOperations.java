package arrays;

public class ArrayDemoOperations {
    public static void main(String[] args) {
        int[] listA = { 5, 10, 15, 20, 25, 30, 35 };

        int[] listB = new int[listA.length];

        for (int index = 0; index < listA.length; index++) {
            listB[index] = listA[index];
        }
        
        System.out.print("listA[]: ");
        for (int index = 0; index < listA.length; index++) {
            System.out.print(listA[index] +" ");
        }

        System.out.print("\n"+"listB[]: ");
        for (int index = 0; index < listB.length; index++) {
            System.out.print(listB[index] + " ");
        }

        if (listA == listB) {
            System.out.println("\n" +"listA[] and listB[] are equal");
        } else {
            System.out.println("\n" +"listB[] and listB[] are not equal");
        }

        System.out.print("Are list[]A and list[]B equal: " + areEqualArrays(listA,listB));
        
        
    }

    public static boolean areEqualArrays(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int index = 0; index < firstArray.length; index++) {
            if (firstArray[index] != secondArray[index]) {
                return false;
            }
        }

         return true;
    }

}
