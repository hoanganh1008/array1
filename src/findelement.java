import java.util.Scanner;

public class findelement {
    public static void main(String[] args) {
        String[] student={"Hoàng Anh","Tuấn Anh","Phúc Anh","Việt Anh"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a name's student");
        String input_name=scanner.nextLine();
        boolean isExist=false;
        for(int i=0;i<student.length;i++){
            if(student[i].equals(input_name))
            {
                System.out.println("position of the studen"+input_name+"is"+(i+1));
                isExist=true;
                break;
            }
            if(!isExist)
            {
                System.out.println("not found");
            }
        }
    }
}

