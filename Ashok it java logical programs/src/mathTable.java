
//display math table of given number
public class mathTable {
    static void table(int no){
       int count = 1;
        while(count <= 10){
            int tab = no * count;
            System.out.println(no + " * " + count + " = " + tab);
            count++;
        }
    }
    public static void main(String[] args) {
        table(12);
    }
}
