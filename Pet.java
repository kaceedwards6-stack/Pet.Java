public class Pet {

    private String name;
    private String type;
    private int age;

    public Pet() {
        setName("Pet Name");
        setType("Animal");
        setAge(1);
    }

    public Pet(String type, String name, int age) {
        setType(type);
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        }
        else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        }
        else {
            return "Noise";
        }
    }

    public String toString() {
        String output = "Pet information:\n";
        output += "Type: " + type + "\n";
        output += "Name: " + name + "\n";
        output += "Sound: " + speak() + "\n";
        output += "Age: " + age;
        return output;
    }
}
