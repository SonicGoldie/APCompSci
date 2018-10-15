package Projects;

class Dog {

    private int age;
    private String name;

    Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setName(String age) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    int getPersonYears() {
        return age * 7;
    }

    public String toString() {
        return "Age: " + age + " Person Age: " + getPersonYears() + " Name: " + name;
    }
}