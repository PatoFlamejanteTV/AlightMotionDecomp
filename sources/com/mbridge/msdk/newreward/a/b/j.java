package com.mbridge.msdk.newreward.a.b;

import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.d.c.q;
import com.mbridge.msdk.newreward.function.d.c.x;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class j implements a {
    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, final b bVar) throws IOException {
        com.mbridge.msdk.newreward.function.d.c.m a9 = ((com.mbridge.msdk.newreward.function.d.a.a) obj).a();
        if (a9 == null) {
            return;
        }
        a9.k().a(0, new x() { // from class: com.mbridge.msdk.newreward.a.b.j.1
            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar, q qVar) {
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar, q qVar) {
                if (bVar2.x()) {
                    bVar.a(aVar);
                }
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar, q qVar, MBridgeError mBridgeError) {
                if (bVar2.x()) {
                    bVar.a(aVar);
                }
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar, q qVar, MBridgeError mBridgeError) {
                if (bVar2.x()) {
                    bVar.a(aVar);
                }
            }
        });
    }
}
