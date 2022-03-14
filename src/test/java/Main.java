import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

         Scanner scanner = new Scanner(System.in);


         System.out.println("Ilu uzytkownikow chcesz dodac?");
        int numberOfNewAccounts = scanner.nextInt();
    Account tableOfNewAccounts[] = new Account[numberOfNewAccounts];

    for(int i= 0; i<tableOfNewAccounts.length; i++){

        tableOfNewAccounts[i]=new Account();
        tableOfNewAccounts[i].openAccount();

    }

    }


    }

