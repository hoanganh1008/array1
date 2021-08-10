import java.util.Scanner;

public class maxvalue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int value;
        int []array;
        do {
            System.out.println("Enter a value");
            value=scanner.nextInt();
            if(value>20)
            {
                System.out.println("Value should not exceed 20");
            }
        } while(value>20);
            array= new int[value];
        int i=0;
        while(i<array.length)
        {

            System.out.print("Element value"+(i+1));
            array[i]=scanner.nextInt();
                    i++;
        }
        System.out.print("property list");
    for(int j=0;j<array.length;j++)
        System.out.print(array[j]+"\t");
        int max=array[0];
    for (int j=0;j<array.length;j++)
    {

        if(max<array[j])
        {
            max=array[j];
        }
    }
        System.out.println("Max property: " + max);
    }

}
