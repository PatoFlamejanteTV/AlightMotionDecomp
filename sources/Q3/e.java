package Q3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f8519a;

    /* renamed from: b, reason: collision with root package name */
    private final C2.c f8520b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8521c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8522d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8523e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f8524f;

    /* renamed from: g, reason: collision with root package name */
    private final C2.c f8525g;

    /* renamed from: h, reason: collision with root package name */
    private final Function0 f8526h;

    public e(String code, C2.c displayName, int i8, String str, String str2, boolean z8, C2.c cVar, Function0 onClick) {
        AbstractC3292y.i(code, "code");
        AbstractC3292y.i(displayName, "displayName");
        AbstractC3292y.i(onClick, "onClick");
        this.f8519a = code;
        this.f8520b = displayName;
        this.f8521c = i8;
        this.f8522d = str;
        this.f8523e = str2;
        this.f8524f = z8;
        this.f8525g = cVar;
        this.f8526h = onClick;
    }

    public final String a() {
        return this.f8519a;
    }

    public final String b() {
        return this.f8523e;
    }

    public final C2.c c() {
        return this.f8520b;
    }

    public final boolean d() {
        return this.f8524f;
    }

    public final int e() {
        return this.f8521c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3292y.d(this.f8519a, eVar.f8519a) && AbstractC3292y.d(this.f8520b, eVar.f8520b) && this.f8521c == eVar.f8521c && AbstractC3292y.d(this.f8522d, eVar.f8522d) && AbstractC3292y.d(this.f8523e, eVar.f8523e) && this.f8524f == eVar.f8524f && AbstractC3292y.d(this.f8525g, eVar.f8525g) && AbstractC3292y.d(this.f8526h, eVar.f8526h)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f8522d;
    }

    public final Function0 g() {
        return this.f8526h;
    }

    public final C2.c h() {
        return this.f8525g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.f8519a.hashCode() * 31) + this.f8520b.hashCode()) * 31) + this.f8521c) * 31;
        String str = this.f8522d;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        String str2 = this.f8523e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int a9 = (((i9 + hashCode2) * 31) + androidx.compose.foundation.a.a(this.f8524f)) * 31;
        C2.c cVar = this.f8525g;
        if (cVar != null) {
            i8 = cVar.hashCode();
        }
        return ((a9 + i8) * 31) + this.f8526h.hashCode();
    }

    public String toString() {
        return "DisplayablePaymentMethod(code=" + this.f8519a + ", displayName=" + this.f8520b + ", iconResource=" + this.f8521c + ", lightThemeIconUrl=" + this.f8522d + ", darkThemeIconUrl=" + this.f8523e + ", iconRequiresTinting=" + this.f8524f + ", subtitle=" + this.f8525g + ", onClick=" + this.f8526h + ")";
    }
}
