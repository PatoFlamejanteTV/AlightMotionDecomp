package j4;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import i6.C2975c;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.AbstractC3394E;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import r4.A0;
import r4.v0;
import r4.x0;
import r4.z0;

/* renamed from: j4.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3189k0 implements r4.v0 {

    /* renamed from: h, reason: collision with root package name */
    private static final a f34168h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f34169i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final List f34170j = AbstractC1435t.G0(AbstractC1435t.F0(new C2975c('0', '9'), new C2975c('a', 'z')), new C2975c('A', 'Z'));

    /* renamed from: a, reason: collision with root package name */
    private final int f34171a = KeyboardCapitalization.Companion.m4872getCharactersIUNYP9k();

    /* renamed from: b, reason: collision with root package name */
    private final String f34172b = "iban";

    /* renamed from: c, reason: collision with root package name */
    private final int f34173c = g4.n.f32424r;

    /* renamed from: d, reason: collision with root package name */
    private final int f34174d = KeyboardType.Companion.m4892getAsciiPjHm6EE();

    /* renamed from: e, reason: collision with root package name */
    private final q6.w f34175e = AbstractC3815N.a(new x0.c(n2.z.f35500o, null, true, null, 10, null));

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3813L f34176f = AbstractC3815N.a(Boolean.FALSE);

    /* renamed from: g, reason: collision with root package name */
    private final VisualTransformation f34177g = new VisualTransformation() { // from class: j4.j0
        @Override // androidx.compose.ui.text.input.VisualTransformation
        public final TransformedText filter(AnnotatedString annotatedString) {
            TransformedText p8;
            p8 = C3189k0.p(annotatedString);
            return p8;
        }
    };

    /* renamed from: j4.k0$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j4.k0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f34178a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(l6.h it) {
            AbstractC3292y.i(it, "it");
            return String.valueOf(l6.n.Q0(it.getValue()) - '7');
        }
    }

    /* renamed from: j4.k0$c */
    /* loaded from: classes4.dex */
    public static final class c implements OffsetMapping {
        c() {
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int i8) {
            return i8 + (i8 / 4);
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int i8) {
            return i8 - (i8 / 5);
        }
    }

    private final boolean o(String str) {
        String upperCase = (l6.n.V0(str, str.length() - 4) + l6.n.U0(str, 4)).toUpperCase(Locale.ROOT);
        AbstractC3292y.h(upperCase, "toUpperCase(...)");
        return new BigInteger(new l6.j("[A-Z]").g(upperCase, b.f34178a)).mod(new BigInteger("97")).equals(BigInteger.ONE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransformedText p(AnnotatedString text) {
        AbstractC3292y.i(text, "text");
        StringBuilder sb = new StringBuilder();
        String text2 = text.getText();
        int i8 = 0;
        int i9 = 0;
        while (i8 < text2.length()) {
            int i10 = i9 + 1;
            sb.append(text2.charAt(i8));
            if (i9 % 4 == 3 && i9 < 33) {
                sb.append(" ");
            }
            i8++;
            i9 = i10;
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "toString(...)");
        return new TransformedText(new AnnotatedString(sb2, null, null, 6, null), new c());
    }

    @Override // r4.v0
    public InterfaceC3813L a() {
        return this.f34176f;
    }

    @Override // r4.v0
    public Integer b() {
        return Integer.valueOf(this.f34173c);
    }

    @Override // r4.v0
    public VisualTransformation d() {
        return this.f34177g;
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
        return this.f34171a;
    }

    @Override // r4.v0
    public String h(String displayName) {
        AbstractC3292y.i(displayName, "displayName");
        return displayName;
    }

    @Override // r4.v0
    public int i() {
        return this.f34174d;
    }

    @Override // r4.v0
    public String j(String userTyped) {
        AbstractC3292y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (f34170j.contains(Character.valueOf(charAt))) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "toString(...)");
        String upperCase = l6.n.U0(sb2, 34).toUpperCase(Locale.ROOT);
        AbstractC3292y.h(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @Override // r4.v0
    public String k() {
        return this.f34172b;
    }

    @Override // r4.v0
    public r4.y0 l(String input) {
        AbstractC3292y.i(input, "input");
        if (l6.n.T(input)) {
            return z0.a.f38774c;
        }
        String upperCase = l6.n.U0(input, 2).toUpperCase(Locale.ROOT);
        AbstractC3292y.h(upperCase, "toUpperCase(...)");
        for (int i8 = 0; i8 < upperCase.length(); i8++) {
            if (Character.isDigit(upperCase.charAt(i8))) {
                return new z0.c(g4.n.f32430u, null, false, 6, null);
            }
        }
        if (upperCase.length() < 2) {
            return new z0.b(g4.n.f32426s);
        }
        String[] iSOCountries = Locale.getISOCountries();
        AbstractC3292y.h(iSOCountries, "getISOCountries(...)");
        if (!AbstractC1428l.W(iSOCountries, upperCase)) {
            return new z0.c(g4.n.f32428t, new String[]{upperCase}, false, 4, null);
        }
        if (input.length() < 8) {
            return new z0.b(g4.n.f32426s);
        }
        if (o(input)) {
            if (input.length() == 34) {
                return A0.a.f37859a;
            }
            return A0.b.f37860a;
        }
        return new z0.b(AbstractC3394E.f35259t0);
    }

    @Override // r4.v0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public q6.w c() {
        return this.f34175e;
    }
}
