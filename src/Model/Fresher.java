
package Model;

import java.util.Scanner;
import static view.Validation.checkRankGra;
public class Fresher extends Candidate {
	private int graTime;// graduated time
	private String  graRank, edu;// Rank of graduation, university
	public Fresher() {
		super();
	}
	public int getGraTime() {
		return graTime;
	}
	public void setGraTime(int graTime) {
		this.graTime = graTime;
	}
	public String getGraRank() {
		return graRank;
	}
	public void setGraRank(String graRank) {
		this.graRank = graRank;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	
	public void input(Scanner s) {
		super.input(s);
		super.setType("Fresher");
		System.out.print("Enter graduated time: ");
		graTime = s.nextInt();
                s.nextLine();
		System.out.print("Enter rank of graduation (Excellence, Good, Fair, Poor): ");
		graRank = s.nextLine();
		checkRankGra(graRank);
		System.out.print("Enter candidate's university: ");
		edu = s.nextLine();
	}
	
	public void show() {
		super.show();
		System.out.print(graTime);
		System.out.print(" | ");
		System.out.print(graRank);
		System.out.print(" | ");
		System.out.print(edu);
		System.out.print(" | ");
		System.out.println();
	}
	
	
}

