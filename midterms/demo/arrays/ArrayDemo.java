
public class ArrayDemo {
    public static void main(String[] args) {
        
        //the general form to declare a one-dimensional array is:
        dataType[] arrayName;

        //the general syntax to instantiate an array object is:
        arrayName = new dataType[intExp];

        //combined two previous statements:
        dataType[] arrayName = new dataType[intExp];

        //sample code
        int[] num = new int[5];

        //alternate ways to declare an Array
        int list[];
        
        //more array declarations
        int alpha[], beta;
        int[] gamma, delta;

        //accessing array elements
        arrayName[indexExp]

        //array declaration an instantiation
        int[] list = new int[10];

        //assignment statement
        list[5] = 34;

        //additional assignment statements
        list[3] = 63;
        
        int i=3;
        list[i] = 63;

        list[(2*i-3] = 58;

        //consider the following statements:
        list[3] = 10;
        list[6] = 35;
        list[5] = list[5] + list[6];

        //you can also declare as follows:
        final int ARRAY_SIZE = 10;
        int[] list = new int[ARRAY_SIZE];

        //specifiying array size during Program Execution
        int arraySize;

        System.out.print("Enter the size of the array: ");
        arraySize = console.nextInt();
        System.out.println();

        int[] list = new int[arraySize];

        //array initialization during Declaration
        double[] sales = {12.25, 32.50, 16.90, 23, 45.68};

        //the above statements is the same as:
        sales[0] = 12.25;
        sales[1] = 32.50;
        sales[2] = 16.90;
        sales[3] = 23;
        sales[4] = 45.68;

        //Arrays and the Instance Variables length
        int[] list = {10, 20, 30, 40, 50, 60};

        int[] numList = new int[10];

        numList[0] = 5;
        numList[1] = 10;
        numList[2] = 15;
        numList[3] = 20;

        System.out.println(numList.length);

        //processing one-dimensional arrays
        int[] list = new int[100];

        //accepting inputs
        for(int i=0; i<list.length; i++)
        {
            list[1] = console.nextInt();
        }

        //displaying outputs
        for(int i=0; i<list.length; i++)
        {
            System.out.println(list[i] + " ");
        }

        double[] sales = new double[10];
        double largestSale, sum, average;

        //initiliazing an array to a specific value:
        for (int index=0; index<sales.length; index++)
        {
            sales[index] = 10.00;
        }

        //reading data into an array:
        for (int index=0; index<sales.length; index++)
        {
            sales[index] = console.nextDouble();
        }

        //printing an array:
        for (int index=0; index<sales.length; index++)
        {
            System.out.print(sales[index] + "");
        }

        //finding the sum and average of an array:
        for (int i=0; i<sales.length; i++)
        {
            sum = sum + sales[0];

            if(sales.length != 0)
            {
                average = sum /sales.length;
            }else
            {
                average = 0.0;
            }
        }

        //determining the largest element in the array
        maxIndex = 0;

        int[] sales = {12.50,8.35, 19.60, 25.00, 14.00, 39.43, 35.90, 98.23, 66.25, 35.64};

        for(int index=1; index<sales.length; i++)
        {
            if (sales[0] < sales[1])
            {
                maxIndex = index;
            }
        }

        largestSale = sales[maxIndex];

        //array index out of bounds exception
        double[] num = double[10];
        int = i; 

        //0,1,2,3,4,5,6,7,8,9   
        //valid
        index >= 0 and index <= arraySize-1
        //  out of bounds
        index < 0 and index > arraySize-1;

        //consider this example
        for(i=0; i<=10; i++)
        {
            list[i] = 0;
        }

        //declaring arrays as formal parameters to methods
        dataType arrayName;

        public static void arrayAsFormalParameter(int[] listA, double[] listB, int num)
        {

        }

        //searching an array for a specific item
        public static int seqSearch(int[] list, int listLength, int searchItem)
        {
            int loc;
            boolean found = false;
            loc = 0;
            
            while(loc<list.length && !found)
            {
                if(list[loc] == searchItem)
                {
                    found = true;
                }else
                {
                    loc++
                }
            }

            if(found)
            {
                return loc;
            }
            else{
                return -1;
            }
        }

        //arrays of objects of other classes
        String[] nameList = new String[5];

        nameList[0] = "Amanda Green";

        Clock[] arrivalTempEmp = new Clock[100];

        //assignment operator, relational operators, and Arrays: A precaution

        //declaration and initialization
        int[] listA = {5,10, 15, 20, 25, 30, 35};
        //declaration
        int[] listB = new int[listA.length];

        //assign values of listA to listB (shallow copying)
        listB = listA

        //assign values of listA to listB (deep copying)
        for(int index = 0; index<listA.length; i++)
        {
            listB[index] = listA[index];
        }

        //compare if listA and listB are in the same array
        if(listA == listB)


        //compare if the values of two arrays are equals
        boolean areEqualArrays(int[]    firstArray, int[] secondArray)
        {
            if(firstArray.length != secondArray.length)
            {
                return false;
            }

            for(int index = 0; index < firstArray.length; i++)
            {
                if(firstArray[index] != secondArray[index])
                {
                    return false;
                }

                return true;
            }
        }


        //searching an array for a specific item
        int[] list = {35, 12, 27, 18, 45, 16, 38};

        public static int seqSearch()
        {
            int loc;
            boolean found = false;
            loc = 0;

            while(loc < listLength && !found)
            {
                if(list[loc] == searchItem
                {
                    found true;
                }
                else{
                    loc++;
                }
            }

            if(found)
            {
                return loc;
            }else{
                return -1;
            }
        }

        //arrays of string objects
        String[] nameList = new String[5];

        nameList[1] = "Peter Parker";
        nameList[2] = "Bruce Banner";
        nameList[3] = "Tony Stark";

        //arrays of other objects
        Clock[] arrivalTempEmp = new Clock[100];

        HelloWorld[] pring = new HelloWorld[10];

    }
}
