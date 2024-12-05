import java.util.Scanner;
public class Lab2C {
    public static void main(String[] args){
        Scanner myScan= new Scanner(System.in);
        int width;
        int height;
        int area;
        int perimeter;
        System.out.println("Enter a width:");
        width= myScan.nextInt();
        System.out.println("Enter a height:");
        height=myScan.nextInt();
        perimeter=2*(width+height);
        area=(width*height);
        System.out.println("The area is "+area);
        System.out.println("The perimeter is " +perimeter);


    }
}
