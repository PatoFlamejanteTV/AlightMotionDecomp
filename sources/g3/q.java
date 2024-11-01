package g3;

import C6.AbstractC1012d0;
import C6.C;
import C6.C1014e0;
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
public final class q implements z2.f {

    /* renamed from: a, reason: collision with root package name */
    private final C2916o f32215a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32216b;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<q> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32217a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f32218b;

        static {
            a aVar = new a();
            f32217a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.model.ConsumerSessionSignup", aVar, 2);
            c1014e0.k("consumer_session", false);
            c1014e0.k("publishable_key", true);
            f32218b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f32218b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            return new y6.b[]{C2916o.a.f32184a, AbstractC4273a.p(r0.f1092a)};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public q d(B6.e decoder) {
            C2916o c2916o;
            String str;
            int i8;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            n0 n0Var = null;
            if (c8.z()) {
                c2916o = (C2916o) c8.p(a9, 0, C2916o.a.f32184a, null);
                str = (String) c8.t(a9, 1, r0.f1092a, null);
                i8 = 3;
            } else {
                c2916o = null;
                String str2 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 != 0) {
                            if (y8 == 1) {
                                str2 = (String) c8.t(a9, 1, r0.f1092a, str2);
                                i9 |= 2;
                            } else {
                                throw new y6.l(y8);
                            }
                        } else {
                            c2916o = (C2916o) c8.p(a9, 0, C2916o.a.f32184a, c2916o);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                str = str2;
                i8 = i9;
            }
            c8.a(a9);
            return new q(i8, c2916o, str, n0Var);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, q value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            q.f(value, c8, a9);
            c8.a(a9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f32217a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new q(C2916o.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final q[] newArray(int i8) {
            return new q[i8];
        }
    }

    public /* synthetic */ q(int i8, C2916o c2916o, String str, n0 n0Var) {
        if (1 != (i8 & 1)) {
            AbstractC1012d0.a(i8, 1, a.f32217a.a());
        }
        this.f32215a = c2916o;
        if ((i8 & 2) == 0) {
            this.f32216b = null;
        } else {
            this.f32216b = str;
        }
    }

    public static final /* synthetic */ void f(q qVar, B6.d dVar, A6.f fVar) {
        dVar.n(fVar, 0, C2916o.a.f32184a, qVar.f32215a);
        if (dVar.x(fVar, 1) || qVar.f32216b != null) {
            dVar.D(fVar, 1, r0.f1092a, qVar.f32216b);
        }
    }

    public final C2916o a() {
        return this.f32215a;
    }

    public final String b() {
        return this.f32216b;
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
        if (AbstractC3292y.d(this.f32215a, qVar.f32215a) && AbstractC3292y.d(this.f32216b, qVar.f32216b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f32215a.hashCode() * 31;
        String str = this.f32216b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "ConsumerSessionSignup(consumerSession=" + this.f32215a + ", publishableKey=" + this.f32216b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        this.f32215a.writeToParcel(out, i8);
        out.writeString(this.f32216b);
    }

    public q(C2916o consumerSession, String str) {
        AbstractC3292y.i(consumerSession, "consumerSession");
        this.f32215a = consumerSession;
        this.f32216b = str;
    }
}
