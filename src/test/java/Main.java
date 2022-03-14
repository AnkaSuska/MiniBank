import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ilu uzytkownikow chcesz dodac?");
        int numberOfNewAccounts = scanner.nextInt();
        Account tableOfNewAccounts[] = new Account[numberOfNewAccounts];

        for (int i = 0; i < tableOfNewAccounts.length; i++) {

            tableOfNewAccounts[i] = new Account();
            tableOfNewAccounts[i].openAccount();
            tableOfNewAccounts[i].showAccount();
        }
        int inputNumber;
        do {

            System.out.println("search.1,2,3,4");
            System.out.println("Co chcesz zrobic? Wprowadz cyfre: ");
            inputNumber = scanner.nextInt();
            switch (inputNumber) {
                case 1:
                    System.out.println("Podaj accountNo:");
                    int accountToSearch = scanner.nextInt();
                    boolean found = false;
                    for (int i = 0; i < tableOfNewAccounts.length; i++) {

                        found = tableOfNewAccounts[i].search(accountToSearch);

                        if (found) {
                            break;
                        }

                    }
                case 5:

                    break;
            }


        }
        while (inputNumber != 5);
    }
}

