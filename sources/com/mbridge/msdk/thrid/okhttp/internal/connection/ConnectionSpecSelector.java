package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.ConnectionSpec;
import com.mbridge.msdk.thrid.okhttp.internal.Internal;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* loaded from: classes4.dex */
public final class ConnectionSpecSelector {
    private final List<ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex = 0;

    public ConnectionSpecSelector(List<ConnectionSpec> list) {
        this.connectionSpecs = list;
    }

    private boolean isFallbackPossible(SSLSocket sSLSocket) {
        for (int i8 = this.nextModeIndex; i8 < this.connectionSpecs.size(); i8++) {
            if (this.connectionSpecs.get(i8).isCompatible(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public ConnectionSpec configureSecureSocket(SSLSocket sSLSocket) throws IOException {
        ConnectionSpec connectionSpec;
        int i8 = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (true) {
            if (i8 < size) {
                connectionSpec = this.connectionSpecs.get(i8);
                if (connectionSpec.isCompatible(sSLSocket)) {
                    this.nextModeIndex = i8 + 1;
                    break;
                }
                i8++;
            } else {
                connectionSpec = null;
                break;
            }
        }
        if (connectionSpec != null) {
            this.isFallbackPossible = isFallbackPossible(sSLSocket);
            Internal.instance.apply(connectionSpec, sSLSocket, this.isFallback);
            return connectionSpec;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.isFallback + ", modes=" + this.connectionSpecs + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean connectionFailed(IOException iOException) {
        this.isFallback = true;
        if (!this.isFallbackPossible || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z8 = iOException instanceof SSLHandshakeException;
        if ((z8 && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        if (z8 || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException)) {
            return true;
        }
        return false;
    }
}
