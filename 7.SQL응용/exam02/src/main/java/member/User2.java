package member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Builder @ToString
//기본 생성자를 꼭 써야되는 경우@NoArgsConstructor @AllArgsCONSTRUCTOR
@NoArgsConstructor @AllArgsConstructor
public class User2 {
    private  String userId;
    private  String userNm;
    private  String email;
    private LocalDateTime regDt;
 }
