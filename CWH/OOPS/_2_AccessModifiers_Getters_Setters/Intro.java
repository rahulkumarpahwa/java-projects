package CWH.OOPS._2_AccessModifiers_Getters_Setters;

public class Intro {
    public static void main(String[] args) {
        MyEmployee e1 = new MyEmployee();
        // e1.name = "apple"; // these can;'t be accessed as this is private
        // e1.id = 34; // these can't access as this is private
        e1.setId(34);
        e1.setName("apple kumar");
        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e1.getClass());

    }
}

class MyEmployee {
    private int id; // these are private so we can't access them directly.
    private String name; // these are private so we can't access them directly.

    void setName(String name) { // setter. we acn apply validation here as well.
        this.name = name;

    }

    void setId(int id) {
        this.id = id;
    }

    int getId() { // getter
        return this.id;
    }

    String getName() {
        return this.name;
    }
}