package g3;

import C6.AbstractC1012d0;
import C6.C;
import C6.C1014e0;
import C6.C1018h;
import C6.n0;
import C6.r0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import g3.C2916o;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import z6.AbstractC4273a;

@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class p implements z2.f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32209a;

    /* renamed from: b, reason: collision with root package name */
    private final C2916o f32210b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32211c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32212d;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<p> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32213a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f32214b;

        static {
            a aVar = new a();
            f32213a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.model.ConsumerSessionLookup", aVar, 4);
            c1014e0.k("exists", false);
            c1014e0.k("consumer_session", true);
            c1014e0.k("error_message", true);
            c1014e0.k("publishable_key", true);
            f32214b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f32214b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            y6.b p8 = AbstractC4273a.p(C2916o.a.f32184a);
            r0 r0Var = r0.f1092a;
            return new y6.b[]{C1018h.f1064a, p8, AbstractC4273a.p(r0Var), AbstractC4273a.p(r0Var)};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p d(B6.e decoder) {
            boolean z8;
            int i8;
            C2916o c2916o;
            String str;
            String str2;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            if (c8.z()) {
                boolean m8 = c8.m(a9, 0);
                C2916o c2916o2 = (C2916o) c8.t(a9, 1, C2916o.a.f32184a, null);
                r0 r0Var = r0.f1092a;
                String str3 = (String) c8.t(a9, 2, r0Var, null);
                z8 = m8;
                str2 = (String) c8.t(a9, 3, r0Var, null);
                str = str3;
                c2916o = c2916o2;
                i8 = 15;
            } else {
                C2916o c2916o3 = null;
                String str4 = null;
                String str5 = null;
                boolean z9 = false;
                int i9 = 0;
                boolean z10 = true;
                while (z10) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 != 0) {
                            if (y8 != 1) {
                                if (y8 != 2) {
                                    if (y8 == 3) {
                                        str5 = (String) c8.t(a9, 3, r0.f1092a, str5);
                                        i9 |= 8;
                                    } else {
                                        throw new y6.l(y8);
                                    }
                                } else {
                                    str4 = (String) c8.t(a9, 2, r0.f1092a, str4);
                                    i9 |= 4;
                                }
                            } else {
                                c2916o3 = (C2916o) c8.t(a9, 1, C2916o.a.f32184a, c2916o3);
                                i9 |= 2;
                            }
                        } else {
                            z9 = c8.m(a9, 0);
                            i9 |= 1;
                        }
                    } else {
                        z10 = false;
                    }
                }
                z8 = z9;
                i8 = i9;
                c2916o = c2916o3;
                str = str4;
                str2 = str5;
            }
            c8.a(a9);
            return new p(i8, z8, c2916o, str, str2, (n0) null);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, p value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            p.f(value, c8, a9);
            c8.a(a9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f32213a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p createFromParcel(Parcel parcel) {
            boolean z8;
            C2916o createFromParcel;
            AbstractC3292y.i(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = C2916o.CREATOR.createFromParcel(parcel);
            }
            return new p(z8, createFromParcel, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p[] newArray(int i8) {
            return new p[i8];
        }
    }

    public /* synthetic */ p(int i8, boolean z8, C2916o c2916o, String str, String str2, n0 n0Var) {
        if (1 != (i8 & 1)) {
            AbstractC1012d0.a(i8, 1, a.f32213a.a());
        }
        this.f32209a = z8;
        if ((i8 & 2) == 0) {
            this.f32210b = null;
        } else {
            this.f32210b = c2916o;
        }
        if ((i8 & 4) == 0) {
            this.f32211c = null;
        } else {
            this.f32211c = str;
        }
        if ((i8 & 8) == 0) {
            this.f32212d = null;
        } else {
            this.f32212d = str2;
        }
    }

    public static final /* synthetic */ void f(p pVar, B6.d dVar, A6.f fVar) {
        dVar.o(fVar, 0, pVar.f32209a);
        if (dVar.x(fVar, 1) || pVar.f32210b != null) {
            dVar.D(fVar, 1, C2916o.a.f32184a, pVar.f32210b);
        }
        if (dVar.x(fVar, 2) || pVar.f32211c != null) {
            dVar.D(fVar, 2, r0.f1092a, pVar.f32211c);
        }
        if (dVar.x(fVar, 3) || pVar.f32212d != null) {
            dVar.D(fVar, 3, r0.f1092a, pVar.f32212d);
        }
    }

    public final C2916o a() {
        return this.f32210b;
    }

    public final String b() {
        return this.f32212d;
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
        if (this.f32209a == pVar.f32209a && AbstractC3292y.d(this.f32210b, pVar.f32210b) && AbstractC3292y.d(this.f32211c, pVar.f32211c) && AbstractC3292y.d(this.f32212d, pVar.f32212d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int a9 = androidx.compose.foundation.a.a(this.f32209a) * 31;
        C2916o c2916o = this.f32210b;
        int i8 = 0;
        if (c2916o == null) {
            hashCode = 0;
        } else {
            hashCode = c2916o.hashCode();
        }
        int i9 = (a9 + hashCode) * 31;
        String str = this.f32211c;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f32212d;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        return "ConsumerSessionLookup(exists=" + this.f32209a + ", consumerSession=" + this.f32210b + ", errorMessage=" + this.f32211c + ", publishableKey=" + this.f32212d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeInt(this.f32209a ? 1 : 0);
        C2916o c2916o = this.f32210b;
        if (c2916o == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c2916o.writeToParcel(out, i8);
        }
        out.writeString(this.f32211c);
        out.writeString(this.f32212d);
    }

    public p(boolean z8, C2916o c2916o, String str, String str2) {
        this.f32209a = z8;
        this.f32210b = c2916o;
        this.f32211c = str;
        this.f32212d = str2;
    }

    public /* synthetic */ p(boolean z8, C2916o c2916o, String str, String str2, int i8, AbstractC3284p abstractC3284p) {
        this(z8, (i8 & 2) != 0 ? null : c2916o, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : str2);
    }
}
