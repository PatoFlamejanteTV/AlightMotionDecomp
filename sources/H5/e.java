package H5;

import H5.d;
import i6.m;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3246a = new a();

    /* loaded from: classes5.dex */
    public static final class a {
        public final String a(String value, int i8) {
            AbstractC3292y.i(value, "value");
            if (i8 == value.length()) {
                int length = value.length() / 2;
                d.a aVar = d.f3245a;
                int a9 = aVar.a(n.T0(value, m.s(0, length)), length) + 65;
                int a10 = aVar.a(n.T0(value, m.s(length, value.length())), length) + 65;
                StringBuilder sb = new StringBuilder();
                sb.append((char) a9);
                sb.append((char) a10);
                return sb.toString();
            }
            a aVar2 = e.f3246a;
            throw new F5.e(AbstractC3292y.q("h.e", ": invalid bit length for language"));
        }
    }
}
