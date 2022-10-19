package JavaCourse;
import java.util.Scanner;
class Subject{
    int max=100;
    int gain;
}
public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t****************Percentage***************\n");
        System.out.print("Enter Maths Marks :: ");
        Subject s1= new Subject();
        s1.gain = sc.nextInt();
//        byte maths = sc.nextByte();
        System.out.print("Enter English Marks :: ");
        Subject s2= new Subject();
        s2.gain = sc.nextInt();
//        byte english = sc.nextByte();
        System.out.print("Enter Science Marks :: ");
        Subject s3= new Subject();
        s3.gain = sc.nextInt();
//        byte science = sc.nextByte();
        System.out.print("Enter Hindi Marks :: ");
        Subject s4= new Subject();
        s4.gain = sc.nextInt();
//        byte hindi = sc.nextByte();
        System.out.print("Enter Social Science Marks :: ");
        Subject s5= new Subject();
        s5.gain = sc.nextInt();
//        byte sst = sc.nextByte();
        float percentage = (s1.gain+s2.gain+s3.gain+s4.gain+s5.gain)/5.0F;
        System.out.println("\nThe Percentage of Student is ");
        System.out.print(percentage);
    }
}
