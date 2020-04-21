package javaprogram;
import java.util.Scanner;

public class homework084 {
    public static void main(String[] args )
    {
        //rectangle();
        //daysinmonth();
        killyourself();
    }
    public static void rectangle(){
        Scanner scanner = new Scanner(System.in);
        int firstside=Integer.parseInt(scanner.nextLine());
        int secoundside= Integer.parseInt(scanner.nextLine());
        System.out.println("side a= "+ firstside);
        System.out.println("side b= "+ secoundside);
        int face ;
        int tour ;
        face = firstside*secoundside;
        tour= 2*firstside+2*secoundside;
        System.out.println("face = "+ face);
        System.out.println("tour = " + tour);
    }

    public static void daysinmonth(){
        Scanner scanner = new Scanner(System.in);
        int month = Integer.parseInt(scanner.next());
        String monthname;
        switch (month){
            case 1:
                monthname = "january";
                break;
            case 2:
                monthname = "fabruary";
                break;
            case 3:
                monthname = "march";
                break;
            case 4:
                monthname = "april";
                break;
            case 5:
                monthname = "may";
                break;
            case 6:
                monthname = "jun";
                break;
            case 7:
                monthname = "july";
                break;
            case 8:
                monthname = "august";
                break;
            case 9:
                monthname = "setember";
                break;
            case 10: monthname="october";
                break;
            case 11: monthname ="november";
                break;
            case 12: monthname="december";
                break;
            default:
                monthname = "invalid month";
                break;
        }
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
        {
            System.out.println(monthname+" = 31 dena");
        }
         else if(month==4||month==6||month==9||month==11){
             System.out.println(monthname +" = 30 dena");
        }
         else if (month == 2)
        {
             System.out.println(monthname + " = 29 dena");}

    }


    public static void killyourself(){
        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.nextLine());
        String neighbours = " value";
        switch(floors){
            case 8: neighbours = "Mitko";
                break;
            case 7: neighbours = "gosho";
                break;
            case 6: neighbours = "mima";
                break;
            case 5: neighbours = "veska";
                break;
            case 4: neighbours = "pesho";
                break;
            case 3: neighbours = "marika";
                break;
            case 2: neighbours = "petranka";
                break;
            case 1: neighbours = "pepa";
                break;
            default: neighbours ="auch";
        break;}
        System.out.println("say hi to your neighbour " + neighbours);
    }
}