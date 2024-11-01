package q3;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: q3.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3649r {

    /* renamed from: a, reason: collision with root package name */
    private final String f36729a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36730b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f36731c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f36732d;

    /* renamed from: e, reason: collision with root package name */
    private final String f36733e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f36734f;

    public C3649r(String authUrl, String str, boolean z8, boolean z9, String str2, boolean z10) {
        AbstractC3292y.i(authUrl, "authUrl");
        this.f36729a = authUrl;
        this.f36730b = str;
        this.f36731c = z8;
        this.f36732d = z9;
        this.f36733e = str2;
        this.f36734f = z10;
    }

    public final String a() {
        return this.f36729a;
    }

    public final boolean b() {
        return this.f36734f;
    }

    public final String c() {
        return this.f36733e;
    }

    public final String d() {
        return this.f36730b;
    }

    public final boolean e() {
        return this.f36732d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3649r)) {
            return false;
        }
        C3649r c3649r = (C3649r) obj;
        if (AbstractC3292y.d(this.f36729a, c3649r.f36729a) && AbstractC3292y.d(this.f36730b, c3649r.f36730b) && this.f36731c == c3649r.f36731c && this.f36732d == c3649r.f36732d && AbstractC3292y.d(this.f36733e, c3649r.f36733e) && this.f36734f == c3649r.f36734f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f36731c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f36729a.hashCode() * 31;
        String str = this.f36730b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int a9 = (((((hashCode2 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f36731c)) * 31) + androidx.compose.foundation.a.a(this.f36732d)) * 31;
        String str2 = this.f36733e;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return ((a9 + i8) * 31) + androidx.compose.foundation.a.a(this.f36734f);
    }

    public String toString() {
        return "WebAuthParams(authUrl=" + this.f36729a + ", returnUrl=" + this.f36730b + ", shouldCancelSource=" + this.f36731c + ", shouldCancelIntentOnUserNavigation=" + this.f36732d + ", referrer=" + this.f36733e + ", forceInAppWebView=" + this.f36734f + ")";
    }

    public /* synthetic */ C3649r(String str, String str2, boolean z8, boolean z9, String str3, boolean z10, int i8, AbstractC3284p abstractC3284p) {
        this(str, str2, (i8 & 4) != 0 ? false : z8, (i8 & 8) != 0 ? true : z9, (i8 & 16) != 0 ? null : str3, (i8 & 32) != 0 ? false : z10);
    }
}
