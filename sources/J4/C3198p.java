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

/* renamed from: j4.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3198p implements r4.v0 {

    /* renamed from: h, reason: collision with root package name */
    private static final a f34226h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f34227i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final int f34228a = KeyboardCapitalization.Companion.m4873getNoneIUNYP9k();

    /* renamed from: b, reason: collision with root package name */
    private final String f34229b = "bacs_debit_sort_code";

    /* renamed from: c, reason: collision with root package name */
    private final int f34230c = g4.n.f32404h;

    /* renamed from: d, reason: collision with root package name */
    private final int f34231d = KeyboardType.Companion.m4896getNumberPasswordPjHm6EE();

    /* renamed from: e, reason: collision with root package name */
    private final VisualTransformation f34232e = C3200q.f34241a;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3813L f34233f = AbstractC3815N.a(null);

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f34234g = AbstractC3815N.a(Boolean.FALSE);

    /* renamed from: j4.p$a */
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
        return this.f34234g;
    }

    @Override // r4.v0
    public Integer b() {
        return Integer.valueOf(this.f34230c);
    }

    @Override // r4.v0
    public InterfaceC3813L c() {
        return this.f34233f;
    }

    @Override // r4.v0
    public VisualTransformation d() {
        return this.f34232e;
    }

    @Override // r4.v0
    public String e() {
        return "10-80-00";
    }

    @Override // r4.v0
    public String f(String rawValue) {
        AbstractC3292y.i(rawValue, "rawValue");
        return rawValue;
    }

    @Override // r4.v0
    public int g() {
        return this.f34228a;
    }

    @Override // r4.v0
    public String h(String displayName) {
        AbstractC3292y.i(displayName, "displayName");
        return displayName;
    }

    @Override // r4.v0
    public int i() {
        return this.f34231d;
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
        return l6.n.U0(sb2, 6);
    }

    @Override // r4.v0
    public String k() {
        return this.f34229b;
    }

    @Override // r4.v0
    public r4.y0 l(String input) {
        AbstractC3292y.i(input, "input");
        if (l6.n.T(input)) {
            return z0.a.f38774c;
        }
        if (input.length() < 6) {
            return new z0.b(g4.n.f32406i);
        }
        return A0.a.f37859a;
    }
}
