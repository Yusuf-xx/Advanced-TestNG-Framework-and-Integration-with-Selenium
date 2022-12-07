package task8;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		
		data[0][0] = "mngr460844";
		data[0][1] = "asygezY";
		
		data[1][0] = "mngr460844";
		data[1][1] = "asygezY";
		
		data[2][0] = "mngr460844";
		data[2][1] = "asygezY";
		
		return data;
	}

}
