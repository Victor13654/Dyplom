
package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Data {

    private Double batteryPercentage;
    private String robotModel;
    private Velocity velocity;
    private Integer batteryTimeRemaining;
    private Double distanceToNextTarget;


}
