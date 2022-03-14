public class Main {
    public static void main(String [] args) {
            Account user1 = new Account (101,"Anna", "Suska",1000);
            Account user2 = new Account();



    System.out.println(user1.getAccountNo());
    user2.setAccountNo(105);
    System.out.println(user2.getAccountNo());


    }
}
