package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.C2107c1;
import com.google.android.gms.internal.measurement.InterfaceC2089a1;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

@DynamiteApi
/* loaded from: classes3.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.S0 {

    /* renamed from: a, reason: collision with root package name */
    S2 f17136a = null;

    /* renamed from: b, reason: collision with root package name */
    private final Map f17137b = new ArrayMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements l0.u {

        /* renamed from: a, reason: collision with root package name */
        private com.google.android.gms.internal.measurement.V0 f17138a;

        a(com.google.android.gms.internal.measurement.V0 v02) {
            this.f17138a = v02;
        }

        @Override // l0.u
        public final void a(String str, String str2, Bundle bundle, long j8) {
            try {
                this.f17138a.Z(str, str2, bundle, j8);
            } catch (RemoteException e8) {
                S2 s22 = AppMeasurementDynamiteService.this.f17136a;
                if (s22 != null) {
                    s22.a().L().b("Event interceptor threw exception", e8);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements l0.t {

        /* renamed from: a, reason: collision with root package name */
        private com.google.android.gms.internal.measurement.V0 f17140a;

        b(com.google.android.gms.internal.measurement.V0 v02) {
            this.f17140a = v02;
        }

        @Override // l0.t
        public final void a(String str, String str2, Bundle bundle, long j8) {
            try {
                this.f17140a.Z(str, str2, bundle, j8);
            } catch (RemoteException e8) {
                S2 s22 = AppMeasurementDynamiteService.this.f17136a;
                if (s22 != null) {
                    s22.a().L().b("Event listener threw exception", e8);
                }
            }
        }
    }

    private final void i() {
        if (this.f17136a != null) {
        } else {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void k(com.google.android.gms.internal.measurement.U0 u02, String str) {
        i();
        this.f17136a.L().S(u02, str);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void beginAdUnitExposure(@NonNull String str, long j8) throws RemoteException {
        i();
        this.f17136a.v().z(str, j8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        i();
        this.f17136a.H().f0(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void clearMeasurementEnabled(long j8) throws RemoteException {
        i();
        this.f17136a.H().Z(null);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void endAdUnitExposure(@NonNull String str, long j8) throws RemoteException {
        i();
        this.f17136a.v().D(str, j8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void generateEventId(com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        i();
        long R02 = this.f17136a.L().R0();
        i();
        this.f17136a.L().Q(u02, R02);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getAppInstanceId(com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        i();
        this.f17136a.f().D(new U2(this, u02));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        i();
        k(u02, this.f17136a.H().v0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        i();
        this.f17136a.f().D(new RunnableC2410o4(this, u02, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        i();
        k(u02, this.f17136a.H().w0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        i();
        k(u02, this.f17136a.H().x0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getGmpAppId(com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        i();
        k(u02, this.f17136a.H().y0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        i();
        this.f17136a.H();
        F3.E(str);
        i();
        this.f17136a.L().P(u02, 25);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getSessionId(com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        i();
        this.f17136a.H().P(u02);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getTestFlag(com.google.android.gms.internal.measurement.U0 u02, int i8) throws RemoteException {
        i();
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4) {
                            this.f17136a.L().U(u02, this.f17136a.H().r0().booleanValue());
                            return;
                        }
                        return;
                    }
                    this.f17136a.L().P(u02, this.f17136a.H().t0().intValue());
                    return;
                }
                d6 L8 = this.f17136a.L();
                double doubleValue = this.f17136a.H().s0().doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble(CampaignEx.JSON_KEY_AD_R, doubleValue);
                try {
                    u02.f(bundle);
                    return;
                } catch (RemoteException e8) {
                    L8.f18099a.a().L().b("Error returning double value to wrapper", e8);
                    return;
                }
            }
            this.f17136a.L().Q(u02, this.f17136a.H().u0().longValue());
            return;
        }
        this.f17136a.L().S(u02, this.f17136a.H().z0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getUserProperties(String str, String str2, boolean z8, com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        i();
        this.f17136a.f().D(new RunnableC2457v3(this, u02, str, str2, z8));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void initForTests(@NonNull Map map) throws RemoteException {
        i();
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void initialize(Y.a aVar, C2107c1 c2107c1, long j8) throws RemoteException {
        S2 s22 = this.f17136a;
        if (s22 == null) {
            this.f17136a = S2.b((Context) AbstractC1396p.l((Context) Y.b.k(aVar)), c2107c1, Long.valueOf(j8));
        } else {
            s22.a().L().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.U0 u02) throws RemoteException {
        i();
        this.f17136a.f().D(new RunnableC2404n5(this, u02));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z8, boolean z9, long j8) throws RemoteException {
        i();
        this.f17136a.H().h0(str, str2, bundle, z8, z9, j8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.U0 u02, long j8) throws RemoteException {
        Bundle bundle2;
        i();
        AbstractC1396p.f(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        this.f17136a.f().D(new O3(this, u02, new E(str2, new D(bundle), MBridgeConstans.DYNAMIC_VIEW_WX_APP, j8), str));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void logHealthData(int i8, @NonNull String str, @NonNull Y.a aVar, @NonNull Y.a aVar2, @NonNull Y.a aVar3) throws RemoteException {
        Object k8;
        Object k9;
        i();
        Object obj = null;
        if (aVar == null) {
            k8 = null;
        } else {
            k8 = Y.b.k(aVar);
        }
        if (aVar2 == null) {
            k9 = null;
        } else {
            k9 = Y.b.k(aVar2);
        }
        if (aVar3 != null) {
            obj = Y.b.k(aVar3);
        }
        this.f17136a.a().z(i8, true, false, str, k8, k9, obj);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityCreated(@NonNull Y.a aVar, @NonNull Bundle bundle, long j8) throws RemoteException {
        i();
        Application.ActivityLifecycleCallbacks p02 = this.f17136a.H().p0();
        if (p02 != null) {
            this.f17136a.H().D0();
            p02.onActivityCreated((Activity) Y.b.k(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityDestroyed(@NonNull Y.a aVar, long j8) throws RemoteException {
        i();
        Application.ActivityLifecycleCallbacks p02 = this.f17136a.H().p0();
        if (p02 != null) {
            this.f17136a.H().D0();
            p02.onActivityDestroyed((Activity) Y.b.k(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityPaused(@NonNull Y.a aVar, long j8) throws RemoteException {
        i();
        Application.ActivityLifecycleCallbacks p02 = this.f17136a.H().p0();
        if (p02 != null) {
            this.f17136a.H().D0();
            p02.onActivityPaused((Activity) Y.b.k(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityResumed(@NonNull Y.a aVar, long j8) throws RemoteException {
        i();
        Application.ActivityLifecycleCallbacks p02 = this.f17136a.H().p0();
        if (p02 != null) {
            this.f17136a.H().D0();
            p02.onActivityResumed((Activity) Y.b.k(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivitySaveInstanceState(Y.a aVar, com.google.android.gms.internal.measurement.U0 u02, long j8) throws RemoteException {
        i();
        Application.ActivityLifecycleCallbacks p02 = this.f17136a.H().p0();
        Bundle bundle = new Bundle();
        if (p02 != null) {
            this.f17136a.H().D0();
            p02.onActivitySaveInstanceState((Activity) Y.b.k(aVar), bundle);
        }
        try {
            u02.f(bundle);
        } catch (RemoteException e8) {
            this.f17136a.a().L().b("Error returning bundle value to wrapper", e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityStarted(@NonNull Y.a aVar, long j8) throws RemoteException {
        i();
        Application.ActivityLifecycleCallbacks p02 = this.f17136a.H().p0();
        if (p02 != null) {
            this.f17136a.H().D0();
            p02.onActivityStarted((Activity) Y.b.k(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityStopped(@NonNull Y.a aVar, long j8) throws RemoteException {
        i();
        Application.ActivityLifecycleCallbacks p02 = this.f17136a.H().p0();
        if (p02 != null) {
            this.f17136a.H().D0();
            p02.onActivityStopped((Activity) Y.b.k(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.U0 u02, long j8) throws RemoteException {
        i();
        u02.f(null);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.V0 v02) throws RemoteException {
        l0.t tVar;
        i();
        synchronized (this.f17137b) {
            try {
                tVar = (l0.t) this.f17137b.get(Integer.valueOf(v02.w()));
                if (tVar == null) {
                    tVar = new b(v02);
                    this.f17137b.put(Integer.valueOf(v02.w()), tVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f17136a.H().n0(tVar);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void resetAnalyticsData(long j8) throws RemoteException {
        i();
        this.f17136a.H().I(j8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j8) throws RemoteException {
        i();
        if (bundle == null) {
            this.f17136a.a().G().a("Conditional user property must not be null");
        } else {
            this.f17136a.H().O0(bundle, j8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setConsent(@NonNull Bundle bundle, long j8) throws RemoteException {
        i();
        this.f17136a.H().Y0(bundle, j8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setConsentThirdParty(@NonNull Bundle bundle, long j8) throws RemoteException {
        i();
        this.f17136a.H().d1(bundle, j8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setCurrentScreen(@NonNull Y.a aVar, @NonNull String str, @NonNull String str2, long j8) throws RemoteException {
        i();
        this.f17136a.I().H((Activity) Y.b.k(aVar), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setDataCollectionEnabled(boolean z8) throws RemoteException {
        i();
        this.f17136a.H().c1(z8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        i();
        this.f17136a.H().X0(bundle);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setEventInterceptor(com.google.android.gms.internal.measurement.V0 v02) throws RemoteException {
        i();
        a aVar = new a(v02);
        if (this.f17136a.f().J()) {
            this.f17136a.H().o0(aVar);
        } else {
            this.f17136a.f().D(new M4(this, aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setInstanceIdProvider(InterfaceC2089a1 interfaceC2089a1) throws RemoteException {
        i();
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setMeasurementEnabled(boolean z8, long j8) throws RemoteException {
        i();
        this.f17136a.H().Z(Boolean.valueOf(z8));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setMinimumSessionDuration(long j8) throws RemoteException {
        i();
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setSessionTimeoutDuration(long j8) throws RemoteException {
        i();
        this.f17136a.H().W0(j8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setSgtmDebugInfo(@NonNull Intent intent) throws RemoteException {
        i();
        this.f17136a.H().K(intent);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setUserId(@NonNull String str, long j8) throws RemoteException {
        i();
        this.f17136a.H().b0(str, j8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull Y.a aVar, boolean z8, long j8) throws RemoteException {
        i();
        this.f17136a.H().k0(str, str2, Y.b.k(aVar), z8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.V0 v02) throws RemoteException {
        l0.t tVar;
        i();
        synchronized (this.f17137b) {
            tVar = (l0.t) this.f17137b.remove(Integer.valueOf(v02.w()));
        }
        if (tVar == null) {
            tVar = new b(v02);
        }
        this.f17136a.H().U0(tVar);
    }
}
