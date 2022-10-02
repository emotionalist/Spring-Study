package Study.SpringStudy.repository;

import CtoySeason2Server.domian.Comment;
import CtoySeason2Server.repository.MemoryCommentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class MemoryCommentRepositoryTest {

    MemoryCommentRepository repository = new MemoryCommentRepository();

    @Test
    public void add(){
        Comment comment = new Comment();
        comment.setName("Spring");

        repository.add(comment);

      Comment result = repository.find(comment.getNUM()).get();

        assertThat(comment).isEqualTo(result);

    }

}
