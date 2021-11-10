import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		  QLMay q = new QLMay();

	        while(true){
	        	  System.out.println("------MENU-------");
	              System.out.println("1. Nhap vao so tien va chon san pham");
	              System.out.println("2. In ra danh sach nhung do da mua");
	              System.out.println("3. xem co khuyen mai hay khong");
	            System.out.print("Ban chon (0->3):");
	            
	            int chon;
	            Scanner in=new Scanner(System.in);
	            chon = Integer.parseInt(in.nextLine());
	            switch(chon){
	                case 0: System.out.println("BYE!!!");
	                        System.exit(0);//safe exit
	                case 1: q.nhap();
	                       break;
	                case 2: q.vietDS();
	                       break;
	                case 3: q.chuongTrinhKhuyenMai();;
                   break;
	                default:System.out.println("chi chon 0->3");
	                      break; 
	            }
	        }

	    }
}
