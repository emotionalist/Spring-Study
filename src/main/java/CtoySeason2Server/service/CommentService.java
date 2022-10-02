package CtoySeason2Server.service;

import CtoySeason2Server.domian.Comment;
import CtoySeason2Server.repository.CommentRepository;
import CtoySeason2Server.repository.MemoryCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //스프링에 올라올때 스프링컨테이너에 서비스를 전달해줌
public class CommentService {

    @Autowired // 의존관게 주입
    private final CommentRepository commentRepository = new MemoryCommentRepository();

    public Long Add(Comment comment){
        commentRepository.add(comment);
        return comment.getNUM();
    }
    public List<Comment> Find(){

        return commentRepository.findAll();
    }

    public Optional<Comment> delete (Long NUM) {
        return commentRepository.delete(NUM);
    }


}
