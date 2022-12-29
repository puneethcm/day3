public class Helloworld2 {
public static void main(String [] argv){
	while (true){
		System.out.println("Hello world");
		try{
			Thread.sleep(60000);
		}catch (Exception ex){}
	}
}
}
