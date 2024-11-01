package p2;

import R5.a0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: p2.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3566h {

    /* renamed from: a, reason: collision with root package name */
    private static final a f36136a = new a(null);

    /* renamed from: p2.h$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: p2.h$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3566h {

        /* renamed from: b, reason: collision with root package name */
        private final String f36137b;

        /* renamed from: c, reason: collision with root package name */
        private final String f36138c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String denormalized) {
            super(null);
            AbstractC3292y.i(denormalized, "denormalized");
            this.f36137b = denormalized;
            StringBuilder sb = new StringBuilder();
            int length = denormalized.length();
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = denormalized.charAt(i8);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "toString(...)");
            this.f36138c = sb2;
        }

        private final boolean b(int i8) {
            return a0.i(3, Integer.valueOf(i8)).contains(Integer.valueOf(this.f36138c.length()));
        }

        public final String a() {
            return this.f36138c;
        }

        public final boolean c(int i8) {
            if ((!l6.n.T(this.f36138c)) && !b(i8)) {
                return true;
            }
            return false;
        }

        public final c d(int i8) {
            if (b(i8)) {
                return new c(this.f36138c);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3292y.d(this.f36137b, ((b) obj).f36137b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f36137b.hashCode();
        }

        public String toString() {
            return "Unvalidated(denormalized=" + this.f36137b + ")";
        }
    }

    /* renamed from: p2.h$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3566h {

        /* renamed from: b, reason: collision with root package name */
        private final String f36139b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String value) {
            super(null);
            AbstractC3292y.i(value, "value");
            this.f36139b = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3292y.d(this.f36139b, ((c) obj).f36139b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f36139b.hashCode();
        }

        public String toString() {
            return "Validated(value=" + this.f36139b + ")";
        }
    }

    private AbstractC3566h() {
    }

    public /* synthetic */ AbstractC3566h(AbstractC3284p abstractC3284p) {
        this();
    }
}
