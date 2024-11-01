package r4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import java.util.Calendar;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import o4.AbstractC3533g;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import r4.A0;
import r4.v0;
import r4.z0;

/* renamed from: r4.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3922v implements v0 {

    /* renamed from: h, reason: collision with root package name */
    public static final a f38675h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f38676i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final int f38677a = KeyboardCapitalization.Companion.m4873getNoneIUNYP9k();

    /* renamed from: b, reason: collision with root package name */
    private final String f38678b = "date";

    /* renamed from: c, reason: collision with root package name */
    private final int f38679c = AbstractC3533g.f35950C;

    /* renamed from: d, reason: collision with root package name */
    private final int f38680d = KeyboardType.Companion.m4896getNumberPasswordPjHm6EE();

    /* renamed from: e, reason: collision with root package name */
    private final B f38681e = new B();

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3813L f38682f = AbstractC3815N.a(null);

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f38683g = AbstractC3815N.a(Boolean.FALSE);

    /* renamed from: r4.v$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final y0 a(int i8, int i9, int i10, int i11) {
            boolean z8;
            boolean z9;
            boolean z10;
            int i12 = i9 - (i11 % 100);
            boolean z11 = false;
            if (i12 < 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (i12 > 50) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i12 == 0 && i10 > i8) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (1 <= i8 && i8 < 13) {
                z11 = true;
            }
            boolean z12 = !z11;
            if (z8) {
                return new z0.c(AbstractC3533g.f35956I, null, true, 2, null);
            }
            if (z9) {
                return new z0.c(AbstractC3533g.f35956I, null, true, 2, null);
            }
            if (z10) {
                return new z0.c(AbstractC3533g.f35955H, null, true, 2, null);
            }
            if (z12) {
                return new z0.b(AbstractC3533g.f35955H);
            }
            return A0.a.f37859a;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @Override // r4.v0
    public InterfaceC3813L a() {
        return this.f38683g;
    }

    @Override // r4.v0
    public Integer b() {
        return Integer.valueOf(this.f38679c);
    }

    @Override // r4.v0
    public InterfaceC3813L c() {
        return this.f38682f;
    }

    @Override // r4.v0
    public String e() {
        return v0.a.a(this);
    }

    @Override // r4.v0
    public String f(String rawValue) {
        AbstractC3292y.i(rawValue, "rawValue");
        return rawValue;
    }

    @Override // r4.v0
    public int g() {
        return this.f38677a;
    }

    @Override // r4.v0
    public String h(String displayName) {
        AbstractC3292y.i(displayName, "displayName");
        return displayName;
    }

    @Override // r4.v0
    public int i() {
        return this.f38680d;
    }

    @Override // r4.v0
    public String j(String userTyped) {
        AbstractC3292y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "toString(...)");
        return sb2;
    }

    @Override // r4.v0
    public String k() {
        return this.f38678b;
    }

    @Override // r4.v0
    public y0 l(String input) {
        AbstractC3292y.i(input, "input");
        if (l6.n.T(input)) {
            return z0.a.f38774c;
        }
        String a9 = AbstractC3919s.a(input);
        if (a9.length() < 4) {
            return new z0.b(AbstractC3533g.f35953F);
        }
        if (a9.length() > 4) {
            return new z0.c(AbstractC3533g.f35953F, null, false, 6, null);
        }
        a aVar = f38675h;
        Integer i8 = l6.n.i(l6.n.U0(a9, 2));
        if (i8 != null) {
            int intValue = i8.intValue();
            Integer i9 = l6.n.i(l6.n.V0(a9, 2));
            if (i9 != null) {
                return aVar.a(intValue, i9.intValue(), Calendar.getInstance().get(2) + 1, Calendar.getInstance().get(1));
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // r4.v0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public B d() {
        return this.f38681e;
    }
}
