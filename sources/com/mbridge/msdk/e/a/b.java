package com.mbridge.msdk.e.a;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface b {

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f20019a;

        /* renamed from: b, reason: collision with root package name */
        public String f20020b;

        /* renamed from: c, reason: collision with root package name */
        public long f20021c;

        /* renamed from: d, reason: collision with root package name */
        public long f20022d;

        /* renamed from: e, reason: collision with root package name */
        public long f20023e;

        /* renamed from: f, reason: collision with root package name */
        public long f20024f;

        /* renamed from: g, reason: collision with root package name */
        public Map<String, String> f20025g = Collections.emptyMap();

        /* renamed from: h, reason: collision with root package name */
        public List<i> f20026h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean a(long j8) {
            if (this.f20023e < j8) {
                return true;
            }
            return false;
        }
    }

    a a(String str);

    void a();

    void a(String str, a aVar);

    void a(String str, boolean z8);
}
