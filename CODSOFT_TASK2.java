import java.util.*;
public class StudentGradeCalculator{
    public static void main(String[]args)
    {
        try(Scanner scanner =new Scanner(System.in)){
        System.out.print("Enter the total number of subjects : ");
        int TotalNumberOfSubjects=scanner.nextInt();
        int Marks[]=new int[TotalNumberOfSubjects];
        int TotalMarks=0;
        char Grade;
        System.out.println("Enter marks obtained in each subject : ");
        for(int i=0;i<TotalNumberOfSubjects;i++)
        {
            Marks[i]=scanner.nextInt();
            TotalMarks += Marks[i];
        }
        double AveragePercentage=(double)TotalMarks/TotalNumberOfSubjects;
        if(AveragePercentage>=90){
            Grade='A';
        }
        else if(AveragePercentage>=80){
            Grade='B';
        }
        else if(AveragePercentage>=70){
            Grade='C';
        }
        else if(AveragePercentage>=60){
            Grade='D';
        }
        else if(AveragePercentage>=50){
            Grade='E';
        }
        else{
            Grade='F';
        }
        System.out.println("Your Total Mark in "+TotalNumberOfSubjects+" is : "+TotalMarks+"/"+(TotalNumberOfSubjects*100));
        System.out.println("The Average Percentage is : "+AveragePercentage+" %");
        System.out.println("Your Grade is : '"+Grade+"'");
        scanner.close();
    }
}
}
