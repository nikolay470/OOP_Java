package DZ.seminar_5.model.abstractClass;

public abstract class User {
    private String name;
    private String surname;
    private int age;

    private int id;
    private static int count = 0;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = ++count;
    }

    public static void setCount(int count) {
        User.count = count;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int getCount() {
        return count;
    }
}
