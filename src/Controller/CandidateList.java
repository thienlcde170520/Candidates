
package Controller;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import Model.Candidate;
import Model.Experience;
import Model.Fresher;
import Model.Intern;

public class CandidateList {
	private ArrayList<Candidate> list = new ArrayList<Candidate>();
	private Experience exp;
	private Fresher fresher;
	private Intern intern;
	private Stack<Candidate> stack = new Stack<Candidate>();
	public void input(Scanner s, int type) {
		String choice;
		do {
			if (type<1||type>3) break;
			switch (type) {
			case 1:
				exp = new Experience();
				exp.input(s);
				exp.setType("Experience");
				list.add(exp);
				stack.push(exp);
				break;
			case 2:
				fresher = new Fresher();
				fresher.input(s);
				fresher.setType("Fresher");
				list.add(fresher);
				stack.push(fresher);
				break;
			case 3:
				intern = new Intern();
				intern.input(s);
				intern.setType("Intern");
				list.add(intern);
				stack.push(intern);
				break;
			}
		System.out.println("Do you want to continue (Y/N)?");
		choice = s.nextLine();
		choice= choice.toLowerCase();
		if (!choice.matches("y")&&!choice.matches("yes")) {
			while(!stack.isEmpty()) {
				stack.pop().show();
				}
			}	
		}
		while(choice.matches("y")||choice.matches("yes"));
	}
	
	public void showNameList() {
		System.out.println("List of candidate: ");
		System.out.println("========EXPERIENCE CANDIDATE=========");
		for(Candidate exp: list) {
			if (exp instanceof Experience)
				System.out.println(exp.getFullName());
		}
		System.out.println("=========FRESHER CANDIDATE==========");
		for(Candidate fresher: list) {
			if (fresher instanceof Fresher)
				System.out.println(fresher.getFullName());
		}
		System.out.println("==========INTERN CANDIDATE==========");
		for(Candidate intern: list) {
			if (intern instanceof Intern)
				System.out.println(intern.getFullName());
		}
	}
	
	public void search(Scanner s) {
		showNameList();
		System.out.println();
		System.out.print("Input candidate name(First name or Last): ");
		String name = s.nextLine();
		System.out.print("Input type of candidate(0.All 1.Experience 2.Fresher 3.Intern): ");
		int type = s.nextInt();
		s.nextLine();
		System.out.println();
		System.out.println();
		System.out.println("The candidate found:");
		String pattern = ".*"+ name+ ".*";
		for (Candidate x: list) {
			String fullname = x.getfName() + x.getlName();
			if (fullname.matches(pattern) )
				stack.push(x); 
		}
		switch (type) {
		case 0:
			while(!stack.isEmpty())
				stack.pop().show();
			break;
		case 1:
			while(!stack.isEmpty())
				if ((stack.peek() instanceof Experience))
					stack.pop().show();
				else stack.pop();
			break;
		case 2:
			while(!stack.isEmpty())
				if ((stack.peek() instanceof Fresher))
					stack.pop().show();
				else stack.pop();
			break;
		case 3:
			while(!stack.isEmpty())
				if ((stack.peek() instanceof Intern))
					stack.pop().show();
				else stack.pop();
			break;
		}
	}
	
}
