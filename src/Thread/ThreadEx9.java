package Thread;
/*
������/ �޼���	Des
ThreadGroup (String name)	������ �̸����� ������ �׷��� ����
ThreadGroup (ThreadGroup parent, String name)	������ ������ �׷쿡 ���ο� ������ �׷����
int activeCount()	������ �׷쿡 Ȱ��ȭ�� �������� �� 
int activeGroupCount()	������ �׷쿡�� Ȱ��ȭ�� ������ �׷�� ��ȯ
void checkAccess()	"������ ������ �Ǹ��� �ִ��� üũ. ���� �Ǹ��� ���ٸ�
���ܸ� ����"
void destory()	������ ���� �׷���� ����
"int enumerate (Thread list)
int enumerate (Thread list,boolean recurse)

int enumerate (ThreadGroup list)
int enumerate (ThreadGroup  list,boolean recurse)"	"������ �׷쿡 ���� ���� ������ �׷� ����� ������ �迭�� ��� ������ ��ȯ.
�Ű������� Recurse  true�� ������ �׷��� ���� �׷��� �迭�� �迭�� ��´�."
int getMaxpriority 	������ �׷��� �ִ� �켱������ ��ȯ 
String getName	������ �׷��� �̸���ȯ
ThreadGroup getPareent()	������ �׷��� ���� ������ �׷��� ��ȯ
void Interrupt	������ �׷쿡 ���� ��� �����带 ���ͷ�Ʈ
boolean isDeamon()	������ �׷��� ���� ������ �׷����� Ȯ��
boolean isDestroyed()	������ �׷��� �����Ǿ������� Ȯ��
void list()	������ �׷쿡 ���� ������� ���� �׷쿡 ���� ���� ���
boolean parenet	������ ������ �׷��� ���� ������ �׷������� Ȯ�� 
void setDeamon(boolean deamon)	������ �׷��� ���� ������ �׷����� ���� /���� 
void setMaxPriority(int pri)	������ �� ���� �ִ�켱������ ����



*
*/												 

public class ThreadEx9 {
 
	public static void main(String []args ) throws Exception {
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2= new ThreadGroup("Group2");
		
		ThreadGroup subGroup = new ThreadGroup(grp1,"SubGroup ");
		
		grp1.setMaxPriority(3); // 1�� �׷��� �ִ� �켱���� 3�� ������. 
		
		Runnable r = new Runnable(){
			public void run(){
				try{
				Thread.sleep(1000);	
				}
				catch(InterruptedException e) {	}
			}
		};

		
	 // Thread(Thread Group , Runnable r, String name) 
		new Thread(grp1, r, "th1").start();
		new Thread(subGroup, r, "th2").start();
		new Thread(grp2, r, "th3").start();
		
		System.out.println(">> List of ThreadGroup" + main.getName() + "Active Thread Group" +
		main.activeCount()+ "Active Thread"+ main.activeCount()); 
	
	main.list();
	}
}
