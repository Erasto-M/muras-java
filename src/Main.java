import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("what is your name");
        String name = keyboard.nextLine();
        System.out.println("my name is " + name);
        System.out.println(" Which is your year of birth?");
        int num= keyboard.nextInt();
        System.out.println("My year of birth is " + num );
        System.out.println("what is your body weight in kilograms");
        float numa= keyboard.nextFloat();
        System.out.println("i have "+ numa +" kilograms");
        System.out.println("My name is " + name + " and i was born in the year " + num + "and i have " + numa + " kilograms");
        hello x = new hello();
        marks mur = new marks();
        Area mun = new Area();
        area mura = new area();
        x.name = "munyao";
        x.year = 2022;
        x.muras = "munyao";
        x.dekut();
        x.murasta();
        mur.marks();
        mun.Area();
        mura.area();
    }
}

class marks{
    public void marks(){
        Scanner muras = new Scanner(System.in);
        System.out.println("enter your marks");
        int x= muras.nextInt();
        if( x>=90 && x<=100){
            System.out.println("Grade is A");
        }
        else if(x>=80 && x<90){
            System.out.println("grade is A-");
        }
        else if(x>=70 && x<80){
            System.out.println("grade is B+");
        }
        else if(x>=65 && x<70){
            System.out.println("grade is B");
        }
        else if(x>=60 && x<65){
            System.out.println("grade is B-");
        }
        else if(x>=55 && x<60){
            System.out.println("grade is C+");
        }
        else if(x>=50 && x<55){
            System.out.println("grade is C");
        }
        else if(x>=45 && x<50){
            System.out.println("grade is C-");
        }
        else if(x>=40 && x<45){
            System.out.println("grade is D+");
        }
        else if(x>=35 && x<40){
            System.out.println("grade is D");
        }  else if(x>=30 && x<35){
            System.out.println("grade is D-");
        }
        else if(x>=0 && x<30){
            System.out.println("grade is E");
        }
        else {
            System.out.println("Wrong marks");
        }

    }
}
 class Area{
    public void   Area(){
        Scanner length = new Scanner(System.in);
        int area;
        System.out.println("Enter the length of the rectangle");
        int x = length.nextInt();
        System.out.println("Enter the width of the rectangle");
        int y = length.nextInt();
        area = x * y;
        System.out.println( "The area of the rectangle is " + area);
    }
 }
class area{
    public void   area(){
        Scanner height = new Scanner(System.in);
        int area;
        System.out.println("Enter the length of the triangle");
        int x = height.nextInt();
        System.out.println("Enter the height of the triangle");
        int y = height.nextInt();
        area = (x/2 * y);
        System.out.println( "The area of the triangle is " + area);
    }
}