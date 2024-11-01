package D6;

import E6.M;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
final class n extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(f configuration, F6.b module) {
        super(configuration, module, null);
        AbstractC3292y.i(configuration, "configuration");
        AbstractC3292y.i(module, "module");
        g();
    }

    private final void g() {
        if (AbstractC3292y.d(e(), F6.c.a())) {
            return;
        }
        e().a(new M(d().n(), d().d()));
    }
}
