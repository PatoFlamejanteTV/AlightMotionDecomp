package r4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q6.AbstractC3815N;
import r4.v0;

/* loaded from: classes4.dex */
public class r0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f38594a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38595b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38596c;

    /* renamed from: d, reason: collision with root package name */
    private final q6.w f38597d;

    /* renamed from: e, reason: collision with root package name */
    private final String f38598e;

    /* renamed from: f, reason: collision with root package name */
    private final VisualTransformation f38599f;

    /* renamed from: g, reason: collision with root package name */
    private final q6.w f38600g;

    /* loaded from: classes4.dex */
    public static final class a implements y0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38601a;

        a(String str) {
            this.f38601a = str;
        }

        @Override // r4.y0
        public boolean a() {
            return !l6.n.T(this.f38601a);
        }

        @Override // r4.y0
        public boolean b() {
            return l6.n.T(this.f38601a);
        }

        @Override // r4.y0
        public boolean c(boolean z8) {
            return false;
        }

        @Override // r4.y0
        public boolean d() {
            return false;
        }

        @Override // r4.y0
        public C getError() {
            return null;
        }
    }

    public /* synthetic */ r0(Integer num, int i8, int i9, q6.w wVar, AbstractC3284p abstractC3284p) {
        this(num, i8, i9, wVar);
    }

    @Override // r4.v0
    public Integer b() {
        return this.f38594a;
    }

    @Override // r4.v0
    public VisualTransformation d() {
        return this.f38599f;
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
        return this.f38595b;
    }

    @Override // r4.v0
    public String h(String displayName) {
        AbstractC3292y.i(displayName, "displayName");
        return displayName;
    }

    @Override // r4.v0
    public int i() {
        return this.f38596c;
    }

    @Override // r4.v0
    public String j(String userTyped) {
        AbstractC3292y.i(userTyped, "userTyped");
        KeyboardType.Companion companion = KeyboardType.Companion;
        if (R5.a0.i(KeyboardType.m4876boximpl(companion.m4895getNumberPjHm6EE()), KeyboardType.m4876boximpl(companion.m4896getNumberPasswordPjHm6EE())).contains(KeyboardType.m4876boximpl(i()))) {
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
        return userTyped;
    }

    @Override // r4.v0
    public String k() {
        return this.f38598e;
    }

    @Override // r4.v0
    public y0 l(String input) {
        AbstractC3292y.i(input, "input");
        return new a(input);
    }

    @Override // r4.v0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public q6.w a() {
        return this.f38600g;
    }

    @Override // r4.v0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public q6.w c() {
        return this.f38597d;
    }

    private r0(Integer num, int i8, int i9, q6.w trailingIcon) {
        AbstractC3292y.i(trailingIcon, "trailingIcon");
        this.f38594a = num;
        this.f38595b = i8;
        this.f38596c = i9;
        this.f38597d = trailingIcon;
        this.f38598e = "generic_text";
        this.f38600g = AbstractC3815N.a(Boolean.FALSE);
    }

    public /* synthetic */ r0(Integer num, int i8, int i9, q6.w wVar, int i10, AbstractC3284p abstractC3284p) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? KeyboardCapitalization.Companion.m4875getWordsIUNYP9k() : i8, (i10 & 4) != 0 ? KeyboardType.Companion.m4899getTextPjHm6EE() : i9, (i10 & 8) != 0 ? AbstractC3815N.a(null) : wVar, null);
    }
}
