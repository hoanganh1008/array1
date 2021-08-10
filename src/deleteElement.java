import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mảng trước khi xóa");
        showArray(array);
        System.out.println("Nhập vị trí muốn xóa");
        int deleteIndex=scanner.nextInt();
        int[] newArray=deleteElement(array,deleteIndex);
        System.out.println("Mảng sau khi xóa");
        showArray(newArray);
    }
    public static void showArray(int[] array){
        for(int x : array){
        System.out.println(x);}
    }

    public static int[] deleteElement(int[] array, int deletedIndex) {
        int[] newArray=new int[array.length-1];
        for(int i=0;i<newArray.length;i++)

        {
            if(i<deletedIndex)
            {newArray[i]=array[i];}
            else{
                newArray[i]=array[i+1];
            }
        }
        return newArray;
    }
}
