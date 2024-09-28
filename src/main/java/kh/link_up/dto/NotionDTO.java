package kh.link_up.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotionDTO {
    private Long p_idx;
    private String p_writer;
    private String p_title;
    private String p_content;
    private Integer p_view_cnt;
    private Integer p_like;
}
