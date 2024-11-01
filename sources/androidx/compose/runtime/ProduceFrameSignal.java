package androidx.compose.runtime;

import Q5.I;
import Q5.s;
import kotlin.jvm.internal.AbstractC3292y;
import n6.C3472p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ProduceFrameSignal {
    private Object pendingFrameContinuation;

    public final Object awaitFrameRequest(Object obj, U5.d dVar) {
        Object obj2;
        Object obj3;
        C3472p c3472p;
        Object obj4;
        Object obj5;
        synchronized (obj) {
            Object obj6 = this.pendingFrameContinuation;
            obj2 = RecomposerKt.ProduceAnotherFrame;
            if (obj6 == obj2) {
                obj5 = RecomposerKt.FramePending;
                this.pendingFrameContinuation = obj5;
                return I.f8786a;
            }
            I i8 = I.f8786a;
            C3472p c3472p2 = new C3472p(V5.b.c(dVar), 1);
            c3472p2.B();
            synchronized (obj) {
                try {
                    Object obj7 = this.pendingFrameContinuation;
                    obj3 = RecomposerKt.ProduceAnotherFrame;
                    if (obj7 == obj3) {
                        obj4 = RecomposerKt.FramePending;
                        this.pendingFrameContinuation = obj4;
                        c3472p = c3472p2;
                    } else {
                        this.pendingFrameContinuation = c3472p2;
                        c3472p = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c3472p != null) {
                s.a aVar = s.f8810b;
                c3472p.resumeWith(s.b(I.f8786a));
            }
            Object y8 = c3472p2.y();
            if (y8 == V5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (y8 == V5.b.e()) {
                return y8;
            }
            return I.f8786a;
        }
    }

    public final U5.d requestFrameLocked() {
        Object obj;
        Object obj2;
        boolean d8;
        Object obj3;
        Object obj4;
        Object obj5 = this.pendingFrameContinuation;
        if (obj5 instanceof U5.d) {
            obj4 = RecomposerKt.FramePending;
            this.pendingFrameContinuation = obj4;
            return (U5.d) obj5;
        }
        obj = RecomposerKt.ProduceAnotherFrame;
        if (!AbstractC3292y.d(obj5, obj)) {
            obj2 = RecomposerKt.FramePending;
            d8 = AbstractC3292y.d(obj5, obj2);
        } else {
            d8 = true;
        }
        if (!d8) {
            if (obj5 == null) {
                obj3 = RecomposerKt.ProduceAnotherFrame;
                this.pendingFrameContinuation = obj3;
            } else {
                throw new IllegalStateException(("invalid pendingFrameContinuation " + obj5).toString());
            }
        }
        return null;
    }

    public final void takeFrameRequestLocked() {
        Object obj;
        Object obj2 = this.pendingFrameContinuation;
        obj = RecomposerKt.FramePending;
        if (obj2 == obj) {
            this.pendingFrameContinuation = null;
            return;
        }
        throw new IllegalStateException("frame not pending".toString());
    }
}
