package r6;

/* loaded from: classes5.dex */
final class x implements U5.d, kotlin.coroutines.jvm.internal.e {

    /* renamed from: a, reason: collision with root package name */
    private final U5.d f38864a;

    /* renamed from: b, reason: collision with root package name */
    private final U5.g f38865b;

    public x(U5.d dVar, U5.g gVar) {
        this.f38864a = dVar;
        this.f38865b = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        U5.d dVar = this.f38864a;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // U5.d
    public U5.g getContext() {
        return this.f38865b;
    }

    @Override // U5.d
    public void resumeWith(Object obj) {
        this.f38864a.resumeWith(obj);
    }
}
