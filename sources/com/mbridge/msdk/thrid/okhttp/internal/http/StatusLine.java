package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.Protocol;
import com.mbridge.msdk.thrid.okhttp.Response;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes4.dex */
public final class StatusLine {
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final String message;
    public final Protocol protocol;

    public StatusLine(Protocol protocol, int i8, String str) {
        this.protocol = protocol;
        this.code = i8;
        this.message = str;
    }

    public static StatusLine get(Response response) {
        return new StatusLine(response.protocol(), response.code(), response.message());
    }

    public static StatusLine parse(String str) throws IOException {
        Protocol protocol;
        int i8;
        String str2;
        if (str.startsWith("HTTP/1.")) {
            i8 = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else if (charAt == 1) {
                    protocol = Protocol.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            protocol = Protocol.HTTP_1_0;
            i8 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i9 = i8 + 3;
        if (str.length() >= i9) {
            try {
                int parseInt = Integer.parseInt(str.substring(i8, i9));
                if (str.length() > i9) {
                    if (str.charAt(i9) == ' ') {
                        str2 = str.substring(i8 + 4);
                    } else {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                } else {
                    str2 = "";
                }
                return new StatusLine(protocol, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }
        throw new ProtocolException("Unexpected status line: " + str);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(this.code);
        if (this.message != null) {
            sb.append(' ');
            sb.append(this.message);
        }
        return sb.toString();
    }
}