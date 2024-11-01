package kotlin.coroutines.jvm.internal;

import U5.g;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class d extends a {
    private final U5.g _context;
    private transient U5.d intercepted;

    public d(U5.d dVar, U5.g gVar) {
        super(dVar);
        this._context = gVar;
    }

    @Override // U5.d
    public U5.g getContext() {
        U5.g gVar = this._context;
        AbstractC3292y.f(gVar);
        return gVar;
    }

    public final U5.d intercepted() {
        U5.d dVar = this.intercepted;
        if (dVar == null) {
            U5.e eVar = (U5.e) getContext().get(U5.e.f10146a0);
            if (eVar == null || (dVar = eVar.interceptContinuation(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        U5.d dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            g.b bVar = getContext().get(U5.e.f10146a0);
            AbstractC3292y.f(bVar);
            ((U5.e) bVar).releaseInterceptedContinuation(dVar);
        }
        this.intercepted = c.f34559a;
    }

    public d(U5.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
