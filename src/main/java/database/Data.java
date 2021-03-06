package database;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "DATA")
public class Data {
    @Id
    private String id;

    @Column
    private Double batteryPercentage;
    @Column
    private String robotModel;
    @Column
    private Double linearVelocity;
    @Column
    private Integer batteryTimeRemaining;
    @Column
    private Double distanceToNextTarget;

}

