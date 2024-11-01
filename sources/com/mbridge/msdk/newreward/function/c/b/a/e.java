package com.mbridge.msdk.newreward.function.c.b.a;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes4.dex */
public final class e implements com.mbridge.msdk.newreward.function.c.b.a {

    /* renamed from: a, reason: collision with root package name */
    com.mbridge.msdk.newreward.a.e f22163a;

    /* renamed from: b, reason: collision with root package name */
    com.mbridge.msdk.newreward.function.c.c f22164b;

    @Override // com.mbridge.msdk.newreward.function.c.b.a
    public final void a(com.mbridge.msdk.newreward.function.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        com.mbridge.msdk.newreward.function.f.e r8;
        com.mbridge.msdk.videocommon.d.c b9;
        Queue<Integer> B8;
        Integer poll;
        int intValue;
        try {
            Map map = (Map) bVar.b();
            this.f22163a = (com.mbridge.msdk.newreward.a.e) map.get("adapter_model");
            this.f22164b = (com.mbridge.msdk.newreward.function.c.c) map.get("command_manager");
            try {
                Map<String, Long> map2 = com.mbridge.msdk.foundation.same.a.d.f20694k;
                if (map2 != null && map2.size() > 0) {
                    com.mbridge.msdk.foundation.same.a.d.f20694k.clear();
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                }
            }
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(this.f22163a.A());
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    e9.printStackTrace();
                }
            }
            try {
                com.mbridge.msdk.newreward.a.e eVar = this.f22163a;
                if (eVar.u() == 2 && TextUtils.isEmpty(eVar.C())) {
                    com.mbridge.msdk.foundation.c.b b10 = com.mbridge.msdk.foundation.c.a.b(880035, "errorCode: 3507 errorMessage: data load failed, errorMsg is bidToken null");
                    throw new MBridgeError(b10.a(), b10.b());
                }
                if (com.mbridge.msdk.system.a.map != null) {
                    if (((MBridgeDailyPlayModel) this.f22164b.a(new HashMap(), com.mbridge.msdk.newreward.function.c.e.CREATE_DAILY)).isOverDailyCap()) {
                        bVar2.a(new com.mbridge.msdk.foundation.c.b(880019));
                        return;
                    }
                    com.mbridge.msdk.newreward.a.e eVar2 = this.f22163a;
                    if (eVar2 != null && (r8 = eVar2.r()) != null && (b9 = r8.b()) != null && (B8 = b9.B()) != null && B8.size() != 0 && (poll = B8.poll()) != null) {
                        intValue = poll.intValue() * 1000;
                        eVar2.e(intValue);
                        bVar2.a((Object) null);
                        return;
                    }
                    intValue = 25000;
                    eVar2.e(intValue);
                    bVar2.a((Object) null);
                    return;
                }
                com.mbridge.msdk.foundation.c.b b11 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is not init sdk");
                throw new MBridgeError(b11.a(), b11.b());
            } catch (MBridgeError e10) {
                bVar2.a(new com.mbridge.msdk.foundation.c.b(e10.getErrorCode(), e10.getErrorMessage()));
            }
        } catch (Exception e11) {
            bVar2.a(new com.mbridge.msdk.foundation.c.b(880020, e11.getMessage()));
        }
    }
}
