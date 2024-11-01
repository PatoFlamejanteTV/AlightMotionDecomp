package g3;

import Q5.s;
import com.stripe.android.view.X;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.AbstractC3335a;

/* loaded from: classes4.dex */
public abstract class w {

    /* loaded from: classes4.dex */
    public static final class a extends w {

        /* renamed from: f, reason: collision with root package name */
        public static final C0745a f32265f = new C0745a(null);

        /* renamed from: g, reason: collision with root package name */
        private static final a f32266g = new a("", "");

        /* renamed from: a, reason: collision with root package name */
        private final String f32267a;

        /* renamed from: b, reason: collision with root package name */
        private final String f32268b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f32269c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f32270d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f32271e;

        /* renamed from: g3.w$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0745a {
            private C0745a() {
            }

            public final a a(String input) {
                AbstractC3292y.i(input, "input");
                for (int i8 = 0; i8 < input.length(); i8++) {
                    char charAt = input.charAt(i8);
                    if (!Character.isDigit(charAt) && !AbstractC3335a.c(charAt) && charAt != '/') {
                        return b();
                    }
                }
                StringBuilder sb = new StringBuilder();
                int length = input.length();
                for (int i9 = 0; i9 < length; i9++) {
                    char charAt2 = input.charAt(i9);
                    if (Character.isDigit(charAt2)) {
                        sb.append(charAt2);
                    }
                }
                String sb2 = sb.toString();
                AbstractC3292y.h(sb2, "toString(...)");
                return new a(l6.n.U0(sb2, 2), l6.n.P0(sb2, 2));
            }

            public final a b() {
                return a.f32266g;
            }

            public /* synthetic */ C0745a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String month, String year) {
            super(null);
            Object b9;
            boolean z8;
            boolean z9;
            AbstractC3292y.i(month, "month");
            AbstractC3292y.i(year, "year");
            this.f32267a = month;
            this.f32268b = year;
            boolean z10 = false;
            try {
                s.a aVar = Q5.s.f8810b;
                int parseInt = Integer.parseInt(month);
                if (1 <= parseInt && parseInt < 13) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                b9 = Q5.s.b(Boolean.valueOf(z9));
            } catch (Throwable th) {
                s.a aVar2 = Q5.s.f8810b;
                b9 = Q5.s.b(Q5.t.a(th));
            }
            this.f32269c = ((Boolean) (Q5.s.g(b9) ? Boolean.FALSE : b9)).booleanValue();
            if (this.f32267a.length() + this.f32268b.length() == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f32270d = z8;
            if (!z8 && this.f32267a.length() + this.f32268b.length() > 0) {
                z10 = true;
            }
            this.f32271e = z10;
        }

        public final String b() {
            return this.f32267a;
        }

        public final String c() {
            return this.f32268b;
        }

        public final boolean d() {
            return this.f32270d;
        }

        public final boolean e() {
            return this.f32269c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3292y.d(this.f32267a, aVar.f32267a) && AbstractC3292y.d(this.f32268b, aVar.f32268b)) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.f32271e;
        }

        public final b g() {
            Object b9;
            String str = this.f32267a;
            String str2 = this.f32268b;
            try {
                s.a aVar = Q5.s.f8810b;
                b9 = Q5.s.b(new b(Integer.parseInt(str), X.f28885a.a(Integer.parseInt(str2))));
            } catch (Throwable th) {
                s.a aVar2 = Q5.s.f8810b;
                b9 = Q5.s.b(Q5.t.a(th));
            }
            if (Q5.s.g(b9)) {
                b9 = null;
            }
            return (b) b9;
        }

        public int hashCode() {
            return (this.f32267a.hashCode() * 31) + this.f32268b.hashCode();
        }

        public String toString() {
            return "Unvalidated(month=" + this.f32267a + ", year=" + this.f32268b + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends w {

        /* renamed from: a, reason: collision with root package name */
        private final int f32272a;

        /* renamed from: b, reason: collision with root package name */
        private final int f32273b;

        public b(int i8, int i9) {
            super(null);
            this.f32272a = i8;
            this.f32273b = i9;
        }

        public final int a() {
            return this.f32272a;
        }

        public final int b() {
            return this.f32273b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f32272a == bVar.f32272a && this.f32273b == bVar.f32273b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f32272a * 31) + this.f32273b;
        }

        public String toString() {
            return "Validated(month=" + this.f32272a + ", year=" + this.f32273b + ")";
        }
    }

    private w() {
    }

    public /* synthetic */ w(AbstractC3284p abstractC3284p) {
        this();
    }
}
