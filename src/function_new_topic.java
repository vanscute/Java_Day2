
public class function_new_topic {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
login();
login("mayur@gmail.com","password2");
login("bharat@gmail.com","password");
getScreenshots("c:\\screenshots\\fb.png");
String firstname=VerifyText();
System.out.println(firstname);
	}
	
	//user define
public static void login()//default method
{
	System.out.println("Open browser");
	System.out.println("Enter email-id-->vandana@gmail.com");
	System.out.println("Enter password-->testing");
	System.out.println("Click on sign in button");
	System.out.println("Verify text welcome Vandana");
	System.out.println("close the browser");
}

//Method Overloading:Same function name but different work
//input parameters
public static void login(String username,String password)//default method
{
	System.out.println("Open browser");
	System.out.println("Enter email-id-->"+username);
	System.out.println("Enter password-->"+password);
	System.out.println("Click on sign in button");
	System.out.println("Verify text welcome Vandana");
	System.out.println("close the browser");
}

public static void getScreenshots(String path)
{
	System.out.println("path is-->"+path);
}

public static String VerifyText()
{
	String text="vivek";
	return text;
}
}
