package j4;

import C6.AbstractC1012d0;
import C6.C;
import C6.C1014e0;
import C6.C1018h;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import r4.G;

@StabilityInferred(parameters = 0)
@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class L0 extends AbstractC3179f0 {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f33881a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33882b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC3210z f33883c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC3195n0 f33884d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f33885e;
    public static final b Companion = new b(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f33879f = r4.G.f37990d;
    public static final Parcelable.Creator<L0> CREATOR = new c();

    /* renamed from: g, reason: collision with root package name */
    private static final y6.b[] f33880g = {null, null, EnumC3210z.Companion.serializer(), EnumC3195n0.Companion.serializer(), null};

    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33886a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f33887b;

        static {
            a aVar = new a();
            f33886a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.ui.core.elements.SimpleTextSpec", aVar, 5);
            c1014e0.k("api_path", false);
            c1014e0.k("label", false);
            c1014e0.k("capitalization", true);
            c1014e0.k("keyboard_type", true);
            c1014e0.k("show_optional_label", true);
            f33887b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f33887b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            y6.b[] bVarArr = L0.f33880g;
            return new y6.b[]{G.a.f38016a, C6.H.f1010a, bVarArr[2], bVarArr[3], C1018h.f1064a};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public L0 d(B6.e decoder) {
            boolean z8;
            int i8;
            int i9;
            r4.G g8;
            EnumC3210z enumC3210z;
            EnumC3195n0 enumC3195n0;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            y6.b[] bVarArr = L0.f33880g;
            if (c8.z()) {
                r4.G g9 = (r4.G) c8.p(a9, 0, G.a.f38016a, null);
                int u8 = c8.u(a9, 1);
                EnumC3210z enumC3210z2 = (EnumC3210z) c8.p(a9, 2, bVarArr[2], null);
                enumC3195n0 = (EnumC3195n0) c8.p(a9, 3, bVarArr[3], null);
                g8 = g9;
                z8 = c8.m(a9, 4);
                enumC3210z = enumC3210z2;
                i9 = u8;
                i8 = 31;
            } else {
                r4.G g10 = null;
                EnumC3210z enumC3210z3 = null;
                EnumC3195n0 enumC3195n02 = null;
                boolean z9 = false;
                int i10 = 0;
                int i11 = 0;
                boolean z10 = true;
                while (z10) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 != 0) {
                            if (y8 != 1) {
                                if (y8 != 2) {
                                    if (y8 != 3) {
                                        if (y8 == 4) {
                                            z9 = c8.m(a9, 4);
                                            i10 |= 16;
                                        } else {
                                            throw new y6.l(y8);
                                        }
                                    } else {
                                        enumC3195n02 = (EnumC3195n0) c8.p(a9, 3, bVarArr[3], enumC3195n02);
                                        i10 |= 8;
                                    }
                                } else {
                                    enumC3210z3 = (EnumC3210z) c8.p(a9, 2, bVarArr[2], enumC3210z3);
                                    i10 |= 4;
                                }
                            } else {
                                i11 = c8.u(a9, 1);
                                i10 |= 2;
                            }
                        } else {
                            g10 = (r4.G) c8.p(a9, 0, G.a.f38016a, g10);
                            i10 |= 1;
                        }
                    } else {
                        z10 = false;
                    }
                }
                z8 = z9;
                i8 = i10;
                i9 = i11;
                g8 = g10;
                enumC3210z = enumC3210z3;
                enumC3195n0 = enumC3195n02;
            }
            c8.a(a9);
            return new L0(i8, g8, i9, enumC3210z, enumC3195n0, z8, (C6.n0) null);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, L0 value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            L0.p(value, c8, a9);
            c8.a(a9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f33886a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L0 createFromParcel(Parcel parcel) {
            boolean z8;
            AbstractC3292y.i(parcel, "parcel");
            r4.G g8 = (r4.G) parcel.readParcelable(L0.class.getClassLoader());
            int readInt = parcel.readInt();
            EnumC3210z valueOf = EnumC3210z.valueOf(parcel.readString());
            EnumC3195n0 valueOf2 = EnumC3195n0.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            return new L0(g8, readInt, valueOf, valueOf2, z8);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final L0[] newArray(int i8) {
            return new L0[i8];
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33888a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f33889b;

        static {
            int[] iArr = new int[EnumC3210z.values().length];
            try {
                iArr[EnumC3210z.f34329b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3210z.f34330c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3210z.f34331d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3210z.f34332e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f33888a = iArr;
            int[] iArr2 = new int[EnumC3195n0.values().length];
            try {
                iArr2[EnumC3195n0.f34207b.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC3195n0.f34208c.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC3195n0.f34209d.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC3195n0.f34210e.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC3195n0.f34211f.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC3195n0.f34212g.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC3195n0.f34213h.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC3195n0.f34214i.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            f33889b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L0(int i8, r4.G g8, int i9, EnumC3210z enumC3210z, EnumC3195n0 enumC3195n0, boolean z8, C6.n0 n0Var) {
        super(null);
        if (3 != (i8 & 3)) {
            AbstractC1012d0.a(i8, 3, a.f33886a.a());
        }
        this.f33881a = g8;
        this.f33882b = i9;
        if ((i8 & 4) == 0) {
            this.f33883c = EnumC3210z.f34329b;
        } else {
            this.f33883c = enumC3210z;
        }
        if ((i8 & 8) == 0) {
            this.f33884d = EnumC3195n0.f34208c;
        } else {
            this.f33884d = enumC3195n0;
        }
        if ((i8 & 16) == 0) {
            this.f33885e = false;
        } else {
            this.f33885e = z8;
        }
    }

    public static final /* synthetic */ void p(L0 l02, B6.d dVar, A6.f fVar) {
        y6.b[] bVarArr = f33880g;
        dVar.n(fVar, 0, G.a.f38016a, l02.i());
        dVar.u(fVar, 1, l02.f33882b);
        if (dVar.x(fVar, 2) || l02.f33883c != EnumC3210z.f34329b) {
            dVar.n(fVar, 2, bVarArr[2], l02.f33883c);
        }
        if (dVar.x(fVar, 3) || l02.f33884d != EnumC3195n0.f34208c) {
            dVar.n(fVar, 3, bVarArr[3], l02.f33884d);
        }
        if (dVar.x(fVar, 4) || l02.f33885e) {
            dVar.o(fVar, 4, l02.f33885e);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l02 = (L0) obj;
        if (AbstractC3292y.d(this.f33881a, l02.f33881a) && this.f33882b == l02.f33882b && this.f33883c == l02.f33883c && this.f33884d == l02.f33884d && this.f33885e == l02.f33885e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f33881a.hashCode() * 31) + this.f33882b) * 31) + this.f33883c.hashCode()) * 31) + this.f33884d.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f33885e);
    }

    public r4.G i() {
        return this.f33881a;
    }

    public final r4.h0 l(Map initialValues) {
        int m4873getNoneIUNYP9k;
        int m4899getTextPjHm6EE;
        AbstractC3292y.i(initialValues, "initialValues");
        r4.G i8 = i();
        Integer valueOf = Integer.valueOf(this.f33882b);
        int i9 = d.f33888a[this.f33883c.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 == 4) {
                        m4873getNoneIUNYP9k = KeyboardCapitalization.Companion.m4874getSentencesIUNYP9k();
                    } else {
                        throw new Q5.p();
                    }
                } else {
                    m4873getNoneIUNYP9k = KeyboardCapitalization.Companion.m4875getWordsIUNYP9k();
                }
            } else {
                m4873getNoneIUNYP9k = KeyboardCapitalization.Companion.m4872getCharactersIUNYP9k();
            }
        } else {
            m4873getNoneIUNYP9k = KeyboardCapitalization.Companion.m4873getNoneIUNYP9k();
        }
        int i10 = m4873getNoneIUNYP9k;
        switch (d.f33889b[this.f33884d.ordinal()]) {
            case 1:
                m4899getTextPjHm6EE = KeyboardType.Companion.m4899getTextPjHm6EE();
                break;
            case 2:
                m4899getTextPjHm6EE = KeyboardType.Companion.m4892getAsciiPjHm6EE();
                break;
            case 3:
                m4899getTextPjHm6EE = KeyboardType.Companion.m4895getNumberPjHm6EE();
                break;
            case 4:
                m4899getTextPjHm6EE = KeyboardType.Companion.m4898getPhonePjHm6EE();
                break;
            case 5:
                m4899getTextPjHm6EE = KeyboardType.Companion.m4900getUriPjHm6EE();
                break;
            case 6:
                m4899getTextPjHm6EE = KeyboardType.Companion.m4894getEmailPjHm6EE();
                break;
            case 7:
                m4899getTextPjHm6EE = KeyboardType.Companion.m4897getPasswordPjHm6EE();
                break;
            case 8:
                m4899getTextPjHm6EE = KeyboardType.Companion.m4896getNumberPasswordPjHm6EE();
                break;
            default:
                throw new Q5.p();
        }
        return AbstractC3179f0.f(this, new r4.q0(i8, new r4.s0(new r4.r0(valueOf, i10, m4899getTextPjHm6EE, null, 8, null), this.f33885e, (String) initialValues.get(i()))), null, 2, null);
    }

    public String toString() {
        return "SimpleTextSpec(apiPath=" + this.f33881a + ", label=" + this.f33882b + ", capitalization=" + this.f33883c + ", keyboardType=" + this.f33884d + ", showOptionalLabel=" + this.f33885e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f33881a, i8);
        out.writeInt(this.f33882b);
        out.writeString(this.f33883c.name());
        out.writeString(this.f33884d.name());
        out.writeInt(this.f33885e ? 1 : 0);
    }

    public /* synthetic */ L0(r4.G g8, int i8, EnumC3210z enumC3210z, EnumC3195n0 enumC3195n0, boolean z8, int i9, AbstractC3284p abstractC3284p) {
        this(g8, i8, (i9 & 4) != 0 ? EnumC3210z.f34329b : enumC3210z, (i9 & 8) != 0 ? EnumC3195n0.f34208c : enumC3195n0, (i9 & 16) != 0 ? false : z8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(r4.G apiPath, int i8, EnumC3210z capitalization, EnumC3195n0 keyboardType, boolean z8) {
        super(null);
        AbstractC3292y.i(apiPath, "apiPath");
        AbstractC3292y.i(capitalization, "capitalization");
        AbstractC3292y.i(keyboardType, "keyboardType");
        this.f33881a = apiPath;
        this.f33882b = i8;
        this.f33883c = capitalization;
        this.f33884d = keyboardType;
        this.f33885e = z8;
    }
}
