package room;
public class Room {
	
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getCot() {
		return cot;
	}
	public void setCot(String cot) {
		this.cot = cot;
	}
	public String getCable() {
		return cable;
	}
	public void setCable(String cable) {
		this.cable = cable;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getLaundry() {
		return laundry;
	}
	public void setLaundry(String laundry) {
		this.laundry = laundry;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	private String ac;
	private String cot;
	private String cable;
	private String wifi;
	private String laundry;
	private int date;
	private int roomNum;
	////////////////////Customer Details
	private int custId;
	private String firstName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public int getAcFee() {
		return acFee;
	}
	public void setAcFee(int acFee) {
		this.acFee = acFee;
	}
	public int getCotFee() {
		return cotFee;
	}
	public void setCotFee(int cotFee) {
		this.cotFee = cotFee;
	}
	public int getCableFee() {
		return cableFee;
	}
	public void setCableFee(int cableFee) {
		this.cableFee = cableFee;
	}
	public int getWifiFee() {
		return wifiFee;
	}
	public void setWifiFee(int wifiFee) {
		this.wifiFee = wifiFee;
	}
	public int getLaundryFee() {
		return laundryFee;
	}
	public void setLaundryFee(int laundryFee) {
		this.laundryFee = laundryFee;
	}
	public int getTotalCharge() {
		return totalCharge;
	}
	public void setTotalCharge(int totalCharge) {
		this.totalCharge = totalCharge;
	}
	private int acFee;
	private int cotFee;
	private int cableFee;
	private int wifiFee;
	private int laundryFee;
	private int totalCharge;
	
}
