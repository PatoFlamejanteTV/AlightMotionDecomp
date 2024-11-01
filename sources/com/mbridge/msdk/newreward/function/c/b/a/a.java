package com.mbridge.msdk.newreward.function.c.b.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a implements com.mbridge.msdk.newreward.function.c.b.d {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.b.a f22147a;

    public final Object a(Object obj) {
        com.mbridge.msdk.foundation.c.b bVar;
        com.mbridge.msdk.newreward.a.e eVar;
        com.mbridge.msdk.newreward.function.c.c cVar;
        int i8;
        if (obj == null) {
            return null;
        }
        Map map = (Map) obj;
        if (map.get("reason") != null) {
            bVar = (com.mbridge.msdk.foundation.c.b) map.get("reason");
        } else {
            bVar = null;
        }
        if (map.get("adapter_model") != null) {
            eVar = (com.mbridge.msdk.newreward.a.e) map.get("adapter_model");
        } else {
            eVar = null;
        }
        if (map.get("command_manager") != null) {
            cVar = (com.mbridge.msdk.newreward.function.c.c) map.get("command_manager");
        } else {
            cVar = null;
        }
        if (eVar != null && cVar != null) {
            boolean z8 = false;
            if (map.get("candidate_type") != null) {
                i8 = ((Integer) map.get("candidate_type")).intValue();
            } else {
                i8 = 0;
            }
            if (this.f22147a == null) {
                String A8 = eVar.A();
                if (eVar.p() == 287) {
                    z8 = true;
                }
                this.f22147a = new com.mbridge.msdk.newreward.function.b.a(A8, z8, cVar);
            }
            com.mbridge.msdk.foundation.same.report.d.b bVar2 = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar2.c(eVar.z());
            if (i8 == 0) {
                String C8 = eVar.C();
                if (TextUtils.isEmpty(C8)) {
                    return null;
                }
                try {
                    com.mbridge.msdk.newreward.function.a.b a9 = this.f22147a.a(bVar2, bVar, eVar, 2);
                    this.f22147a.a(bVar2, C8, a9, null, null, eVar, 3);
                    return a9;
                } catch (Exception e8) {
                    ad.b("CandidateReceiver", "load error" + e8.getMessage());
                    return null;
                }
            }
            if (i8 == 1) {
                String C9 = eVar.C();
                if (TextUtils.isEmpty(C9)) {
                    return Boolean.FALSE;
                }
                try {
                    return Boolean.valueOf(this.f22147a.a(C9));
                } catch (Exception e9) {
                    ad.b("CandidateReceiver", "loadCallBack error" + e9.getMessage());
                    return Boolean.FALSE;
                }
            }
            if (i8 == 2) {
                String C10 = eVar.C();
                if (TextUtils.isEmpty(C10)) {
                    return null;
                }
                try {
                    com.mbridge.msdk.newreward.function.a.b a10 = this.f22147a.a(bVar2, bVar, eVar, 2);
                    com.mbridge.msdk.newreward.function.b.a aVar = this.f22147a;
                    if (aVar != null) {
                        aVar.a(bVar2, C10, a10, null, null, eVar, 1);
                    }
                    return a10;
                } catch (Exception e10) {
                    ad.b("CandidateReceiver", "loadCallBack error" + e10.getMessage());
                    return null;
                }
            }
            if (TextUtils.isEmpty(eVar.C())) {
                return null;
            }
            try {
                return this.f22147a.a(bVar2, bVar, eVar, 2);
            } catch (Exception e11) {
                ad.b("CandidateReceiver", "load error" + e11.getMessage());
            }
        }
        return null;
    }
}
