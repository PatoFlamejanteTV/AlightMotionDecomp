package z2;

import C6.AbstractC1012d0;
import C6.C;
import C6.C1014e0;
import C6.n0;
import C6.r0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import y6.g;
import y6.l;
import z2.b;

@g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4266a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final z2.b f41462a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41463b;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<C4266a> CREATOR = new c();

    /* renamed from: z2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0944a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final C0944a f41464a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f41465b;

        static {
            C0944a c0944a = new C0944a();
            f41464a = c0944a;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.core.model.Country", c0944a, 2);
            c1014e0.k("code", false);
            c1014e0.k("name", false);
            f41465b = c1014e0;
        }

        private C0944a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f41465b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            return new y6.b[]{b.a.f41470a, r0.f1092a};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C4266a d(B6.e decoder) {
            z2.b bVar;
            String str;
            int i8;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            n0 n0Var = null;
            if (c8.z()) {
                bVar = (z2.b) c8.p(a9, 0, b.a.f41470a, null);
                str = c8.o(a9, 1);
                i8 = 3;
            } else {
                bVar = null;
                String str2 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 != 0) {
                            if (y8 == 1) {
                                str2 = c8.o(a9, 1);
                                i9 |= 2;
                            } else {
                                throw new l(y8);
                            }
                        } else {
                            bVar = (z2.b) c8.p(a9, 0, b.a.f41470a, bVar);
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
            return new C4266a(i8, bVar, str, n0Var);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, C4266a value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            C4266a.h(value, c8, a9);
            c8.a(a9);
        }
    }

    /* renamed from: z2.a$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return C0944a.f41464a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: z2.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4266a createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new C4266a(z2.b.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4266a[] newArray(int i8) {
            return new C4266a[i8];
        }
    }

    public /* synthetic */ C4266a(int i8, z2.b bVar, String str, n0 n0Var) {
        if (3 != (i8 & 3)) {
            AbstractC1012d0.a(i8, 3, C0944a.f41464a.a());
        }
        this.f41462a = bVar;
        this.f41463b = str;
    }

    public static final /* synthetic */ void h(C4266a c4266a, B6.d dVar, A6.f fVar) {
        dVar.n(fVar, 0, b.a.f41470a, c4266a.f41462a);
        dVar.q(fVar, 1, c4266a.f41463b);
    }

    public final z2.b a() {
        return this.f41462a;
    }

    public final z2.b b() {
        return this.f41462a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4266a)) {
            return false;
        }
        C4266a c4266a = (C4266a) obj;
        if (AbstractC3292y.d(this.f41462a, c4266a.f41462a) && AbstractC3292y.d(this.f41463b, c4266a.f41463b)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f41463b;
    }

    public int hashCode() {
        return (this.f41462a.hashCode() * 31) + this.f41463b.hashCode();
    }

    public String toString() {
        return this.f41463b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        this.f41462a.writeToParcel(out, i8);
        out.writeString(this.f41463b);
    }

    public C4266a(z2.b code, String name) {
        AbstractC3292y.i(code, "code");
        AbstractC3292y.i(name, "name");
        this.f41462a = code;
        this.f41463b = name;
    }
}
