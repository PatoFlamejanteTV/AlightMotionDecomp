package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes3.dex */
public final class i6 {

    /* renamed from: a, reason: collision with root package name */
    private final S2 f17858a;

    public i6(S2 s22) {
        this.f17858a = s22;
    }

    private final boolean d() {
        if (this.f17858a.F().f18167z.a() > 0) {
            return true;
        }
        return false;
    }

    private final boolean e() {
        if (!d() || this.f17858a.x().currentTimeMillis() - this.f17858a.F().f18167z.a() <= this.f17858a.z().A(null, G.f17274W)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        String str;
        this.f17858a.f().k();
        if (!d()) {
            return;
        }
        if (e()) {
            this.f17858a.F().f18166y.b(null);
            Bundle bundle = new Bundle();
            bundle.putString("source", "(not set)");
            bundle.putString("medium", "(not set)");
            bundle.putString("_cis", "intent");
            bundle.putLong("_cc", 1L);
            this.f17858a.H().b1("auto", "_cmpx", bundle);
        } else {
            String a9 = this.f17858a.F().f18166y.a();
            if (TextUtils.isEmpty(a9)) {
                this.f17858a.a().I().a("Cache still valid but referrer not found");
            } else {
                long a10 = ((this.f17858a.F().f18167z.a() / 3600000) - 1) * 3600000;
                Uri parse = Uri.parse(a9);
                Bundle bundle2 = new Bundle();
                Pair pair = new Pair(parse.getPath(), bundle2);
                for (String str2 : parse.getQueryParameterNames()) {
                    bundle2.putString(str2, parse.getQueryParameter(str2));
                }
                ((Bundle) pair.second).putLong("_cc", a10);
                Object obj = pair.first;
                if (obj == null) {
                    str = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
                } else {
                    str = (String) obj;
                }
                this.f17858a.H().b1(str, "_cmp", (Bundle) pair.second);
            }
            this.f17858a.F().f18166y.b(null);
        }
        this.f17858a.F().f18167z.b(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, Bundle bundle) {
        String str2;
        this.f17858a.f().k();
        if (!this.f17858a.m()) {
            if (bundle != null && !bundle.isEmpty()) {
                if (str == null || str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f17858a.F().f18166y.b(str2);
                this.f17858a.F().f18167z.b(this.f17858a.x().currentTimeMillis());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (d() && e()) {
            this.f17858a.F().f18166y.b(null);
        }
    }
}
