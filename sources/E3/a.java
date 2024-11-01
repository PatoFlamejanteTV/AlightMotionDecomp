package E3;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1574a;

    /* renamed from: b, reason: collision with root package name */
    private final C0027a f1575b;

    /* renamed from: E3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0027a {

        /* renamed from: a, reason: collision with root package name */
        private final C2.c f1576a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f1577b;

        public C0027a(C2.c label, boolean z8) {
            AbstractC3292y.i(label, "label");
            this.f1576a = label;
            this.f1577b = z8;
        }

        public final C2.c a() {
            return this.f1576a;
        }

        public final boolean b() {
            return this.f1577b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0027a)) {
                return false;
            }
            C0027a c0027a = (C0027a) obj;
            if (AbstractC3292y.d(this.f1576a, c0027a.f1576a) && this.f1577b == c0027a.f1577b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f1576a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f1577b);
        }

        public String toString() {
            return "BuyButtonOverride(label=" + this.f1576a + ", lockEnabled=" + this.f1577b + ")";
        }
    }

    public a(boolean z8, C0027a c0027a) {
        this.f1574a = z8;
        this.f1575b = c0027a;
    }

    public final C0027a a() {
        return this.f1575b;
    }

    public final boolean b() {
        return this.f1574a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1574a == aVar.f1574a && AbstractC3292y.d(this.f1575b, aVar.f1575b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int a9 = androidx.compose.foundation.a.a(this.f1574a) * 31;
        C0027a c0027a = this.f1575b;
        if (c0027a == null) {
            hashCode = 0;
        } else {
            hashCode = c0027a.hashCode();
        }
        return a9 + hashCode;
    }

    public String toString() {
        return "BuyButtonState(visible=" + this.f1574a + ", buyButtonOverride=" + this.f1575b + ")";
    }

    public /* synthetic */ a(boolean z8, C0027a c0027a, int i8, AbstractC3284p abstractC3284p) {
        this(z8, (i8 & 2) != 0 ? null : c0027a);
    }
}
