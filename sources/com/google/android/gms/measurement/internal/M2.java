package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2266u6;
import java.util.Map;

/* loaded from: classes3.dex */
final class M2 implements InterfaceC2266u6 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17446a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ I2 f17447b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M2(I2 i22, String str) {
        this.f17446a = str;
        this.f17447b = i22;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2266u6
    public final String c(String str) {
        Map map;
        map = this.f17447b.f17396d;
        Map map2 = (Map) map.get(this.f17446a);
        if (map2 != null && map2.containsKey(str)) {
            return (String) map2.get(str);
        }
        return null;
    }
}
