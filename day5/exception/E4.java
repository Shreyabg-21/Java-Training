package oop.day5.exception;
import java.io.*;

public class E4 {
    public static void main(String[] args)throws IOException {
        BufferedReader br =null;//should always be initiialzed to null//if we dont need catch dont declare null
        String str;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));//to read the file
//            new OutputStreamWriter(System.out)//for writting the value
            System.out.print("Enter any data");
            str = br.readLine();

        }catch (Exception e){
            br.close();
        }
//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
////to read the file
////            new OutputStreamWriter(System.out)//for writting the value
//            System.out.print("Enter any data");
//            str = br.readLine();// can use try without catch or finally by using try with resource
//        }
    }
}