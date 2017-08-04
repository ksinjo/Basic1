package Thread;
import javax.swing.JOptionPane;

public class ThreadEx6 {

	public static void main(String[] args) throws Exception{

		String output = JOptionPane.showInputDialog("아무값이나 입력");
			System.out.print("입력하신  값" +output + "입니다.");
			
			for(int i = 0 ; i <10; i++){
				System.out.println(i);
				try{
					Thread.sleep(1000);
				}
				catch(Exception e) {}

			}

	}
}