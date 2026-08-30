 public class CourseEnrollment {
    public static void main(String[] args) {

        Course course = new Course("CS101", "Java Programming", 5);

        System.out.println(course);

        System.out.println("Enroll: " + course.enroll());
        System.out.println("Enroll: " + course.enroll());

        System.out.println(course);

        System.out.println("Enroll: " + course.enroll());
        System.out.println("Is Full: " + course.isFull());

        System.out.println("Over-enroll: " + course.enroll());

        System.out.println("Withdraw: " + course.withdraw());
        System.out.println(course);

        System.out.println("Withdraw: " + course.withdraw());
        System.out.println("Withdraw: " + course.withdraw());

        System.out.println("Withdraw from empty: " + course.withdraw());
    }

    
}
