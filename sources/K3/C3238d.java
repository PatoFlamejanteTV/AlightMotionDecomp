package k3;

import com.stripe.android.model.Source;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: k3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3238d {

    /* renamed from: a, reason: collision with root package name */
    private final String f34413a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34414b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34415c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34416d;

    /* renamed from: e, reason: collision with root package name */
    private final Source f34417e;

    /* renamed from: f, reason: collision with root package name */
    private final String f34418f;

    public C3238d(String clientSecret, int i8, boolean z8, String str, Source source, String str2) {
        AbstractC3292y.i(clientSecret, "clientSecret");
        this.f34413a = clientSecret;
        this.f34414b = i8;
        this.f34415c = z8;
        this.f34416d = str;
        this.f34417e = source;
        this.f34418f = str2;
    }

    public final boolean a() {
        return this.f34415c;
    }

    public final String b() {
        return this.f34413a;
    }

    public final int c() {
        return this.f34414b;
    }

    public final String d() {
        return this.f34416d;
    }

    public final String e() {
        return this.f34418f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3238d)) {
            return false;
        }
        C3238d c3238d = (C3238d) obj;
        if (AbstractC3292y.d(this.f34413a, c3238d.f34413a) && this.f34414b == c3238d.f34414b && this.f34415c == c3238d.f34415c && AbstractC3292y.d(this.f34416d, c3238d.f34416d) && AbstractC3292y.d(this.f34417e, c3238d.f34417e) && AbstractC3292y.d(this.f34418f, c3238d.f34418f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.f34413a.hashCode() * 31) + this.f34414b) * 31) + androidx.compose.foundation.a.a(this.f34415c)) * 31;
        String str = this.f34416d;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        Source source = this.f34417e;
        if (source == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = source.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f34418f;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        return "Validated(clientSecret=" + this.f34413a + ", flowOutcome=" + this.f34414b + ", canCancelSource=" + this.f34415c + ", sourceId=" + this.f34416d + ", source=" + this.f34417e + ", stripeAccountId=" + this.f34418f + ")";
    }
}
