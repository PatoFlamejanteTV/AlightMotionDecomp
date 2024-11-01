package a4;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Z3.c f14121a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14122b;

    public l(Context context, Z3.c errorReporter) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(errorReporter, "errorReporter");
        this.f14121a = errorReporter;
        Context applicationContext = context.getApplicationContext();
        AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
        this.f14122b = applicationContext;
    }
}
