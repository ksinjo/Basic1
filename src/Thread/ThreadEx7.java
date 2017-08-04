package Thread;
import javax.swing.JOptionPane;

public class ThreadEx7 {

	public static void main(String[] args) throws Exception {
		ThreadEx7_1 th1 = new ThreadEx7_1();
		th1.start();

		String output = JOptionPane.showInputDialog("���� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ��" + output + "�Դϴ�");

	}

}

class ThreadEx7_1 extends Thread {
	public void run() {

		
		for (int i = 10; i > 0 ; i--) {
			System.out.print(i);
			try {
				
			   sleep(1000);
			} catch (Exception e) {}
		}

	}

}