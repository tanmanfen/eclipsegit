package WEIGUI;

public class weizhangxinxi {
	private int id;
	private String Chepai;
	private String pcode;
	private String shijian;
	private String didian;
	
	public weizhangxinxi() {
	}

	public weizhangxinxi(int id, String chepai, String pcode, String shijian,String didian) {
		this.id = id;
		this.Chepai = chepai;
		this.pcode = pcode;
		this.shijian = shijian;
		this.didian =didian;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChepai() {
		return Chepai;
	}

	public void setChepai(String chepai) {
		this.Chepai = chepai;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getShijian() {
		return shijian;
	}

	public void setShijian(String shijian) {
		this.shijian = shijian;
	}

	public String getDidian() {
		return didian;
	}

	public void setDidian(String didian) {
		this.didian = didian;
	}
	
	

}


