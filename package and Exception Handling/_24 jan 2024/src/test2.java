

public class test2 {

    public String user (int id) throws Exception {
        if(id == 101){
            return "raju";
        } else if (id == 102) {
            return "rani";
        }else{

            throw new Exception("name not found");

        }


    }

    public static void main(String[] args) throws Exception {
        test2 t = new test2();
      String name =  t.user(101);
        System.out.println(name);
    }

}
