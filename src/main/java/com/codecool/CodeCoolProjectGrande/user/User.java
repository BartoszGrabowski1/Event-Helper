package com.codecool.CodeCoolProjectGrande.user;

import com.codecool.CodeCoolProjectGrande.user.passwordreset.ResetPasswordToken;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.springframework.http.converter.json.GsonBuilderUtils;

import javax.persistence.*;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
@Builder
public class User {

    @Id
    @Type(type="org.hibernate.type.PostgresUUIDType")
    private UUID userId = UUID.randomUUID();
    private String name;
    private int age;
    private String password;
    private String email;
    private UserType userType;
    private String imgUrl;
    private String location;
    @JoinColumn(name = "tokenId")
    @OneToOne(cascade=CascadeType.ALL)
    private ResetPasswordToken resetPasswordToken;
    @JoinColumn(name = "banId")
    @OneToOne(cascade=CascadeType.ALL)
    private BanToken banToken;
}
