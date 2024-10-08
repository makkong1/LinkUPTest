package kh.link_up.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long u_idx;

    private String u_username;

    @Column(unique = true)
    private String u_id;

    private String u_pwd;

    private String u_nickname;

    private String u_email;

    private String u_telephone;

    private java.sql.Date u_birthday;

    private java.sql.Timestamp u_created_at;

    private String u_block;

    @Column(length = 1)
    private String u_role; // 'a' for admin, 'u' for user
}
