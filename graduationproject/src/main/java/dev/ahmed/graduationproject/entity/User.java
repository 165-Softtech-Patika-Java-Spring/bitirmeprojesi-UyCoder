package dev.ahmed.graduationproject.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

/**
 * @Author Ahmed Bughra
 * @Created 3/12/2022 - 12:02 AM
 * @Project bitirmeprojesi-UyCoder
 */

@Entity
@Table(name = "USER")
@Getter
@Setter
public class User {

    @Id
    @SequenceGenerator(name = "User" , sequenceName = "USER_ID_SEQ")
    @GeneratedValue(generator = "User")
    private Long id;

    @Column(name = "USER_NAME", length = 30, unique = true)
    private String userName;

    @Column(name = "FIRST_NAME", length = 30)
    private String firstName;

    @Column(name = "LAST_NAME", length = 30)
    private String lastName;

}
