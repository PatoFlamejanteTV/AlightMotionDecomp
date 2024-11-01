package com.mbridge.msdk.mbbanner.common.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f21532a;

    /* renamed from: b, reason: collision with root package name */
    private String f21533b;

    /* renamed from: c, reason: collision with root package name */
    private String f21534c;

    /* renamed from: d, reason: collision with root package name */
    private String f21535d;

    /* renamed from: e, reason: collision with root package name */
    private String f21536e;

    /* renamed from: f, reason: collision with root package name */
    private String f21537f;

    /* renamed from: g, reason: collision with root package name */
    private String f21538g;

    /* renamed from: h, reason: collision with root package name */
    private int f21539h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21540i;

    private a() {
    }

    public final a a(boolean z8) {
        this.f21540i = z8;
        return this;
    }

    public final a b(String str) {
        this.f21533b = str;
        return this;
    }

    public final a c(String str) {
        this.f21534c = str;
        return this;
    }

    public final a d(String str) {
        this.f21535d = str;
        return this;
    }

    public final a e(String str) {
        this.f21536e = str;
        return this;
    }

    public final a f(String str) {
        this.f21537f = str;
        return this;
    }

    public final a g(String str) {
        this.f21538g = str;
        return this;
    }

    public static a a() {
        return new a();
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f21533b)) {
            sb.append("unit_id=");
            sb.append(this.f21533b);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f21534c)) {
            sb.append("cid=");
            sb.append(this.f21534c);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f21535d)) {
            sb.append("rid=");
            sb.append(this.f21535d);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f21536e)) {
            sb.append("rid_n=");
            sb.append(this.f21536e);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f21537f)) {
            sb.append("creative_id=");
            sb.append(this.f21537f);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f21538g)) {
            sb.append("reason=");
            sb.append(this.f21538g);
            sb.append("&");
        }
        if (this.f21539h != 0) {
            sb.append("result=");
            sb.append(this.f21539h);
            sb.append("&");
        }
        if (this.f21540i) {
            sb.append("hb=1");
            sb.append("&");
        }
        sb.append("network_type=");
        sb.append(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
        sb.append("&");
        if (!TextUtils.isEmpty(this.f21532a)) {
            sb.append("key=");
            sb.append(this.f21532a);
        }
        return sb.toString();
    }

    public final a a(String str) {
        this.f21532a = str;
        return this;
    }

    public final a a(int i8) {
        this.f21539h = i8;
        return this;
    }
}
