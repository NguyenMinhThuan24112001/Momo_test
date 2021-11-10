import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class QLMay {
	private List<String> list1;
    private Scanner in=new Scanner(System.in);
    public QLMay() {
    	list1=new ArrayList<String>();
	}
    
    public void nhap() {
    	double soTien;
    	String sp;
		while(true){
			System.out.println("Nhap so tien dua vao: ");
			soTien=Integer.parseInt(in.nextLine());
			if(soTien==10000||soTien==20000||soTien==50000||soTien==100000||soTien==200000||soTien==500000)
				break;
			System.err.println("hay nhap lai so tien");
		}
		while(true) {
			System.out.println("Chon san pham muon mua");
			System.out.println("0. Huy khong mua san pham");
			System.out.println("1. Pepsi");
	        System.out.println("2. Coke");
	        System.out.println("3. Soda");
			int chon;
			Scanner in=new Scanner(System.in);
            chon = Integer.parseInt(in.nextLine());
            switch(chon){
            case 0: System.out.println("BYE!!! Tien Thua cua ban la"+ " "+soTien);
                    //System.exit(0);//safe exit
            case 1:
            	double tienThua=soTien-10000;;
            	sp="pepsi";
            	list1.add(sp);
            	System.out.println("san pham ban vua mua la: "+sp+" + "+"Tien thua cua ban la: "+tienThua);
                break;
            case 2:
            	double tienThua1=soTien-10000;;
            	sp="coke";
            	list1.add(sp);
            	System.out.println("san pham ban vua mua la: "+sp+" + "+"Tien thua cua ban la: "+tienThua1);
                break;
            case 3:
            	if(soTien<=10000) {
            		System.out.println("ban khong du tien mua san pham nay");
            		break;
            	}else {
            		double tienThua2=soTien-10000;;
                	sp="soda";
                	list1.add(sp);
                	System.out.println("san pham ban vua mua la: "+sp+" + "+"Tien thua cua ban la: "+tienThua2);
            	}
            default:System.out.println("chi chon 0->4");
            break; 
		 }
            System.out.println("Cam on ban da su dung dich vu");
//            System.out.println("Cac loai da mua");
 	      
            break;
   	   }
	}


	public void vietDS() {
		// TODO Auto-generated method stub
//		System.out.println("Cac loai da mua");
//		  for (SanPham i:list)
//	           if(i instanceof SanPham)
//	              System.out.println(i);
//	        //   if(i instanceof SanPham)
	             
	}
	
	
	public boolean Ktra(List<String> list1) {
		 for (int i=0;i<list1.size();i++) {
	    	   if(list1.get(i).equalsIgnoreCase(list1.get(i+1))&&list1.get(i+1).equalsIgnoreCase(list1.get(i+2))) {
	    		   return true;
	    	   }
	       }
		 return false;
	}
	
	
	public int xetNgay() {
		Calendar c=Calendar.getInstance();//nam hien thoi
		int day=c.get(Calendar.DAY_OF_MONTH);
		return day;
	}
	
	
	public void chuongTrinhKhuyenMai() {

		String[] a1= {"pepsi","coke","soda"};
		int rnd = new Random().nextInt(a1.length);
		 Calendar c=Calendar.getInstance();//nam hien thoi
		 int day=c.get(Calendar.DAY_OF_MONTH);
		 double quy=50000;
	     if(Ktra(list1)&&xetNgay()==day) {
	    	 int a=((int)(10 * Math.random()) + 8) / 9;
	    	 if(a==0&&a1[rnd].equalsIgnoreCase("coke")) {
	    		 System.out.println("ban da trung thuong 1 coke");
	    		 quy-=10000;
	    	 }
	    	 if(a==0&&a1[rnd].equalsIgnoreCase("pepsi")) {
	    		 System.out.println("ban da trung thuong 1 pepsi");
	    		 quy-=10000;
	    	 }
	    	 else if(a==0&&a1[rnd].equalsIgnoreCase("soda")) {
	    		 
	    		 System.out.println("ban da trung thuong 1 soda");
	    		 quy-=20000;
	    	 }
	    	 else if(a==1||quy<=0) {
	    		 System.out.println("Chuc ban may man lan sau");
	    		 quy=50000;
	    		 return;
	    	 }
	     }else if(quy<=50000&&xetNgay()==day) {
	    	 day+=1;
	    	 int b=((int)(10 * Math.random()) + 8) / 13;
	    	 if(b==0&&a1[rnd].equalsIgnoreCase("coke")) {
	    		 System.out.println("ban da trung thuong 1 coke");
	    		 quy-=10000;
	    	 }
	    	 if(b==0&&a1[rnd].equalsIgnoreCase("pepsi")) {
	    		 System.out.println("ban da trung thuong 1 pepsi");
	    		 quy-=10000;
	    	 }
	    	 else if(b==0&&a1[rnd].equalsIgnoreCase("soda")) {
	    		 
	    		 System.out.println("ban da trung thuong 1 soda");
	    		 quy-=20000;
	    	 }
	    	 else if(b==1||quy<=0) {
	    		 System.out.println("Chuc ban may man lan sau");
	    		 quy=50000;
	    		 return;
	    	 }
	     }
	}
}
