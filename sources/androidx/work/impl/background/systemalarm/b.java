package androidx.work.impl.background.systemalarm;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DelayMetCommandHandler f14811a;

    public /* synthetic */ b(DelayMetCommandHandler delayMetCommandHandler) {
        this.f14811a = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14811a.startWork();
    }
}
