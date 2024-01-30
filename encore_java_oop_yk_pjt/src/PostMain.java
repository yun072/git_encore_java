import com.encore.post.domain.PostRequestDTO;
import com.encore.post.service.PostService ;
import com.encore.post.view.PostView;

public class PostMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PostService service = new PostService () ;
		//System.out.println("debug >>>main caller -> service savePost working method");
		
		
		//case01.
		//String msg = service.savePost("jslim", "공지사항", "내일은 휴강입니다", 0, true) ; //사용자가 압력한 값이 되어야 함//변수선언
		//System.out.println("Result >>>>" +msg) ;
		
		// case02-1
		//PostRequestDTO request = new PostRequestDTO () ;
		//request .setId(null);
		//request .settitle(null);
		//request .setcontent(null);
		//request .setcnt(null);
		//request .setisFlag(null);
		
		//String msg = service.savePost(request) ;
		//System.out.println("Request >>>>" +msg) ;
		
		
		
		
		//case02-2
		//PostRequestDTO request = new PostRequestDTO ("jslim", "공지사항", "내일은 휴강입니다.", 0, true) ;
		//String msg = service.savePost(request) ;
		//System.out.println("Request >>>>" +msg) ;
		
		//case03.
		//view를 이용한 사용자 입력과 연결 .....
		//PostView view = new PostView() ;
		//view.menu() ;
		
		//case04.
		//불필요하게 발생되는 객체 생성을 효율적으로 관리하기 위해서 얕은 복사 개념을 사용 할 수 있다. 
		//주소만 넘겨줄 것-필요로 되는 영역: postservice
		
		PostService service   = new PostService() ;
		PostRequestDTO params = new PostRequestDTO() ;
		
		PostView view = new PostView(service, params) ; //변수 두개 받는 인자가 postview에 없어서 에러	
		view.menu();
		

	}

}
