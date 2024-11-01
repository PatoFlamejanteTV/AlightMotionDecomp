package S;

import N.C1341d;
import P.InterfaceC1379c;
import P.h;
import Q.AbstractC1387g;
import Q.C1384d;
import Q.C1402w;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import d0.AbstractC2737d;

/* loaded from: classes3.dex */
public final class e extends AbstractC1387g {

    /* renamed from: I, reason: collision with root package name */
    private final C1402w f9362I;

    public e(Context context, Looper looper, C1384d c1384d, C1402w c1402w, InterfaceC1379c interfaceC1379c, h hVar) {
        super(context, looper, SubsamplingScaleImageView.ORIENTATION_270, c1384d, interfaceC1379c, hVar);
        this.f9362I = c1402w;
    }

    @Override // Q.AbstractC1383c
    protected final Bundle A() {
        return this.f9362I.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1383c
    public final String E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // Q.AbstractC1383c
    protected final String F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // Q.AbstractC1383c
    protected final boolean I() {
        return true;
    }

    @Override // Q.AbstractC1383c, O.a.f
    public final int k() {
        return 203400000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1383c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new a(iBinder);
    }

    @Override // Q.AbstractC1383c
    public final C1341d[] v() {
        return AbstractC2737d.f31283b;
    }
}
