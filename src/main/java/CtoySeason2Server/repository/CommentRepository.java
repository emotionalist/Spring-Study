package CtoySeason2Server.repository;

import CtoySeason2Server.domian.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentRepository {

    Comment add(Comment comment);

    Optional<Comment>  modify(Comment comment);

    Optional<Comment> find(Long NUM);

    Optional<Comment> delete(Long NUM);

    List<Comment> findAll();
}
