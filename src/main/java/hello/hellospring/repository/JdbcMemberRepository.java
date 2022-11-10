package hello.hellospring.repository;

import javax.sql.DataSource;
import java.lang.reflect.Member;
import java.util.List;
import java.util.Optional;

public class JdbcMemberRepository implements MemberRepository{

    private final DataSource dataSource;

    public JdbcMemberRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Member save(Member member) {
        String sql = "insert into member(name) values(?)";
        return null;
    }

    @Override
    public hello.hellospring.domain.Member save(hello.hellospring.domain.Member member) {
        return null;
    }

    @Override
    public Optional<hello.hellospring.domain.Member> findById(Long Id) {
        return Optional.empty();
    }

    @Override
    public Optional<hello.hellospring.domain.Member> findByName(String Name) {
        return Optional.empty();
    }

    @Override
    public List<hello.hellospring.domain.Member> findAll() {
        return null;
    }

    @Override
    public void clearStore() {

    }
}
