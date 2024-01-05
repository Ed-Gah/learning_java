import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Student {
    String name;
    int rno;
    Student() {
        name = "Edwin";
        rno = 123;
    }
    Student(String str, int n) {
        name = str;
        rno = n;
    }
}
class Buffer {
    public void throwsError() throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int a = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println("A :" + a);
        System.out.println("String :"+ str);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // Reading input with scanner class
        Student s1 = new Student();
        System.out.println(s1.name);
        Student s2 = new Student("Gah", 28);
        System.out.println(s2.name);
        System.out.println(s2.rno);
        String name;
        double c;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name");
//        name = sc.next();
//        System.out.println("Name: " + name);
//        Buffer bf = new Buffer();
//        bf.throwsError();
        System.out.println(s1.rno);

        // Read data from files
//        FileReader fr = new FileReader(/home/ed-gah/bash);// Read data from files existing files
//        BufferedReader bf = new BufferedReader(fr);
//        String bfstr = bf.readLine();
//        System.out.println(bfstr);
//        // Read characters from the input string with BufferedReader
//        InputStreamReader ir = new InputStreamReader(System.in); //Read bytes and convert them to character.
//        BufferedReader br = new BufferedReader(ir); //Read only characters / string converted above;
//        int a = Integer.parseInt(br.readLine());
//        float b = Float.parseFloat(br.readLine());
//        String str = br.readLine();
    }
}