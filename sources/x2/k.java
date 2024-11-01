package x2;

import R5.AbstractC1435t;
import j$.util.Objects;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;
import org.json.JSONException;
import x2.C4207a;

/* loaded from: classes4.dex */
public abstract class k extends Exception {

    /* renamed from: e, reason: collision with root package name */
    public static final a f40948e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final v2.f f40949a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40950b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40951c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f40952d;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        private final String a(Throwable th) {
            Class<?> cls = th.getClass();
            String name = cls.getName();
            AbstractC3292y.h(name, "getName(...)");
            if (!n.B(name, "android.", false, 2, null)) {
                String name2 = cls.getName();
                AbstractC3292y.h(name2, "getName(...)");
                if (!n.B(name2, "java.", false, 2, null)) {
                    return null;
                }
            }
            return cls.getName();
        }

        public final k b(Throwable throwable) {
            k c4211e;
            AbstractC3292y.i(throwable, "throwable");
            if (throwable instanceof k) {
                return (k) throwable;
            }
            if (throwable instanceof JSONException) {
                c4211e = new C4208b(throwable);
            } else {
                if (throwable instanceof IOException) {
                    return C4207a.C0932a.b(C4207a.f40944f, (IOException) throwable, null, 2, null);
                }
                if (throwable instanceof IllegalArgumentException) {
                    c4211e = new C4212f(null, null, 0, throwable.getMessage(), throwable, 7, null);
                } else {
                    c4211e = new C4211e(throwable, a(throwable));
                }
            }
            return c4211e;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ k(v2.f r5, java.lang.String r6, int r7, java.lang.Throwable r8, java.lang.String r9, int r10, kotlin.jvm.internal.AbstractC3284p r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L7
            r11 = r0
            goto L8
        L7:
            r11 = r5
        L8:
            r5 = r10 & 2
            if (r5 == 0) goto Le
            r1 = r0
            goto Lf
        Le:
            r1 = r6
        Lf:
            r5 = r10 & 4
            if (r5 == 0) goto L16
            r7 = 0
            r2 = 0
            goto L17
        L16:
            r2 = r7
        L17:
            r5 = r10 & 8
            if (r5 == 0) goto L1d
            r3 = r0
            goto L1e
        L1d:
            r3 = r8
        L1e:
            r5 = r10 & 16
            if (r5 == 0) goto L2b
            if (r11 == 0) goto L2a
            java.lang.String r5 = r11.i()
            r9 = r5
            goto L2b
        L2a:
            r9 = r0
        L2b:
            r10 = r9
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.k.<init>(v2.f, java.lang.String, int, java.lang.Throwable, java.lang.String, int, kotlin.jvm.internal.p):void");
    }

    private final boolean f(k kVar) {
        if (AbstractC3292y.d(this.f40949a, kVar.f40949a) && AbstractC3292y.d(this.f40950b, kVar.f40950b) && this.f40951c == kVar.f40951c && AbstractC3292y.d(getMessage(), kVar.getMessage())) {
            return true;
        }
        return false;
    }

    public abstract String a();

    public final String b() {
        return this.f40950b;
    }

    public final int c() {
        return this.f40951c;
    }

    public final v2.f d() {
        return this.f40949a;
    }

    public final boolean e() {
        return this.f40952d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return f((k) obj);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f40949a, this.f40950b, Integer.valueOf(this.f40951c), getMessage());
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str;
        String str2 = this.f40950b;
        if (str2 != null) {
            str = "Request-id: " + str2;
        } else {
            str = null;
        }
        return AbstractC1435t.w0(AbstractC1435t.r(str, super.toString()), "\n", null, null, 0, null, null, 62, null);
    }

    public k(v2.f fVar, String str, int i8, Throwable th, String str2) {
        super(str2, th);
        this.f40949a = fVar;
        this.f40950b = str;
        this.f40951c = i8;
        boolean z8 = false;
        if (400 <= i8 && i8 < 500) {
            z8 = true;
        }
        this.f40952d = z8;
    }
}
