package j4;

import C6.AbstractC1012d0;
import C6.C;
import C6.C1014e0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import z6.AbstractC4273a;

@StabilityInferred(parameters = 1)
@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: j4.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3171b0 implements Parcelable {

    /* renamed from: e, reason: collision with root package name */
    public static final int f34090e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final String f34091a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34092b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34093c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34094d;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<C3171b0> CREATOR = new c();

    /* renamed from: j4.b0$a */
    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34095a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f34096b;

        static {
            a aVar = new a();
            f34095a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.ui.core.elements.ExternalPaymentMethodSpec", aVar, 4);
            c1014e0.k("type", false);
            c1014e0.k("label", false);
            c1014e0.k("light_image_url", false);
            c1014e0.k("dark_image_url", true);
            f34096b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f34096b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            C6.r0 r0Var = C6.r0.f1092a;
            return new y6.b[]{r0Var, r0Var, r0Var, AbstractC4273a.p(r0Var)};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3171b0 d(B6.e decoder) {
            int i8;
            String str;
            String str2;
            String str3;
            String str4;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            String str5 = null;
            if (c8.z()) {
                String o8 = c8.o(a9, 0);
                String o9 = c8.o(a9, 1);
                String o10 = c8.o(a9, 2);
                str = o8;
                str4 = (String) c8.t(a9, 3, C6.r0.f1092a, null);
                str3 = o10;
                str2 = o9;
                i8 = 15;
            } else {
                String str6 = null;
                String str7 = null;
                String str8 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 != 0) {
                            if (y8 != 1) {
                                if (y8 != 2) {
                                    if (y8 == 3) {
                                        str8 = (String) c8.t(a9, 3, C6.r0.f1092a, str8);
                                        i9 |= 8;
                                    } else {
                                        throw new y6.l(y8);
                                    }
                                } else {
                                    str7 = c8.o(a9, 2);
                                    i9 |= 4;
                                }
                            } else {
                                str6 = c8.o(a9, 1);
                                i9 |= 2;
                            }
                        } else {
                            str5 = c8.o(a9, 0);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
                str = str5;
                str2 = str6;
                str3 = str7;
                str4 = str8;
            }
            c8.a(a9);
            return new C3171b0(i8, str, str2, str3, str4, null);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, C3171b0 value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            C3171b0.h(value, c8, a9);
            c8.a(a9);
        }
    }

    /* renamed from: j4.b0$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f34095a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: j4.b0$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3171b0 createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new C3171b0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3171b0[] newArray(int i8) {
            return new C3171b0[i8];
        }
    }

    public /* synthetic */ C3171b0(int i8, String str, String str2, String str3, String str4, C6.n0 n0Var) {
        if (7 != (i8 & 7)) {
            AbstractC1012d0.a(i8, 7, a.f34095a.a());
        }
        this.f34091a = str;
        this.f34092b = str2;
        this.f34093c = str3;
        if ((i8 & 8) == 0) {
            this.f34094d = null;
        } else {
            this.f34094d = str4;
        }
    }

    public static final /* synthetic */ void h(C3171b0 c3171b0, B6.d dVar, A6.f fVar) {
        dVar.q(fVar, 0, c3171b0.f34091a);
        dVar.q(fVar, 1, c3171b0.f34092b);
        dVar.q(fVar, 2, c3171b0.f34093c);
        if (dVar.x(fVar, 3) || c3171b0.f34094d != null) {
            dVar.D(fVar, 3, C6.r0.f1092a, c3171b0.f34094d);
        }
    }

    public final String a() {
        return this.f34094d;
    }

    public final String b() {
        return this.f34092b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3171b0)) {
            return false;
        }
        C3171b0 c3171b0 = (C3171b0) obj;
        if (AbstractC3292y.d(this.f34091a, c3171b0.f34091a) && AbstractC3292y.d(this.f34092b, c3171b0.f34092b) && AbstractC3292y.d(this.f34093c, c3171b0.f34093c) && AbstractC3292y.d(this.f34094d, c3171b0.f34094d)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f34093c;
    }

    public final String getType() {
        return this.f34091a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.f34091a.hashCode() * 31) + this.f34092b.hashCode()) * 31) + this.f34093c.hashCode()) * 31;
        String str = this.f34094d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "ExternalPaymentMethodSpec(type=" + this.f34091a + ", label=" + this.f34092b + ", lightImageUrl=" + this.f34093c + ", darkImageUrl=" + this.f34094d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f34091a);
        out.writeString(this.f34092b);
        out.writeString(this.f34093c);
        out.writeString(this.f34094d);
    }

    public C3171b0(String type, String label, String lightImageUrl, String str) {
        AbstractC3292y.i(type, "type");
        AbstractC3292y.i(label, "label");
        AbstractC3292y.i(lightImageUrl, "lightImageUrl");
        this.f34091a = type;
        this.f34092b = label;
        this.f34093c = lightImageUrl;
        this.f34094d = str;
    }
}
