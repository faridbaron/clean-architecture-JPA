package co.com.crudanimal.jpa.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table (name = "tbanimal")
public class AnimalEntity {

    @Id private String name;
    @Column private String gender;
    @Column private Long legs;
    @Column private String species;
    @Column private String habitat;

    @Column private Boolean domestic;
}
