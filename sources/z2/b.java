package z2;

import C6.AbstractC1012d0;
import C6.C;
import C6.C1014e0;
import C6.n0;
import C6.r0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import y6.g;
import y6.l;

@g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f41469a;
    public static final C0945b Companion = new C0945b(null);
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final b f41466b = new b("US");

    /* renamed from: c, reason: collision with root package name */
    private static final b f41467c = new b("CA");

    /* renamed from: d, reason: collision with root package name */
    private static final b f41468d = new b("GB");

    /* loaded from: classes4.dex */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f41470a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f41471b;

        static {
            a aVar = new a();
            f41470a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.core.model.CountryCode", aVar, 1);
            c1014e0.k("value", false);
            f41471b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f41471b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            return new y6.b[]{r0.f1092a};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public b d(B6.e decoder) {
            String str;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            int i8 = 1;
            n0 n0Var = null;
            if (c8.z()) {
                str = c8.o(a9, 0);
            } else {
                str = null;
                boolean z8 = true;
                int i9 = 0;
                while (z8) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 == 0) {
                            str = c8.o(a9, 0);
                            i9 = 1;
                        } else {
                            throw new l(y8);
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
            }
            c8.a(a9);
            return new b(i8, str, n0Var);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, b value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            b.f(value, c8, a9);
            c8.a(a9);
        }
    }

    /* renamed from: z2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0945b {
        private C0945b() {
        }

        public final b a(String value) {
            AbstractC3292y.i(value, "value");
            String upperCase = value.toUpperCase(Locale.ROOT);
            AbstractC3292y.h(upperCase, "toUpperCase(...)");
            return new b(upperCase);
        }

        public final b b() {
            return b.f41466b;
        }

        public final y6.b serializer() {
            return a.f41470a;
        }

        public /* synthetic */ C0945b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
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

    public /* synthetic */ b(int i8, String str, n0 n0Var) {
        if (1 != (i8 & 1)) {
            AbstractC1012d0.a(i8, 1, a.f41470a.a());
        }
        this.f41469a = str;
    }

    public static final /* synthetic */ void f(b bVar, B6.d dVar, A6.f fVar) {
        dVar.q(fVar, 0, bVar.f41469a);
    }

    public final String b() {
        return this.f41469a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && AbstractC3292y.d(this.f41469a, ((b) obj).f41469a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f41469a.hashCode();
    }

    public String toString() {
        return "CountryCode(value=" + this.f41469a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f41469a);
    }

    public b(String value) {
        AbstractC3292y.i(value, "value");
        this.f41469a = value;
    }
}
