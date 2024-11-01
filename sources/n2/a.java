package N2;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3292y;
import r0.AbstractC3883v;
import r0.C3875m;

/* loaded from: classes4.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6432a;

    public a(Context context) {
        AbstractC3292y.i(context, "context");
        this.f6432a = context;
    }

    @Override // N2.g
    public C3875m a(d environment) {
        AbstractC3292y.i(environment, "environment");
        AbstractC3883v.a a9 = new AbstractC3883v.a.C0841a().b(environment.b()).a();
        AbstractC3292y.h(a9, "build(...)");
        C3875m a10 = AbstractC3883v.a(this.f6432a, a9);
        AbstractC3292y.h(a10, "getPaymentsClient(...)");
        return a10;
    }
}
