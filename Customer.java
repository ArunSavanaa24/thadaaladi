
public class Customer {
	private String name;
	private int age;
	private int amountAva;
	private long aadharNum;
	private boolean isMale;
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setAmountAva(int amountAva) {
		this.amountAva=amountAva;
	}
	public int getAmountAva() {
		return amountAva;
	}
	public void setAadharNum(long aadharNum) {
		this.aadharNum=aadharNum;
	}
	public long getAadharNum() {
		return aadharNum;
	}
	public void setIsMale(boolean isMale) {
		this.isMale=isMale;
	}
	public boolean getIsMale() {
		return isMale;
	}
	
	public Customer(String name,int age,int amountAva,long aadharNum,boolean isMale) {
		this.name=name;
		this.age=age;
		this.amountAva=amountAva;
		this.aadharNum=aadharNum;
		this.isMale=isMale;
	}
	public String toString() {
		return name+" "+age+" "+amountAva+" "+aadharNum+" "+isMale;
	}	
}


