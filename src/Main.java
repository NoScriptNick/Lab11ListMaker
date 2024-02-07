import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        String option = "";
        boolean done = false;

        while (!done) {
            list.addAll(Arrays.asList("Mr. Boolean", "Nick Beres", "Sub 5 minute mile", "LCL Victory", "Physics", "Books", "Math", "ReallyLongString", "Gamestop", "Barnes and Noble"));

            InputHelper.getRegExString(scan, "Options: \nA – Add an item to the list \nD – Delete an item from the list \nP – Print the list \nQ – Quit the program", "AaDdPpQq");

        }
    }

    public static ArrayList<String> Add(ArrayList<String> list){
        ArrayList<String> temp = list;

        return temp;
    }

    public static ArrayList<String> Delete(ArrayList<String> list){
        ArrayList<String> temp = list;

        return temp;
    }

    public static ArrayList<String> Print(ArrayList<String> list){
        ArrayList<String> temp = list;

        return temp;
    }

    public static boolean Quit(){
        Scanner scan = new Scanner(System.in);
        boolean done = InputHelper.getYNConfirm(scan, "Are you sure you want to quit? [Y/N]");
        return done;
    }
}