import java.util.Scanner;

public class Arrayact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = new String[10];
        String[] section = new String[10];
        int[] eng = new int[10];
        int[] math = new int[10];
        int[] ap = new int[10];
        double[] ave = new double[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Student " + (i+1));
            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();
            System.out.print("Enter Section: ");
            section[i] = sc.nextLine();
            System.out.print("Enter English Grade: ");
            eng[i] = sc.nextInt();
            System.out.print("Enter Mathematics Grade: ");
            math[i] = sc.nextInt();
            System.out.print("Enter Aralin Panlipunan Grade: ");
            ap[i] = sc.nextInt();
            sc.nextLine();

            ave[i] = (eng[i] + math[i] + ap[i]) / 3.0;
        }

        for(int i = 0; i < 10-1; i++){
            for(int j = i+1; j < 10; j++){
                if(ave[i] > ave[j]){
                    double tempAve = ave[i];
                    ave[i] = ave[j];
                    ave[j] = tempAve;

                    String tempName = name[i];
                    name[i] = name[j];
                    name[j] = tempName;

                    String tempSec = section[i];
                    section[i] = section[j];
                    section[j] = tempSec;
                }
            }
        }

        System.out.println("\nSorted Students by Average (Ascending)");
        for(int i = 0; i < 10; i++){
            System.out.println(name[i] + " | " + section[i] + " | Average: " + ave[i]);
        }

        System.out.print("\nSearch student name: ");
        String search = sc.nextLine();
        boolean found = false;

        for(int i = 0; i < 10; i++){
            if(name[i].equalsIgnoreCase(search)){
                System.out.println("Name: " + name[i]);
                System.out.println("Section: " + section[i]);
                System.out.println("Average: " + ave[i]);
                if(ave[i] >= 75){
                    System.out.println("Passed");
                }else{
                    System.out.println("Failed");
                }
                found = true;
            }
        }

        if(!found){
            System.out.println("Student not found");
        }
    }
}