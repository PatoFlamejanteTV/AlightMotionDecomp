package j4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import i6.C2975c;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import r4.A0;
import r4.v0;
import r4.z0;

/* renamed from: j4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3182h implements r4.v0 {

    /* renamed from: h, reason: collision with root package name */
    private static final a f34127h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f34128i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final C2975c f34129j = new C2975c('0', '9');

    /* renamed from: c, reason: collision with root package name */
    private final VisualTransformation f34132c;

    /* renamed from: a, reason: collision with root package name */
    private final int f34130a = KeyboardCapitalization.Companion.m4873getNoneIUNYP9k();

    /* renamed from: b, reason: collision with root package name */
    private final String f34131b = "au_bank_account_number";

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f34133d = AbstractC3815N.a(null);

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f34134e = AbstractC3815N.a(Boolean.FALSE);

    /* renamed from: f, reason: collision with root package name */
    private final int f34135f = AbstractC3394E.f35206N;

    /* renamed from: g, reason: collision with root package name */
    private final int f34136g = KeyboardType.Companion.m4895getNumberPjHm6EE();

    /* renamed from: j4.h$a */
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
        return this.f34134e;
    }

    @Override // r4.v0
    public Integer b() {
        return Integer.valueOf(this.f34135f);
    }

    @Override // r4.v0
    public InterfaceC3813L c() {
        return this.f34133d;
    }

    @Override // r4.v0
    public VisualTransformation d() {
        return this.f34132c;
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
        return this.f34130a;
    }

    @Override // r4.v0
    public String h(String displayName) {
        AbstractC3292y.i(displayName, "displayName");
        return displayName;
    }

    @Override // r4.v0
    public int i() {
        return this.f34136g;
    }

    @Override // r4.v0
    public String j(String userTyped) {
        AbstractC3292y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (f34129j.k(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "toString(...)");
        return l6.n.U0(sb2, 9);
    }

    @Override // r4.v0
    public String k() {
        return this.f34131b;
    }

    @Override // r4.v0
    public r4.y0 l(String input) {
        AbstractC3292y.i(input, "input");
        if (l6.n.T(input)) {
            return z0.a.f38774c;
        }
        if (input.length() < 9) {
            return new z0.b(AbstractC3394E.f35208O);
        }
        return A0.a.f37859a;
    }
}
