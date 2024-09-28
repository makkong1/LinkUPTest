package kh.link_up.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminDTO {
    private Long a_idx;
    private String a_id;
    private String a_email;
    private String a_telephone;
}
