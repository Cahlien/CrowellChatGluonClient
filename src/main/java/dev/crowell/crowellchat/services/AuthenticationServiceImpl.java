package dev.crowell.crowellchat.services;

import dev.crowell.crowellchat.models.*;

import java.util.LinkedList;
import java.util.Optional;

public class AuthenticationServiceImpl implements AuthenticationService {
    @Override
    public Optional<ChatterIdentityModel> authenticate(LoginRequestModel request) {
        if(request.getUsername().equals("test") && request.getPassword().equals("test")){
            var identity = new ChatterIdentityModel();
            identity.setId(1L);
            identity.setGivenNames(new LinkedList<>());
            identity.setSurname(new CognomenModel());
            identity.setContactInformation(new ContactInformationModel());
            return Optional.of(identity);
        } else {
            return Optional.empty();
        }
    }
}
