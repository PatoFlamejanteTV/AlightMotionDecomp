package P;

/* loaded from: classes3.dex */
final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o0.l f7969a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f7970b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(y yVar, o0.l lVar) {
        this.f7970b = yVar;
        this.f7969a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y.u0(this.f7970b, this.f7969a);
    }
}
