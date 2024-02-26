package org.humber.project.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String user_id;
    private String username;
    private String email;
    private String password;
    private String watched_id;
    private String plantowatch_id;
}
