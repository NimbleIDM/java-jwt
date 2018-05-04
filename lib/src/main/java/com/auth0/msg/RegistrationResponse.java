package com.auth0.msg;

import java.util.List;
import java.util.Map;

public class RegistrationResponse extends AbstractMessage{

    public RegistrationResponse(Map<String, Object> claims){
        super(claims);
    }

    @Override
    protected List<String> getRequiredClaims() {
        return null;
    }

    @Override
    public Map<String, Object> getClaims() throws InvalidClaimsException {
        return null;
    }

    @Override
    public MessageType getMessageType() {
        return MessageType.REGISTRATION_RESPONSE;
    }

    @Override
    public boolean hasError() {
        return false;
    }
}