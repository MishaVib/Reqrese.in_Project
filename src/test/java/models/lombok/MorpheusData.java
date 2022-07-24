package models.lombok;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties (ignoreUnknown = true)
public class MorpheusData {
    private String name;
    private String job;

}
