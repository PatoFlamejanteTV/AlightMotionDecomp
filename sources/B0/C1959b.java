package b0;

import N.AbstractC1349l;
import P.InterfaceC1379c;
import P.h;
import Q.AbstractC1387g;
import Q.C1384d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1959b extends AbstractC1387g {

    /* renamed from: I, reason: collision with root package name */
    private final Bundle f14891I;

    public C1959b(Context context, Looper looper, C1384d c1384d, H.c cVar, InterfaceC1379c interfaceC1379c, h hVar) {
        super(context, looper, 16, c1384d, interfaceC1379c, hVar);
        this.f14891I = new Bundle();
    }

    @Override // Q.AbstractC1383c
    protected final Bundle A() {
        return this.f14891I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1383c
    public final String E() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // Q.AbstractC1383c
    protected final String F() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // Q.AbstractC1383c
    public final boolean S() {
        return true;
    }

    @Override // Q.AbstractC1383c, O.a.f
    public final int k() {
        return AbstractC1349l.f6370a;
    }

    @Override // Q.AbstractC1383c, O.a.f
    public final boolean o() {
        C1384d j02 = j0();
        if (!TextUtils.isEmpty(j02.b()) && !j02.e(H.b.f3161a).isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1383c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof C1960c) {
            return (C1960c) queryLocalInterface;
        }
        return new C1960c(iBinder);
    }
}
