public class Student extends user {
    int rank;

    void Show (Student s){
        System.out.println(s.id);
        System.out.println(s.name);
        System.out.println(s.rank);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.id =12343;
        s.name = "Ashok";
        s.rank = 784683;
        s.Show(s);

    }
}
