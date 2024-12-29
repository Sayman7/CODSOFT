import java.util.*;

public class Grade_Calculator {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        float marks[]= new float[5];
        float tot=0.0f,avg=0.0f;
        char grade='\0';
        System.out.print("Enter the marks obtained in English: ");
        marks[0]= in.nextFloat();
        System.out.print("Enter the marks obtained in Hindi: ");
        marks[1]= in.nextFloat();
        System.out.print("Enter the marks obtained in Optional 1: ");
        marks[2]= in.nextFloat();
        System.out.print("Enter the marks obtained in Optional 2: ");
        marks[3]= in.nextFloat();
        System.out.print("Enter the marks obtained in Computer Science: ");
        marks[4]= in.nextFloat();
        for(int i=0;i<marks.length;i++)
         if(marks[i]>100)
         System.exit(0);
        for(int i=0;i<marks.length;i++)
         tot+=marks[i];
        avg= (float)(tot/5);
        if((avg<=100)&&(avg>=90))
        grade= 'A';
        else if((avg<90)&&(avg>=75))
        grade= 'B';
        else if((avg<75)&&(avg>=60))
        grade= 'C';
        else if((avg<60)&&(avg>=40))
        grade= 'D';
        else if(avg<40)
        grade= 'E';
        System.out.println("The total marks obtained is: "+tot);
        System.out.println("The average percentage calculated is: "+avg);
        System.out.println("The corresponding grade is: "+grade);
    }
}
