package com.example.cacheResponseObject;

import lombok.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserCache implements Serializable {

    private int userId;

    private String name;

    private String mobile;

    private String email;

    private String password;

    private Date createdOn;

    private Date updatedOn;

    private String authorities;

}
