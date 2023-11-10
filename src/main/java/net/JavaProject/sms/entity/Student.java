package net.JavaProject.sms.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name", nullable = false)
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    public Student(){

    }
    public Student(String firstName,String lastName,String email){
        super();
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }

    @Column(name="email_id" , nullable = false , unique = true)
    private String email;

}
