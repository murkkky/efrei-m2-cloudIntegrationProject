package arradibouchakour.application.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Team {
    private Long id;
    private String name;
    private String playerID;
}
