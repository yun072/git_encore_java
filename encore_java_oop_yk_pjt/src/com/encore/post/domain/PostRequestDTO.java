package com.encore.post.domain;

public class PostRequestDTO {
	private String id ;
	private String title ;
	private String content ;
	private int    cnt ;
	private boolean isFlag ;
	
	//public PostRequestDTO () {
		
	//}
	//생성자 오버로딩 (매개변수의 개수와 타입을 재정의해서 여러개 가짐)
   // public PostRequestDTO (String id) {
    	//this.id = id ;
		
	//}
	
	public PostRequestDTO() {
	}
	public PostRequestDTO(String id) {
		this.id = id;
	}
	
	
	public PostRequestDTO(String id, String title, String content, int cnt, boolean isFlag) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.cnt = cnt;
		this.isFlag = isFlag;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) { //지역변수와 전역변수의 이름이 같을 떄 지역내에서는 지역변수가 우선권을 갖기떄문에 지역변수와 멤버변수 구별 필요 이떄 thㅑs는 인스턴스 소유로써 지칭함으로써 모호성 제거 
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public boolean isFlag() {
		return isFlag;
	}
	public void setFlag(boolean isFlag) {
		this.isFlag = isFlag;
	}
	//sorce- generate getter and setter -> 변수가 private 이기 때문에 외부에서 접근할 수 있도록 매핑 시켜주는 것 //이래야 main에서 메인 -dto -서비스의 구조에서 메인에서 dto관꼐 갖고 서비스에 dto 넘겨줄 것 
}
