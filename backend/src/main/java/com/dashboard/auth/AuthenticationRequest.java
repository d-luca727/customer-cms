package com.dashboard.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}
