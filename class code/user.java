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

 User(boolean create) {
  if (!create) {
   this.pass = "TestUser";
   this.p_num = "0";
   this.email = "test@weride.com";
   this.fname = "Test User";
   this.drive_id = "1234";
  }

 }

 public String getfname() {
  return this.fname;
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
  if (!name.isEmpty()) {
   this.fname = name;
   return true;
  } else {
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

public void empty_fields(String fname,String i_pass,String i_email )
 {
     if (fname.isEmpty() || i_pass.isEmpty() || i_email.isEmpty())
     {
         System.out.println("Empty spaces must be filled, please try again");
     }
     else
     {
         System.out.println("Please click continue");
     }
 }
}
