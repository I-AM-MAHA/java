package tasks;

class Course {

    private String courseName;
    private String instructor;
    private int credits;

    Course(String courseName, String instructor, int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
    }
}

class OnlineCourse extends Course {

    private String platform;
    private int duration; 

    OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

    // Override displayDetails to include platform and duration
    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Platform: " + platform);
        System.out.println("Duration: " + duration + " hours");
    }

    public void checkEligibilityForCertificate() {
        if (duration >= 10) { 
            System.out.println("Eligible for Certificate: Yes");
        } else {
            System.out.println("Eligible for Certificate: No");
        }
    }
}

public class CourseApp {

    public static void main(String[] args) {

        Course generalCourse = new Course("python", "Arun", 3);

        OnlineCourse onlineCourse = new OnlineCourse("Java Programming","lucky ", 4, "Coursera", 15);

        System.out.println("General Course Details:");
        generalCourse.displayDetails();

        System.out.println("Online Course Details:");
        onlineCourse.displayDetails();
        onlineCourse.checkEligibilityForCertificate();
    }
}
