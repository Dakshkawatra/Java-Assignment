    class Course {
    private String code;
    private String title;
    private int capacity;
    private int enrolledCount;

    Course(String code, String title, int capacity) {
        if (capacity <= 0)
            System.out.println("Capacity must be positive");

        this.code = code;
        this.title = title;
        this.capacity = capacity;
        this.enrolledCount = 0;
    }

    boolean enroll() {
        if (isFull())
            return false;

        enrolledCount++;
        return true;
    }

    boolean withdraw() {
        if (enrolledCount == 0)
            return false;

        enrolledCount--;
        return true;
    }

    boolean isFull() {
        return enrolledCount == capacity;
    }

    int getAvailableSeats() {
        return capacity - enrolledCount;
    }

    public String toString() {
        return code + " - " + title +
               " | Enrolled: " + enrolledCount +
               "/" + capacity +
               " | Available: " + getAvailableSeats();
    }
} 
