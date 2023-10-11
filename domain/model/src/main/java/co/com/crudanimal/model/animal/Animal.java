package co.com.crudanimal.model.animal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

    private String name;
    private String gender;
    private Long legs;
    private String species;
    private String habitat;
    private Boolean domestic;

}
