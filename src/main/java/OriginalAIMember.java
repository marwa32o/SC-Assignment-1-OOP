/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */public class OriginalAIMember {
    public String name;
    public int memberId;

    public OriginalAIMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void borrowBook(OriginalAIBook book) {
        if (book.available) {
            book.available = false;
            System.out.println(name + " borrowed " + book.title);
        } else {
            System.out.println("Book is not available.");
        }
    }
}