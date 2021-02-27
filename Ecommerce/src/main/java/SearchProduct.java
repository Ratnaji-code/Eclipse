

public class SearchProduct extends SearhFunctions {

	
	
	public static void main(String[] args) {
		
		SearhFunctions sf=new SearhFunctions();
		sf.launch();
		try {
			sf.search();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		sf.selectProduct();
//		sf.add2Cart();
		
	}
	

}
