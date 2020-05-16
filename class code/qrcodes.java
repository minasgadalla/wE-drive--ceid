class qrcode extends car{
	private int qrcode;
	
	public boolean check_qr(int scanned_qr){
		if (this.qrcode == scanned_qr){
			return true;
		else{
			return false;
			}
		}
	}
	
	public void load_QR_screen(){
        	System.out.println("Displaying QR screen");
        	System.out.println("Please scan the QR-code");
        	this.check_QR();
    }
	
}
