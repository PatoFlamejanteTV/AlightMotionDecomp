package kotlin.coroutines.jvm.internal;

import Q5.s;
import Q5.t;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class a implements U5.d, e, Serializable {
    private final U5.d completion;

    public a(U5.d dVar) {
        this.completion = dVar;
    }

    public U5.d create(U5.d completion) {
        AbstractC3292y.i(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public e getCallerFrame() {
        U5.d dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final U5.d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // U5.d
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        U5.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            U5.d dVar2 = aVar.completion;
            AbstractC3292y.f(dVar2);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
            } catch (Throwable th) {
                s.a aVar2 = s.f8810b;
                obj = s.b(t.a(th));
            }
            if (invokeSuspend == V5.b.e()) {
                return;
            }
            obj = s.b(invokeSuspend);
            aVar.releaseIntercepted();
            if (dVar2 instanceof a) {
                dVar = dVar2;
            } else {
                dVar2.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public U5.d create(Object obj, U5.d completion) {
        AbstractC3292y.i(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
