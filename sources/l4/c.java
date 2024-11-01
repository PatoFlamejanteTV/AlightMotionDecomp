package l4;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private String f34687a;

    /* renamed from: b, reason: collision with root package name */
    private String f34688b;

    /* renamed from: c, reason: collision with root package name */
    private String f34689c;

    /* renamed from: d, reason: collision with root package name */
    private String f34690d;

    /* renamed from: e, reason: collision with root package name */
    private String f34691e;

    public c(String str, String str2, String str3, String str4, String str5) {
        this.f34687a = str;
        this.f34688b = str2;
        this.f34689c = str3;
        this.f34690d = str4;
        this.f34691e = str5;
    }

    public final String a() {
        return this.f34688b;
    }

    public final String b() {
        return this.f34687a;
    }

    public final String c() {
        return this.f34689c;
    }

    public final String d() {
        return this.f34690d;
    }

    public final String e() {
        return this.f34691e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3292y.d(this.f34687a, cVar.f34687a) && AbstractC3292y.d(this.f34688b, cVar.f34688b) && AbstractC3292y.d(this.f34689c, cVar.f34689c) && AbstractC3292y.d(this.f34690d, cVar.f34690d) && AbstractC3292y.d(this.f34691e, cVar.f34691e)) {
            return true;
        }
        return false;
    }

    public final void f(String str) {
        this.f34688b = str;
    }

    public final void g(String str) {
        this.f34687a = str;
    }

    public final void h(String str) {
        this.f34689c = str;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f34687a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f34688b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f34689c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f34690d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f34691e;
        if (str5 != null) {
            i8 = str5.hashCode();
        }
        return i12 + i8;
    }

    public final void i(String str) {
        this.f34690d = str;
    }

    public final void j(String str) {
        this.f34691e = str;
    }

    public String toString() {
        return "AddressLine1(streetNumber=" + this.f34687a + ", route=" + this.f34688b + ", subLocalityLevel2=" + this.f34689c + ", subLocalityLevel3=" + this.f34690d + ", subLocalityLevel4=" + this.f34691e + ")";
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, String str5, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5);
    }
}
