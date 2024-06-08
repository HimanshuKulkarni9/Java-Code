package day2_HomeWork;

public class Chair {
	
	private int legs;
	String company;
	int qty;
	
	public void setLegs(int l) {
		legs = l;
	}
	public int getLegs() {
		return legs;
	}
	public void setCompany(String s) {
		company = s;
	}
	public String getCompany() {
		return company;
	}
	public void setQty(int q) {
		qty = q;
	}
	public int getQty() {
		return qty;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chair c = new Chair();
		c.setCompany("Nilkamal");
		System.out.println("Company Name :" + c.getCompany());
		c.setLegs(4);
		System.out.println("Chair legs: " + c.getLegs());
		c.setQty(40);
		System.out.println("chair quntity :" + c.getQty());

		
		Chair c2 = new Chair();
		c2.setCompany("Nilkamal");
		System.out.println("Company Name :" + c2.getCompany());
		c2.setLegs(4);
		System.out.println("Chair legs: " + c2.getLegs());
		c2.setQty(40);
		System.out.println("chair quntity :" + c2.getQty());
	}

}
