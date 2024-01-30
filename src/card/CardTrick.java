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
        
        System.out.println("The 7 random cards in the magicHand are:");
        for (Card card : magicHand) {
            System.out.println(card.getSuit() + " " + card.getValue());
        }

        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit("Spades");
        System.out.println("Lucky Card: " + luckyCard.getSuit() + " " + luckyCard.getValue());
        
        boolean found = false;
                for (Card card:magicHand) {
                    if (card.getValue() == luckyCard.getValue() && card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                        found = true;
                        break;
                    }
                }
        if (found) {
            System.out.println("Congratulations! The lucky card is in the magic hand!");
        } else {
            System.out.println("Sorry, the lucky card is not in the magic hand.");
        }
        
        scanner.close();
    }
    
}
