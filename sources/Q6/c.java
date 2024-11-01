package Q6;

import U6.C1452h;
import com.mbridge.msdk.thrid.okhttp.internal.http2.Header;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final C1452h f8842d = C1452h.f(":");

    /* renamed from: e, reason: collision with root package name */
    public static final C1452h f8843e = C1452h.f(Header.RESPONSE_STATUS_UTF8);

    /* renamed from: f, reason: collision with root package name */
    public static final C1452h f8844f = C1452h.f(Header.TARGET_METHOD_UTF8);

    /* renamed from: g, reason: collision with root package name */
    public static final C1452h f8845g = C1452h.f(Header.TARGET_PATH_UTF8);

    /* renamed from: h, reason: collision with root package name */
    public static final C1452h f8846h = C1452h.f(Header.TARGET_SCHEME_UTF8);

    /* renamed from: i, reason: collision with root package name */
    public static final C1452h f8847i = C1452h.f(Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: a, reason: collision with root package name */
    public final C1452h f8848a;

    /* renamed from: b, reason: collision with root package name */
    public final C1452h f8849b;

    /* renamed from: c, reason: collision with root package name */
    final int f8850c;

    public c(String str, String str2) {
        this(C1452h.f(str), C1452h.f(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f8848a.equals(cVar.f8848a) || !this.f8849b.equals(cVar.f8849b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f8848a.hashCode()) * 31) + this.f8849b.hashCode();
    }

    public String toString() {
        return L6.c.o("%s: %s", this.f8848a.P(), this.f8849b.P());
    }

    public c(C1452h c1452h, String str) {
        this(c1452h, C1452h.f(str));
    }

    public c(C1452h c1452h, C1452h c1452h2) {
        this.f8848a = c1452h;
        this.f8849b = c1452h2;
        this.f8850c = c1452h.J() + 32 + c1452h2.J();
    }
}
