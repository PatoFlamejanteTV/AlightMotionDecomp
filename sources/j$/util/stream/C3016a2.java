package j$.util.stream;

/* renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3016a2 extends AbstractC3021b2 {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f33451b++;
    }

    @Override // j$.util.stream.V1
    public final void f(V1 v12) {
        this.f33451b += ((AbstractC3021b2) v12).f33451b;
    }

    @Override // j$.util.stream.W1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f33451b);
    }
}
