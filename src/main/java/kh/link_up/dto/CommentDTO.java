package kh.link_up.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {
    private Long c_idx;
    private String c_writer;
    private String c_content;
    private String c_username;
    private Integer c_like;
}

