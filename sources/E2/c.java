package E2;

import E2.d;
import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import m6.AbstractC3376c;
import m6.C3374a;
import m6.EnumC3377d;

/* loaded from: classes4.dex */
public final class c implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f1550b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final c f1551c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Map f1552a = new LinkedHashMap();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final c a() {
            return c.f1551c;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private c() {
    }

    @Override // E2.d
    public void a(d.b key, boolean z8) {
        AbstractC3292y.i(key, "key");
        if (z8 || !this.f1552a.containsKey(key)) {
            this.f1552a.put(key, Long.valueOf(SystemClock.uptimeMillis()));
        }
    }

    @Override // E2.d
    public C3374a b(d.b key) {
        AbstractC3292y.i(key, "key");
        Long l8 = (Long) this.f1552a.remove(key);
        if (l8 != null) {
            long uptimeMillis = SystemClock.uptimeMillis() - l8.longValue();
            C3374a.C0804a c0804a = C3374a.f35036b;
            return C3374a.e(AbstractC3376c.t(uptimeMillis, EnumC3377d.f35045d));
        }
        return null;
    }
}
