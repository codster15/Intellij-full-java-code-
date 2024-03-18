public class AXIS implements bank {

    @Override
    public void balancetranfer() {

        System.out.println("axis balance transfer");
    }

    @Override
    public void checkBalance() {

        System.out.println("axis check balance");

    }

    public static void main(String[] args) {
        AXIS a = new AXIS();
        a.balancetranfer();
        a.checkBalance();
    }
}
