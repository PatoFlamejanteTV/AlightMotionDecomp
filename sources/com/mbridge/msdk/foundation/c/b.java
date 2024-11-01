package com.mbridge.msdk.foundation.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private int f20274a;

    /* renamed from: b, reason: collision with root package name */
    private int f20275b;

    /* renamed from: c, reason: collision with root package name */
    private String f20276c;

    /* renamed from: d, reason: collision with root package name */
    private Throwable f20277d;

    /* renamed from: e, reason: collision with root package name */
    private CampaignEx f20278e;

    /* renamed from: f, reason: collision with root package name */
    private MBridgeIds f20279f;

    /* renamed from: g, reason: collision with root package name */
    private String f20280g;

    /* renamed from: h, reason: collision with root package name */
    private String f20281h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20282i;

    /* renamed from: j, reason: collision with root package name */
    private int f20283j = -1;

    /* renamed from: k, reason: collision with root package name */
    private String f20284k;

    /* renamed from: l, reason: collision with root package name */
    private HashMap<Object, Object> f20285l;

    /* renamed from: m, reason: collision with root package name */
    private int f20286m;

    /* renamed from: n, reason: collision with root package name */
    private String f20287n;

    /* renamed from: o, reason: collision with root package name */
    private String f20288o;

    /* renamed from: p, reason: collision with root package name */
    private String f20289p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20290q;

    public b(int i8) {
        this.f20274a = i8;
        this.f20275b = a.b(i8);
    }

    public final int a() {
        return this.f20274a;
    }

    public final String b() {
        String str;
        int i8;
        if (!TextUtils.isEmpty(this.f20276c)) {
            str = this.f20276c;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) && (i8 = this.f20274a) != -1) {
            str = a.a(i8);
        }
        Throwable th = this.f20277d;
        if (th == null) {
            return str;
        }
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            return str;
        }
        return str + " # " + message;
    }

    public final CampaignEx c() {
        return this.f20278e;
    }

    public final MBridgeIds d() {
        if (this.f20279f == null) {
            this.f20279f = new MBridgeIds();
        }
        return this.f20279f;
    }

    public final boolean e() {
        return this.f20282i;
    }

    public final int f() {
        return this.f20275b;
    }

    public final int g() {
        return this.f20283j;
    }

    public final String h() {
        return this.f20284k;
    }

    public final int i() {
        return this.f20286m;
    }

    public final String j() {
        return this.f20287n;
    }

    public final String k() {
        return this.f20288o;
    }

    public final String l() {
        return this.f20289p;
    }

    public final boolean m() {
        return this.f20290q;
    }

    public final String toString() {
        return "MBFailureReason{errorCode=" + this.f20274a + ", errorSubType=" + this.f20275b + ", message='" + this.f20276c + "', cause=" + this.f20277d + ", campaign=" + this.f20278e + ", ids=" + this.f20279f + ", requestId='" + this.f20280g + "', localRequestId='" + this.f20281h + "', isHeaderBidding=" + this.f20282i + ", typeD=" + this.f20283j + ", reasonD='" + this.f20284k + "', extraMap=" + this.f20285l + ", serverErrorCode=" + this.f20286m + ", errorUrl='" + this.f20287n + "', serverErrorResponse='" + this.f20288o + "'}";
    }

    public final void a(String str) {
        this.f20276c = str;
    }

    public final void c(String str) {
        this.f20287n = str;
    }

    public final void e(String str) {
        this.f20289p = str;
    }

    public final void a(Throwable th) {
        this.f20277d = th;
    }

    public final void a(CampaignEx campaignEx) {
        this.f20278e = campaignEx;
    }

    public final void d(String str) {
        this.f20288o = str;
    }

    public b(int i8, String str) {
        this.f20274a = i8;
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
        }
        this.f20276c = str;
        this.f20275b = a.b(i8);
    }

    public final void a(MBridgeIds mBridgeIds) {
        this.f20279f = mBridgeIds;
    }

    public final void a(boolean z8) {
        this.f20282i = z8;
    }

    public final void a(int i8) {
        this.f20275b = i8;
    }

    public final void a(Object obj, Object obj2) {
        if (this.f20285l == null) {
            this.f20285l = new HashMap<>();
        }
        this.f20285l.put(obj, obj2);
    }

    public final Object a(Object obj) {
        HashMap<Object, Object> hashMap = this.f20285l;
        if (hashMap != null && hashMap.containsKey(obj)) {
            return this.f20285l.get(obj);
        }
        return null;
    }

    public final void b(int i8) {
        this.f20283j = i8;
    }

    public b(int i8, int i9, String str) {
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
            this.f20276c = str;
        } else {
            this.f20276c = a.a(i9);
        }
        this.f20286m = i8;
        this.f20275b = a.b(i9);
    }

    public final void b(String str) {
        this.f20284k = str;
    }

    public final void b(boolean z8) {
        this.f20290q = z8;
    }
}
