package com.shivam.library.request.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {
    public String email;
    public String password;

    @Override
    public String toString() {
        return "Email" + email + ", Password" + password;
    }
}
