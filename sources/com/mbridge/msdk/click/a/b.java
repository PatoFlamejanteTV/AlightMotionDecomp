package com.mbridge.msdk.click.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f19327a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f19328b = 1;

    /* renamed from: c, reason: collision with root package name */
    private String f19329c;

    /* renamed from: d, reason: collision with root package name */
    private int f19330d;

    /* renamed from: e, reason: collision with root package name */
    private HashSet<String> f19331e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private long f19332f = System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    private CampaignEx f19333g;

    /* renamed from: h, reason: collision with root package name */
    private String f19334h;

    /* renamed from: i, reason: collision with root package name */
    private int f19335i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f19336j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19337k;

    /* renamed from: l, reason: collision with root package name */
    private int f19338l;

    public b(String str, String str2) {
        this.f19329c = str;
        b(str2);
    }

    public final boolean a() {
        return this.f19336j;
    }

    public final boolean b() {
        return this.f19337k;
    }

    public final int c() {
        return this.f19338l;
    }

    public final int d() {
        return this.f19335i;
    }

    public final String e() {
        return this.f19334h;
    }

    public final CampaignEx f() {
        return this.f19333g;
    }

    public final String g() {
        return this.f19329c;
    }

    public final int h() {
        return this.f19330d;
    }

    public final HashSet<String> i() {
        return this.f19331e;
    }

    public final long j() {
        return this.f19332f;
    }

    public final void a(boolean z8) {
        this.f19336j = z8;
    }

    public final void b(boolean z8) {
        this.f19337k = z8;
    }

    public final void a(int i8) {
        this.f19338l = i8;
    }

    public final void b(int i8) {
        this.f19335i = i8;
    }

    public final void a(String str) {
        this.f19334h = str;
    }

    public final void b(String str) {
        this.f19330d++;
        this.f19331e.add(str);
    }

    public final void a(CampaignEx campaignEx) {
        this.f19333g = campaignEx;
    }
}
