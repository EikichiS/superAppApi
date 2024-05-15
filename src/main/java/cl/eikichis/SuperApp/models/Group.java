package cl.eikichis.SuperApp.models;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Group {
    @Id
    private String id;
    private List<Person> perosnas;

    private int lider_id;
    private String actividad;
}
