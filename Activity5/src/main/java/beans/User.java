package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean(name="User")
@ViewScoped

public class User 
{
	@NotNull()
	@Size(min = 5, max = 15)
	String firstName; 
	
	@NotNull()
	@Size(min = 5, max = 15)
	String lastName;
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}