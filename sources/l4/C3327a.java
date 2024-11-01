package l4;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: l4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3327a {

    /* renamed from: a, reason: collision with root package name */
    private String f34673a;

    /* renamed from: b, reason: collision with root package name */
    private String f34674b;

    /* renamed from: c, reason: collision with root package name */
    private String f34675c;

    /* renamed from: d, reason: collision with root package name */
    private String f34676d;

    /* renamed from: e, reason: collision with root package name */
    private String f34677e;

    /* renamed from: f, reason: collision with root package name */
    private String f34678f;

    /* renamed from: g, reason: collision with root package name */
    private String f34679g;

    public C3327a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f34673a = str;
        this.f34674b = str2;
        this.f34675c = str3;
        this.f34676d = str4;
        this.f34677e = str5;
        this.f34678f = str6;
        this.f34679g = str7;
    }

    public static /* synthetic */ C3327a b(C3327a c3327a, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = c3327a.f34673a;
        }
        if ((i8 & 2) != 0) {
            str2 = c3327a.f34674b;
        }
        String str8 = str2;
        if ((i8 & 4) != 0) {
            str3 = c3327a.f34675c;
        }
        String str9 = str3;
        if ((i8 & 8) != 0) {
            str4 = c3327a.f34676d;
        }
        String str10 = str4;
        if ((i8 & 16) != 0) {
            str5 = c3327a.f34677e;
        }
        String str11 = str5;
        if ((i8 & 32) != 0) {
            str6 = c3327a.f34678f;
        }
        String str12 = str6;
        if ((i8 & 64) != 0) {
            str7 = c3327a.f34679g;
        }
        return c3327a.a(str, str8, str9, str10, str11, str12, str7);
    }

    public final C3327a a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new C3327a(str, str2, str3, str4, str5, str6, str7);
    }

    public final String c() {
        return this.f34675c;
    }

    public final String d() {
        return this.f34676d;
    }

    public final String e() {
        return this.f34677e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3327a)) {
            return false;
        }
        C3327a c3327a = (C3327a) obj;
        if (AbstractC3292y.d(this.f34673a, c3327a.f34673a) && AbstractC3292y.d(this.f34674b, c3327a.f34674b) && AbstractC3292y.d(this.f34675c, c3327a.f34675c) && AbstractC3292y.d(this.f34676d, c3327a.f34676d) && AbstractC3292y.d(this.f34677e, c3327a.f34677e) && AbstractC3292y.d(this.f34678f, c3327a.f34678f) && AbstractC3292y.d(this.f34679g, c3327a.f34679g)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f34674b;
    }

    public final String g() {
        return this.f34678f;
    }

    public final String h() {
        return this.f34673a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str = this.f34673a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f34674b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f34675c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f34676d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f34677e;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str6 = this.f34678f;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str7 = this.f34679g;
        if (str7 != null) {
            i8 = str7.hashCode();
        }
        return i14 + i8;
    }

    public final String i() {
        return this.f34679g;
    }

    public final void j(String str) {
        this.f34675c = str;
    }

    public final void k(String str) {
        this.f34676d = str;
    }

    public final void l(String str) {
        this.f34677e = str;
    }

    public final void m(String str) {
        this.f34674b = str;
    }

    public final void n(String str) {
        this.f34678f = str;
    }

    public final void o(String str) {
        this.f34673a = str;
    }

    public final void p(String str) {
        this.f34679g = str;
    }

    public String toString() {
        return "Address(locality=" + this.f34673a + ", country=" + this.f34674b + ", addressLine1=" + this.f34675c + ", addressLine2=" + this.f34676d + ", administrativeArea=" + this.f34677e + ", dependentLocality=" + this.f34678f + ", postalCode=" + this.f34679g + ")";
    }

    public /* synthetic */ C3327a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5, (i8 & 32) != 0 ? null : str6, (i8 & 64) != 0 ? null : str7);
    }
}
