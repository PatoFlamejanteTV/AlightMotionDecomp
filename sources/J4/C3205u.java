package j4;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import com.stripe.android.view.C2673s;
import i6.C2975c;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import r4.A0;
import r4.v0;
import r4.z0;

/* renamed from: j4.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3205u implements r4.v0 {

    /* renamed from: i, reason: collision with root package name */
    private static final a f34274i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f34275j = 8;

    /* renamed from: k, reason: collision with root package name */
    private static final C2975c f34276k = new C2975c('0', '9');

    /* renamed from: a, reason: collision with root package name */
    private final List f34277a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34278b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34279c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f34280d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f34281e;

    /* renamed from: f, reason: collision with root package name */
    private final int f34282f;

    /* renamed from: g, reason: collision with root package name */
    private final int f34283g;

    /* renamed from: h, reason: collision with root package name */
    private final VisualTransformation f34284h;

    /* renamed from: j4.u$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: j4.u$b */
    /* loaded from: classes4.dex */
    public static final class b implements OffsetMapping {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34285a;

        b(String str) {
            this.f34285a = str;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int i8) {
            if (i8 > 2) {
                return i8 + this.f34285a.length();
            }
            return i8;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int i8) {
            if (i8 > 3) {
                return i8 - this.f34285a.length();
            }
            return i8;
        }
    }

    public C3205u(List banks) {
        AbstractC3292y.i(banks, "banks");
        this.f34277a = banks;
        this.f34278b = KeyboardCapitalization.Companion.m4873getNoneIUNYP9k();
        this.f34279c = "bsb";
        this.f34280d = AbstractC3815N.a(null);
        this.f34281e = AbstractC3815N.a(Boolean.FALSE);
        this.f34282f = AbstractC3394E.f35210Q;
        this.f34283g = KeyboardType.Companion.m4895getNumberPjHm6EE();
        this.f34284h = new VisualTransformation() { // from class: j4.t
            @Override // androidx.compose.ui.text.input.VisualTransformation
            public final TransformedText filter(AnnotatedString annotatedString) {
                TransformedText n8;
                n8 = C3205u.n(annotatedString);
                return n8;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransformedText n(AnnotatedString text) {
        AbstractC3292y.i(text, "text");
        StringBuilder sb = new StringBuilder();
        String text2 = text.getText();
        int i8 = 0;
        int i9 = 0;
        while (i8 < text2.length()) {
            int i10 = i9 + 1;
            sb.append(text2.charAt(i8));
            if (i9 == 2) {
                sb.append(" - ");
            }
            i8++;
            i9 = i10;
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "toString(...)");
        return new TransformedText(new AnnotatedString(sb2, null, null, 6, null), new b(" - "));
    }

    @Override // r4.v0
    public InterfaceC3813L a() {
        return this.f34281e;
    }

    @Override // r4.v0
    public Integer b() {
        return Integer.valueOf(this.f34282f);
    }

    @Override // r4.v0
    public InterfaceC3813L c() {
        return this.f34280d;
    }

    @Override // r4.v0
    public VisualTransformation d() {
        return this.f34284h;
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
        return this.f34278b;
    }

    @Override // r4.v0
    public String h(String displayName) {
        AbstractC3292y.i(displayName, "displayName");
        return displayName;
    }

    @Override // r4.v0
    public int i() {
        return this.f34283g;
    }

    @Override // r4.v0
    public String j(String userTyped) {
        AbstractC3292y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (f34276k.k(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "toString(...)");
        return l6.n.U0(sb2, 6);
    }

    @Override // r4.v0
    public String k() {
        return this.f34279c;
    }

    @Override // r4.v0
    public r4.y0 l(String input) {
        Object obj;
        AbstractC3292y.i(input, "input");
        if (l6.n.T(input)) {
            return z0.a.f38774c;
        }
        if (input.length() < 6) {
            return new z0.b(AbstractC3394E.f35211R);
        }
        Iterator it = this.f34277a.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (l6.n.B(input, ((C2673s.a) next).b(), false, 2, null)) {
                obj = next;
                break;
            }
        }
        if (((C2673s.a) obj) != null && input.length() <= 6) {
            return A0.a.f37859a;
        }
        return new z0.c(AbstractC3394E.f35212S, null, false, 6, null);
    }
}
