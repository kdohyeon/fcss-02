package fast.campus.fcss02.service;

import org.springframework.stereotype.Service;

@Service
public class EncryptService {
    public String encrypt(String before) {
        return "encrypted_" + before;
    }
}
