package customannotations;

import customannotations.TestInfo.Priority;

@TestInfo (createdBy = "Sravan Kumar Pala", 
createdDate = "10/08/2018",
priority = Priority.HIGH)
public class CustomAnnotationClient {

	@Test
	public void executeTest() {
		System.out.println("Enabled Test");
	}
	
}
