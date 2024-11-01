package androidx.lifecycle.viewmodel.internal;

import Q5.q;
import U5.g;
import U5.h;
import kotlin.jvm.internal.AbstractC3292y;
import n6.C3445b0;
import n6.M;
import n6.U0;

/* loaded from: classes3.dex */
public final class CloseableCoroutineScopeKt {
    public static final String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    public static final CloseableCoroutineScope asCloseable(M m8) {
        AbstractC3292y.i(m8, "<this>");
        return new CloseableCoroutineScope(m8);
    }

    public static final CloseableCoroutineScope createViewModelScope() {
        g gVar;
        try {
            gVar = C3445b0.c().E();
        } catch (q unused) {
            gVar = h.f10149a;
        } catch (IllegalStateException unused2) {
            gVar = h.f10149a;
        }
        return new CloseableCoroutineScope(gVar.plus(U0.b(null, 1, null)));
    }
}
