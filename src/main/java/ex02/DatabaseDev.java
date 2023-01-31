package ex02;

public class DatabaseDev {

	private String url;
	private String uid;
	private String upw;
	
	// 생성자는 건들지 않고, set, get 메서드 만듦
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	
}
