package com.stripe.android.model;

import R5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC2900J;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class a implements z2.f, InterfaceC2900J {

    /* renamed from: h, reason: collision with root package name */
    public static final int f25420h = 0;

    /* renamed from: a, reason: collision with root package name */
    private final String f25421a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25422b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25423c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25424d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25425e;

    /* renamed from: f, reason: collision with root package name */
    private final String f25426f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f25419g = new b(null);
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: com.stripe.android.model.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0496a {

        /* renamed from: a, reason: collision with root package name */
        private String f25427a;

        /* renamed from: b, reason: collision with root package name */
        private String f25428b;

        /* renamed from: c, reason: collision with root package name */
        private String f25429c;

        /* renamed from: d, reason: collision with root package name */
        private String f25430d;

        /* renamed from: e, reason: collision with root package name */
        private String f25431e;

        /* renamed from: f, reason: collision with root package name */
        private String f25432f;

        public final a a() {
            return new a(this.f25427a, this.f25428b, this.f25429c, this.f25430d, this.f25431e, this.f25432f);
        }

        public final C0496a b(String str) {
            this.f25427a = str;
            return this;
        }

        public final C0496a c(String str) {
            String str2;
            if (str != null) {
                str2 = str.toUpperCase(Locale.ROOT);
                AbstractC3292y.h(str2, "toUpperCase(...)");
            } else {
                str2 = null;
            }
            this.f25428b = str2;
            return this;
        }

        public final C0496a d(z2.b bVar) {
            String str;
            if (bVar != null) {
                str = bVar.b();
            } else {
                str = null;
            }
            this.f25428b = str;
            return this;
        }

        public final C0496a e(String str) {
            this.f25429c = str;
            return this;
        }

        public final C0496a f(String str) {
            this.f25430d = str;
            return this;
        }

        public final C0496a g(String str) {
            this.f25431e = str;
            return this;
        }

        public final C0496a h(String str) {
            this.f25432f = str;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f25421a = str;
        this.f25422b = str2;
        this.f25423c = str3;
        this.f25424d = str4;
        this.f25425e = str5;
        this.f25426f = str6;
    }

    @Override // g3.InterfaceC2900J
    public Map B() {
        String str = this.f25421a;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Q5.r a9 = Q5.x.a("city", str);
        String str3 = this.f25422b;
        if (str3 == null) {
            str3 = "";
        }
        Q5.r a10 = Q5.x.a("country", str3);
        String str4 = this.f25423c;
        if (str4 == null) {
            str4 = "";
        }
        Q5.r a11 = Q5.x.a("line1", str4);
        String str5 = this.f25424d;
        if (str5 == null) {
            str5 = "";
        }
        Q5.r a12 = Q5.x.a("line2", str5);
        String str6 = this.f25425e;
        if (str6 == null) {
            str6 = "";
        }
        Q5.r a13 = Q5.x.a("postal_code", str6);
        String str7 = this.f25426f;
        if (str7 != null) {
            str2 = str7;
        }
        Map k8 = Q.k(a9, a10, a11, a12, a13, Q5.x.a("state", str2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : k8.entrySet()) {
            if (((String) entry.getValue()).length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final String a() {
        return this.f25421a;
    }

    public final String b() {
        return this.f25422b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC3292y.d(this.f25421a, aVar.f25421a) && AbstractC3292y.d(this.f25422b, aVar.f25422b) && AbstractC3292y.d(this.f25423c, aVar.f25423c) && AbstractC3292y.d(this.f25424d, aVar.f25424d) && AbstractC3292y.d(this.f25425e, aVar.f25425e) && AbstractC3292y.d(this.f25426f, aVar.f25426f);
    }

    public final String f() {
        return this.f25423c;
    }

    public final String h() {
        return this.f25424d;
    }

    public int hashCode() {
        String str = this.f25421a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25422b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25423c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25424d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f25425e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f25426f;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String i() {
        return this.f25425e;
    }

    public final String l() {
        return this.f25426f;
    }

    public final boolean p() {
        if (this.f25421a == null && this.f25422b == null && this.f25423c == null && this.f25424d == null && this.f25425e == null && this.f25426f == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Address(city=" + this.f25421a + ", country=" + this.f25422b + ", line1=" + this.f25423c + ", line2=" + this.f25424d + ", postalCode=" + this.f25425e + ", state=" + this.f25426f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f25421a);
        out.writeString(this.f25422b);
        out.writeString(this.f25423c);
        out.writeString(this.f25424d);
        out.writeString(this.f25425e);
        out.writeString(this.f25426f);
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5, (i8 & 32) != 0 ? null : str6);
    }
}
