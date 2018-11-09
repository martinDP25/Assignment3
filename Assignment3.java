// -------------------------------------------------------
// Assignment 3
// Written by: Matthew Da Silva - 40008582
// For COMP 248 Section EE – Fall 2018
//
// 
// --------------------------------------------------------
import java.util.Scanner;
import java.util.Random;

public class Assignment3 {

	public static void main(String[] args) {

		
		Random randG=new Random();
		int x, i, g=16;
		int goals1[]= new int [8];
		int goals2[]= new int [8];
		String favTeam;
		String[] teams16= {"Portugal", "Italy", "Brazil", "England", "Greece", "Canada", "Spain", "Germany", 
				"France", "Switzerland", "Sweden", "Denmark", "Ireland", "Belgium", "Columbia", "Russia"};
		String[] teams8, teams4, teams2;
		
		String[][] round1 = {{"Portugal", "Italy"}, {"Brazil", "England"}, {"Greece", "Canada"}, {"Spain", "Germany"}, 
				{"France", "Switzerland"}, {"Sweden", "Denmark"}, {"Ireland", "Belgium"}, {"Columbia", "Russia"}};
		
		Scanner myKeys=new Scanner(System.in);

		System.out.println("Enter your favourite team: ");
		favTeam=myKeys.next();

		for(x=0; x<teams16.length; x++)
		{
			if(favTeam.equalsIgnoreCase(teams16[x]))
			{
				break;
			}else if(x==15) {
				System.out.println("Sorry, your team is not in the Round of 16"); 	
			}
		}
		System.out.println("Round of 16");
		for(x=0; x<round1.length; x++)
		{
			for(i=0; i<round1[x].length; i++) 
			{
				goals1[i]=randG.nextInt(5);
				goals2[i]=randG.nextInt(5);
				System.out.print("[" + round1[x][i] + " " + goals1[i] + " : " + goals2[i] + " " + round1[x][++i] + "]");
			}
			System.out.print(" ");
		}
		System.out.println("");
		System.out.println("Quarter Finals");
	}
	
}