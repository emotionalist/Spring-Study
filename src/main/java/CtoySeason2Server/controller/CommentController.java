package CtoySeason2Server.controller;

import CtoySeason2Server.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CommentController {

    private  final CommentService commentService;

    @Autowired //생성자 호출할때 코멘트서비스를 스프링 컨테이너랑 연결시켜줌

    // 스프링빈을 등록하는 방법 : 컴포넌트 스캔과 자동의존관계 설정 @에노테이션으로 , 자바 코드로 직접 스프링 빈 등록하기.

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }








}
