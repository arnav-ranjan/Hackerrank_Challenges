package com.HackerRank.Examples;

import java.util.*;
// hello?
class student {
    private int token;
    private  String fname;
    private double cgpa;

    public student(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getToken() {
        return token;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class Priorities {
    public List < student > getStudents( List < String > events) {
        PriorityQueue < student > student_queue = new PriorityQueue(Comparator.comparing(student::getCgpa).reversed().thenComparing(student::getFname).thenComparing(student::getToken));
        List < student > students = new ArrayList<>();

        for (String e : events) {
            Scanner scan = new Scanner(e);
            String event = scan.next();

            if (event.equals("ENTER")) {

                String name = scan.next();
                float cgpa = scan.nextFloat();
                int token = scan.nextInt();

                student student = new student(token, name, cgpa);
                student_queue.add(student);
            } else if (event.equals("SERVED")) {
                student first = student_queue.poll();
            } scan.close();
        }
        student first = student_queue.poll();
        if (first == null) {
            return students;
        } else {
            while(first != null) {
                students.add(first);
                first = student_queue.poll();
            }
            return students;
        }

    }
}

public class HRPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (student st: students) {
                System.out.println(st.getFname());
            }
        }
    }

}
