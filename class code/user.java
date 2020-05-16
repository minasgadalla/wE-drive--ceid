public class User{
	
	private int pass;
	private int p_num;
	private string email;
	private string fname;
	private string drive_id;
		
	User(){
		System.out.println("Please fill all the required fields");
	}
	
	public boolean set_email(string i_email){7
		string regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(regex); 
		if (pat.matcher(email).matches()){
			this.email = i_email;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean set_pass(int i_pass){

		if (password is correct){
			this.pass = i_pass;
			return true;
		}else{
			this.recomplete_form();
			return false;
		}
	}
	
	public boolean set_name(int name){

		if (name is correct){
			this.fname = name;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean set_id_drive(string id){
		if (id == ){
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