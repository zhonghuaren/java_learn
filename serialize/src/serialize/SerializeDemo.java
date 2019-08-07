package serialize;
import java.io.*;

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.name = "Reyan Ali";
		e.address = "shanghai";
		e.SSN = 11223344;
		e.number = 133;
		try {
			FileOutputStream fileOut = new FileOutputStream("employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

}
