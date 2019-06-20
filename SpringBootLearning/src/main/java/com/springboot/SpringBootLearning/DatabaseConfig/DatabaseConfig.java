package com.springboot.SpringBootLearning.DatabaseConfig;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

//@ConditionalOnBean(name = "dataSource")
//@ConfigurationProperties("com.springboot.configurations")
public class DatabaseConfig {

//	DataSourceAutoConfiguration dataSource = new DataSourceAutoConfiguration();
//	dataSource
	
	
	public static void printData() {
		System.out.println("static DynamicBindingChild printData");
	}
	
//	public static void main(String[] args) {
//		 Integer value = 1;
//		value = new Integer(3);
//		
//		System.out.println(value);
//		
//	}
	
	private Integer value = 1;
    
    public Integer getValue() {
        return value;
    }
    
    public void changeVal(Integer value) {
        value = new Integer(3);
    }

    public static void main(String args[]) {
        Integer a = new Integer(2);
        System.out.print(a);
        DatabaseConfig c = new DatabaseConfig();
        c.changeVal(a);
        System.out.print(a);
    };
}
