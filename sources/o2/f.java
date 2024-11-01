package O2;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.m;

/* loaded from: classes4.dex */
public final class f {

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f7131a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p3.i f7132b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v2.d f7133c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, p3.i iVar, v2.d dVar) {
            super(1);
            this.f7131a = context;
            this.f7132b = iVar;
            this.f7133c = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.googlepaylauncher.c invoke(N2.d environment) {
            AbstractC3292y.i(environment, "environment");
            return new com.stripe.android.googlepaylauncher.c(this.f7131a, environment, new m.a(false, null, false, 7, null), true, true, null, this.f7132b, this.f7133c, 32, null);
        }
    }

    public final Function1 a(Context appContext, v2.d logger, p3.i errorReporter) {
        AbstractC3292y.i(appContext, "appContext");
        AbstractC3292y.i(logger, "logger");
        AbstractC3292y.i(errorReporter, "errorReporter");
        return new a(appContext, errorReporter, logger);
    }
}
