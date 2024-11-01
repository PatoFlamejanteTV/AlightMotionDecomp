package S1;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f9379a;

    /* renamed from: b, reason: collision with root package name */
    private final SecretKey f9380b;

    /* renamed from: c, reason: collision with root package name */
    private final SecretKey f9381c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9382d;

    public j(SecretKey secretKey) {
        this.f9379a = secretKey;
        byte[] encoded = secretKey.getEncoded();
        if (encoded.length == 32) {
            this.f9380b = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
            this.f9381c = new SecretKeySpec(encoded, 16, 16, "AES");
            this.f9382d = 16;
        } else if (encoded.length == 48) {
            this.f9380b = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
            this.f9381c = new SecretKeySpec(encoded, 24, 24, "AES");
            this.f9382d = 24;
        } else {
            if (encoded.length == 64) {
                this.f9380b = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
                this.f9381c = new SecretKeySpec(encoded, 32, 32, "AES");
                this.f9382d = 32;
                return;
            }
            throw new O1.u("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
        }
    }

    public SecretKey a() {
        return this.f9381c;
    }

    public SecretKey b() {
        return this.f9380b;
    }

    public int c() {
        return this.f9382d;
    }
}
