package Model; 

import java.util.Scanner;
import static view.Validation.checkValidBirthDate;
import static view.Validation.checkValidEmail;;
import static view.Validation.checkValidPhoneNumber;;

public abstract class Candidate {
	private int id;
	private String fName, lName, gender, email, phone, address, type;//First name & Last name
	private int birthDate;
	
	public Candidate() {

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void input(Scanner s) {
		System.out.print("Enter id: ");
		id = s.nextInt();               
		s.nextLine();
		System.out.print("Enter first name: ");
		fName = s.nextLine();
		System.out.print("Enter last name: ");
		lName = s.nextLine();
		System.out.print("Enter birth date (xxxx): ");
		birthDate = s.nextInt();
		checkValidBirthDate(birthDate);
		s.nextLine();
		System.out.print("Enter address: ");
		address = s.nextLine();
		System.out.print("Enter phone: ");
		phone = s.nextLine();
		checkValidPhoneNumber(phone);
		System.out.print("Enter email: ");
		email = s.nextLine();
		checkValidEmail(email);
	}
	public void show() {
                System.out.print(id);
                System.out.print(" | ");
		System.out.print(lName);
		System.out.print(" ");
		System.out.print(fName);
		System.out.print(" | ");
		System.out.print(birthDate);
		System.out.print(" | ");
		System.out.print(address);
		System.out.print(" | ");
		System.out.print(phone);
		System.out.print(" | ");
		System.out.print(email);
		System.out.print(" | ");
		System.out.print(type);
		System.out.println();
	}
	
	public String getFullName() {
		return lName +" " + fName;
	}
	
	
}
