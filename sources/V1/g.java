package V1;

import O1.x;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class g implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final g f10471c = new g("EC", x.RECOMMENDED);

    /* renamed from: d, reason: collision with root package name */
    public static final g f10472d = new g("RSA", x.REQUIRED);

    /* renamed from: e, reason: collision with root package name */
    public static final g f10473e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f10474f;

    /* renamed from: a, reason: collision with root package name */
    private final String f10475a;

    /* renamed from: b, reason: collision with root package name */
    private final x f10476b;

    static {
        x xVar = x.OPTIONAL;
        f10473e = new g("oct", xVar);
        f10474f = new g("OKP", xVar);
    }

    public g(String str, x xVar) {
        if (str != null) {
            this.f10475a = str;
            this.f10476b = xVar;
            return;
        }
        throw new IllegalArgumentException("The key type value must not be null");
    }

    public static g b(String str) {
        if (str != null) {
            g gVar = f10471c;
            if (str.equals(gVar.a())) {
                return gVar;
            }
            g gVar2 = f10472d;
            if (str.equals(gVar2.a())) {
                return gVar2;
            }
            g gVar3 = f10473e;
            if (str.equals(gVar3.a())) {
                return gVar3;
            }
            g gVar4 = f10474f;
            if (str.equals(gVar4.a())) {
                return gVar4;
            }
            return new g(str, null);
        }
        throw new IllegalArgumentException("The key type to parse must not be null");
    }

    public String a() {
        return this.f10475a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof g) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f10475a.hashCode();
    }

    public String toString() {
        return this.f10475a;
    }
}
