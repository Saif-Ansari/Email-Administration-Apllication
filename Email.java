import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastname;
	private String department;
	private String password;
	private String email;
	private int mailBoxCapacity = 500;
	private String alterMail;
	private String company = "company.com";
	private int defaultPasswordLength = 10;

	// constructing the constructor for first and last name
	public Email(String firstName, String lastname) {
		this.firstName = firstName;
		this.lastname = lastname;
		System.out.println("email created  Name: " + firstName + " " + lastname);
		;
		// calling method setDepartment which returns the type of department
		this.department = setDepartmenr();
		System.out.println("department selected :" + department);

		// calling a method that returns random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);

		// combine elements to generate email
		email = firstName.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + company;
		System.out.println("Your company email: " + email);
	}

	// setting department method
	private String setDepartmenr() {
		System.out.println("Enter department\n1 for sales\n2 for development\n3 for accounting \n0 for none ");
		Scanner s = new Scanner(System.in);
		int depChoice = s.nextInt();
		if (depChoice == 1) {
			return "sales";
		} else if (depChoice == 2) {
			return "developement";
		} else if (depChoice == 3) {
			return "accounting";
		} else {
			return " ";
		}
	}

	// generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789$%@&^";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int randValue = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(randValue);

		}
		return new String(password);
	}

	// set mail box capacity
	public void setMailBoxCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
	}

	// set the alternate mail
	public void setAlterMail(String alterMail) {
		this.alterMail = alterMail;
	}

	// change the password
	public void changePasswor(String password) {
		this.password = password;
	}

	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public String getAlterMail() {
		return alterMail;
	}

	public String getpassword() {
		return password;
	}

	// Show info method
	public String showInfo() {
		return "Display Name: " + firstName + " " + lastname + "\nEmail: " + email + "\nmailBox Capacity: "
				+ mailBoxCapacity + " mb";
	}

}
