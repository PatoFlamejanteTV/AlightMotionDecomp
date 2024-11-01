package E2;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1570a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1571b;

    /* renamed from: c, reason: collision with root package name */
    private final v2.d f1572c;

    public f(Context context) {
        boolean z8;
        AbstractC3292y.i(context, "context");
        if ((context.getApplicationInfo().flags & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f1570a = z8;
        this.f1572c = v2.d.f40434a.a(z8 || this.f1571b);
    }

    @Override // E2.h
    public void a(String message) {
        AbstractC3292y.i(message, "message");
        this.f1572c.c(message);
    }
}
