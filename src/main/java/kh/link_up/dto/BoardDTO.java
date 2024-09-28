package kh.link_up.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {
    private Long b_idx;
    private String b_writer;
    private String b_category;
    private String b_title;
    private String b_content;
    private Integer b_view_cnt;
    private Integer b_like;
}
