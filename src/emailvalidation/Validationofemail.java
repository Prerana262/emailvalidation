package emailvalidation;
import java. util.Scanner;
import java.util.regex.*;
import java.util.*;

public class Validationofemail {
	
		

		// add the email variable in array list of string 

		static ArrayList<String> email_id = new ArrayList<String>();


		private static void VerfiyID(String ID)
		{

			boolean accessFlag= false;
			for(String id : email_id)

			{

				if(ID.equalsIgnoreCase(id))

				{
					accessFlag=true;
					System.out.println("access grant to "+ ID );
					break;

				}   	 

			}

			if(accessFlag==false)

			{

				System.out.println("access deined to "+ ID );

			}

		}

		// verifying the id by verifyFormate

		private static boolean VerfiyFormate(String ID)
		{
			// Regular expression from wikipedia

			String regex = "[a-zA-Z0-9!#$&'*+-/=?^_`{|}~]*@[a-zA-Z0-9][a-zA-Z0-9-]*[a-zA-Z0-9][.][a-zA-Z]*";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(ID);

			if(!matcher.matches())

			{

				return true;

			} else 
			{

				return false;

			}

		}

		public static void main(String[] args) {

			// valid email id

			email_id.add("catie.harington@hgy.com");
			email_id.add("dustin.harington@kyc.com");
			email_id.add("billi.agh@bvz.com");
			email_id.add("aura.sharma@hxc.com");
			/// invalid email id
			email_id.add("@oviz#.com");
			email_id.add("buc#domain.com");

			System.out.println(" Hello, welcome to email_validation");

			
			Scanner sc = new Scanner(System.in);
			String userID;
			while (true){

				System.out.println(" Enter your User ID ");
				userID = sc.next();
				while(VerfiyFormate(userID))

				{

					System.out.println(" Hello,please Enter your User ID with valid format ");
					userID = sc.next();

				}

				VerfiyID(userID);

				System.out.println("");

			}

		}

	}
	


