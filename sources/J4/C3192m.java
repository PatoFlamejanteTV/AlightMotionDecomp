package j4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import r4.A0;
import r4.z0;

/* renamed from: j4.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3192m implements r4.v0 {

    /* renamed from: h, reason: collision with root package name */
    private static final a f34187h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f34188i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final int f34189a = KeyboardCapitalization.Companion.m4873getNoneIUNYP9k();

    /* renamed from: b, reason: collision with root package name */
    private final String f34190b = "bacs_debit_account_number";

    /* renamed from: c, reason: collision with root package name */
    private final int f34191c = g4.n.f32396d;

    /* renamed from: d, reason: collision with root package name */
    private final int f34192d = KeyboardType.Companion.m4896getNumberPasswordPjHm6EE();

    /* renamed from: e, reason: collision with root package name */
    private final VisualTransformation f34193e = VisualTransformation.Companion.getNone();

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3813L f34194f = AbstractC3815N.a(null);

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f34195g = AbstractC3815N.a(Boolean.FALSE);

    /* renamed from: j4.m$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @Override // r4.v0
    public InterfaceC3813L a() {
        return this.f34195g;
    }

    @Override // r4.v0
    public Integer b() {
        return Integer.valueOf(this.f34191c);
    }

    @Override // r4.v0
    public InterfaceC3813L c() {
        return this.f34194f;
    }

    @Override // r4.v0
    public VisualTransformation d() {
        return this.f34193e;
    }

    @Override // r4.v0
    public String e() {
        return "00012345";
    }

    @Override // r4.v0
    public String f(String rawValue) {
        AbstractC3292y.i(rawValue, "rawValue");
        return rawValue;
    }

    @Override // r4.v0
    public int g() {
        return this.f34189a;
    }

    @Override // r4.v0
    public String h(String displayName) {
        AbstractC3292y.i(displayName, "displayName");
        return displayName;
    }

    @Override // r4.v0
    public int i() {
        return this.f34192d;
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
        return l6.n.U0(sb2, 8);
    }

    @Override // r4.v0
    public String k() {
        return this.f34190b;
    }

    @Override // r4.v0
    public r4.y0 l(String input) {
        AbstractC3292y.i(input, "input");
        if (l6.n.T(input)) {
            return z0.a.f38774c;
        }
        if (input.length() < 8) {
            return new z0.b(g4.n.f32398e);
        }
        return A0.a.f37859a;
    }
}
