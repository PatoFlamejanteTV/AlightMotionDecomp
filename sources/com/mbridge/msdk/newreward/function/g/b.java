package com.mbridge.msdk.newreward.function.g;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.function.c.e;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeOffsetManager;
import java.util.Map;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f22490a;

    /* renamed from: com.mbridge.msdk.newreward.function.g.b$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22491a;

        static {
            int[] iArr = new int[e.values().length];
            f22491a = iArr;
            try {
                iArr[e.REQ_SETTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22491a[e.REQ_CAMPAIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private b() {
    }

    public static b a() {
        if (f22490a == null) {
            synchronized (b.class) {
                try {
                    if (f22490a == null) {
                        f22490a = new b();
                    }
                } finally {
                }
            }
        }
        return f22490a;
    }

    public final <T extends a> a a(Object obj, e eVar) {
        int i8 = AnonymousClass1.f22491a[eVar.ordinal()];
        if (i8 == 1) {
            c cVar = new c();
            com.mbridge.msdk.newreward.function.c.b bVar = (com.mbridge.msdk.newreward.function.c.b) obj;
            if (!(bVar.b() instanceof Map)) {
                return cVar;
            }
            Map map = (Map) bVar.b();
            cVar.a(((Integer) map.get("mb_ad_type")).intValue());
            cVar.a((String) map.get("mb_ad_unit_id"));
            return cVar;
        }
        if (i8 != 2) {
            return null;
        }
        Map map2 = (Map) obj;
        com.mbridge.msdk.newreward.a.e eVar2 = (com.mbridge.msdk.newreward.a.e) map2.get("adapter_model");
        MBridgeOffsetManager mBridgeOffsetManager = (MBridgeOffsetManager) ((com.mbridge.msdk.newreward.function.c.c) map2.get("command_manager")).a((Object) null, e.CREATE_OFFSET);
        if (mBridgeOffsetManager == null) {
            eVar2.a(0);
        } else {
            eVar2.a(mBridgeOffsetManager.getOffset());
        }
        d dVar = new d(eVar2.p(), eVar2.w(), eVar2.A(), !TextUtils.isEmpty(eVar2.C()), eVar2.C());
        dVar.a(eVar2.E());
        dVar.e(eVar2.z());
        dVar.c(eVar2.F());
        dVar.b(eVar2.G());
        dVar.a(eVar2.e());
        if (com.mbridge.msdk.f.b.a()) {
            eVar2.A();
            com.mbridge.msdk.foundation.controller.c.m().c();
            TextUtils.isEmpty("");
            dVar.c("");
        }
        String a9 = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), eVar2.A());
        if (TextUtils.isEmpty(a9)) {
            a9 = "";
        }
        dVar.a(a9);
        dVar.b("");
        dVar.d(TextUtils.isEmpty(MBridgeGlobalCommon.SESSION_ID) ? "" : MBridgeGlobalCommon.SESSION_ID);
        return dVar;
    }
}
