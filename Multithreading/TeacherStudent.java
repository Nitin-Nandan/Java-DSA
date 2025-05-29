package Multithreading;

class WhiteBoard {
    String text;
    int numberOfStudents = 0;
    int count = 0;

    public void attendance() {
        numberOfStudents++;
    }

    synchronized public void write(String text) {
        System.out.println("Teacher is writing : " + text);
        while (count != 0) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.text = text;
        count = numberOfStudents;
        notifyAll();
    }

    synchronized public String read() {
        while (count == 0) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        String toWrite = text;
        count--;
        if(count == 0) {
            notify();
        }
        return toWrite;
    }
}

class Teacher extends Thread {
    WhiteBoard wb;
    String[] notes = {"JAVA is OOPs language", "It is Platform Independent", "It supports Threads", "end"};

    public Teacher(WhiteBoard wb){
        this.wb = wb;
    }

    public void run() {
        for(int i=0; i<notes.length; i++){
            wb.write(notes[i]);
        }
    }
}

class Student extends Thread{
    String name;
    WhiteBoard wb;
    public Student (String name, WhiteBoard wb) {
        this.name = name;
        this.wb = wb;
    }
    public void run() {
        String text;
        wb.attendance();

        do{
            text=wb.read();
            System.out.println(name + " reading " + text);
            System.out.flush();
        } while(!text.equals("end"));
    }
}

public class TeacherStudent {
    public static void main(String arg[]) {
        WhiteBoard wb = new WhiteBoard();
        Teacher t = new Teacher(wb);

        Student s1 = new Student("1. Ajay", wb);
        Student s2 = new Student("2. Nitin", wb);
        Student s3 = new Student("3. Shivali", wb);
        Student s4 = new Student("4. Shreyas", wb);

        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
