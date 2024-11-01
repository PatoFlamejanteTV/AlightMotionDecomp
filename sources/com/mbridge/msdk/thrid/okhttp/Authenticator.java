package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;

/* loaded from: classes4.dex */
public interface Authenticator {
    public static final Authenticator NONE = new Authenticator() { // from class: com.mbridge.msdk.thrid.okhttp.Authenticator.1
        @Override // com.mbridge.msdk.thrid.okhttp.Authenticator
        public Request authenticate(Route route, Response response) {
            return null;
        }
    };

    Request authenticate(Route route, Response response) throws IOException;
}
