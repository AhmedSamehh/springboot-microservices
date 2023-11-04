package com.seha.customer;

import org.springframework.web.bind.annotation.RequestBody;

public record CustomerRegisterationRequest(
        String firstName,
        String lastName,
        String email) {
}
