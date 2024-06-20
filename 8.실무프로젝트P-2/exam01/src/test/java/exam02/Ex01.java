package exam02;

import Configs.DBConn;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Member;
import java.util.List;

public class Ex01 {

    @Test
    void test1() {
        SqlSession session = DBConn.getSession();
        List<Member> members =session.selectList("mappers.Member.getList");
        members.forEach(System.out::println);
    }

}
