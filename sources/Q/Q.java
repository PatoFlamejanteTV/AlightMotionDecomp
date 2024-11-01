package Q;

import N.C1339b;
import android.app.PendingIntent;
import android.os.Bundle;

/* loaded from: classes3.dex */
abstract class Q extends c0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f8169d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f8170e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC1383c f8171f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(AbstractC1383c abstractC1383c, int i8, Bundle bundle) {
        super(abstractC1383c, Boolean.TRUE);
        this.f8171f = abstractC1383c;
        this.f8169d = i8;
        this.f8170e = bundle;
    }

    @Override // Q.c0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        PendingIntent pendingIntent = null;
        if (this.f8169d != 0) {
            this.f8171f.i0(1, null);
            Bundle bundle = this.f8170e;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
            }
            f(new C1339b(this.f8169d, pendingIntent));
            return;
        }
        if (!g()) {
            this.f8171f.i0(1, null);
            f(new C1339b(8, null));
        }
    }

    protected abstract void f(C1339b c1339b);

    protected abstract boolean g();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.c0
    public final void b() {
    }
}
