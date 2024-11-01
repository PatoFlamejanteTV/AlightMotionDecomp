package com.mbridge.msdk.e;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class i implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static String f20124a = "CREATE TABLE IF NOT EXISTS %s (id INTEGER PRIMARY KEY,uuid TEXT,name TEXT,type INTEGER,time_stamp INTEGER,duration INTEGER,properties TEXT,priority INTEGER,state INTEGER,invalid_time INTEGER,ignore_max_timeout INTEGER,ignore_max_retry_times INTEGER,report_count INTEGER)";

    /* renamed from: b, reason: collision with root package name */
    static String f20125b = "DROP TABLE IF EXISTS %s";

    /* renamed from: c, reason: collision with root package name */
    private final e f20126c;

    /* renamed from: d, reason: collision with root package name */
    private int f20127d;

    /* renamed from: e, reason: collision with root package name */
    private int f20128e;

    /* renamed from: f, reason: collision with root package name */
    private final String f20129f;

    /* renamed from: g, reason: collision with root package name */
    private long f20130g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f20131h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20132i = false;

    public i(e eVar) {
        this.f20126c = eVar;
        this.f20129f = eVar.e();
    }

    public final void a(boolean z8) {
        this.f20131h = z8;
    }

    public final void b(boolean z8) {
        this.f20132i = z8;
    }

    public final e c() {
        return this.f20126c;
    }

    public final int d() {
        return this.f20127d;
    }

    public final int e() {
        return this.f20128e;
    }

    public final String f() {
        return this.f20129f;
    }

    public final long g() {
        return this.f20130g;
    }

    public final boolean a() {
        return this.f20131h;
    }

    public final boolean b() {
        return this.f20132i;
    }

    public final void a(int i8) {
        this.f20127d = i8;
    }

    public final void b(int i8) {
        this.f20128e = i8;
    }

    public final void a(long j8) {
        this.f20130g = j8;
    }
}
