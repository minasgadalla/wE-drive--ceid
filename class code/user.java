public class User{
	private int pass;
	private int p_num;
	private string email;
	private string fname;
	private string drive_id;
	
	public User(){
		System.out.println("Please fill all the required fields");
	}
	
	public boolean set_email(string i_email){
		if (email is coreect){
			this.email = i_email;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean set_pass(int i_pass){
		if (email is coreect){
			this.pass = i_pass;
			return true;
		}else{
			this.recomplete_form();
			return false;
		}
	}
	
	public boolean set_name(int name){
		string emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
		if (pat.matcher(email).matches()){
			this.fname = name;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean set_id_drive(string id){
		if (driver licence is coreect){
			this.drive_id = id;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean set_phone(int ph){
		if (ph is coreect){
			this.p_num = ph;
			return true;
		}else{
			return false;
		}
	}
}