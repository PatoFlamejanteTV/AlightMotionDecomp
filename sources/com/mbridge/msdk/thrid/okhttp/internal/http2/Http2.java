package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okio.ByteString;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class Http2 {
    static final byte FLAG_ACK = 1;
    static final byte FLAG_COMPRESSED = 32;
    static final byte FLAG_END_HEADERS = 4;
    static final byte FLAG_END_PUSH_PROMISE = 4;
    static final byte FLAG_END_STREAM = 1;
    static final byte FLAG_NONE = 0;
    static final byte FLAG_PADDED = 8;
    static final byte FLAG_PRIORITY = 32;
    static final int INITIAL_MAX_FRAME_SIZE = 16384;
    static final byte TYPE_CONTINUATION = 9;
    static final byte TYPE_DATA = 0;
    static final byte TYPE_GOAWAY = 7;
    static final byte TYPE_HEADERS = 1;
    static final byte TYPE_PING = 6;
    static final byte TYPE_PRIORITY = 2;
    static final byte TYPE_PUSH_PROMISE = 5;
    static final byte TYPE_RST_STREAM = 3;
    static final byte TYPE_SETTINGS = 4;
    static final byte TYPE_WINDOW_UPDATE = 8;
    static final ByteString CONNECTION_PREFACE = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    static final String[] FLAGS = new String[64];
    static final String[] BINARY = new String[256];

    static {
        int i8 = 0;
        int i9 = 0;
        while (true) {
            String[] strArr = BINARY;
            if (i9 >= strArr.length) {
                break;
            }
            strArr[i9] = Util.format("%8s", Integer.toBinaryString(i9)).replace(' ', '0');
            i9++;
        }
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i10 = iArr[0];
        strArr2[i10 | 8] = strArr2[i10] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            int i13 = iArr[0];
            String[] strArr3 = FLAGS;
            int i14 = i13 | i12;
            strArr3[i14] = strArr3[i13] + '|' + strArr3[i12];
            strArr3[i14 | 8] = strArr3[i13] + '|' + strArr3[i12] + "|PADDED";
        }
        while (true) {
            String[] strArr4 = FLAGS;
            if (i8 < strArr4.length) {
                if (strArr4[i8] == null) {
                    strArr4[i8] = BINARY[i8];
                }
                i8++;
            } else {
                return;
            }
        }
    }

    private Http2() {
    }

    static String formatFlags(byte b9, byte b10) {
        String str;
        if (b10 == 0) {
            return "";
        }
        if (b9 != 2 && b9 != 3) {
            if (b9 != 4 && b9 != 6) {
                if (b9 != 7 && b9 != 8) {
                    String[] strArr = FLAGS;
                    if (b10 < strArr.length) {
                        str = strArr[b10];
                    } else {
                        str = BINARY[b10];
                    }
                    if (b9 == 5 && (b10 & 4) != 0) {
                        return str.replace("HEADERS", "PUSH_PROMISE");
                    }
                    if (b9 == 0 && (b10 & 32) != 0) {
                        return str.replace("PRIORITY", "COMPRESSED");
                    }
                    return str;
                }
            } else {
                if (b10 == 1) {
                    return "ACK";
                }
                return BINARY[b10];
            }
        }
        return BINARY[b10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String frameLog(boolean z8, int i8, int i9, byte b9, byte b10) {
        String format;
        String str;
        String[] strArr = FRAME_NAMES;
        if (b9 < strArr.length) {
            format = strArr[b9];
        } else {
            format = Util.format("0x%02x", Byte.valueOf(b9));
        }
        String formatFlags = formatFlags(b9, b10);
        if (z8) {
            str = "<<";
        } else {
            str = ">>";
        }
        return Util.format("%s 0x%08x %5d %-13s %s", str, Integer.valueOf(i8), Integer.valueOf(i9), format, formatFlags);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IllegalArgumentException illegalArgument(String str, Object... objArr) {
        throw new IllegalArgumentException(Util.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IOException ioException(String str, Object... objArr) throws IOException {
        throw new IOException(Util.format(str, objArr));
    }
}
