package chapter4.labs;

public class Laptop {

	private double price;
	private String ram;
	private String disk;
	private char wireless;
	private boolean hdmi;

	public static void main(String[] args) {
		Laptop laptop = new Laptop(100.00, "8GB", "512GB", 'B', true);
		System.out.println(laptop);
	}
	public Laptop(double price, String ram, String disk, char wireless, boolean hdmi) {
		this.price = price;
		this.ram = ram;
		this.disk = disk;
		this.wireless = wireless;
		this.hdmi = hdmi;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getDisk() {
		return disk;
	}

	public void setDisk(String disk) {
		this.disk = disk;
	}

	public char getWireless() {
		return wireless;
	}

	public void setWireless(char wireless) {
		this.wireless = wireless;
	}

	public boolean isHdmi() {
		return hdmi;
	}

	public void setHdmi(boolean hdmi) {
		this.hdmi = hdmi;
	}

	@Override
	public String toString() {
		return "Laptop{" +
			"price=" + price +
			", ram='" + ram + '\'' +
			", disk='" + disk + '\'' +
			", wireless=" + wireless +
			", hdmi=" + hdmi +
			'}';
	}
}
