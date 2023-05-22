/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package studentlist;

import java.util.Scanner;

/**
 *
 * @author Megha Patel,2023
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] sList=new Student[5];
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<=sList.length-1;i++){
            sList[i]=new Student();
        
            System.out.println("Enter student name:");
            
            sList[i].setStudentName(sc.nextLine());
        }
        
        for(int i=0;i<=sList.length-1;i++)
        {
            System.out.println("Student name: "+sList[i].getStudentName());
        }
     }

}
