package arradibouchakour.application.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Player {
    private Long id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String teamID;
}
