package bigdatasystem.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "Arts")
public class Art { //Arts 컬렉션 필드

    @Id
    private String id;

    private String pblprfr_nm;

    private String pblprfr_place_nm;

    private String pblprfr_de;

    private String pblprfr_time;

    private String genre_nm;

    private String prc_cn;

    private String hmpg_url;

    private String setle_de;

    private String setle_time;

    private String dscnt_cn;

    private String setle_price;

    private String mber_grad_nm;

    private String bn_value;

    private String sexdstn_value;

    private String oc_area_nm;

    private String rfn_at;

}



