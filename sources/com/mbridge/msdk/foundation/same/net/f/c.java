package com.mbridge.msdk.foundation.same.net.f;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f20894a;

    /* renamed from: b, reason: collision with root package name */
    public final List<com.mbridge.msdk.foundation.same.net.d.b> f20895b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f20896c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20897d;

    public c(int i8, byte[] bArr, List<com.mbridge.msdk.foundation.same.net.d.b> list) {
        this(i8, bArr, a(list), list);
    }

    private static Map<String, String> a(List<com.mbridge.msdk.foundation.same.net.d.b> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (com.mbridge.msdk.foundation.same.net.d.b bVar : list) {
            treeMap.put(bVar.a(), bVar.b());
        }
        return treeMap;
    }

    private c(int i8, byte[] bArr, Map<String, String> map, List<com.mbridge.msdk.foundation.same.net.d.b> list) {
        this.f20897d = i8;
        this.f20894a = bArr;
        this.f20896c = map;
        if (list == null) {
            this.f20895b = null;
        } else {
            this.f20895b = DesugarCollections.unmodifiableList(list);
        }
    }
}
