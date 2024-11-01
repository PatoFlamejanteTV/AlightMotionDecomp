package d1;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f31292a = Byte.parseByte("01110000", 2);

    /* renamed from: b, reason: collision with root package name */
    private static final byte f31293b = Byte.parseByte("00001111", 2);

    private static String b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    public String a() {
        byte[] c8 = c(UUID.randomUUID(), new byte[17]);
        byte b9 = c8[0];
        c8[16] = b9;
        c8[0] = (byte) ((b9 & f31293b) | f31292a);
        return b(c8);
    }
}
