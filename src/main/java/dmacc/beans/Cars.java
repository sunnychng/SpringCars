package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Cars {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String model;
	private String make;
	private String type;
	private String year;
	@Autowired
	private Owner carowner;
	
	public Cars() {
		super();
		// TODO Auto-generated constructor stub
		
		this.year = "2011";
	}

	public Cars(String make) {
		super();
		this.make = make;
	}
	
	public Cars(String model, String make) {
		super();
		this.model = model;
		this.make = make;
	}

	public Cars(String model, String make, String type, String year) {
		super();
		this.model = model;
		this.make = make;
		this.type = type;
		this.year = year;
	}
	
	public Cars(String model, String make, String type, String year, Owner carowner) {
		super();
		this.model = model;
		this.make = make;
		this.type = type;
		this.year = year;
		this.carowner = carowner;
	}

	public Cars(int id, String model, String make, String type, String year) {
		super();
		this.id = id;
		this.model = model;
		this.make = make;
		this.type = type;
		this.year = year;
	}
	
	public Cars(int id, String model, String make, String type, String year, Owner carowner) {
		super();
		this.id = id;
		this.model = model;
		this.make = make;
		this.type = type;
		this.year = year;
		this.carowner = carowner;
	}

	public int getId() {
		return id;
	}

	public String getModel() {
		return model;
	}

	public String getMake() {
		return make;
	}

	public String getType() {
		return type;
	}

	public String getYear() {
		return year;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	public Owner getCarowner() {
		return carowner;
	}

	public void setCarowner(Owner carowner) {
		this.carowner = carowner;
	}

	@Override
	public String toString() {
		return "Cars [id=" + id + ", model=" + model + ", make=" + make + ", type=" + type + ", year=" + year + "]";
	}
	
}
