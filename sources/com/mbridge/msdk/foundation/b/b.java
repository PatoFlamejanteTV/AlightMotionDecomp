package com.mbridge.msdk.foundation.b;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.x;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f20250a;

    /* renamed from: b, reason: collision with root package name */
    private double f20251b;

    /* renamed from: c, reason: collision with root package name */
    private String f20252c;

    /* renamed from: d, reason: collision with root package name */
    private String f20253d;

    /* renamed from: e, reason: collision with root package name */
    private int f20254e;

    /* renamed from: f, reason: collision with root package name */
    private long f20255f;

    /* renamed from: g, reason: collision with root package name */
    private int f20256g;

    /* renamed from: h, reason: collision with root package name */
    private long f20257h;

    /* renamed from: i, reason: collision with root package name */
    private String f20258i;

    /* renamed from: j, reason: collision with root package name */
    private long f20259j;

    public final long a() {
        return this.f20259j;
    }

    public final CopyOnWriteArrayList<CampaignEx> b() {
        return this.f20250a;
    }

    public final double c() {
        return this.f20251b;
    }

    public final String d() {
        return this.f20252c;
    }

    public final String e() {
        return this.f20253d;
    }

    public final int f() {
        return this.f20254e;
    }

    public final int g() {
        return this.f20256g;
    }

    public final long h() {
        return this.f20257h;
    }

    public final void a(long j8) {
        this.f20259j = j8;
    }

    public final void b(String str) {
        this.f20252c = str;
    }

    public final void c(String str) {
        this.f20253d = str;
    }

    public final void d(String str) {
        this.f20258i = str;
    }

    public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f20250a = copyOnWriteArrayList;
    }

    public final void b(int i8) {
        this.f20256g = i8;
    }

    public final void c(long j8) {
        this.f20255f = j8;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String a9 = x.a(str);
        if (TextUtils.isEmpty(a9)) {
            return;
        }
        try {
            double parseDouble = Double.parseDouble(a9);
            if (parseDouble <= 0.0d) {
                return;
            }
            this.f20251b = parseDouble;
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void b(long j8) {
        this.f20257h = j8;
    }

    public final void a(int i8) {
        this.f20254e = i8;
    }
}
