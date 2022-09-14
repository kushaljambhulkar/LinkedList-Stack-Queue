package dackOfcard;

import java.util.*;

public class DackOfCard {

	static String[] SUITS = {"Clubs","Diamonds","Hearts","Spades"};
	static String[] RANKS = {" 2"," 3"," 4"," 5"," 6"," 7"," 8"," 9"," 10"," Jack"," Queen"," King"," Ace"};
	static String[][] deck = new String[SUITS.length][RANKS.length];
	
	public static void cardsCreation()
	{
		for(int i = 0; i< SUITS.length; i++)
		{
			for(int j = 0; j< RANKS.length; j++)
			{
				deck[i][j] = SUITS[i] + RANKS[j];
			}
			
		}
	}
	
	public static void shuffle()
	{
		Random rand = new Random();
		for(int i = 0; i < SUITS.length; i++)
		{
			for(int j = 0; j< RANKS.length; j++)
			{
				int m = rand.nextInt(i+1);
				int n = rand.nextInt(j+1);
				String temp = deck[i][j];
				deck[i][j] = deck[m][n];
				deck[m][n] = temp; 
			}
		}
	}
	
	public static void distribute()
	{
		for(int i = 0; i<SUITS.length; i++)
		{
			System.out.println("");
			System.out.println("Cards recieved by players " +(i+1)+ " is ");
			for(int j = 0; j<9; j++)
			{
				System.out.println(" "+deck[i][j]);
			}
		}
	}
	public static void main(String[] args)
	{
		cardsCreation();
		shuffle();
		distribute();
	}
	
}
