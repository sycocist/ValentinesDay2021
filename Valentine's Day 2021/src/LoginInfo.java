import java.util.HashMap;

public class LoginInfo {

	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	LoginInfo(){
		
		logininfo.put("Dorah", "583194");
		logininfo.put("Odessa", "583194");
		logininfo.put("Joyce", "583194");
		logininfo.put("Cassie", "583194");
		logininfo.put("Breanna", "583194");
		logininfo.put("Jo-Lynn", "583194");
		logininfo.put("Ben", "583194");
		logininfo.put("Max", "583194");
		logininfo.put("Cameron", "583194");
		logininfo.put("Philip", "583194");
		logininfo.put("Ayden", "583194");
		logininfo.put("Avi", "583194");
		logininfo.put("Emily", "583194");
		logininfo.put("Dylan", "583194");
		logininfo.put("Ellie", "583194");
		logininfo.put("guest", "583194");
		logininfo.put("      ", "583194");
	}
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}
	
}
