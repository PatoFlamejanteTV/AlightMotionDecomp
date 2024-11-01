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
public final class Q0 implements r4.v0 {

    /* renamed from: f, reason: collision with root package name */
    private final VisualTransformation f33971f;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f33966a = Q5.l.b(a.f33974a);

    /* renamed from: b, reason: collision with root package name */
    private final int f33967b = g4.n.f32367D0;

    /* renamed from: c, reason: collision with root package name */
    private final int f33968c = KeyboardCapitalization.Companion.m4873getNoneIUNYP9k();

    /* renamed from: d, reason: collision with root package name */
    private final String f33969d = "upi_id";

    /* renamed from: e, reason: collision with root package name */
    private final int f33970e = KeyboardType.Companion.m4894getEmailPjHm6EE();

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f33972g = AbstractC3815N.a(null);

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3813L f33973h = AbstractC3815N.a(Boolean.FALSE);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33974a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l6.j invoke() {
            return new l6.j("[a-zA-Z0-9.\\-_]{2,256}@[a-zA-Z]{2,64}");
        }
    }

    private final l6.j m() {
        return (l6.j) this.f33966a.getValue();
    }

    @Override // r4.v0
    public InterfaceC3813L a() {
        return this.f33973h;
    }

    @Override // r4.v0
    public Integer b() {
        return Integer.valueOf(this.f33967b);
    }

    @Override // r4.v0
    public InterfaceC3813L c() {
        return this.f33972g;
    }

    @Override // r4.v0
    public VisualTransformation d() {
        return this.f33971f;
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
        return this.f33968c;
    }

    @Override // r4.v0
    public String h(String displayName) {
        AbstractC3292y.i(displayName, "displayName");
        return displayName;
    }

    @Override // r4.v0
    public int i() {
        return this.f33970e;
    }

    @Override // r4.v0
    public String j(String userTyped) {
        AbstractC3292y.i(userTyped, "userTyped");
        return l6.n.M0(userTyped).toString();
    }

    @Override // r4.v0
    public String k() {
        return this.f33969d;
    }

    @Override // r4.v0
    public r4.y0 l(String input) {
        boolean z8;
        AbstractC3292y.i(input, "input");
        if (m().e(input) && input.length() <= 30) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (input.length() == 0) {
            return z0.a.f38774c;
        }
        if (z8) {
            return A0.b.f37860a;
        }
        return new z0.b(g4.n.f32438y);
    }
}
