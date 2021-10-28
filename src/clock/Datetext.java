package clock;
import java.util.*;
import java.text.*;

public class Datetext {   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss ");
		
		
		System.out.println("当前时间："+ft.format(now));
		System.out.printf("全部日期和时间信息：%tc%n",now);          
	    //f的使用  
	    System.out.printf("年-月-日格式：%tF%n",now);  
	    //d的使用  
	    System.out.printf("月/日/年格式：%tD%n",now);  
	    //r的使用  
	    System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",now);  
	    //t的使用  
	    System.out.printf("HH:MM:SS格式（24时制）：%tT%n",now);  
	    //R的使用  
	    System.out.printf("HH:MM格式（24时制）：%tR",now);
	}

}
