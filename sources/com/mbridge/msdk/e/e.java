package com.mbridge.msdk.e;

import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f20105a;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f20108d;

    /* renamed from: i, reason: collision with root package name */
    private h f20113i;

    /* renamed from: b, reason: collision with root package name */
    private int f20106b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f20107c = 0;

    /* renamed from: g, reason: collision with root package name */
    private long f20111g = 0;

    /* renamed from: h, reason: collision with root package name */
    private long f20112h = 604800000;

    /* renamed from: j, reason: collision with root package name */
    private boolean f20114j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20115k = false;

    /* renamed from: f, reason: collision with root package name */
    private long f20110f = System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    private String f20109e = UUID.randomUUID().toString();

    public e(String str) {
        this.f20105a = str;
    }

    public final String a() {
        return this.f20105a;
    }

    public final int b() {
        return this.f20106b;
    }

    public final int c() {
        return this.f20107c;
    }

    public final JSONObject d() {
        JSONObject jSONObject = this.f20108d;
        if (jSONObject == null) {
            JSONObject jSONObject2 = new JSONObject();
            this.f20108d = jSONObject2;
            return jSONObject2;
        }
        return jSONObject;
    }

    public final String e() {
        return this.f20109e;
    }

    public final long f() {
        return this.f20110f;
    }

    public final long g() {
        return this.f20111g;
    }

    public final long h() {
        return this.f20112h;
    }

    public final h i() {
        return this.f20113i;
    }

    public final boolean j() {
        return this.f20114j;
    }

    public final boolean k() {
        return this.f20115k;
    }

    public final void a(int i8) {
        this.f20106b = i8;
    }

    public final void b(int i8) {
        this.f20107c = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(long j8) {
        this.f20112h = j8;
    }

    public final void a(JSONObject jSONObject) {
        this.f20108d = jSONObject;
    }

    public final void b(long j8) {
        this.f20111g = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str) {
        this.f20109e = str;
    }

    public final void a(long j8) {
        this.f20110f = j8;
    }

    public final void a(h hVar) {
        this.f20113i = hVar;
    }

    public final void a(boolean z8) {
        this.f20115k = z8;
    }
}
