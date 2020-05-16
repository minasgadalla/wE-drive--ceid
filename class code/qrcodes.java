class qrcode extends car{  //  qr code is a subclass of class car
	private int qrcode;
	
	public boolean check_qr(int scanned_qr){    //  check whether the qr code is the right one or not
		if (this.qrcode == scanned_qr){
			System.out.println("Successful scan");
			return true;
		else{
			load_QR_screen();
			}
		}
	}
	
	public void load_QR_screen(){      //  and calls the qr code check
        	System.out.println("Displaying QR screen");
        	System.out.println("Please scan the QR-code");
        	this.check_qr(int scanned_qr);
    }
	
}
