public class Student {
    private String local_name;
    private String local_gender;
    private int local_id;
    private int local_age;

    public Student(String name, String gender, int id, int age) {
        local_name = name;
        local_gender = gender;
        local_id = id;
        local_age = age;
    }

    public Student(String name) {
        local_name = name;
        local_gender = "";
    }

    public void changeName(String newName) {
        local_name = newName;
    }
    public void changeGender(String newGender) {
        local_gender = newGender;
    }
    public void changeId(int newId) {
        local_id = newId;
    }


    public String returnName() {
        return local_name;
    }


}