package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Owner {
	private String name;
	private String phone;
	
	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Owner(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", phone=" + phone + "]";
	}
	
}
