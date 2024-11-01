package r4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.core.app.NotificationCompat;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.AbstractC3335a;
import o4.AbstractC3533g;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import r4.A0;
import r4.v0;
import r4.z0;

/* renamed from: r4.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3890A implements v0 {

    /* renamed from: h, reason: collision with root package name */
    public static final a f37849h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f37850i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f37851j;

    /* renamed from: a, reason: collision with root package name */
    private final int f37852a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37853b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37854c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37855d;

    /* renamed from: e, reason: collision with root package name */
    private final VisualTransformation f37856e;

    /* renamed from: f, reason: collision with root package name */
    private final q6.w f37857f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f37858g;

    /* renamed from: r4.A$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ s0 b(a aVar, String str, boolean z8, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                z8 = false;
            }
            return aVar.a(str, z8);
        }

        public final s0 a(String str, boolean z8) {
            return new s0(new C3890A(0, 1, null), z8, str);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        Pattern compile = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
        AbstractC3292y.h(compile, "compile(...)");
        f37851j = compile;
    }

    public C3890A(int i8) {
        this.f37852a = i8;
        this.f37853b = KeyboardCapitalization.Companion.m4873getNoneIUNYP9k();
        this.f37854c = NotificationCompat.CATEGORY_EMAIL;
        this.f37855d = KeyboardType.Companion.m4894getEmailPjHm6EE();
        this.f37857f = AbstractC3815N.a(null);
        this.f37858g = AbstractC3815N.a(Boolean.FALSE);
    }

    private final boolean m(String str) {
        int i8 = 0;
        for (int i9 = 0; i9 < str.length(); i9++) {
            if (str.charAt(i9) == '@') {
                i8++;
            }
        }
        if (i8 <= 1) {
            return false;
        }
        return true;
    }

    private final boolean n(String str) {
        if (!l6.n.G(str, "@", false, 2, null) || !new l6.j(".*@.*\\..+").e(str)) {
            return false;
        }
        return true;
    }

    @Override // r4.v0
    public InterfaceC3813L a() {
        return this.f37858g;
    }

    @Override // r4.v0
    public Integer b() {
        return Integer.valueOf(this.f37852a);
    }

    @Override // r4.v0
    public VisualTransformation d() {
        return this.f37856e;
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
        return this.f37853b;
    }

    @Override // r4.v0
    public String h(String displayName) {
        AbstractC3292y.i(displayName, "displayName");
        return displayName;
    }

    @Override // r4.v0
    public int i() {
        return this.f37855d;
    }

    @Override // r4.v0
    public String j(String userTyped) {
        AbstractC3292y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < userTyped.length(); i8++) {
            char charAt = userTyped.charAt(i8);
            if (!AbstractC3335a.c(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "toString(...)");
        return sb2;
    }

    @Override // r4.v0
    public String k() {
        return this.f37854c;
    }

    @Override // r4.v0
    public y0 l(String input) {
        AbstractC3292y.i(input, "input");
        if (input.length() == 0) {
            return z0.a.f38774c;
        }
        if (f37851j.matcher(input).matches()) {
            return A0.b.f37860a;
        }
        if (!n(input) && !m(input)) {
            return new z0.b(AbstractC3533g.f35949B);
        }
        return new z0.c(AbstractC3533g.f35949B, null, false, 6, null);
    }

    @Override // r4.v0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public q6.w c() {
        return this.f37857f;
    }

    public /* synthetic */ C3890A(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? AbstractC3533g.f35948A : i8);
    }
}
