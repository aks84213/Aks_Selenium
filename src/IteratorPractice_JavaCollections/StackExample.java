package IteratorPractice_JavaCollections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackpractise();
	}
public static void stackpractise(){
	
	Stack<String> teamPlayers = new Stack<>();
	teamPlayers.push("Bruce");
	teamPlayers.push("Jackie");
	teamPlayers.push("JetLi");
	teamPlayers.push("YeonBueo");
	teamPlayers.push("SammoHung");
	
	System.out.println(teamPlayers);
	System.out.println(teamPlayers.empty());
	System.out.println(teamPlayers.peek());
	System.out.println(teamPlayers.pop());
	System.out.println(teamPlayers.size());
	System.out.println(teamPlayers.search("Jackie"));
	System.out.println(teamPlayers);
	
	}
}
