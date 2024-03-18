public class HDFC implements bank {


    @Override
    public void balancetranfer() {
        System.out.println("hdfc bank balance tranfer");
    }

    @Override
    public void checkBalance() {

        System.out.println("hdfc check balance");
    }

    public static void main(String[] args) {
        HDFC hd = new HDFC();
        hd.balancetranfer();
        hd.checkBalance();
    }
}
