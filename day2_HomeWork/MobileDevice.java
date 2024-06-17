package day2_HomeWork;

public class MobileDevice {
	private
	int price;
	String mobileName;
	int qty;
	
	public void setPrice(int a) {
		
		price = a;
	}
	public int getPrice() {
		return price;
	}
    public void setMobileName(String m) {
		
		mobileName = m;
	}
	public String getMobileName() {
		return mobileName;
	}
public void setQty(int q) {
		
		qty = q;
	}
	public int getQty() {
		return qty;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileDevice d = new MobileDevice();
		d.setMobileName("Samsung");
		System.out.println("Mobile Name :"+d.getMobileName());
		d.setPrice(10000);
		System.out.println("Mobilee Price :"+d.getPrice());
		d.setQty(10);
		System.out.println("Mobile qty:"+ d.getQty());
	}

}
