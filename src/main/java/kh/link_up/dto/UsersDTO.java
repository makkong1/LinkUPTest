package kh.link_up.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersDTO {
    private Long u_idx;
    private String u_username;
    private String u_id;
    private String u_nickname;
    private String u_email;
    private String u_telephone;
    private java.sql.Date u_birthday;
}

