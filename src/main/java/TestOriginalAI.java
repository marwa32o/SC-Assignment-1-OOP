/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */public class TestOriginalAI {
    public static void main(String[] args) {
        OriginalAIBook book = new OriginalAIBook("Java Programming", "James Gosling");
        OriginalAIMember member = new OriginalAIMember("Ali", 101);

        System.out.println("--- Testing Original AI Code (Flawed Encapsulation) ---");
        System.out.println("Initial Availability: " + book.available);
        
        // DIRECT BYPASS: Modifying public variable directly without using methods
        book.available = false; 
        
        System.out.println("Availability after direct bypass: " + book.available);
    }
}