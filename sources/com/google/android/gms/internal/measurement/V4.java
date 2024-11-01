package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class V4 {

    /* renamed from: a, reason: collision with root package name */
    private Map f16474a = new HashMap();

    public final InterfaceC2243s a(String str) {
        if (this.f16474a.containsKey(str)) {
            try {
                return (InterfaceC2243s) ((Callable) this.f16474a.get(str)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: " + str);
            }
        }
        return InterfaceC2243s.f16971b0;
    }

    public final void b(String str, Callable callable) {
        this.f16474a.put(str, callable);
    }
}
