package customannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TestInfo {
	
	public String createdBy() default "";
	public String createdDate() default "10/08/2018";

	public enum Priority 
	{
		LOW, MEDIUM, HIGH
	};
	
	public Priority priority() default Priority.MEDIUM;

}
