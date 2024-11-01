package j4;

import Q5.InterfaceC1416k;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import r4.A0;
import r4.v0;
import r4.z0;

/* loaded from: classes4.dex */
public final class r implements r4.v0 {

    /* renamed from: f, reason: collision with root package name */
    private final VisualTransformation f34251f;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f34246a = Q5.l.b(a.f34254a);

    /* renamed from: b, reason: collision with root package name */
    private final int f34247b = g4.n.f32410k;

    /* renamed from: c, reason: collision with root package name */
    private final int f34248c = KeyboardCapitalization.Companion.m4873getNoneIUNYP9k();

    /* renamed from: d, reason: collision with root package name */
    private final String f34249d = "blik_code";

    /* renamed from: e, reason: collision with root package name */
    private final int f34250e = KeyboardType.Companion.m4895getNumberPjHm6EE();

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f34252g = AbstractC3815N.a(null);

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3813L f34253h = AbstractC3815N.a(Boolean.FALSE);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34254a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l6.j invoke() {
            return new l6.j("^[0-9]{6}$");
        }
    }

    private final l6.j m() {
        return (l6.j) this.f34246a.getValue();
    }

    @Override // r4.v0
    public InterfaceC3813L a() {
        return this.f34253h;
    }

    @Override // r4.v0
    public Integer b() {
        return Integer.valueOf(this.f34247b);
    }

    @Override // r4.v0
    public InterfaceC3813L c() {
        return this.f34252g;
    }

    @Override // r4.v0
    public VisualTransformation d() {
        return this.f34251f;
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
        return this.f34248c;
    }

    @Override // r4.v0
    public String h(String displayName) {
        AbstractC3292y.i(displayName, "displayName");
        return displayName;
    }

    @Override // r4.v0
    public int i() {
        return this.f34250e;
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
        return this.f34249d;
    }

    @Override // r4.v0
    public r4.y0 l(String input) {
        AbstractC3292y.i(input, "input");
        boolean e8 = m().e(input);
        if (input.length() == 0) {
            return z0.a.f38774c;
        }
        if (e8) {
            return A0.b.f37860a;
        }
        for (int i8 = 0; i8 < input.length(); i8++) {
            if (!Character.isDigit(input.charAt(i8))) {
                return new z0.c(g4.n.f32436x, null, false, 6, null);
            }
        }
        if (input.length() < 6) {
            return new z0.b(g4.n.f32434w);
        }
        return new z0.c(g4.n.f32436x, null, false, 6, null);
    }
}
