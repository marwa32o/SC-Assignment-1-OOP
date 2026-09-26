/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Task4Main {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "James Gosling");
        Member member = new Member("Ali", 101);

        System.out.println("--- Testing Refactored Task 4 Code ---");
        System.out.println("Initial Availability: " + book.isAvailable());
        
        member.borrowBook(book);
        
        System.out.println("Availability after borrowing: " + book.isAvailable());
    }
}