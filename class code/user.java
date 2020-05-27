import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class User {
 private String pass;
 private String p_num;
 private String email;
 private String fname;
 private String drive_id;

 User() {
  System.out.println("Lets start creating your account!");
 }


 public boolean set_email(String i_email) {
  String regex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
   "[a-zA-Z0-9_+&*-]+)*@" +
   "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
   "A-Z]{2,7}$";

  Pattern pat = Pattern.compile(regex);
  if (pat.matcher(i_email).matches()) {
   this.email = i_email;
   return true;
  } else {
   return false;
  }
 }

 public boolean set_pass(String i_pass, String conf_pass) {

  if (new String(i_pass).equals(conf_pass)) {
   this.pass = i_pass;
   return true;
  } else {
   return false;
  }
 }

 public boolean set_name(String name) {
    if (!name.isEmpty()){
    this.fname = name;
    return true;
}
    else{
    return false;
    }
 }

 public boolean set_id_drive(String id) {
  if (!id.isEmpty()) {
   this.drive_id = id;
   return true;
  } else {
   return false;
  }
 }

 public boolean set_phone(String ph) {
  int length = String.valueOf(ph).length();
  if (length == 10) {
   this.p_num = ph;
   return true;
  } else {
   return false;
  }
 }
 
 
}
