package com.mbridge.msdk.dycreator.g;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class c extends a {
    public final void a(Object obj) {
        b bVar;
        ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f19929a;
        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
            for (Map.Entry<Integer, Object> entry : this.f19929a.entrySet()) {
                if (entry != null) {
                    try {
                        if (entry.getValue() != null && (bVar = (b) entry.getValue()) != null) {
                            bVar.a(obj);
                        }
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
            }
        }
    }
}
