package kh.link_up.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "noption")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Notion{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long p_idx;

    private String p_writer;

    private String p_title;

    private String p_content;

    private java.sql.Timestamp p_upload;

    private Integer p_view_cnt;

    private Integer p_like;
}