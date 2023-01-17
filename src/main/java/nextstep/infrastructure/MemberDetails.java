package nextstep.infrastructure;

import lombok.*;
import nextstep.auth.role.Role;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDetails {
    private Long id;
    private String username;
    private String password;
    private String name;
    private String phone;
    private Role role;
}
