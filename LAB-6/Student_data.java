
import java.util.Scanner;

class Student {
   int id_no;
   int no_of_subject_registered;
   String []subject_code;
   int []subject_credits;
   String []grade_obtained;
   double spi;
   
   Student(int id_no , int no_of_subject_registered){
    this.id_no = id_no;
    this.no_of_subject_registered = no_of_subject_registered;
    this.subject_code = new String[no_of_subject_registered];
    this.subject_credits = new int[no_of_subject_registered];
    this.grade_obtained = new String[no_of_subject_registered];
   }

   public void insertSubjectData(){
    Scanner sc = new Scanner(System.in);

    for(int i=0; i<no_of_subject_registered ; i++){
        System.out.println("Enter Subject Code : ");
        this.subject_code[i] = sc.next();

        System.out.println("Enter Subject Credit : ");
        this.subject_credits[i] = sc.nextInt();

        System.out.println("Enter Subject Grade Obtained : ");
        this.grade_obtained[i] = sc.next();
    }
    sc.close();
   }

   
   public double calculate_spi(){
    int totalCredits = 0;
    int sum=0;

    for(int i=0 ; i<no_of_subject_registered ; i++){
        totalCredits+=subject_credits[i];
        switch (grade_obtained[i]) {
            case "A+":
                sum+=10*subject_credits[i];
                break;
            case "A":
                sum+=9*subject_credits[i];
                break;
            case "B+":
                sum+=8*subject_credits[i];
                break;
            case "B":
                sum+=7*subject_credits[i];
                break;
            case "C+":
                sum+=6*subject_credits[i];
                break;
            case "C":
                sum+=5*subject_credits[i];
                break;
            default:
                sum+=0*subject_credits[i];
                break;
        }
    }
    this.spi = sum / (double)totalCredits;
    return this.spi;
   }
}

public class Student_data {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        Student s[]= new Student[n];
        for(int i=0; i<n ; i++){
            System.out.println("Enter Student Id : ");
            int id_no = sc.nextInt();
            System.out.println("Enter no of Subject Registered :");
            int no_of_subject_registered = sc.nextInt();
            s[i] = new Student(id_no, no_of_subject_registered);
            s[i].insertSubjectData();
            System.out.println("SPI = " + s[i].calculate_spi());
        }
        
        sc.close();

    }
}
