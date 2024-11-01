package P;

import N.C1339b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y f7968a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(y yVar) {
        this.f7968a = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar;
        xVar = this.f7968a.f7978o;
        xVar.c(new C1339b(4));
    }
}
