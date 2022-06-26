import java.util.HashMap;

public class IDandPasswords {
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	IDandPasswords(){
	
		logininfo.put("Cristi", "1234");
		logininfo.put("Cristian", "PASSWORD");
		logininfo.put("Cri", "abc123");
	}
	protected HashMap getLoginInfo() {
		return logininfo;
	
	}
}
