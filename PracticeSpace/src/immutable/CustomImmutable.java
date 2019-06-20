package immutable;

import java.util.Date;

/*
 * 1. Class should not be extended, so declare the class as final
 * 2. Make all fields private so that direct access is not allowed
 * 3. Don't provide setter methods for variables
 * 4. Make all mutable fields final so that it's value can be assigned only once
 * 5. Initialize all the fields via a constructor performing deep copy
 * 6. Perfom cloning of objects in the getter methods to return the copy rather than returning the actual object reference
 */
public final class CustomImmutable {
	
	private final String name;
	private final Integer id;
	private final Date dob;
	
	public CustomImmutable(String name, Integer id, Date dob) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
	}
	
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
	public Date getDob() {
		return dob;
	}
	
	@Override
	public String toString() {
		return "CustomImmutable [name=" + name + ", id=" + id + ", dob=" + dob + "]";
	}
	
}
