package clock;
import java.util.*;
import java.text.*;

public class Datetext {   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss ");
		
		
		System.out.println("��ǰʱ�䣺"+ft.format(now));
		System.out.printf("ȫ�����ں�ʱ����Ϣ��%tc%n",now);          
	    //f��ʹ��  
	    System.out.printf("��-��-�ո�ʽ��%tF%n",now);  
	    //d��ʹ��  
	    System.out.printf("��/��/���ʽ��%tD%n",now);  
	    //r��ʹ��  
	    System.out.printf("HH:MM:SS PM��ʽ��12ʱ�ƣ���%tr%n",now);  
	    //t��ʹ��  
	    System.out.printf("HH:MM:SS��ʽ��24ʱ�ƣ���%tT%n",now);  
	    //R��ʹ��  
	    System.out.printf("HH:MM��ʽ��24ʱ�ƣ���%tR",now);
	}

}
