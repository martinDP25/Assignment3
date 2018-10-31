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
		int x, i, goals;
		String favTeam;
		String[] teams16= {"Portugal", "Italy", "Brazil", "England", "Greece", "Canada", "Spain", "Germany", 
				"France", "Switzerland", "Sweden", "Denmark", "Ireland", "Belgium", "Columbia", "Russia"};
		
		String[][] match1 = {{"Portugal", "Italy"}, {"Brazil", "England"}, {"Greece", "Canada"}, {"Spain", "Germany"}, 
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
		for(x=0; x<match1.length; x++)
		{
			for(i=0; i<match1[x].length; i++) 
			{
				System.out.print(match1[x][i] + " : ");
			}
			System.out.println(" ");
		}
		/*for(x=0; x<teams16.length; x++)
		{
			goals=randG.nextInt(5);
			System.out.print(teams16[x] + " " + goals + ":");
			goals=randG.nextInt(5);
			System.out.println(teams16[++x] + " " + goals);
		}*/
	}
}
