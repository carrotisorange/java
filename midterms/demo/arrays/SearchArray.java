import java.util.Scanner;
public class SearchArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] list = new int[10];
        
        int searchItem;
        int index;

        System.out.println("Length of the array: " + list.length);

        for(index = 0; index<list.length; index++)
        {
            list[index] = console.nextInt();
        }

        System.out.print("Enter the number to be searched: ");
        searchItem = console.nextInt();
        System.out.println();

        index = seqSearch(list, list.length, searchItem);

        if(index != -1)
        {
            System.out.println("Number is found found at position " + index);
        }
        else{
            System.out.println(searchItem + " is not on the list.");
        }

    }

    public static int seqSearch(int[] list, int listLength, int searchItem)
        {
            int loc = 0;
            boolean found = false;

            while(loc < listLength && !found)
            {
                if(list[1] == searchItem)
                {
                    found = true;
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

}
