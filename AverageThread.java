package tasks;

class SubjectThread extends Thread {
    private final String subjectName; 
    private final int marks; 
    private static int totalMarks = 0; 
    private static final Object lock = new Object(); 

    public SubjectThread(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    
    public void run() {
        synchronized (lock) {
            totalMarks += marks; 
            System.out.println(subjectName + " processed marks: " + marks);
        }
    }

    public static int getTotalMarks() {
        return totalMarks;
    }
}

public class AverageThread {
    public static void main(String[] args) {
        String[] subjects = {"Maths", "Physics", "English", "Chemistry", "Tamil"};
        int[] marks = {85, 90, 78, 88, 92};

        SubjectThread[] threads = new SubjectThread[subjects.length];

        for (int i = 0; i < subjects.length; i++) {
            threads[i] = new SubjectThread(subjects[i], marks[i]);
            threads[i].start();
        }

        for (SubjectThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        int totalMarks = SubjectThread.getTotalMarks();
        double average = totalMarks / (double) subjects.length;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
    }
}
