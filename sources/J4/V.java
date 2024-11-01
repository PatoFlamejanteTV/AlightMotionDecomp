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
public final class V implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f34051a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34052b;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<V> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34053a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f34054b;

        static {
            a aVar = new a();
            f34053a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.ui.core.elements.DropdownItemSpec", aVar, 2);
            c1014e0.k("api_value", true);
            c1014e0.k("display_text", true);
            f34054b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f34054b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            C6.r0 r0Var = C6.r0.f1092a;
            return new y6.b[]{AbstractC4273a.p(r0Var), r0Var};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public V d(B6.e decoder) {
            String str;
            String str2;
            int i8;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            C6.n0 n0Var = null;
            if (c8.z()) {
                str = (String) c8.t(a9, 0, C6.r0.f1092a, null);
                str2 = c8.o(a9, 1);
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
                                str3 = c8.o(a9, 1);
                                i9 |= 2;
                            } else {
                                throw new y6.l(y8);
                            }
                        } else {
                            str = (String) c8.t(a9, 0, C6.r0.f1092a, str);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                str2 = str3;
                i8 = i9;
            }
            c8.a(a9);
            return new V(i8, str, str2, n0Var);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, V value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            V.f(value, c8, a9);
            c8.a(a9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f34053a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new V(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final V[] newArray(int i8) {
            return new V[i8];
        }
    }

    public /* synthetic */ V(int i8, String str, String str2, C6.n0 n0Var) {
        this.f34051a = (i8 & 1) == 0 ? null : str;
        if ((i8 & 2) == 0) {
            this.f34052b = "Other";
        } else {
            this.f34052b = str2;
        }
    }

    public static final /* synthetic */ void f(V v8, B6.d dVar, A6.f fVar) {
        if (dVar.x(fVar, 0) || v8.f34051a != null) {
            dVar.D(fVar, 0, C6.r0.f1092a, v8.f34051a);
        }
        if (dVar.x(fVar, 1) || !AbstractC3292y.d(v8.f34052b, "Other")) {
            dVar.q(fVar, 1, v8.f34052b);
        }
    }

    public final String a() {
        return this.f34051a;
    }

    public final String b() {
        return this.f34052b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v8 = (V) obj;
        if (AbstractC3292y.d(this.f34051a, v8.f34051a) && AbstractC3292y.d(this.f34052b, v8.f34052b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f34051a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 31) + this.f34052b.hashCode();
    }

    public String toString() {
        return "DropdownItemSpec(apiValue=" + this.f34051a + ", displayText=" + this.f34052b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f34051a);
        out.writeString(this.f34052b);
    }

    public V(String str, String displayText) {
        AbstractC3292y.i(displayText, "displayText");
        this.f34051a = str;
        this.f34052b = displayText;
    }
}
