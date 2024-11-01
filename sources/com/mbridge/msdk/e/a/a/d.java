package com.mbridge.msdk.e.a.a;

import com.mbridge.msdk.e.a.p;

/* loaded from: classes4.dex */
public final class d implements com.mbridge.msdk.e.a.d {
    @Override // com.mbridge.msdk.e.a.d
    public final String a(p<?> pVar) {
        String i8 = pVar.i();
        int g8 = pVar.g();
        if (g8 == 0) {
            return i8;
        }
        return Integer.toString(g8) + '-' + i8;
    }
}
