package com.mbridge.msdk.thrid.okhttp.internal.ws;

import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.ByteString;

/* loaded from: classes4.dex */
public final class WebSocketProtocol {
    static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    static final int B0_FLAG_FIN = 128;
    static final int B0_FLAG_RSV1 = 64;
    static final int B0_FLAG_RSV2 = 32;
    static final int B0_FLAG_RSV3 = 16;
    static final int B0_MASK_OPCODE = 15;
    static final int B1_FLAG_MASK = 128;
    static final int B1_MASK_LENGTH = 127;
    static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    static final long CLOSE_MESSAGE_MAX = 123;
    static final int CLOSE_NO_STATUS_CODE = 1005;
    static final int OPCODE_BINARY = 2;
    static final int OPCODE_CONTINUATION = 0;
    static final int OPCODE_CONTROL_CLOSE = 8;
    static final int OPCODE_CONTROL_PING = 9;
    static final int OPCODE_CONTROL_PONG = 10;
    static final int OPCODE_FLAG_CONTROL = 8;
    static final int OPCODE_TEXT = 1;
    static final long PAYLOAD_BYTE_MAX = 125;
    static final int PAYLOAD_LONG = 127;
    static final int PAYLOAD_SHORT = 126;
    static final long PAYLOAD_SHORT_MAX = 65535;

    private WebSocketProtocol() {
        throw new AssertionError("No instances.");
    }

    public static String acceptHeader(String str) {
        return ByteString.encodeUtf8(str + ACCEPT_MAGIC).sha1().base64();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String closeCodeExceptionMessage(int i8) {
        if (i8 >= 1000 && i8 < 5000) {
            if ((i8 >= 1004 && i8 <= 1006) || (i8 >= 1012 && i8 <= 2999)) {
                return "Code " + i8 + " is reserved and may not be used.";
            }
            return null;
        }
        return "Code must be in range [1000,5000): " + i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void toggleMask(Buffer.UnsafeCursor unsafeCursor, byte[] bArr) {
        int length = bArr.length;
        int i8 = 0;
        do {
            byte[] bArr2 = unsafeCursor.data;
            int i9 = unsafeCursor.start;
            int i10 = unsafeCursor.end;
            while (i9 < i10) {
                int i11 = i8 % length;
                bArr2[i9] = (byte) (bArr2[i9] ^ bArr[i11]);
                i9++;
                i8 = i11 + 1;
            }
        } while (unsafeCursor.next() != -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void validateCloseCode(int i8) {
        String closeCodeExceptionMessage = closeCodeExceptionMessage(i8);
        if (closeCodeExceptionMessage == null) {
        } else {
            throw new IllegalArgumentException(closeCodeExceptionMessage);
        }
    }
}
