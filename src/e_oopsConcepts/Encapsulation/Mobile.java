package e_oopsConcepts.Encapsulation;

public class Mobile{
	private String name;
	private int ram;
	private int rom;
	private String color;
	private double price;
	public Mobile(String name, int ram, int rom, String color, double price) {
		this.name = name;
		this.ram = ram;
		this.rom = rom;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Mobile[Name: "+name+", RAM: "+ram+", ROM: "+rom+", Color: "+color+", Price: "+price+"]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
