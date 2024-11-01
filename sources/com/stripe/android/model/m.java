package com.stripe.android.model;

import R5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.browser.customtabs.CustomTabsCallback;
import g3.InterfaceC2900J;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class m implements InterfaceC2900J, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final c f25541a;

    /* renamed from: b, reason: collision with root package name */
    private static final a f25540b = new a(null);
    public static final Parcelable.Creator<m> CREATOR = new b();

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new m((c) parcel.readParcelable(m.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m[] newArray(int i8) {
            return new m[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class c implements InterfaceC2900J, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f25542a;

        /* loaded from: classes4.dex */
        public static final class a extends c {

            /* renamed from: b, reason: collision with root package name */
            private final String f25545b;

            /* renamed from: c, reason: collision with root package name */
            private final String f25546c;

            /* renamed from: d, reason: collision with root package name */
            private final boolean f25547d;

            /* renamed from: e, reason: collision with root package name */
            public static final C0510a f25543e = new C0510a(null);
            public static final Parcelable.Creator<a> CREATOR = new b();

            /* renamed from: f, reason: collision with root package name */
            private static final a f25544f = new a(null, null, true, 3, null);

            /* renamed from: com.stripe.android.model.m$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0510a {
                private C0510a() {
                }

                public final a a() {
                    return a.f25544f;
                }

                public /* synthetic */ C0510a(AbstractC3284p abstractC3284p) {
                    this();
                }
            }

            /* loaded from: classes4.dex */
            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new a(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public /* synthetic */ a(String str, String str2, boolean z8, int i8, AbstractC3284p abstractC3284p) {
                this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? false : z8);
            }

            @Override // g3.InterfaceC2900J
            public Map B() {
                if (this.f25547d) {
                    return Q.e(Q5.x.a("infer_from_client", Boolean.TRUE));
                }
                String str = this.f25545b;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                Q5.r a9 = Q5.x.a("ip_address", str);
                String str3 = this.f25546c;
                if (str3 != null) {
                    str2 = str3;
                }
                return Q.k(a9, Q5.x.a("user_agent", str2));
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
                return AbstractC3292y.d(this.f25545b, aVar.f25545b) && AbstractC3292y.d(this.f25546c, aVar.f25546c) && this.f25547d == aVar.f25547d;
            }

            public int hashCode() {
                String str = this.f25545b;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f25546c;
                return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + androidx.compose.foundation.a.a(this.f25547d);
            }

            public String toString() {
                return "Online(ipAddress=" + this.f25545b + ", userAgent=" + this.f25546c + ", inferFromClient=" + this.f25547d + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f25545b);
                out.writeString(this.f25546c);
                out.writeInt(this.f25547d ? 1 : 0);
            }

            public a(String str, String str2, boolean z8) {
                super(CustomTabsCallback.ONLINE_EXTRAS_KEY, null);
                this.f25545b = str;
                this.f25546c = str2;
                this.f25547d = z8;
            }
        }

        public /* synthetic */ c(String str, AbstractC3284p abstractC3284p) {
            this(str);
        }

        public final String a() {
            return this.f25542a;
        }

        private c(String str) {
            this.f25542a = str;
        }
    }

    public m(c type) {
        AbstractC3292y.i(type, "type");
        this.f25541a = type;
    }

    @Override // g3.InterfaceC2900J
    public Map B() {
        return Q.e(Q5.x.a("customer_acceptance", Q.k(Q5.x.a("type", this.f25541a.a()), Q5.x.a(this.f25541a.a(), this.f25541a.B()))));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && AbstractC3292y.d(this.f25541a, ((m) obj).f25541a);
    }

    public int hashCode() {
        return this.f25541a.hashCode();
    }

    public String toString() {
        return "MandateDataParams(type=" + this.f25541a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f25541a, i8);
    }
}
