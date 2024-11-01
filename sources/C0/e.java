package c0;

import H.g;
import O.f;
import Q.AbstractC1387g;
import Q.C1384d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class e extends AbstractC1387g {

    /* renamed from: I, reason: collision with root package name */
    private final g f15181I;

    public e(Context context, Looper looper, C1384d c1384d, g gVar, f.a aVar, f.b bVar) {
        super(context, looper, 68, c1384d, aVar, bVar);
        H.f fVar = new H.f(gVar == null ? g.f3167d : gVar);
        fVar.a(AbstractC2005b.a());
        this.f15181I = new g(fVar);
    }

    @Override // Q.AbstractC1383c
    protected final Bundle A() {
        return this.f15181I.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1383c
    public final String E() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // Q.AbstractC1383c
    protected final String F() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // Q.AbstractC1383c, O.a.f
    public final int k() {
        return 12800000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1383c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof f) {
            return (f) queryLocalInterface;
        }
        return new f(iBinder);
    }
}
