/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Task1Main {

    public static void main(String[] args) {

        DigitalWallet wallet =
                new DigitalWallet("Marwa", 5000, "1234");

        System.out.println("Account Holder: "
                + wallet.getAccountHolder());

        System.out.println("Initial Balance: "
                + wallet.getBalance());

        boolean result1 = wallet.withdraw(1000, "1234");

        System.out.println("Withdrawal with correct PIN: "
                + result1);

        System.out.println("Balance after withdrawal: "
                + wallet.getBalance());

        boolean result2 = wallet.withdraw(1000, "9999");

        System.out.println("Withdrawal with wrong PIN: "
                + result2);

        System.out.println("Final Balance: "
                + wallet.getBalance());
    }
}
