package kotlin.coroutines.jvm.internal;

/* loaded from: classes5.dex */
public abstract class j extends a {
    public j(U5.d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != U5.h.f10149a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // U5.d
    public U5.g getContext() {
        return U5.h.f10149a;
    }
}
