import java.util.Scanner;
class GradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of 5 subject: ");
        int[] arr= new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<0 || arr[i]>100){
                System.out.println("Invlaid marks.Enter the valid marks.");
                return;
            }
        }
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Total Marks: "+sum+" / 500");
        double average = (double) sum/arr.length;
        System.out.println("Average Percentage: "+average+"%");
        if(average<=35){
            System.out.println("Grade: D");
        }
        else if(average<=50){
            System.out.println("Grade: C");
        }
        else if(average<=70){
            System.out.println("Grade: B");
        }
        else if(average<=89){
            System.out.println("Grade: A");
        }
        else{
            System.out.println("Grade: A+");
        }
    }
}