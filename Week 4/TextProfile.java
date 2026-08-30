class Profile {

    private String name;
    private int age;
    private double heightMetres;

    Profile(String name, int age, double heightMetres) {

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Name cannot be blank.");
        }

        if (age < 0) {
            System.out.println("Age cannot be negative.");
        }

        if (heightMetres <= 0) {
            System.out.println("Height must be positive.");
        }

        this.name = name;
        this.age = age;
        this.heightMetres = heightMetres;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    double getHeightMetres() {
        return heightMetres;
    }

    @Override
    public String toString() {
        return "Profile [Name: " + name
                + ", Age: " + age
                + ", Height: " + heightMetres + " m]";
    }
}


public class TextProfile {

    public static void main(String[] args) {

        

        String name = args[0];
        String ageText = args[1];
        String heightText = args[2];

        int age = Integer.parseInt(ageText);
        double height = Double.parseDouble(heightText);

        Profile person = new Profile(name, age, height);

        System.out.println("=== Profile Details ===");
        System.out.println(person);

        System.out.println("\nUsing getters:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Height: " + person.getHeightMetres() + " metres");

        // Reverse conversion from numbers back to Strings
        String ageAsText = Integer.toString(person.getAge());
        String heightAsText = Double.toString(person.getHeightMetres());

        System.out.println("\nReverse Conversion:");
        System.out.println("Age as text: " + ageAsText);
        System.out.println("Height as text: " + heightAsText);
    }
}