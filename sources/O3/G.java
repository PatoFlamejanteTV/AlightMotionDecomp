package O3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;

/* loaded from: classes4.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final int f7197a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7198b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7199c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7200d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f7201e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0 f7202f;

    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: O3.G$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0136a implements a {

            /* renamed from: a, reason: collision with root package name */
            private final boolean f7203a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f7204b;

            /* renamed from: c, reason: collision with root package name */
            private final Function0 f7205c;

            public C0136a(boolean z8, boolean z9, Function0 onEditIconPressed) {
                AbstractC3292y.i(onEditIconPressed, "onEditIconPressed");
                this.f7203a = z8;
                this.f7204b = z9;
                this.f7205c = onEditIconPressed;
            }

            public final boolean a() {
                return this.f7204b;
            }

            public final Function0 b() {
                return this.f7205c;
            }

            public final boolean c() {
                return this.f7203a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0136a)) {
                    return false;
                }
                C0136a c0136a = (C0136a) obj;
                if (this.f7203a == c0136a.f7203a && this.f7204b == c0136a.f7204b && AbstractC3292y.d(this.f7205c, c0136a.f7205c)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (((androidx.compose.foundation.a.a(this.f7203a) * 31) + androidx.compose.foundation.a.a(this.f7204b)) * 31) + this.f7205c.hashCode();
            }

            public String toString() {
                return "Maybe(isEditing=" + this.f7203a + ", canEdit=" + this.f7204b + ", onEditIconPressed=" + this.f7205c + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f7206a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 2105449614;
            }

            public String toString() {
                return "Never";
            }
        }
    }

    public G(int i8, int i9, boolean z8, boolean z9, boolean z10, Function0 onEditIconPressed) {
        AbstractC3292y.i(onEditIconPressed, "onEditIconPressed");
        this.f7197a = i8;
        this.f7198b = i9;
        this.f7199c = z8;
        this.f7200d = z9;
        this.f7201e = z10;
        this.f7202f = onEditIconPressed;
    }

    public final int a() {
        return this.f7198b;
    }

    public final int b() {
        if (this.f7201e) {
            return AbstractC3394E.f35235h0;
        }
        return AbstractC3394E.f35237i0;
    }

    public final int c() {
        return this.f7197a;
    }

    public final Function0 d() {
        return this.f7202f;
    }

    public final boolean e() {
        return this.f7200d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g8 = (G) obj;
        if (this.f7197a == g8.f7197a && this.f7198b == g8.f7198b && this.f7199c == g8.f7199c && this.f7200d == g8.f7200d && this.f7201e == g8.f7201e && AbstractC3292y.d(this.f7202f, g8.f7202f)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f7199c;
    }

    public final boolean g() {
        return this.f7201e;
    }

    public int hashCode() {
        return (((((((((this.f7197a * 31) + this.f7198b) * 31) + androidx.compose.foundation.a.a(this.f7199c)) * 31) + androidx.compose.foundation.a.a(this.f7200d)) * 31) + androidx.compose.foundation.a.a(this.f7201e)) * 31) + this.f7202f.hashCode();
    }

    public String toString() {
        return "PaymentSheetTopBarState(icon=" + this.f7197a + ", contentDescription=" + this.f7198b + ", showTestModeLabel=" + this.f7199c + ", showEditMenu=" + this.f7200d + ", isEditing=" + this.f7201e + ", onEditIconPressed=" + this.f7202f + ")";
    }
}
