photoCheck extends car
{
    // instance variables - replace the example below with your own

    public void photoCheck()
    {

    }

    public void connection()
    {
          System.out.println("Please wait...");

    }
    
    public boolean upload_photos(String photo_upload){
        
        if (photo_upload != null && !photo_upload.isEmpty()) {
            evaluation(photo_upload);
            return true;
            
        }else{
            this.invalid_upload();
            return false;
        }
    }
    
    public void invalid_upload(){
        System.out.println("Invalid photo. PLease try again");
    }
    
    public boolean evaluation(String photo){
        if(true){
            // check photo condition
            return true;
        }else{
            return false;
        }
        
    }
    
}
