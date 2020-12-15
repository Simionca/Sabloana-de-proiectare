package ro.uvt.models;

import lombok.Getter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class BaseElement implements Element {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private int id;
}