package d2;

/* loaded from: classes4.dex */
public class c extends C2747a {
    public c(String str) {
        super(str);
    }

    public static c d(String str) {
        return e(str.getBytes(m.f31296a));
    }

    public static c e(byte[] bArr) {
        return new c(AbstractC2748b.g(bArr, true));
    }

    public static c f(String str) {
        if (str == null) {
            return null;
        }
        return new c(str);
    }

    @Override // d2.C2747a
    public boolean equals(Object obj) {
        if ((obj instanceof c) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }
}
