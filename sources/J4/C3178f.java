package j4;

import R5.AbstractC1435t;
import android.content.res.Resources;
import androidx.compose.ui.text.intl.Locale;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q6.InterfaceC3813L;
import r4.D;

/* renamed from: j4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3178f implements r4.D {

    /* renamed from: e, reason: collision with root package name */
    public static final a f34116e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f34117f = 8;

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f34118a;

    /* renamed from: b, reason: collision with root package name */
    private final r4.r f34119b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34120c;

    /* renamed from: d, reason: collision with root package name */
    private final C2.c f34121d;

    /* renamed from: j4.f$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final boolean a() {
            return R5.a0.i("GB", "ES", "FR", "IT").contains(Locale.Companion.getCurrent().getRegion());
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C3178f(r4.G identifier, r4.r rVar) {
        AbstractC3292y.i(identifier, "identifier");
        this.f34118a = identifier;
        this.f34119b = rVar;
    }

    private final String h(Locale locale) {
        String language = locale.getLanguage();
        java.util.Locale locale2 = java.util.Locale.ROOT;
        String lowerCase = language.toLowerCase(locale2);
        AbstractC3292y.h(lowerCase, "toLowerCase(...)");
        String upperCase = locale.getRegion().toUpperCase(locale2);
        AbstractC3292y.h(upperCase, "toUpperCase(...)");
        return lowerCase + "_" + upperCase;
    }

    @Override // r4.D
    public r4.G a() {
        return this.f34118a;
    }

    @Override // r4.D
    public C2.c b() {
        return this.f34121d;
    }

    @Override // r4.D
    public boolean c() {
        return this.f34120c;
    }

    @Override // r4.D
    public InterfaceC3813L d() {
        return A4.g.n(AbstractC1435t.m());
    }

    @Override // r4.D
    public InterfaceC3813L e() {
        return D.a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3178f)) {
            return false;
        }
        C3178f c3178f = (C3178f) obj;
        if (AbstractC3292y.d(this.f34118a, c3178f.f34118a) && AbstractC3292y.d(this.f34119b, c3178f.f34119b)) {
            return true;
        }
        return false;
    }

    public final String f() {
        String format = String.format("https://static.afterpay.com/modal/%s.html", Arrays.copyOf(new Object[]{h(Locale.Companion.getCurrent())}, 1));
        AbstractC3292y.h(format, "format(...)");
        return format;
    }

    public final String g(Resources resources) {
        AbstractC3292y.i(resources, "resources");
        String string = resources.getString(g4.n.f32390a);
        AbstractC3292y.h(string, "getString(...)");
        return l6.n.z(string, "<img/>", "<img/> <b>ⓘ</b>", false, 4, null);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f34118a.hashCode() * 31;
        r4.r rVar = this.f34119b;
        if (rVar == null) {
            hashCode = 0;
        } else {
            hashCode = rVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "AfterpayClearpayHeaderElement(identifier=" + this.f34118a + ", controller=" + this.f34119b + ")";
    }

    public /* synthetic */ C3178f(r4.G g8, r4.r rVar, int i8, AbstractC3284p abstractC3284p) {
        this(g8, (i8 & 2) != 0 ? null : rVar);
    }
}
