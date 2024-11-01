package d2;

import java.io.Serializable;
import java.math.BigInteger;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2747a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final String f31294a;

    public C2747a(String str) {
        if (str != null) {
            this.f31294a = str;
            return;
        }
        throw new IllegalArgumentException("The Base64 value must not be null");
    }

    public byte[] a() {
        return AbstractC2748b.c(this.f31294a);
    }

    public BigInteger b() {
        return new BigInteger(1, a());
    }

    public String c() {
        return new String(a(), m.f31296a);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C2747a) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f31294a.hashCode();
    }

    public String toString() {
        return this.f31294a;
    }
}
