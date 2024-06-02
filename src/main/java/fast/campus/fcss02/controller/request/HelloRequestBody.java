package fast.campus.fcss02.controller.request;

import fast.campus.fcss02.annotation.CustomEncryption;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class HelloRequestBody {
    private String id;

    @CustomEncryption
    private String password;
}
