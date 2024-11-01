package com.mbridge.msdk.video.module.c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.tools.x;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b extends a {
    public b(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.video.module.c.a, com.mbridge.msdk.foundation.same.net.h.c
    public final void addExtraParams(String str, e eVar) {
        super.addExtraParams(str, eVar);
        if (h.a().b(c.m().k()) != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    String b9 = x.b(jSONObject.toString());
                    if (!TextUtils.isEmpty(b9)) {
                        eVar.a("dvi", b9);
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }
}
