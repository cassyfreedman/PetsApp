
package model;


public class Pets {
    private int petID;
    private String petName;
    private String petType;
    private int age;
    private String color;

    public Pets() {
        this.petID = 0;
        this.petName = "";
        this.petType = "";
        this.age = 0;
        this.color = "";
    }
    
    public Pets(int petID, String petName, String petType, int age, String color) {
        this.petID = petID;
        this.petName = petName;
        this.petType = petType;
        this.age = age;
        this.color = color;
    }

    public int getPetID() {
        return petID;
    }

    public void setPetID(int petID) {
        this.petID = petID;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pets{" + "petID=" + petID + ", petName=" + petName + ", petType=" + petType + ", age=" + age + ", color=" + color + '}';
    }
    
    
}
