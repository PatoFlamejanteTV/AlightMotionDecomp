package j4;

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
/* loaded from: classes4.dex */
public final class F0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f33797a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33798b;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<F0> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33799a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f33800b;

        static {
            a aVar = new a();
            f33799a = aVar;
            C1014e0 c1014e0 = new C1014e0("next_action_spec", aVar, 2);
            c1014e0.k("light_theme_png", true);
            c1014e0.k("dark_theme_png", true);
            f33800b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f33800b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            C6.r0 r0Var = C6.r0.f1092a;
            return new y6.b[]{AbstractC4273a.p(r0Var), AbstractC4273a.p(r0Var)};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public F0 d(B6.e decoder) {
            String str;
            int i8;
            String str2;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            C6.n0 n0Var = null;
            if (c8.z()) {
                C6.r0 r0Var = C6.r0.f1092a;
                str2 = (String) c8.t(a9, 0, r0Var, null);
                str = (String) c8.t(a9, 1, r0Var, null);
                i8 = 3;
            } else {
                str = null;
                String str3 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 != 0) {
                            if (y8 == 1) {
                                str = (String) c8.t(a9, 1, C6.r0.f1092a, str);
                                i9 |= 2;
                            } else {
                                throw new y6.l(y8);
                            }
                        } else {
                            str3 = (String) c8.t(a9, 0, C6.r0.f1092a, str3);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
                str2 = str3;
            }
            c8.a(a9);
            return new F0(i8, str2, str, n0Var);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, F0 value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            F0.f(value, c8, a9);
            c8.a(a9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f33799a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F0 createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new F0(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final F0[] newArray(int i8) {
            return new F0[i8];
        }
    }

    public /* synthetic */ F0(int i8, String str, String str2, C6.n0 n0Var) {
        if ((i8 & 1) == 0) {
            this.f33797a = null;
        } else {
            this.f33797a = str;
        }
        if ((i8 & 2) == 0) {
            this.f33798b = null;
        } else {
            this.f33798b = str2;
        }
    }

    public static final /* synthetic */ void f(F0 f02, B6.d dVar, A6.f fVar) {
        if (dVar.x(fVar, 0) || f02.f33797a != null) {
            dVar.D(fVar, 0, C6.r0.f1092a, f02.f33797a);
        }
        if (dVar.x(fVar, 1) || f02.f33798b != null) {
            dVar.D(fVar, 1, C6.r0.f1092a, f02.f33798b);
        }
    }

    public final String a() {
        return this.f33798b;
    }

    public final String b() {
        return this.f33797a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        if (AbstractC3292y.d(this.f33797a, f02.f33797a) && AbstractC3292y.d(this.f33798b, f02.f33798b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f33797a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f33798b;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return "SelectorIcon(lightThemePng=" + this.f33797a + ", darkThemePng=" + this.f33798b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f33797a);
        out.writeString(this.f33798b);
    }

    public F0(String str, String str2) {
        this.f33797a = str;
        this.f33798b = str2;
    }
}
