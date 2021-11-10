
public class SanPham implements TinhTienThua {
	private double soTien;
	private String tenSanPham;
	private double soTienThua;
	public SanPham(){
		
	}
	public SanPham(double soTien, String tenSanPham) {
		this.soTien = soTien;
		this.tenSanPham = tenSanPham;
		this.getGia();
	}
	public double getSoTien() {
		return soTien;
	}
	public void setSoTien(double soTien) {
		this.soTien = soTien;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	
	public double getSoTienThua() {
		return soTienThua;
	}
	public void setSoTienThua(double soTienThua) {
		this.soTienThua = soTienThua;
	}
	@Override
	public String toString() {
		return "[So tien ban dua vao=" + getSoTien() + "Loai san pham da mua" + getTenSanPham() + ", So Tien Thua=" + getSoTienThua();
	}
	
	@Override
	public void getGia() {
		double tt=0;
		if(this.tenSanPham.equalsIgnoreCase("pepsi")||this.tenSanPham.equalsIgnoreCase("coke")) {
			tt=soTien-10000;
		}else if(this.tenSanPham.equalsIgnoreCase("soda")&&getSoTien()>=10000) {
			tt=soTien-20000;
		}
		this.setSoTienThua(tt);
	}
	
}
