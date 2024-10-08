package kh.link_up.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "board")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long b_idx;

    private String b_writer;

    private String b_category;

    private String b_title;

    private String b_content;

    private String b_pwd;

    private java.sql.Timestamp b_upload;

    private Integer b_view_cnt;

    private Integer b_like;

    private String b_file_path;
}
