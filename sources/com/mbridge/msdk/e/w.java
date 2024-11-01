package com.mbridge.msdk.e;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f20205a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20206b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20207c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20208d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20209e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20210f;

    /* renamed from: g, reason: collision with root package name */
    public final o f20211g;

    /* renamed from: h, reason: collision with root package name */
    public final d f20212h;

    /* renamed from: i, reason: collision with root package name */
    public final v f20213i;

    /* renamed from: j, reason: collision with root package name */
    public final f f20214j;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private o f20218d;

        /* renamed from: h, reason: collision with root package name */
        private d f20222h;

        /* renamed from: i, reason: collision with root package name */
        private v f20223i;

        /* renamed from: j, reason: collision with root package name */
        private f f20224j;

        /* renamed from: a, reason: collision with root package name */
        private int f20215a = 50;

        /* renamed from: b, reason: collision with root package name */
        private int f20216b = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;

        /* renamed from: c, reason: collision with root package name */
        private int f20217c = 1;

        /* renamed from: e, reason: collision with root package name */
        private int f20219e = 2;

        /* renamed from: f, reason: collision with root package name */
        private int f20220f = 50;

        /* renamed from: g, reason: collision with root package name */
        private int f20221g = 604800000;

        public final a a(int i8) {
            if (i8 <= 0) {
                this.f20215a = 50;
            } else {
                this.f20215a = i8;
            }
            return this;
        }

        public final a b(int i8) {
            if (i8 < 0) {
                this.f20216b = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;
            } else {
                this.f20216b = i8;
            }
            return this;
        }

        public final a c(int i8) {
            if (i8 <= 0) {
                this.f20219e = 2;
            } else {
                this.f20219e = i8;
            }
            return this;
        }

        public final a d(int i8) {
            if (i8 < 0) {
                this.f20220f = 50;
            } else {
                this.f20220f = i8;
            }
            return this;
        }

        public final a e(int i8) {
            if (i8 < 0) {
                this.f20221g = 604800000;
            } else {
                this.f20221g = i8;
            }
            return this;
        }

        public final a a(int i8, o oVar) {
            this.f20217c = i8;
            this.f20218d = oVar;
            return this;
        }

        public final a a(d dVar) {
            this.f20222h = dVar;
            return this;
        }

        public final a a(v vVar) {
            this.f20223i = vVar;
            return this;
        }

        public final a a(f fVar) {
            this.f20224j = fVar;
            return this;
        }

        public final w a() {
            if (y.a(this.f20222h) && com.mbridge.msdk.e.a.f19988a) {
                Log.e("TrackManager", "decorate can not be null");
            }
            if (y.a(this.f20223i) && com.mbridge.msdk.e.a.f19988a) {
                Log.e("TrackManager", "responseHandler can not be null");
            }
            if ((y.a(this.f20218d) || y.a(this.f20218d.c())) && com.mbridge.msdk.e.a.f19988a) {
                Log.e("TrackManager", "networkStackConfig or stack can not be null");
            }
            return new w(this);
        }
    }

    private w(a aVar) {
        this.f20205a = aVar.f20215a;
        this.f20206b = aVar.f20216b;
        this.f20207c = aVar.f20217c;
        this.f20208d = aVar.f20219e;
        this.f20209e = aVar.f20220f;
        this.f20210f = aVar.f20221g;
        this.f20211g = aVar.f20218d;
        this.f20212h = aVar.f20222h;
        this.f20213i = aVar.f20223i;
        this.f20214j = aVar.f20224j;
    }
}
