import java.util.*;
public class JDBC extends jdbcdatabase{

	void execute() throws Exception{

		System.out.println("EMPLOYEE DATABASE:");
		while(true) {
			char ch;			
			System.out.println("Enter the Choice:");
			System.out.println("1.Insert\n2.Update\n3.Delete\n4.Select\n5.Exit");
			Scanner scan = new Scanner(System.in);
			ch = scan.next().charAt(0);
			switch(ch) {

			case '1':
				disp(1);
				break;
			case '2':
				disp(2);
				System.out.println("update:");
				break;
			case '3':
				disp(3);
				System.out.println("delete:");
				break;
			case '4':
				disp(4);
				System.out.println("select:");
				break;      
			}
			if(ch == '5')
				break;

		}
	}
	public static class databaseassignment {

	public static void main(String[] args) throws Exception {
		new JDBC().execute();
		
	}
}
}



