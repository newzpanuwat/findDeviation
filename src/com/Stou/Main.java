package com.Stou;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double A[] = new double[5];
        Main cl = new Main();
        cl.enterData(A);
        cl.showData(A);



    }
    public void enterData(double []A) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            System.out.print("Input data:" + (i+1)+ " ");
            A[i] = sc.nextDouble();
        }
    }

    public double sumData(double []A){
        double sum=0;

        for(int i =0;i<A.length;i++){
            sum += A[i];
        }
        return sum;
    }

    public double findMax(double []A) {
        double max = 0;
        for (int i = 0; i < A.length; i++) {
            max = A[0];
            if(A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }


    public double findMin(double []A){
        double min = 0;
        for(int i=0;i<A.length;i++) {
            min = A[0];
            if(A[i] < min) {
                min = A[i];
            }
        }
        return min;
    }

    public double findMean(double []A,double sum){
        double mean = 0;
        for(int i=0;i<A.length;i++){
            mean = sum/A[i];
        }
        return mean;
    }
    public double findDeviation(double []A, double mean){
        double Deviate=0;
        double Sumdeviate=0;
        double E=0;

        E = A.length-mean;
        Sumdeviate = Math.pow(E,2)/A.length;
        Deviate = Math.sqrt(Sumdeviate);

        return Deviate;

    }


    public void showData(double []A){
        Main cl = new Main();
        double SUM,MAX,MIN,MEAN,DEVIATION=0;

        SUM = cl.sumData(A);
        MAX = cl.findMax(A);
        MIN = cl.findMin(A);
        MEAN = cl.findMean(A,SUM);
        DEVIATION = cl.findDeviation(A,MEAN);

        System.out.println("Summary is "+ SUM);
        System.out.println("Max is "+ MAX);
        System.out.println("Min is "+ MIN);
        System.out.println("MEAN is "+ MEAN);
        System.out.println("DEVIATION is "+ DEVIATION);

    }
}
