package in.co.rays.inheritance;

public class Shape { 
	
	private String color;
	private String home; 
	private String car;
	private String vehiclenum; 
	
	
	public void setColor(String color) {
		this.color=color;
	} 
	public String getColor() {
		return color;
	} 
	
	public void setHome(String home) {
		this.home=home;	
	}
	public String getHome() {
		return home;
    }
	
	public void setCar(String car) {
		this.car=car;	
	} 
	public String getCar() {
		return car;	
	} 
	public void setVehicleNum(String vehiclenum) {
		this.vehiclenum=vehiclenum;
	} 
	public String getVehicleNum() {
		return vehiclenum;
	} 
	
	public void detail() {
		
		System.out.println("COLOR NAME = "+getColor()+"\nCAR NAME = "+getCar()+"\nVEHICLE NUMBER = "+getVehicleNum()+"\nINSIDE THE HOME = "+getHome());
		
	}
	
	
}
