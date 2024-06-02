package fast.campus.fcss02.controller;

import fast.campus.fcss02.controller.request.HelloRequestBody;
import fast.campus.fcss02.service.EncryptService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final EncryptService encryptService;

    @PostMapping("/api/v1/hello")
    public String hello(@RequestBody HelloRequestBody request) {
        String encrypted = encryptService.encrypt(request.getPassword());
        return "";
    }
}
