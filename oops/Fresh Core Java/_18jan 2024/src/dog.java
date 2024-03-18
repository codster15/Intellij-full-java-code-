public class dog {


    private String name ;
    private String bread ;


    public dog setName(String name) {
        this.name = name;
        return this;
    }

    public dog setBread(String bread) {
        this.bread = bread;
        return this;
    }



   public dog(String name , String bread){
       this.name = name;
       this.bread = bread;

   }


   String getDogName (){
       return name;
   }

   String getDogBread (){
       return bread ;
   }






    public static void main(String[] args) {
        dog dog1 = new dog("William" , "German Shephard");

        dog1.getDogName();
        dog1.getDogBread();

         dog1.setName("king");
        dog1.setBread("loyal");


        System.out.println(dog1.getDogBread());
        System.out.println(dog1.getDogName());

    }
}





