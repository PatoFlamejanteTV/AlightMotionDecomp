package O1;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes4.dex */
public final class w implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final a f7078a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f7079b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7080c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f7081d;

    /* renamed from: e, reason: collision with root package name */
    private final d2.c f7082e;

    /* renamed from: f, reason: collision with root package name */
    private final r f7083f;

    /* loaded from: classes4.dex */
    public enum a {
        JSON,
        STRING,
        BYTE_ARRAY,
        BASE64URL,
        JWS_OBJECT,
        SIGNED_JWT
    }

    public w(String str) {
        if (str != null) {
            this.f7079b = null;
            this.f7080c = str;
            this.f7081d = null;
            this.f7082e = null;
            this.f7083f = null;
            this.f7078a = a.STRING;
            return;
        }
        throw new IllegalArgumentException("The string must not be null");
    }

    private static String a(byte[] bArr) {
        if (bArr != null) {
            return new String(bArr, d2.m.f31296a);
        }
        return null;
    }

    private static byte[] b(String str) {
        if (str != null) {
            return str.getBytes(d2.m.f31296a);
        }
        return null;
    }

    public d2.c c() {
        d2.c cVar = this.f7082e;
        if (cVar != null) {
            return cVar;
        }
        return d2.c.e(d());
    }

    public byte[] d() {
        byte[] bArr = this.f7081d;
        if (bArr != null) {
            return bArr;
        }
        d2.c cVar = this.f7082e;
        if (cVar != null) {
            return cVar.a();
        }
        return b(toString());
    }

    public String toString() {
        String str = this.f7080c;
        if (str != null) {
            return str;
        }
        r rVar = this.f7083f;
        if (rVar != null) {
            if (rVar.a() != null) {
                return this.f7083f.a();
            }
            return this.f7083f.m();
        }
        Map map = this.f7079b;
        if (map != null) {
            return d2.k.o(map);
        }
        byte[] bArr = this.f7081d;
        if (bArr != null) {
            return a(bArr);
        }
        d2.c cVar = this.f7082e;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    public w(byte[] bArr) {
        if (bArr != null) {
            this.f7079b = null;
            this.f7080c = null;
            this.f7081d = bArr;
            this.f7082e = null;
            this.f7083f = null;
            this.f7078a = a.BYTE_ARRAY;
            return;
        }
        throw new IllegalArgumentException("The byte array must not be null");
    }

    public w(d2.c cVar) {
        if (cVar != null) {
            this.f7079b = null;
            this.f7080c = null;
            this.f7081d = null;
            this.f7082e = cVar;
            this.f7083f = null;
            this.f7078a = a.BASE64URL;
            return;
        }
        throw new IllegalArgumentException("The Base64URL-encoded object must not be null");
    }
}
