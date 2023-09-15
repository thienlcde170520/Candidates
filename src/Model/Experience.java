package Model;

import java.util.Scanner;
import static view.Validation.checkValidYear;
public class Experience extends Candidate {
	private int expYear; // year of experience
	private String proSkill;// Professional Skill
	public Experience() {
		super();
	}
	public int getExpYear() {
		return expYear;
	}
	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}
	public String getProSkill() {
		return proSkill;
	}
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	
	public void input(Scanner s) {
		super.input(s);
		super.setType("Experience");
		System.out.print("Enter year of experience: ");
		expYear = s.nextInt();
		checkValidYear(expYear);
		s.nextLine();
		System.out.print("Enter professional skill: ");
		proSkill = s.nextLine();
	}
	public void show() {
		super.show();
		System.out.print(expYear);
		System.out.print(" | ");
		System.out.print(proSkill);
		System.out.print(" | ");
		System.out.println();
	}
	
	
}
