package database;

import lombok.Getter;
import lombok.Setter;


import javax.annotation.Resource;
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


}

