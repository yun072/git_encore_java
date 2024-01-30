package com.encore.post.view; //무한 루프 방지

import java.util.Scanner;

import com.encore.post.domain.PostRequestDTO;
import com.encore.post.service.PostService;

public class PostView {
	//참조 타입의 멤버변수
	private PostService  service ;
	private PostRequestDTO  params ;
	
	//생성자 오버로딩
	public  PostView (){
	}
    public  PostView (PostService service, PostRequestDTO params) {
    	this.service = service ;
    	this.params = params ;
	}       //(멤버변수에 어싸인)
	
	public void menu() { //보여지는 역할만 함
		Scanner scan = new Scanner (System.in) ;
		while(true) {
			System.out.println(">>>>Hanwha software camp beyond 5th");
			System.out.println("1. login");
			System.out.println("2. join");
			System.out.println("3. post write");
			System.out.println("4. post delete");
			System.out.println("99. exit");
			System.out.print("input number : "); //print는 개행이 안되는 메서드
			int number = scan.nextInt();
			
			if (number ==99) {
				System.exit(0) ;
			}
			if (number == 3) {
				requestSave() ;
			}
			if (number == 4) {
				requestDelete() ; //같은 틀래스에서 또다르 메서드 호출 할 수 있다는 의미
			}
			
		}
		
	}
	
	public void requestSave() {
		System.out.println("debug>>>>client post view") ;
		Scanner scan = new Scanner(System.in) ;
		System.out.print("아이디 : ") ;
		String id = scan.nextLine() ;
		System.out.print("제목 : ") ;
		String title = scan.nextLine() ;
		System.out.print("내용 : ") ;
		String content = scan.nextLine() ;
		System.out.print("조회수  : ") ;
		int cnt = scan.nextInt() ;
		System.out.print("공개여부  : ") ;
		boolean isFlag = scan.nextBoolean() ;
		//
		//PostService service = new PostService() ;
		//PostRequestDTO request = new PostRequestDTO (id, title, content, cnt, isFlag) ;
		params.setId(id); params.setTitle(title); params.setContent(content);params.setCnt(cnt); params.setFlag(isFlag);
		String msg = service .savePost(params) ;
		System.out.print("Resualt >>>>" +msg) ;
		
		
		
	}
	
	//request delete
	//terminal로부터 사용자의 아이디만 입력 받아서 
	//해당 id를 dto에 담고
	//PostService에 정의된 postDelete(PostRequestDTO params)
	//메서드를 호출하여 '작성하신 글이 삭제되었습니다.' 메세지를 반환받아서 출력
	// 개인 풀이
	//public void requestDelete () {
		//Scanner scan = new Scanner(System.in) ;
		//System.out.print("아이디 : ") ;
		//String id = scan.nextLine() ;
		//PostRequestDTO requestDelete = new PostRequestDTO (id, null, null, null, false) ;
		//PostService service = new PostService() ;
	//강사님 풀이
	public void requestDelete () {
		System.out.println("debug>>>>client post delete view") ;
		System.out.println();
		
		Scanner scan = new Scanner(System.in) ;
		System.out.print("아이디 : ") ;
		String id = scan.nextLine() ;
		//PostRequestDTO request = new PostRequestDTO(id) ;
		//PostService service = new PostService() ;
		
		params.setId(id);
		String msg = service.postDelete(params) ;
		System.out.print("Resualt >>>>" +msg) ;
		
		
		
		
	}
	
		
		
	}
	
	
	





