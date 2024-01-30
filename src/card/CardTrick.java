/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;
/*
 * @author jennyle 
 * Student ID 991108304
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        Random rand = new Random();
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            int randomSuitIndex = rand.nextInt(Card.SUITS.length);
            c.setSuit(Card.SUITS[randomSuitIndex]);
            
            int randomValue = rand.nextInt(13)+1;
            c.setValue(randomValue);
            
            magicHand[i] = c;
        }
        
        System.out.println("Enter a card value (1-13): ");
        int userValue = scanner.nextInt();
        
        System.out.println("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        String userSuit = scanner.next();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        boolean found = false;
                for (Card card:magicHand) {
                    if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                        found = true;
                        break;
                    }
                }
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        
        scanner.close();
    }
    
}
