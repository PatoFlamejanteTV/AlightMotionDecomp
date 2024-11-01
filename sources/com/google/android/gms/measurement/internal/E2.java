package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.InterfaceC2115d0;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes3.dex */
public final class E2 {

    /* renamed from: a, reason: collision with root package name */
    final S2 f17196a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E2(H5 h52) {
        this.f17196a = h52.t0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle a(String str, InterfaceC2115d0 interfaceC2115d0) {
        this.f17196a.f().k();
        if (interfaceC2115d0 == null) {
            this.f17196a.a().L().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(CampaignEx.JSON_KEY_PACKAGE_NAME, str);
        try {
            Bundle f8 = interfaceC2115d0.f(bundle);
            if (f8 == null) {
                this.f17196a.a().G().a("Install Referrer Service returned a null response");
                return null;
            }
            return f8;
        } catch (Exception e8) {
            this.f17196a.a().G().b("Exception occurred while retrieving the Install Referrer", e8.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        try {
            X.d a9 = X.e.a(this.f17196a.w());
            if (a9 == null) {
                this.f17196a.a().K().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            if (a9.e("com.android.vending", 128).versionCode < 80837300) {
                return false;
            }
            return true;
        } catch (Exception e8) {
            this.f17196a.a().K().b("Failed to retrieve Play Store version for Install Referrer", e8);
            return false;
        }
    }
}
