package cn.lnfvc.spring_test.domain;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Person(String name) {
        super();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}