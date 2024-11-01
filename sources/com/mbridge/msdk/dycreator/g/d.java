package com.mbridge.msdk.dycreator.g;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d extends a {
    public final void a(Object obj) {
        i iVar;
        try {
            synchronized (this) {
                try {
                    ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f19929a;
                    if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                        for (Map.Entry<Integer, Object> entry : this.f19929a.entrySet()) {
                            if (entry != null && (entry.getValue() instanceof i) && (iVar = (i) entry.getValue()) != null) {
                                iVar.a(obj);
                            }
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
