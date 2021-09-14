package com.lt.business;

import java.util.*;

import com.lt.bean.User;

public class UserImplService implements UserInterface{

	@Override
	public String login() {

		StudentInterface student = new StudentImplService();

		System.out.println("Enter Username");
		Scanner in = new Scanner(System.in);
		String username = in.nextLine();

		System.out.println("Enter password");
		Scanner inn = new Scanner(System.in);
		String password = inn.nextLine();

		System.out.println("Welcome to Homepage");

		System.out.println("1. Student"+"\n"+"2. Professor"+"\n"+"3. Admin"+"\n"+"4. Exit");
		Scanner sc = new Scanner(System.in);
		int selection = sc.nextInt();  

		switch(selection)
		{
		case 1: System.out.println("Student:-");
		student.studentMenu();
		break;

		/*case 2: System.out.println("Professor:-");
                user.signup();
                break;

        case 3: System.out.println("Admin:-");
                user.updatePassword();
                break;
		 */ 
		case 4: System.out.println("Exit");
		break;

		}
		StudentInterface studentInterface = new StudentImplService();
		studentInterface.courseRegistration();

		return "";
	}

	/*@Override
	public String viewRole() {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public String signup() {
		User user1 = new User();

		System.out.println("Enter Username");
		Scanner in = new Scanner(System.in);
		String username = in.nextLine();
		user1.setUsername(username);

		System.out.println("Enter password");
		Scanner in2 = new Scanner(System.in);
		String password = in2.nextLine();
		user1.setPassword(password);

		/*System.out.println("Enter email");
        Scanner in3 = new Scanner(System.in);
        String email = in3.nextLine();
        user1.setEmail(email);

        System.out.println("Enter contact");
        Scanner in4 = new Scanner(System.in);
        String contact = in4.nextLine();
        user1.setcontact(contact);
		 */

		return "Signup Succesfully";
	}

	@Override
	public boolean updatePassword() {
		System.out.println("Enter new password");
		Scanner in2 = new Scanner(System.in);
		String password = in2.nextLine();

		System.out.println("Confirm password");
		Scanner in3 = new Scanner(System.in);
		String confirmPassword = in3.nextLine();

		if(password.equals(confirmPassword))
		{
			return true;
		}
		else
			return false;

	}

}
