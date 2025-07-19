package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
    static Student[] data = new Student[10]; 
    public static void init() {
        
        for (int i = 0; i < data.length; i++) {
            data[i] = new Student();
        
        data[0] = new Student("A1", new int[]{72, 73, 74});
        data[1] = new Student("B1", new int[]{75, 76, 77});
        data[2] = new Student("C1", new int[]{99, 99, 99});
        data[3] = new Student("C3", new int[]{100, 100, 99});
        data[4] = new Student("B2", new int[]{13, 88, 13});
        data[5] = new Student("C3", new int[]{14, 14, 99});
        data[6] = new Student("A2", new int[]{77, 55, 12});
        data[7] = new Student(null, new int[]{13, 88, 13});  
        data[8] = new Student("A2", null);                    
        data[9] = null;                                       
        }
    }

    public static void main(String[] args) {
        init();

        StudentReport sr = new StudentReport();
        StudentService ss = new StudentService();

        for (int i = 0; i < data.length; i++) {
            try {
                
                if (data[i] == null) {
                    System.out.println("Student object at index " + i + " is null");
                    continue; 
                }

                String result = sr.validate(data[i]);
                if ("VALID".equals(result)) {
                    String grade = sr.findGrades(data[i]);
                    System.out.println("Grade for student " + i + ": " + grade);
                }
            } catch (NullNameException e) {
                System.out.println(e.toString()); 
            } catch (NullMarksArrayException e) {
                System.out.println(e.toString()); 
            } catch (NullStudentObjectException e) {
                System.out.println(e.toString()); 
            }
        }
        System.out.println("Number of null marks array: " + ss.findNumberOfNullMarksArray(data));
        System.out.println("Number of null names: " + ss.findNumberOfNullName(data));
        System.out.println("Number of null objects: " + ss.findNumberOfNullObjects(data));
    }
}
