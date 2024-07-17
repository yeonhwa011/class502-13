package exam01.member.entities;

import lombok.Builder;
import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Data
@Builder
public class Member {
    private long seq;
    private String email;
    private String password;
    private String userName;
    private LocalDateTime regDt;

}
