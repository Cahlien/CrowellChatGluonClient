package dev.crowell.crowellchat.services;

import dev.crowell.crowellchat.models.ChatterIdentityModel;
import dev.crowell.crowellchat.models.LoginRequestModel;

import java.util.Optional;

public interface AuthenticationService {
    Optional<ChatterIdentityModel> authenticate(LoginRequestModel request);
}
