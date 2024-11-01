package s6;

/* renamed from: s6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3986f implements n6.M {

    /* renamed from: a, reason: collision with root package name */
    private final U5.g f39192a;

    public C3986f(U5.g gVar) {
        this.f39192a = gVar;
    }

    @Override // n6.M
    public U5.g getCoroutineContext() {
        return this.f39192a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
