import java.util.Scanner;
public class Lab2A {
    public static void main(String[] args){
        Scanner myScan= new Scanner(System.in);
        System.out.print("Enter a name:");
        String name1;
        name1= myScan.nextLine();
        System.out.print("Enter another name:");
        String name2;
        name2= myScan.nextLine();
        System.out.print("Enter a verb:");
        String verb;
        verb= myScan.nextLine();
        System.out.print("Enter an adverb:");
        String adverb;
        adverb= myScan.nextLine();
        System.out.println("Once upon a time, there was a person named " + name1 + " who had a child named " + name2 +"." + " This child would " + verb +" " + adverb + " while singing to strangers.");
    }
}