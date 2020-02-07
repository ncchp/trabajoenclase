package pclase16;

public class TestHerencia3 {

	public static void main(String[] args) {
		
		ProductosFrescos pfrescos1 = new ProductosFrescos("29-10-2020",123,"China","01-01-2020");
		System.out.println(pfrescos1.toString());		
		
		ProductosFrescos pfrescos2 = new ProductosFrescos("29-10-2020",123,"China","01-01-2020");
		System.out.println(pfrescos2.toString());		
		
		ProductosRefrigerados prefrigerados1 = new ProductosRefrigerados("03-03-2020",456,"Mozambique","21-01-2015",45,32);
	    System.out.println(prefrigerados1.toString());
		
		ProductosRefrigerados prefrigerados2 = new ProductosRefrigerados("23-07-2070",456,"zambia","24",4,65);
			    System.out.println(prefrigerados2.toString());
		
		ProductosRefrigerados prefrigerados3 = new ProductosRefrigerados("25-07-2020",253,"Alemania","",3,25);
			    System.out.println(prefrigerados3.toString());
		
		ProductosCongelados pcongelado1 = new ProductosCongelados("24-05-2021",833,"francia","05-03-2018",13);
		 		System.out.println(pcongelado1.toString());


	}

}
