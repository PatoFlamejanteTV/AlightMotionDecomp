package H5;

import kotlin.jvm.internal.AbstractC3292y;
import l6.AbstractC3335a;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3245a = new a();

    /* loaded from: classes5.dex */
    public static final class a {
        public final int a(String value, int i8) {
            AbstractC3292y.i(value, "value");
            if (i8 == value.length()) {
                return Integer.parseInt(value, AbstractC3335a.a(2));
            }
            a aVar = d.f3245a;
            throw new F5.e(AbstractC3292y.q("h.d", ": invalid bit length"));
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x004d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String b(java.lang.Object r10, int r11) {
            /*
                r9 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.AbstractC3292y.i(r10, r0)
                boolean r0 = r10 instanceof java.lang.Integer
                java.lang.String r1 = "h.d"
                java.lang.String r2 = "toString(this, checkRadix(radix))"
                r3 = 2
                if (r0 == 0) goto L27
                r0 = r10
                java.lang.Number r0 = (java.lang.Number) r0
                int r4 = r0.intValue()
                if (r4 < 0) goto L27
                int r0 = r0.intValue()
                int r3 = l6.AbstractC3335a.a(r3)
                java.lang.String r0 = java.lang.Integer.toString(r0, r3)
                kotlin.jvm.internal.AbstractC3292y.h(r0, r2)
                goto L47
            L27:
                boolean r0 = r10 instanceof java.lang.Long
                if (r0 == 0) goto L78
                r0 = r10
                java.lang.Number r0 = (java.lang.Number) r0
                long r4 = r0.longValue()
                r6 = 0
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 < 0) goto L78
                long r4 = r0.longValue()
                int r0 = l6.AbstractC3335a.a(r3)
                java.lang.String r0 = java.lang.Long.toString(r4, r0)
                kotlin.jvm.internal.AbstractC3292y.h(r0, r2)
            L47:
                int r2 = r0.length()
                if (r2 > r11) goto L54
                r10 = 48
                java.lang.String r10 = l6.n.e0(r0, r11, r10)
                return r10
            L54:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                H5.d$a r2 = H5.d.f3245a
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                r0.append(r10)
                java.lang.String r10 = " too large to encode into "
                r0.append(r10)
                r0.append(r11)
                java.lang.String r10 = r0.toString()
                F5.e r11 = new F5.e
                r11.<init>(r10)
                throw r11
            L78:
                H5.d$a r10 = H5.d.f3245a
                java.lang.String r10 = ": incorrect format passed"
                java.lang.String r10 = kotlin.jvm.internal.AbstractC3292y.q(r1, r10)
                F5.e r11 = new F5.e
                r11.<init>(r10)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: H5.d.a.b(java.lang.Object, int):java.lang.String");
        }
    }
}
