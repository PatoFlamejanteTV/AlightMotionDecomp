package com.mbridge.msdk.thrid.okhttp;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public interface Dns {
    public static final Dns SYSTEM = new Dns() { // from class: com.mbridge.msdk.thrid.okhttp.Dns.1
        @Override // com.mbridge.msdk.thrid.okhttp.Dns
        public List<InetAddress> lookup(String str) throws UnknownHostException {
            if (str != null) {
                try {
                    return Arrays.asList(InetAddress.getAllByName(str));
                } catch (NullPointerException e8) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e8);
                    throw unknownHostException;
                }
            }
            throw new UnknownHostException("hostname == null");
        }
    };

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
