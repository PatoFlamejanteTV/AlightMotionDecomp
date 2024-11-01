package H5;

import com.inmobi.cmp.model.ChoiceError;
import kotlin.jvm.internal.AbstractC3292y;
import l6.AbstractC3335a;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0064a f3241a = new C0064a();

    /* renamed from: H5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0064a {
        public final long a(String value, int i8) {
            long parseLong;
            AbstractC3292y.i(value, "value");
            if (i8 == value.length()) {
                AbstractC3292y.i(value, "value");
                if (i8 != value.length()) {
                    A5.b.a(A5.b.f238a, ChoiceError.ENCODE_INVALID_BIT_LENGTH, null, null, A5.c.CONSOLE, null, 22);
                    parseLong = -1;
                } else {
                    parseLong = Long.parseLong(value, AbstractC3335a.a(2));
                }
                return parseLong * 100;
            }
            C0064a c0064a = a.f3241a;
            throw new F5.e(AbstractC3292y.q("h.a", ": invalid bit length"));
        }
    }
}
