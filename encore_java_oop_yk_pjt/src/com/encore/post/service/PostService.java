
package com.encore.post.service;


import com.encore.post.domain.PostRequestDTO;
// xxxService, xxxxServiceImpl 비지니스 로직을 처리하는 역할을 담당
//사용자가 블로그에 글 작성(savePost), 수정, 삭제, 검색, 읽기 (시나리오)
//아이디, 제목, 내용, 등록일, 조회수, 공개/비공개
//업무로직 처리하는 메서드 생성
//글작성이 완료됐다는 메세지 반환하고 싶음
//기본생성자는 명시적으로 없어도 묵시적으로 들어있음

public class PostService { 

	public String savePost(String id, String title, String content, int cnt, boolean isFlag) {
		
		System.out.println("debug>>>>working method save completed...") ; //정상적으로 호출되는지 디버깅
		
		return "작성하신 글이 저장되었습니다." ; //이렇게 정의된 걸 누군가가 호출해야함 =view //반환타입인 string에 맞게 "작성하신 글이 저장되었습니다"반환
	}
	
	//메서드 오버로딩
    public String savePost(PostRequestDTO params) {
		
		System.out.println("debug>>>>working method save completed...") ; //정상적으로 호출되는지 디버깅
		
		return "작성하신 글이 저장되었습니다." ; //이렇게 정의된 걸 누군가가 호출해야함 =view //반환타입인 string에 맞게 "작성하신 글이 저장되었습니다"반환
	}
    
   public String postDelete(PostRequestDTO params) {
		
		System.out.println("debug>>>>working method save completed...") ; //정상적으로 호출되는지 디버깅
		
		return "작성하신 글이 삭제 되었습니다." ; //이렇게 정의된 걸 누군가가 호출해야함 =view //반환타입인 string에 맞게 "작성하신 글이 저장되었습니다"반환
	}
}

