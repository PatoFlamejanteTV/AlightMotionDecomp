package com.stripe.android.paymentsheet;

import R5.AbstractC1435t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.graphics.ColorKt;
import com.stripe.android.googlepaylauncher.j;
import g3.EnumC2906e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import o4.C3538l;
import r2.C3886a;
import w3.C4154a;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final f f27888b = new f(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f27889c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final y f27890a;

    /* loaded from: classes4.dex */
    public static final class e implements Parcelable {

        /* renamed from: m, reason: collision with root package name */
        private static final e f27923m;

        /* renamed from: n, reason: collision with root package name */
        private static final e f27924n;

        /* renamed from: a, reason: collision with root package name */
        private final int f27925a;

        /* renamed from: b, reason: collision with root package name */
        private final int f27926b;

        /* renamed from: c, reason: collision with root package name */
        private final int f27927c;

        /* renamed from: d, reason: collision with root package name */
        private final int f27928d;

        /* renamed from: e, reason: collision with root package name */
        private final int f27929e;

        /* renamed from: f, reason: collision with root package name */
        private final int f27930f;

        /* renamed from: g, reason: collision with root package name */
        private final int f27931g;

        /* renamed from: h, reason: collision with root package name */
        private final int f27932h;

        /* renamed from: i, reason: collision with root package name */
        private final int f27933i;

        /* renamed from: j, reason: collision with root package name */
        private final int f27934j;

        /* renamed from: k, reason: collision with root package name */
        private final int f27935k;

        /* renamed from: l, reason: collision with root package name */
        public static final a f27922l = new a(null);
        public static final Parcelable.Creator<e> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final e a() {
                return e.f27924n;
            }

            public final e b() {
                return e.f27923m;
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new e(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        static {
            C3538l c3538l = C3538l.f36005a;
            f27923m = new e(c3538l.c().g().m1155getPrimary0d7_KjU(), c3538l.c().g().m1159getSurface0d7_KjU(), c3538l.c().d(), c3538l.c().e(), c3538l.c().f(), c3538l.c().h(), c3538l.c().j(), c3538l.c().i(), c3538l.c().g().m1154getOnSurface0d7_KjU(), c3538l.c().c(), c3538l.c().g().m1149getError0d7_KjU(), null);
            f27924n = new e(c3538l.b().g().m1155getPrimary0d7_KjU(), c3538l.b().g().m1159getSurface0d7_KjU(), c3538l.b().d(), c3538l.b().e(), c3538l.b().f(), c3538l.b().h(), c3538l.b().j(), c3538l.b().i(), c3538l.b().g().m1154getOnSurface0d7_KjU(), c3538l.b().c(), c3538l.b().g().m1149getError0d7_KjU(), null);
        }

        public /* synthetic */ e(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, AbstractC3284p abstractC3284p) {
            this(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f27925a == eVar.f27925a && this.f27926b == eVar.f27926b && this.f27927c == eVar.f27927c && this.f27928d == eVar.f27928d && this.f27929e == eVar.f27929e && this.f27930f == eVar.f27930f && this.f27931g == eVar.f27931g && this.f27932h == eVar.f27932h && this.f27933i == eVar.f27933i && this.f27934j == eVar.f27934j && this.f27935k == eVar.f27935k;
        }

        public final int f() {
            return this.f27934j;
        }

        public final int h() {
            return this.f27927c;
        }

        public int hashCode() {
            return (((((((((((((((((((this.f27925a * 31) + this.f27926b) * 31) + this.f27927c) * 31) + this.f27928d) * 31) + this.f27929e) * 31) + this.f27930f) * 31) + this.f27931g) * 31) + this.f27932h) * 31) + this.f27933i) * 31) + this.f27934j) * 31) + this.f27935k;
        }

        public final int i() {
            return this.f27928d;
        }

        public final int l() {
            return this.f27929e;
        }

        public final int p() {
            return this.f27935k;
        }

        public final int s() {
            return this.f27930f;
        }

        public String toString() {
            return "Colors(primary=" + this.f27925a + ", surface=" + this.f27926b + ", component=" + this.f27927c + ", componentBorder=" + this.f27928d + ", componentDivider=" + this.f27929e + ", onComponent=" + this.f27930f + ", onSurface=" + this.f27931g + ", subtitle=" + this.f27932h + ", placeholderText=" + this.f27933i + ", appBarIcon=" + this.f27934j + ", error=" + this.f27935k + ")";
        }

        public final int u() {
            return this.f27931g;
        }

        public final int v() {
            return this.f27933i;
        }

        public final int w() {
            return this.f27925a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(this.f27925a);
            out.writeInt(this.f27926b);
            out.writeInt(this.f27927c);
            out.writeInt(this.f27928d);
            out.writeInt(this.f27929e);
            out.writeInt(this.f27930f);
            out.writeInt(this.f27931g);
            out.writeInt(this.f27932h);
            out.writeInt(this.f27933i);
            out.writeInt(this.f27934j);
            out.writeInt(this.f27935k);
        }

        public final int x() {
            return this.f27932h;
        }

        public final int y() {
            return this.f27926b;
        }

        public e(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f27925a = i8;
            this.f27926b = i9;
            this.f27927c = i10;
            this.f27928d = i11;
            this.f27929e = i12;
            this.f27930f = i13;
            this.f27931g = i14;
            this.f27932h = i15;
            this.f27933i = i16;
            this.f27934j = i17;
            this.f27935k = i18;
        }

        private e(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
            this(ColorKt.m3002toArgb8_81llA(j8), ColorKt.m3002toArgb8_81llA(j9), ColorKt.m3002toArgb8_81llA(j10), ColorKt.m3002toArgb8_81llA(j11), ColorKt.m3002toArgb8_81llA(j12), ColorKt.m3002toArgb8_81llA(j13), ColorKt.m3002toArgb8_81llA(j16), ColorKt.m3002toArgb8_81llA(j14), ColorKt.m3002toArgb8_81llA(j15), ColorKt.m3002toArgb8_81llA(j17), ColorKt.m3002toArgb8_81llA(j18));
        }
    }

    /* loaded from: classes4.dex */
    public static final class f {
        private f() {
        }

        public /* synthetic */ f(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface h extends Parcelable {

        /* loaded from: classes4.dex */
        public static final class a implements h {
            public static final Parcelable.Creator<a> CREATOR = new C0662a();

            /* renamed from: a, reason: collision with root package name */
            private final String f27954a;

            /* renamed from: b, reason: collision with root package name */
            private final String f27955b;

            /* renamed from: com.stripe.android.paymentsheet.w$h$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0662a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new a(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(String customerSessionClientSecret) {
                AbstractC3292y.i(customerSessionClientSecret, "customerSessionClientSecret");
                this.f27954a = customerSessionClientSecret;
                this.f27955b = "customer_session";
            }

            public final String H() {
                return this.f27954a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC3292y.d(this.f27954a, ((a) obj).f27954a);
            }

            @Override // com.stripe.android.paymentsheet.w.h
            public String g() {
                return this.f27955b;
            }

            public int hashCode() {
                return this.f27954a.hashCode();
            }

            public String toString() {
                return "CustomerSession(customerSessionClientSecret=" + this.f27954a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f27954a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements h {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f27956a;

            /* renamed from: b, reason: collision with root package name */
            private final String f27957b;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new b(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            public b(String ephemeralKeySecret) {
                AbstractC3292y.i(ephemeralKeySecret, "ephemeralKeySecret");
                this.f27956a = ephemeralKeySecret;
                this.f27957b = "legacy";
            }

            public final String a() {
                return this.f27956a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC3292y.d(this.f27956a, ((b) obj).f27956a);
            }

            @Override // com.stripe.android.paymentsheet.w.h
            public String g() {
                return this.f27957b;
            }

            public int hashCode() {
                return this.f27956a.hashCode();
            }

            public String toString() {
                return "LegacyCustomerEphemeralKey(ephemeralKeySecret=" + this.f27956a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f27956a);
            }
        }

        String g();
    }

    /* loaded from: classes4.dex */
    public static final class i implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f27960a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27961b;

        /* renamed from: c, reason: collision with root package name */
        private final h f27962c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f27958d = new a(null);

        /* renamed from: e, reason: collision with root package name */
        public static final int f27959e = 8;
        public static final Parcelable.Creator<i> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
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
            public final i createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new i(parcel.readString(), parcel.readString(), (h) parcel.readParcelable(i.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final i[] newArray(int i8) {
                return new i[i8];
            }
        }

        public i(String id, String ephemeralKeySecret, h accessType) {
            AbstractC3292y.i(id, "id");
            AbstractC3292y.i(ephemeralKeySecret, "ephemeralKeySecret");
            AbstractC3292y.i(accessType, "accessType");
            this.f27960a = id;
            this.f27961b = ephemeralKeySecret;
            this.f27962c = accessType;
        }

        public final h a() {
            return this.f27962c;
        }

        public final String b() {
            return this.f27961b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return AbstractC3292y.d(this.f27960a, iVar.f27960a) && AbstractC3292y.d(this.f27961b, iVar.f27961b) && AbstractC3292y.d(this.f27962c, iVar.f27962c);
        }

        public final String getId() {
            return this.f27960a;
        }

        public int hashCode() {
            return (((this.f27960a.hashCode() * 31) + this.f27961b.hashCode()) * 31) + this.f27962c.hashCode();
        }

        public String toString() {
            return "CustomerConfiguration(id=" + this.f27960a + ", ephemeralKeySecret=" + this.f27961b + ", accessType=" + this.f27962c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f27960a);
            out.writeString(this.f27961b);
            out.writeParcelable(this.f27962c, i8);
        }
    }

    /* loaded from: classes4.dex */
    public interface j {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27963a = a.f27964a;

        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f27964a = new a();

            /* renamed from: b, reason: collision with root package name */
            private static com.stripe.android.paymentsheet.i f27965b;

            private a() {
            }

            public final void a(com.stripe.android.paymentsheet.i iVar) {
                f27965b = iVar;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        private final c f27966a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27967b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27968c;

        /* renamed from: d, reason: collision with root package name */
        private final Long f27969d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27970e;

        /* renamed from: f, reason: collision with root package name */
        private final a f27971f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f27972a = new a("Buy", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final a f27973b = new a("Book", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final a f27974c = new a("Checkout", 2);

            /* renamed from: d, reason: collision with root package name */
            public static final a f27975d = new a("Donate", 3);

            /* renamed from: e, reason: collision with root package name */
            public static final a f27976e = new a("Order", 4);

            /* renamed from: f, reason: collision with root package name */
            public static final a f27977f = new a("Pay", 5);

            /* renamed from: g, reason: collision with root package name */
            public static final a f27978g = new a("Subscribe", 6);

            /* renamed from: h, reason: collision with root package name */
            public static final a f27979h = new a("Plain", 7);

            /* renamed from: i, reason: collision with root package name */
            private static final /* synthetic */ a[] f27980i;

            /* renamed from: j, reason: collision with root package name */
            private static final /* synthetic */ W5.a f27981j;

            static {
                a[] a9 = a();
                f27980i = a9;
                f27981j = W5.b.a(a9);
            }

            private a(String str, int i8) {
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f27972a, f27973b, f27974c, f27975d, f27976e, f27977f, f27978g, f27979h};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f27980i.clone();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new k(c.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final k[] newArray(int i8) {
                return new k[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            public static final c f27982a = new c("Production", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final c f27983b = new c("Test", 1);

            /* renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ c[] f27984c;

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ W5.a f27985d;

            static {
                c[] a9 = a();
                f27984c = a9;
                f27985d = W5.b.a(a9);
            }

            private c(String str, int i8) {
            }

            private static final /* synthetic */ c[] a() {
                return new c[]{f27982a, f27983b};
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f27984c.clone();
            }
        }

        public k(c environment, String countryCode, String str, Long l8, String str2, a buttonType) {
            AbstractC3292y.i(environment, "environment");
            AbstractC3292y.i(countryCode, "countryCode");
            AbstractC3292y.i(buttonType, "buttonType");
            this.f27966a = environment;
            this.f27967b = countryCode;
            this.f27968c = str;
            this.f27969d = l8;
            this.f27970e = str2;
            this.f27971f = buttonType;
        }

        public final Long a() {
            return this.f27969d;
        }

        public final a b() {
            return this.f27971f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f27966a == kVar.f27966a && AbstractC3292y.d(this.f27967b, kVar.f27967b) && AbstractC3292y.d(this.f27968c, kVar.f27968c) && AbstractC3292y.d(this.f27969d, kVar.f27969d) && AbstractC3292y.d(this.f27970e, kVar.f27970e) && this.f27971f == kVar.f27971f;
        }

        public final String f() {
            return this.f27968c;
        }

        public final c h() {
            return this.f27966a;
        }

        public int hashCode() {
            int hashCode = ((this.f27966a.hashCode() * 31) + this.f27967b.hashCode()) * 31;
            String str = this.f27968c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l8 = this.f27969d;
            int hashCode3 = (hashCode2 + (l8 == null ? 0 : l8.hashCode())) * 31;
            String str2 = this.f27970e;
            return ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f27971f.hashCode();
        }

        public final String i() {
            return this.f27970e;
        }

        public final String m() {
            return this.f27967b;
        }

        public String toString() {
            return "GooglePayConfiguration(environment=" + this.f27966a + ", countryCode=" + this.f27967b + ", currencyCode=" + this.f27968c + ", amount=" + this.f27969d + ", label=" + this.f27970e + ", buttonType=" + this.f27971f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f27966a.name());
            out.writeString(this.f27967b);
            out.writeString(this.f27968c);
            Long l8 = this.f27969d;
            if (l8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeLong(l8.longValue());
            }
            out.writeString(this.f27970e);
            out.writeString(this.f27971f.name());
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class l implements Parcelable {

        /* loaded from: classes4.dex */
        public static final class a extends l {
            public static final Parcelable.Creator<a> CREATOR = new C0663a();

            /* renamed from: a, reason: collision with root package name */
            private final m f27986a;

            /* renamed from: com.stripe.android.paymentsheet.w$l$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0663a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new a(m.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m intentConfiguration) {
                super(null);
                AbstractC3292y.i(intentConfiguration, "intentConfiguration");
                this.f27986a = intentConfiguration;
            }

            @Override // com.stripe.android.paymentsheet.w.l
            public void a() {
            }

            public final m b() {
                return this.f27986a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC3292y.d(this.f27986a, ((a) obj).f27986a);
            }

            public int hashCode() {
                return this.f27986a.hashCode();
            }

            public String toString() {
                return "DeferredIntent(intentConfiguration=" + this.f27986a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                this.f27986a.writeToParcel(out, i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends l {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f27987a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new b(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String clientSecret) {
                super(null);
                AbstractC3292y.i(clientSecret, "clientSecret");
                this.f27987a = clientSecret;
            }

            @Override // com.stripe.android.paymentsheet.w.l
            public void a() {
                new D3.e(this.f27987a).b();
            }

            public final String d() {
                return this.f27987a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC3292y.d(this.f27987a, ((b) obj).f27987a);
            }

            public int hashCode() {
                return this.f27987a.hashCode();
            }

            public String toString() {
                return "PaymentIntent(clientSecret=" + this.f27987a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f27987a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends l {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f27988a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new c(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String clientSecret) {
                super(null);
                AbstractC3292y.i(clientSecret, "clientSecret");
                this.f27988a = clientSecret;
            }

            @Override // com.stripe.android.paymentsheet.w.l
            public void a() {
                new D3.k(this.f27988a).b();
            }

            public final String d() {
                return this.f27988a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC3292y.d(this.f27988a, ((c) obj).f27988a);
            }

            public int hashCode() {
                return this.f27988a.hashCode();
            }

            public String toString() {
                return "SetupIntent(clientSecret=" + this.f27988a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f27988a);
            }
        }

        private l() {
        }

        public abstract void a();

        public /* synthetic */ l(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28011a;

        /* renamed from: b, reason: collision with root package name */
        private static final n f28012b;

        /* renamed from: c, reason: collision with root package name */
        public static final n f28013c;

        /* renamed from: d, reason: collision with root package name */
        public static final n f28014d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ n[] f28015e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ W5.a f28016f;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final n a() {
                return n.f28012b;
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        static {
            n nVar = new n("Horizontal", 0);
            f28013c = nVar;
            f28014d = new n("Vertical", 1);
            n[] a9 = a();
            f28015e = a9;
            f28016f = W5.b.a(a9);
            f28011a = new a(null);
            f28012b = nVar;
        }

        private n(String str, int i8) {
        }

        private static final /* synthetic */ n[] a() {
            return new n[]{f28013c, f28014d};
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f28015e.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class p implements Parcelable {

        /* renamed from: g, reason: collision with root package name */
        private static final p f28022g;

        /* renamed from: h, reason: collision with root package name */
        private static final p f28023h;

        /* renamed from: a, reason: collision with root package name */
        private final Integer f28024a;

        /* renamed from: b, reason: collision with root package name */
        private final int f28025b;

        /* renamed from: c, reason: collision with root package name */
        private final int f28026c;

        /* renamed from: d, reason: collision with root package name */
        private final int f28027d;

        /* renamed from: e, reason: collision with root package name */
        private final int f28028e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f28021f = new a(null);
        public static final Parcelable.Creator<p> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final p a() {
                return p.f28023h;
            }

            public final p b() {
                return p.f28022g;
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new p(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final p[] newArray(int i8) {
                return new p[i8];
            }
        }

        static {
            C3538l c3538l = C3538l.f36005a;
            f28022g = new p(null, ColorKt.m3002toArgb8_81llA(c3538l.d().c().c()), ColorKt.m3002toArgb8_81llA(c3538l.d().c().b()), ColorKt.m3002toArgb8_81llA(c3538l.d().c().e()), ColorKt.m3002toArgb8_81llA(c3538l.d().c().c()));
            f28023h = new p(null, ColorKt.m3002toArgb8_81llA(c3538l.d().b().c()), ColorKt.m3002toArgb8_81llA(c3538l.d().b().b()), ColorKt.m3002toArgb8_81llA(c3538l.d().b().e()), ColorKt.m3002toArgb8_81llA(c3538l.d().b().c()));
        }

        public p(Integer num, int i8, int i9, int i10, int i11) {
            this.f28024a = num;
            this.f28025b = i8;
            this.f28026c = i9;
            this.f28027d = i10;
            this.f28028e = i11;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return AbstractC3292y.d(this.f28024a, pVar.f28024a) && this.f28025b == pVar.f28025b && this.f28026c == pVar.f28026c && this.f28027d == pVar.f28027d && this.f28028e == pVar.f28028e;
        }

        public final Integer f() {
            return this.f28024a;
        }

        public final int h() {
            return this.f28026c;
        }

        public int hashCode() {
            Integer num = this.f28024a;
            return ((((((((num == null ? 0 : num.hashCode()) * 31) + this.f28025b) * 31) + this.f28026c) * 31) + this.f28027d) * 31) + this.f28028e;
        }

        public final int i() {
            return this.f28025b;
        }

        public final int l() {
            return this.f28028e;
        }

        public final int p() {
            return this.f28027d;
        }

        public String toString() {
            return "PrimaryButtonColors(background=" + this.f28024a + ", onBackground=" + this.f28025b + ", border=" + this.f28026c + ", successBackgroundColor=" + this.f28027d + ", onSuccessBackgroundColor=" + this.f28028e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3292y.i(out, "out");
            Integer num = this.f28024a;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeInt(this.f28025b);
            out.writeInt(this.f28026c);
            out.writeInt(this.f28027d);
            out.writeInt(this.f28028e);
        }
    }

    /* loaded from: classes4.dex */
    public static final class s implements Parcelable {

        /* renamed from: d, reason: collision with root package name */
        private static final s f28034d;

        /* renamed from: a, reason: collision with root package name */
        private final float f28035a;

        /* renamed from: b, reason: collision with root package name */
        private final float f28036b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f28033c = new a(null);
        public static final Parcelable.Creator<s> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final s a() {
                return s.f28034d;
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final s createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new s(parcel.readFloat(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final s[] newArray(int i8) {
                return new s[i8];
            }
        }

        static {
            C3538l c3538l = C3538l.f36005a;
            f28034d = new s(c3538l.e().e(), c3538l.e().c());
        }

        public s(float f8, float f9) {
            this.f28035a = f8;
            this.f28036b = f9;
        }

        public final float b() {
            return this.f28036b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return Float.compare(this.f28035a, sVar.f28035a) == 0 && Float.compare(this.f28036b, sVar.f28036b) == 0;
        }

        public final float f() {
            return this.f28035a;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f28035a) * 31) + Float.floatToIntBits(this.f28036b);
        }

        public String toString() {
            return "Shapes(cornerRadiusDp=" + this.f28035a + ", borderStrokeWidthDp=" + this.f28036b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeFloat(this.f28035a);
            out.writeFloat(this.f28036b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class t implements Parcelable {

        /* renamed from: d, reason: collision with root package name */
        private static final t f28038d;

        /* renamed from: a, reason: collision with root package name */
        private final float f28039a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f28040b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f28037c = new a(null);
        public static final Parcelable.Creator<t> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final t a() {
                return t.f28038d;
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final t createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new t(parcel.readFloat(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final t[] newArray(int i8) {
                return new t[i8];
            }
        }

        static {
            C3538l c3538l = C3538l.f36005a;
            f28038d = new t(c3538l.f().g(), c3538l.f().f());
        }

        public t(float f8, Integer num) {
            this.f28039a = f8;
            this.f28040b = num;
        }

        public final Integer b() {
            return this.f28040b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return Float.compare(this.f28039a, tVar.f28039a) == 0 && AbstractC3292y.d(this.f28040b, tVar.f28040b);
        }

        public final float f() {
            return this.f28039a;
        }

        public int hashCode() {
            int hashCode;
            int floatToIntBits = Float.floatToIntBits(this.f28039a) * 31;
            Integer num = this.f28040b;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            return floatToIntBits + hashCode;
        }

        public String toString() {
            return "Typography(sizeScaleFactor=" + this.f28039a + ", fontResId=" + this.f28040b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3292y.i(out, "out");
            out.writeFloat(this.f28039a);
            Integer num = this.f28040b;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
        }
    }

    public w(y paymentSheetLauncher) {
        AbstractC3292y.i(paymentSheetLauncher, "paymentSheetLauncher");
        this.f27890a = paymentSheetLauncher;
    }

    public final void a(String paymentIntentClientSecret, g gVar) {
        AbstractC3292y.i(paymentIntentClientSecret, "paymentIntentClientSecret");
        this.f27890a.a(new l.b(paymentIntentClientSecret), gVar);
    }

    /* loaded from: classes4.dex */
    public static final class q implements Parcelable {
        public static final Parcelable.Creator<q> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Float f28029a;

        /* renamed from: b, reason: collision with root package name */
        private final Float f28030b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final q createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new q(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final q[] newArray(int i8) {
                return new q[i8];
            }
        }

        public q(Float f8, Float f9) {
            this.f28029a = f8;
            this.f28030b = f9;
        }

        public final Float a() {
            return this.f28030b;
        }

        public final Float b() {
            return this.f28029a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return AbstractC3292y.d(this.f28029a, qVar.f28029a) && AbstractC3292y.d(this.f28030b, qVar.f28030b);
        }

        public int hashCode() {
            Float f8 = this.f28029a;
            int hashCode = (f8 == null ? 0 : f8.hashCode()) * 31;
            Float f9 = this.f28030b;
            return hashCode + (f9 != null ? f9.hashCode() : 0);
        }

        public String toString() {
            return "PrimaryButtonShape(cornerRadiusDp=" + this.f28029a + ", borderStrokeWidthDp=" + this.f28030b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            Float f8 = this.f28029a;
            if (f8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeFloat(f8.floatValue());
            }
            Float f9 = this.f28030b;
            if (f9 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeFloat(f9.floatValue());
            }
        }

        public /* synthetic */ q(Float f8, Float f9, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? null : f8, (i8 & 2) != 0 ? null : f9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class r implements Parcelable {
        public static final Parcelable.Creator<r> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Integer f28031a;

        /* renamed from: b, reason: collision with root package name */
        private final Float f28032b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new r(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final r[] newArray(int i8) {
                return new r[i8];
            }
        }

        public r(Integer num, Float f8) {
            this.f28031a = num;
            this.f28032b = f8;
        }

        public final Integer a() {
            return this.f28031a;
        }

        public final Float b() {
            return this.f28032b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return AbstractC3292y.d(this.f28031a, rVar.f28031a) && AbstractC3292y.d(this.f28032b, rVar.f28032b);
        }

        public int hashCode() {
            Integer num = this.f28031a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Float f8 = this.f28032b;
            return hashCode + (f8 != null ? f8.hashCode() : 0);
        }

        public String toString() {
            return "PrimaryButtonTypography(fontResId=" + this.f28031a + ", fontSizeSp=" + this.f28032b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            Integer num = this.f28031a;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Float f8 = this.f28032b;
            if (f8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeFloat(f8.floatValue());
            }
        }

        public /* synthetic */ r(Integer num, Float f8, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? null : num, (i8 & 2) != 0 ? null : f8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(ComponentActivity activity, v3.p callback) {
        this(new C2635b(activity, callback));
        AbstractC3292y.i(activity, "activity");
        AbstractC3292y.i(callback, "callback");
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final a f27902a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27903b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27904c;

        /* renamed from: d, reason: collision with root package name */
        private final String f27905d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c(parcel.readInt() == 0 ? null : a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(a aVar, String str, String str2, String str3) {
            this.f27902a = aVar;
            this.f27903b = str;
            this.f27904c = str2;
            this.f27905d = str3;
        }

        public final a a() {
            return this.f27902a;
        }

        public final String b() {
            return this.f27903b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3292y.d(this.f27902a, cVar.f27902a) && AbstractC3292y.d(this.f27903b, cVar.f27903b) && AbstractC3292y.d(this.f27904c, cVar.f27904c) && AbstractC3292y.d(this.f27905d, cVar.f27905d);
        }

        public final String f() {
            return this.f27904c;
        }

        public final String h() {
            return this.f27905d;
        }

        public int hashCode() {
            a aVar = this.f27902a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            String str = this.f27903b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f27904c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f27905d;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean i() {
            if (this.f27902a == null && this.f27903b == null && this.f27904c == null && this.f27905d == null) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "BillingDetails(address=" + this.f27902a + ", email=" + this.f27903b + ", name=" + this.f27904c + ", phone=" + this.f27905d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            a aVar = this.f27902a;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f27903b);
            out.writeString(this.f27904c);
            out.writeString(this.f27905d);
        }

        public /* synthetic */ c(a aVar, String str, String str2, String str3, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? null : aVar, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3);
        }
    }

    /* loaded from: classes4.dex */
    public static final class o implements Parcelable {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final p f28017a;

        /* renamed from: b, reason: collision with root package name */
        private final p f28018b;

        /* renamed from: c, reason: collision with root package name */
        private final q f28019c;

        /* renamed from: d, reason: collision with root package name */
        private final r f28020d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                Parcelable.Creator<p> creator = p.CREATOR;
                return new o(creator.createFromParcel(parcel), creator.createFromParcel(parcel), q.CREATOR.createFromParcel(parcel), r.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final o[] newArray(int i8) {
                return new o[i8];
            }
        }

        public o(p colorsLight, p colorsDark, q shape, r typography) {
            AbstractC3292y.i(colorsLight, "colorsLight");
            AbstractC3292y.i(colorsDark, "colorsDark");
            AbstractC3292y.i(shape, "shape");
            AbstractC3292y.i(typography, "typography");
            this.f28017a = colorsLight;
            this.f28018b = colorsDark;
            this.f28019c = shape;
            this.f28020d = typography;
        }

        public final p a() {
            return this.f28018b;
        }

        public final p b() {
            return this.f28017a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return AbstractC3292y.d(this.f28017a, oVar.f28017a) && AbstractC3292y.d(this.f28018b, oVar.f28018b) && AbstractC3292y.d(this.f28019c, oVar.f28019c) && AbstractC3292y.d(this.f28020d, oVar.f28020d);
        }

        public final q f() {
            return this.f28019c;
        }

        public final r h() {
            return this.f28020d;
        }

        public int hashCode() {
            return (((((this.f28017a.hashCode() * 31) + this.f28018b.hashCode()) * 31) + this.f28019c.hashCode()) * 31) + this.f28020d.hashCode();
        }

        public String toString() {
            return "PrimaryButton(colorsLight=" + this.f28017a + ", colorsDark=" + this.f28018b + ", shape=" + this.f28019c + ", typography=" + this.f28020d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            this.f28017a.writeToParcel(out, i8);
            this.f28018b.writeToParcel(out, i8);
            this.f28019c.writeToParcel(out, i8);
            this.f28020d.writeToParcel(out, i8);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ o(com.stripe.android.paymentsheet.w.p r3, com.stripe.android.paymentsheet.w.p r4, com.stripe.android.paymentsheet.w.q r5, com.stripe.android.paymentsheet.w.r r6, int r7, kotlin.jvm.internal.AbstractC3284p r8) {
            /*
                r2 = this;
                r8 = r7 & 1
                if (r8 == 0) goto La
                com.stripe.android.paymentsheet.w$p$a r3 = com.stripe.android.paymentsheet.w.p.f28021f
                com.stripe.android.paymentsheet.w$p r3 = r3.b()
            La:
                r8 = r7 & 2
                if (r8 == 0) goto L14
                com.stripe.android.paymentsheet.w$p$a r4 = com.stripe.android.paymentsheet.w.p.f28021f
                com.stripe.android.paymentsheet.w$p r4 = r4.a()
            L14:
                r8 = r7 & 4
                r0 = 3
                r1 = 0
                if (r8 == 0) goto L1f
                com.stripe.android.paymentsheet.w$q r5 = new com.stripe.android.paymentsheet.w$q
                r5.<init>(r1, r1, r0, r1)
            L1f:
                r7 = r7 & 8
                if (r7 == 0) goto L28
                com.stripe.android.paymentsheet.w$r r6 = new com.stripe.android.paymentsheet.w$r
                r6.<init>(r1, r1, r0, r1)
            L28:
                r2.<init>(r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.w.o.<init>(com.stripe.android.paymentsheet.w$p, com.stripe.android.paymentsheet.w$p, com.stripe.android.paymentsheet.w$q, com.stripe.android.paymentsheet.w$r, int, kotlin.jvm.internal.p):void");
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final e f27897a;

        /* renamed from: b, reason: collision with root package name */
        private final e f27898b;

        /* renamed from: c, reason: collision with root package name */
        private final s f27899c;

        /* renamed from: d, reason: collision with root package name */
        private final t f27900d;

        /* renamed from: e, reason: collision with root package name */
        private final o f27901e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                Parcelable.Creator<e> creator = e.CREATOR;
                return new b(creator.createFromParcel(parcel), creator.createFromParcel(parcel), s.CREATOR.createFromParcel(parcel), t.CREATOR.createFromParcel(parcel), o.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(e colorsLight, e colorsDark, s shapes, t typography, o primaryButton) {
            AbstractC3292y.i(colorsLight, "colorsLight");
            AbstractC3292y.i(colorsDark, "colorsDark");
            AbstractC3292y.i(shapes, "shapes");
            AbstractC3292y.i(typography, "typography");
            AbstractC3292y.i(primaryButton, "primaryButton");
            this.f27897a = colorsLight;
            this.f27898b = colorsDark;
            this.f27899c = shapes;
            this.f27900d = typography;
            this.f27901e = primaryButton;
        }

        public final e a() {
            return this.f27898b;
        }

        public final e b() {
            return this.f27897a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3292y.d(this.f27897a, bVar.f27897a) && AbstractC3292y.d(this.f27898b, bVar.f27898b) && AbstractC3292y.d(this.f27899c, bVar.f27899c) && AbstractC3292y.d(this.f27900d, bVar.f27900d) && AbstractC3292y.d(this.f27901e, bVar.f27901e);
        }

        public final o f() {
            return this.f27901e;
        }

        public final s h() {
            return this.f27899c;
        }

        public int hashCode() {
            return (((((((this.f27897a.hashCode() * 31) + this.f27898b.hashCode()) * 31) + this.f27899c.hashCode()) * 31) + this.f27900d.hashCode()) * 31) + this.f27901e.hashCode();
        }

        public final t i() {
            return this.f27900d;
        }

        public String toString() {
            return "Appearance(colorsLight=" + this.f27897a + ", colorsDark=" + this.f27898b + ", shapes=" + this.f27899c + ", typography=" + this.f27900d + ", primaryButton=" + this.f27901e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            this.f27897a.writeToParcel(out, i8);
            this.f27898b.writeToParcel(out, i8);
            this.f27899c.writeToParcel(out, i8);
            this.f27900d.writeToParcel(out, i8);
            this.f27901e.writeToParcel(out, i8);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b() {
            /*
                r13 = this;
                com.stripe.android.paymentsheet.w$e$a r0 = com.stripe.android.paymentsheet.w.e.f27922l
                com.stripe.android.paymentsheet.w$e r2 = r0.b()
                com.stripe.android.paymentsheet.w$e r3 = r0.a()
                com.stripe.android.paymentsheet.w$s$a r0 = com.stripe.android.paymentsheet.w.s.f28033c
                com.stripe.android.paymentsheet.w$s r4 = r0.a()
                com.stripe.android.paymentsheet.w$t$a r0 = com.stripe.android.paymentsheet.w.t.f28037c
                com.stripe.android.paymentsheet.w$t r5 = r0.a()
                com.stripe.android.paymentsheet.w$o r0 = new com.stripe.android.paymentsheet.w$o
                r11 = 15
                r12 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r6 = r0
                r6.<init>(r7, r8, r9, r10, r11, r12)
                r1 = r13
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.w.b.<init>():void");
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new c();

        /* renamed from: a, reason: collision with root package name */
        private final b f27906a;

        /* renamed from: b, reason: collision with root package name */
        private final b f27907b;

        /* renamed from: c, reason: collision with root package name */
        private final b f27908c;

        /* renamed from: d, reason: collision with root package name */
        private final a f27909d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f27910e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f27911a = new a("Automatic", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final a f27912b = new a("Never", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final a f27913c = new a("Full", 2);

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ a[] f27914d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ W5.a f27915e;

            static {
                a[] a9 = a();
                f27914d = a9;
                f27915e = W5.b.a(a9);
            }

            private a(String str, int i8) {
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f27911a, f27912b, f27913c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f27914d.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public static final b f27916a = new b("Automatic", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final b f27917b = new b("Never", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final b f27918c = new b("Always", 2);

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ b[] f27919d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ W5.a f27920e;

            static {
                b[] a9 = a();
                f27919d = a9;
                f27920e = W5.b.a(a9);
            }

            private b(String str, int i8) {
            }

            private static final /* synthetic */ b[] a() {
                return new b[]{f27916a, f27917b, f27918c};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f27919d.clone();
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d(b.valueOf(parcel.readString()), b.valueOf(parcel.readString()), b.valueOf(parcel.readString()), a.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* renamed from: com.stripe.android.paymentsheet.w$d$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0661d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f27921a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.f27912b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.f27911a.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.f27913c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f27921a = iArr;
            }
        }

        public d(b name, b phone, b email, a address, boolean z8) {
            AbstractC3292y.i(name, "name");
            AbstractC3292y.i(phone, "phone");
            AbstractC3292y.i(email, "email");
            AbstractC3292y.i(address, "address");
            this.f27906a = name;
            this.f27907b = phone;
            this.f27908c = email;
            this.f27909d = address;
            this.f27910e = z8;
        }

        public final a a() {
            return this.f27909d;
        }

        public final boolean b() {
            return this.f27910e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f27906a == dVar.f27906a && this.f27907b == dVar.f27907b && this.f27908c == dVar.f27908c && this.f27909d == dVar.f27909d && this.f27910e == dVar.f27910e;
        }

        public final boolean f() {
            b bVar = this.f27906a;
            b bVar2 = b.f27918c;
            if (bVar != bVar2 && this.f27907b != bVar2 && this.f27908c != bVar2 && this.f27909d != a.f27913c) {
                return false;
            }
            return true;
        }

        public final boolean h() {
            if (this.f27908c == b.f27918c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f27906a.hashCode() * 31) + this.f27907b.hashCode()) * 31) + this.f27908c.hashCode()) * 31) + this.f27909d.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f27910e);
        }

        public final boolean i() {
            if (this.f27906a == b.f27918c) {
                return true;
            }
            return false;
        }

        public final boolean l() {
            if (this.f27907b == b.f27918c) {
                return true;
            }
            return false;
        }

        public final b p() {
            return this.f27908c;
        }

        public final b s() {
            return this.f27906a;
        }

        public String toString() {
            return "BillingDetailsCollectionConfiguration(name=" + this.f27906a + ", phone=" + this.f27907b + ", email=" + this.f27908c + ", address=" + this.f27909d + ", attachDefaultsToPaymentMethod=" + this.f27910e + ")";
        }

        public final b u() {
            return this.f27907b;
        }

        public final j.b v() {
            boolean z8;
            boolean z9;
            j.b.EnumC0474b enumC0474b;
            a aVar = this.f27909d;
            boolean z10 = false;
            if (aVar == a.f27913c) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (this.f27907b == b.f27918c) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i8 = C0661d.f27921a[aVar.ordinal()];
            if (i8 != 1 && i8 != 2) {
                if (i8 == 3) {
                    enumC0474b = j.b.EnumC0474b.f25149c;
                } else {
                    throw new Q5.p();
                }
            } else {
                enumC0474b = j.b.EnumC0474b.f25148b;
            }
            if (z8 || z9) {
                z10 = true;
            }
            return new j.b(z10, enumC0474b, z9);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f27906a.name());
            out.writeString(this.f27907b.name());
            out.writeString(this.f27908c.name());
            out.writeString(this.f27909d.name());
            out.writeInt(this.f27910e ? 1 : 0);
        }

        public /* synthetic */ d(b bVar, b bVar2, b bVar3, a aVar, boolean z8, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? b.f27916a : bVar, (i8 & 2) != 0 ? b.f27916a : bVar2, (i8 & 4) != 0 ? b.f27916a : bVar3, (i8 & 8) != 0 ? a.f27911a : aVar, (i8 & 16) != 0 ? false : z8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final d f27991a;

        /* renamed from: b, reason: collision with root package name */
        private final List f27992b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27993c;

        /* renamed from: d, reason: collision with root package name */
        private final String f27994d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f27995e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f27989f = new b(null);

        /* renamed from: g, reason: collision with root package name */
        public static final int f27990g = 8;
        public static final Parcelable.Creator<m> CREATOR = new c();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f27996a = new a("Automatic", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final a f27997b = new a("AutomaticAsync", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final a f27998c = new a("Manual", 2);

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ a[] f27999d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ W5.a f28000e;

            static {
                a[] a9 = a();
                f27999d = a9;
                f28000e = W5.b.a(a9);
            }

            private a(String str, int i8) {
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f27996a, f27997b, f27998c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f27999d.clone();
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
            public final m createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new m((d) parcel.readParcelable(m.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final m[] newArray(int i8) {
                return new m[i8];
            }
        }

        /* loaded from: classes4.dex */
        public static abstract class d implements Parcelable {

            /* loaded from: classes4.dex */
            public static final class a extends d {
                public static final Parcelable.Creator<a> CREATOR = new C0664a();

                /* renamed from: a, reason: collision with root package name */
                private final long f28001a;

                /* renamed from: b, reason: collision with root package name */
                private final String f28002b;

                /* renamed from: c, reason: collision with root package name */
                private final e f28003c;

                /* renamed from: d, reason: collision with root package name */
                private final a f28004d;

                /* renamed from: com.stripe.android.paymentsheet.w$m$d$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0664a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final a createFromParcel(Parcel parcel) {
                        AbstractC3292y.i(parcel, "parcel");
                        return new a(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : e.valueOf(parcel.readString()), a.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final a[] newArray(int i8) {
                        return new a[i8];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(long j8, String currency, e eVar, a captureMethod) {
                    super(null);
                    AbstractC3292y.i(currency, "currency");
                    AbstractC3292y.i(captureMethod, "captureMethod");
                    this.f28001a = j8;
                    this.f28002b = currency;
                    this.f28003c = eVar;
                    this.f28004d = captureMethod;
                }

                public final String L() {
                    return this.f28002b;
                }

                @Override // com.stripe.android.paymentsheet.w.m.d
                public e a() {
                    return this.f28003c;
                }

                public final long b() {
                    return this.f28001a;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public a f() {
                    return this.f28004d;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3292y.i(out, "out");
                    out.writeLong(this.f28001a);
                    out.writeString(this.f28002b);
                    e eVar = this.f28003c;
                    if (eVar == null) {
                        out.writeInt(0);
                    } else {
                        out.writeInt(1);
                        out.writeString(eVar.name());
                    }
                    out.writeString(this.f28004d.name());
                }
            }

            private d() {
            }

            public abstract e a();

            /* loaded from: classes4.dex */
            public static final class b extends d {
                public static final Parcelable.Creator<b> CREATOR = new a();

                /* renamed from: a, reason: collision with root package name */
                private final String f28005a;

                /* renamed from: b, reason: collision with root package name */
                private final e f28006b;

                /* loaded from: classes4.dex */
                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final b createFromParcel(Parcel parcel) {
                        AbstractC3292y.i(parcel, "parcel");
                        return new b(parcel.readString(), e.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final b[] newArray(int i8) {
                        return new b[i8];
                    }
                }

                public /* synthetic */ b(String str, e eVar, int i8, AbstractC3284p abstractC3284p) {
                    this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? e.f28008b : eVar);
                }

                public final String L() {
                    return this.f28005a;
                }

                @Override // com.stripe.android.paymentsheet.w.m.d
                public e a() {
                    return this.f28006b;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3292y.i(out, "out");
                    out.writeString(this.f28005a);
                    out.writeString(this.f28006b.name());
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(String str, e setupFutureUse) {
                    super(null);
                    AbstractC3292y.i(setupFutureUse, "setupFutureUse");
                    this.f28005a = str;
                    this.f28006b = setupFutureUse;
                }
            }

            public /* synthetic */ d(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class e {

            /* renamed from: a, reason: collision with root package name */
            public static final e f28007a = new e("OnSession", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final e f28008b = new e("OffSession", 1);

            /* renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ e[] f28009c;

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ W5.a f28010d;

            static {
                e[] a9 = a();
                f28009c = a9;
                f28010d = W5.b.a(a9);
            }

            private e(String str, int i8) {
            }

            private static final /* synthetic */ e[] a() {
                return new e[]{f28007a, f28008b};
            }

            public static e valueOf(String str) {
                return (e) Enum.valueOf(e.class, str);
            }

            public static e[] values() {
                return (e[]) f28009c.clone();
            }
        }

        public m(d mode, List paymentMethodTypes, String str, String str2, boolean z8) {
            AbstractC3292y.i(mode, "mode");
            AbstractC3292y.i(paymentMethodTypes, "paymentMethodTypes");
            this.f27991a = mode;
            this.f27992b = paymentMethodTypes;
            this.f27993c = str;
            this.f27994d = str2;
            this.f27995e = z8;
        }

        public final d a() {
            return this.f27991a;
        }

        public final String b() {
            return this.f27994d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final List e() {
            return this.f27992b;
        }

        public final String f() {
            return this.f27993c;
        }

        public final boolean h() {
            return this.f27995e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f27991a, i8);
            out.writeStringList(this.f27992b);
            out.writeString(this.f27993c);
            out.writeString(this.f27994d);
            out.writeInt(this.f27995e ? 1 : 0);
        }

        public /* synthetic */ m(d dVar, List list, String str, String str2, boolean z8, int i8, AbstractC3284p abstractC3284p) {
            this(dVar, (i8 & 2) != 0 ? AbstractC1435t.m() : list, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? false : z8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0660a();

        /* renamed from: a, reason: collision with root package name */
        private final String f27891a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27892b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27893c;

        /* renamed from: d, reason: collision with root package name */
        private final String f27894d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27895e;

        /* renamed from: f, reason: collision with root package name */
        private final String f27896f;

        /* renamed from: com.stripe.android.paymentsheet.w$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0660a implements Parcelable.Creator {
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
            this.f27891a = str;
            this.f27892b = str2;
            this.f27893c = str3;
            this.f27894d = str4;
            this.f27895e = str5;
            this.f27896f = str6;
        }

        public final String a() {
            return this.f27891a;
        }

        public final String b() {
            return this.f27892b;
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
            return AbstractC3292y.d(this.f27891a, aVar.f27891a) && AbstractC3292y.d(this.f27892b, aVar.f27892b) && AbstractC3292y.d(this.f27893c, aVar.f27893c) && AbstractC3292y.d(this.f27894d, aVar.f27894d) && AbstractC3292y.d(this.f27895e, aVar.f27895e) && AbstractC3292y.d(this.f27896f, aVar.f27896f);
        }

        public final String f() {
            return this.f27893c;
        }

        public final String h() {
            return this.f27894d;
        }

        public int hashCode() {
            String str = this.f27891a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f27892b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f27893c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f27894d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f27895e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f27896f;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String i() {
            return this.f27895e;
        }

        public final String l() {
            return this.f27896f;
        }

        public String toString() {
            return "Address(city=" + this.f27891a + ", country=" + this.f27892b + ", line1=" + this.f27893c + ", line2=" + this.f27894d + ", postalCode=" + this.f27895e + ", state=" + this.f27896f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f27891a);
            out.writeString(this.f27892b);
            out.writeString(this.f27893c);
            out.writeString(this.f27894d);
            out.writeString(this.f27895e);
            out.writeString(this.f27896f);
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5, (i8 & 32) != 0 ? null : str6);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f27938a;

        /* renamed from: b, reason: collision with root package name */
        private final i f27939b;

        /* renamed from: c, reason: collision with root package name */
        private final k f27940c;

        /* renamed from: d, reason: collision with root package name */
        private final ColorStateList f27941d;

        /* renamed from: e, reason: collision with root package name */
        private final c f27942e;

        /* renamed from: f, reason: collision with root package name */
        private final C4154a f27943f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f27944g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f27945h;

        /* renamed from: i, reason: collision with root package name */
        private final b f27946i;

        /* renamed from: j, reason: collision with root package name */
        private final String f27947j;

        /* renamed from: k, reason: collision with root package name */
        private final d f27948k;

        /* renamed from: l, reason: collision with root package name */
        private final List f27949l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f27950m;

        /* renamed from: n, reason: collision with root package name */
        private final List f27951n;

        /* renamed from: o, reason: collision with root package name */
        private final List f27952o;

        /* renamed from: p, reason: collision with root package name */
        private final n f27953p;

        /* renamed from: q, reason: collision with root package name */
        public static final a f27936q = new a(null);

        /* renamed from: r, reason: collision with root package name */
        public static final int f27937r = 8;
        public static final Parcelable.Creator<g> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final g a(Context context) {
                AbstractC3292y.i(context, "context");
                return new g(context.getApplicationInfo().loadLabel(context.getPackageManager()).toString(), null, null, null, null, null, false, false, null, null, null, null, 4094, null);
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                String readString = parcel.readString();
                i createFromParcel = parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel);
                k createFromParcel2 = parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel);
                ColorStateList colorStateList = (ColorStateList) parcel.readParcelable(g.class.getClassLoader());
                c createFromParcel3 = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
                C4154a createFromParcel4 = parcel.readInt() != 0 ? C4154a.CREATOR.createFromParcel(parcel) : null;
                boolean z8 = parcel.readInt() != 0;
                boolean z9 = parcel.readInt() != 0;
                b createFromParcel5 = b.CREATOR.createFromParcel(parcel);
                String readString2 = parcel.readString();
                d createFromParcel6 = d.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(EnumC2906e.valueOf(parcel.readString()));
                }
                return new g(readString, createFromParcel, createFromParcel2, colorStateList, createFromParcel3, createFromParcel4, z8, z9, createFromParcel5, readString2, createFromParcel6, arrayList, parcel.readInt() != 0, parcel.createStringArrayList(), parcel.createStringArrayList(), n.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        public g(String merchantDisplayName, i iVar, k kVar, ColorStateList colorStateList, c cVar, C4154a c4154a, boolean z8, boolean z9, b appearance, String str, d billingDetailsCollectionConfiguration, List preferredNetworks, boolean z10, List paymentMethodOrder, List externalPaymentMethods, n paymentMethodLayout) {
            AbstractC3292y.i(merchantDisplayName, "merchantDisplayName");
            AbstractC3292y.i(appearance, "appearance");
            AbstractC3292y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            AbstractC3292y.i(preferredNetworks, "preferredNetworks");
            AbstractC3292y.i(paymentMethodOrder, "paymentMethodOrder");
            AbstractC3292y.i(externalPaymentMethods, "externalPaymentMethods");
            AbstractC3292y.i(paymentMethodLayout, "paymentMethodLayout");
            this.f27938a = merchantDisplayName;
            this.f27939b = iVar;
            this.f27940c = kVar;
            this.f27941d = colorStateList;
            this.f27942e = cVar;
            this.f27943f = c4154a;
            this.f27944g = z8;
            this.f27945h = z9;
            this.f27946i = appearance;
            this.f27947j = str;
            this.f27948k = billingDetailsCollectionConfiguration;
            this.f27949l = preferredNetworks;
            this.f27950m = z10;
            this.f27951n = paymentMethodOrder;
            this.f27952o = externalPaymentMethods;
            this.f27953p = paymentMethodLayout;
        }

        public final String I() {
            return this.f27947j;
        }

        public final boolean a() {
            return this.f27944g;
        }

        public final boolean b() {
            return this.f27945h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return AbstractC3292y.d(this.f27938a, gVar.f27938a) && AbstractC3292y.d(this.f27939b, gVar.f27939b) && AbstractC3292y.d(this.f27940c, gVar.f27940c) && AbstractC3292y.d(this.f27941d, gVar.f27941d) && AbstractC3292y.d(this.f27942e, gVar.f27942e) && AbstractC3292y.d(this.f27943f, gVar.f27943f) && this.f27944g == gVar.f27944g && this.f27945h == gVar.f27945h && AbstractC3292y.d(this.f27946i, gVar.f27946i) && AbstractC3292y.d(this.f27947j, gVar.f27947j) && AbstractC3292y.d(this.f27948k, gVar.f27948k) && AbstractC3292y.d(this.f27949l, gVar.f27949l) && this.f27950m == gVar.f27950m && AbstractC3292y.d(this.f27951n, gVar.f27951n) && AbstractC3292y.d(this.f27952o, gVar.f27952o) && this.f27953p == gVar.f27953p;
        }

        public final boolean f() {
            return this.f27950m;
        }

        public final b h() {
            return this.f27946i;
        }

        public int hashCode() {
            int hashCode = this.f27938a.hashCode() * 31;
            i iVar = this.f27939b;
            int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
            k kVar = this.f27940c;
            int hashCode3 = (hashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
            ColorStateList colorStateList = this.f27941d;
            int hashCode4 = (hashCode3 + (colorStateList == null ? 0 : colorStateList.hashCode())) * 31;
            c cVar = this.f27942e;
            int hashCode5 = (hashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            C4154a c4154a = this.f27943f;
            int hashCode6 = (((((((hashCode5 + (c4154a == null ? 0 : c4154a.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f27944g)) * 31) + androidx.compose.foundation.a.a(this.f27945h)) * 31) + this.f27946i.hashCode()) * 31;
            String str = this.f27947j;
            return ((((((((((((hashCode6 + (str != null ? str.hashCode() : 0)) * 31) + this.f27948k.hashCode()) * 31) + this.f27949l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f27950m)) * 31) + this.f27951n.hashCode()) * 31) + this.f27952o.hashCode()) * 31) + this.f27953p.hashCode();
        }

        public final d i() {
            return this.f27948k;
        }

        public final i l() {
            return this.f27939b;
        }

        public final c p() {
            return this.f27942e;
        }

        public final C4154a q() {
            return this.f27943f;
        }

        public final List s() {
            return this.f27952o;
        }

        public String toString() {
            return "Configuration(merchantDisplayName=" + this.f27938a + ", customer=" + this.f27939b + ", googlePay=" + this.f27940c + ", primaryButtonColor=" + this.f27941d + ", defaultBillingDetails=" + this.f27942e + ", shippingDetails=" + this.f27943f + ", allowsDelayedPaymentMethods=" + this.f27944g + ", allowsPaymentMethodsRequiringShippingAddress=" + this.f27945h + ", appearance=" + this.f27946i + ", primaryButtonLabel=" + this.f27947j + ", billingDetailsCollectionConfiguration=" + this.f27948k + ", preferredNetworks=" + this.f27949l + ", allowsRemovalOfLastSavedPaymentMethod=" + this.f27950m + ", paymentMethodOrder=" + this.f27951n + ", externalPaymentMethods=" + this.f27952o + ", paymentMethodLayout=" + this.f27953p + ")";
        }

        public final k u() {
            return this.f27940c;
        }

        public final String v() {
            return this.f27938a;
        }

        public final n w() {
            return this.f27953p;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f27938a);
            i iVar = this.f27939b;
            if (iVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                iVar.writeToParcel(out, i8);
            }
            k kVar = this.f27940c;
            if (kVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                kVar.writeToParcel(out, i8);
            }
            out.writeParcelable(this.f27941d, i8);
            c cVar = this.f27942e;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                cVar.writeToParcel(out, i8);
            }
            C4154a c4154a = this.f27943f;
            if (c4154a == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                c4154a.writeToParcel(out, i8);
            }
            out.writeInt(this.f27944g ? 1 : 0);
            out.writeInt(this.f27945h ? 1 : 0);
            this.f27946i.writeToParcel(out, i8);
            out.writeString(this.f27947j);
            this.f27948k.writeToParcel(out, i8);
            List list = this.f27949l;
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeString(((EnumC2906e) it.next()).name());
            }
            out.writeInt(this.f27950m ? 1 : 0);
            out.writeStringList(this.f27951n);
            out.writeStringList(this.f27952o);
            out.writeString(this.f27953p.name());
        }

        public final List x() {
            return this.f27951n;
        }

        public final List y() {
            return this.f27949l;
        }

        public final ColorStateList z() {
            return this.f27941d;
        }

        public /* synthetic */ g(String str, i iVar, k kVar, ColorStateList colorStateList, c cVar, C4154a c4154a, boolean z8, boolean z9, b bVar, String str2, d dVar, List list, boolean z10, List list2, List list3, n nVar, int i8, AbstractC3284p abstractC3284p) {
            this(str, (i8 & 2) != 0 ? C3886a.f37798a.d() : iVar, (i8 & 4) != 0 ? C3886a.f37798a.f() : kVar, (i8 & 8) != 0 ? C3886a.f37798a.i() : colorStateList, (i8 & 16) != 0 ? C3886a.f37798a.b() : cVar, (i8 & 32) != 0 ? C3886a.f37798a.k() : c4154a, (i8 & 64) != 0 ? false : z8, (i8 & 128) == 0 ? z9 : false, (i8 & 256) != 0 ? C3886a.f37798a.a() : bVar, (i8 & 512) != 0 ? C3886a.f37798a.j() : str2, (i8 & 1024) != 0 ? C3886a.f37798a.c() : dVar, (i8 & 2048) != 0 ? C3886a.f37798a.h() : list, (i8 & 4096) != 0 ? true : z10, (i8 & 8192) != 0 ? C3886a.f37798a.g() : list2, (i8 & 16384) != 0 ? C3886a.f37798a.e() : list3, (i8 & 32768) != 0 ? n.f28011a.a() : nVar);
        }

        public /* synthetic */ g(String str, i iVar, k kVar, ColorStateList colorStateList, c cVar, C4154a c4154a, boolean z8, boolean z9, b bVar, String str2, d dVar, List list, int i8, AbstractC3284p abstractC3284p) {
            this(str, (i8 & 2) != 0 ? C3886a.f37798a.d() : iVar, (i8 & 4) != 0 ? C3886a.f37798a.f() : kVar, (i8 & 8) != 0 ? C3886a.f37798a.i() : colorStateList, (i8 & 16) != 0 ? C3886a.f37798a.b() : cVar, (i8 & 32) != 0 ? C3886a.f37798a.k() : c4154a, (i8 & 64) != 0 ? false : z8, (i8 & 128) == 0 ? z9 : false, (i8 & 256) != 0 ? C3886a.f37798a.a() : bVar, (i8 & 512) != 0 ? C3886a.f37798a.j() : str2, (i8 & 1024) != 0 ? C3886a.f37798a.c() : dVar, (i8 & 2048) != 0 ? C3886a.f37798a.h() : list);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public g(String merchantDisplayName, i iVar, k kVar, ColorStateList colorStateList, c cVar, C4154a c4154a, boolean z8, boolean z9, b appearance, String str, d billingDetailsCollectionConfiguration, List preferredNetworks) {
            this(merchantDisplayName, iVar, kVar, colorStateList, cVar, c4154a, z8, z9, appearance, str, billingDetailsCollectionConfiguration, preferredNetworks, true, null, C3886a.f37798a.e(), null, 40960, null);
            AbstractC3292y.i(merchantDisplayName, "merchantDisplayName");
            AbstractC3292y.i(appearance, "appearance");
            AbstractC3292y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            AbstractC3292y.i(preferredNetworks, "preferredNetworks");
        }
    }
}
