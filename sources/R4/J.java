package r4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import r4.A0;
import r4.v0;
import r4.z0;

/* loaded from: classes4.dex */
public final class J implements v0 {

    /* renamed from: h, reason: collision with root package name */
    public static final a f38018h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f38019i = 8;

    /* renamed from: e, reason: collision with root package name */
    private final VisualTransformation f38024e;

    /* renamed from: a, reason: collision with root package name */
    private final int f38020a = v2.e.f40442e;

    /* renamed from: b, reason: collision with root package name */
    private final int f38021b = KeyboardCapitalization.Companion.m4875getWordsIUNYP9k();

    /* renamed from: c, reason: collision with root package name */
    private final String f38022c = "name";

    /* renamed from: d, reason: collision with root package name */
    private final int f38023d = KeyboardType.Companion.m4899getTextPjHm6EE();

    /* renamed from: f, reason: collision with root package name */
    private final q6.w f38025f = AbstractC3815N.a(null);

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f38026g = AbstractC3815N.a(Boolean.FALSE);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final s0 a(String str) {
            return new s0(new J(), false, str, 2, null);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @Override // r4.v0
    public InterfaceC3813L a() {
        return this.f38026g;
    }

    @Override // r4.v0
    public Integer b() {
        return Integer.valueOf(this.f38020a);
    }

    @Override // r4.v0
    public VisualTransformation d() {
        return this.f38024e;
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
        return this.f38021b;
    }

    @Override // r4.v0
    public String h(String displayName) {
        AbstractC3292y.i(displayName, "displayName");
        return displayName;
    }

    @Override // r4.v0
    public int i() {
        return this.f38023d;
    }

    @Override // r4.v0
    public String j(String userTyped) {
        AbstractC3292y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (Character.isLetter(charAt) || charAt == ' ') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "toString(...)");
        return sb2;
    }

    @Override // r4.v0
    public String k() {
        return this.f38022c;
    }

    @Override // r4.v0
    public y0 l(String input) {
        AbstractC3292y.i(input, "input");
        if (l6.n.T(input)) {
            return z0.a.f38774c;
        }
        return A0.b.f37860a;
    }

    @Override // r4.v0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public q6.w c() {
        return this.f38025f;
    }
}
