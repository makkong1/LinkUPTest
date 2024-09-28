package kh.link_up.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "comments")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_idx;

    private String c_writer;

    private String c_content;

    private String c_username;

    private java.sql.Timestamp c_upload;

    private Integer c_like;
}
