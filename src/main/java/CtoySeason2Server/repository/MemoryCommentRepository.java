package CtoySeason2Server.repository;

import CtoySeason2Server.domian.Comment;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MemoryCommentRepository implements CommentRepository {

    private static Map<Long, Comment> store = new HashMap<>();  // 메모리 저장하는 곳 , add할때 아이디가 추가되는 곳
    private static long sequence = 0L;

    @Override
    public Comment add(Comment comment) {
       comment.setNUM(++sequence);
       store.put(comment.getNUM(), comment);
        return comment;
    }

    @Override
    public Optional<Comment> modify(Comment comment) {

        return Optional.empty();
    }

    @Override
    public Optional<Comment> find(Long NUM) {
        return Optional.ofNullable(store.get(NUM));

    }

    @Override
    public Optional<Comment> delete(Long NUM) {
        return Optional.ofNullable(store.remove(NUM)); // ofNullable 은 null값을 받지 않는다는 코드
    }

    @Override
    public List<Comment> findAll() {
        return new ArrayList<>(store.values());
    }
}