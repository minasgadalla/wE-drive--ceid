class qrcode extends car{
	private int qrcode
	
	public boolean check_qr(int scanned_qr){
		if (this.qrcode == scanned_qr){
			return false;
		else{
			return true;
			}
		}
	}
}