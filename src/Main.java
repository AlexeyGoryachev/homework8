import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 8.");
        System.out.println("Task 1.");
        int [] num = new int [3];
        num [0]=1;
        num [1]=2;
        num [2]=3;
        double [] num1={1.57, 7.564, 9.986};
        int [] num2={11,22,33};
        System.out.println(" ");
        System.out.println("Task 2.");
        System.out.print(Arrays.toString(num));
        System.out.println(" ");
        System.out.print(Arrays.toString(num1));
        System.out.println(" ");
        System.out.println(Arrays.toString(num2));
        System.out.println(" ");
        System.out.println("Task 3.");
        for (int i=num.length - 1; i>=0; i--) {
            System.out.print(num[i] + ", ");
        }
        System.out.println(" ");
        for (int i=num1.length - 1; i>=0; i--) {
            System.out.print(num1[i] + ", ");
        }
        System.out.println(" ");
        for (int i=num2.length - 1; i>=0; i--){
            System.out.print(num2[i] + ", ");
        }
        System.out.println(" ");
        System.out.println("Task 4.");
        //num [0] = num [0] + 1;
        //num [2] = num [2] + 1;
        for (int q=0; q<num.length; q++){
            if (num[q]%2!=0){
                num[q]++;
            }
        }
        System.out.print(Arrays.toString(num));
    }
}