package q0;

/* loaded from: classes3.dex */
final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f36656a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(z zVar) {
        this.f36656a = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC3619e interfaceC3619e;
        InterfaceC3619e interfaceC3619e2;
        obj = this.f36656a.f36658b;
        synchronized (obj) {
            try {
                z zVar = this.f36656a;
                interfaceC3619e = zVar.f36659c;
                if (interfaceC3619e != null) {
                    interfaceC3619e2 = zVar.f36659c;
                    interfaceC3619e2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
