package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f23242a;

    /* renamed from: b, reason: collision with root package name */
    private String f23243b;

    /* renamed from: c, reason: collision with root package name */
    private int f23244c;

    /* renamed from: d, reason: collision with root package name */
    private float f23245d;

    /* renamed from: e, reason: collision with root package name */
    private float f23246e;

    /* renamed from: f, reason: collision with root package name */
    private int f23247f;

    /* renamed from: g, reason: collision with root package name */
    private int f23248g;

    /* renamed from: h, reason: collision with root package name */
    private View f23249h;

    /* renamed from: i, reason: collision with root package name */
    private List<CampaignEx> f23250i;

    /* renamed from: j, reason: collision with root package name */
    private int f23251j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f23252k;

    /* renamed from: l, reason: collision with root package name */
    private List<String> f23253l;

    /* renamed from: m, reason: collision with root package name */
    private int f23254m;

    /* renamed from: n, reason: collision with root package name */
    private String f23255n;

    /* renamed from: o, reason: collision with root package name */
    private int f23256o;

    /* renamed from: p, reason: collision with root package name */
    private int f23257p;

    /* renamed from: q, reason: collision with root package name */
    private String f23258q;

    /* loaded from: classes4.dex */
    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private Context f23259a;

        /* renamed from: b, reason: collision with root package name */
        private String f23260b;

        /* renamed from: c, reason: collision with root package name */
        private int f23261c;

        /* renamed from: d, reason: collision with root package name */
        private float f23262d;

        /* renamed from: e, reason: collision with root package name */
        private float f23263e;

        /* renamed from: f, reason: collision with root package name */
        private int f23264f;

        /* renamed from: g, reason: collision with root package name */
        private int f23265g;

        /* renamed from: h, reason: collision with root package name */
        private View f23266h;

        /* renamed from: i, reason: collision with root package name */
        private List<CampaignEx> f23267i;

        /* renamed from: j, reason: collision with root package name */
        private int f23268j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f23269k;

        /* renamed from: l, reason: collision with root package name */
        private List<String> f23270l;

        /* renamed from: m, reason: collision with root package name */
        private int f23271m;

        /* renamed from: n, reason: collision with root package name */
        private String f23272n;

        /* renamed from: o, reason: collision with root package name */
        private int f23273o;

        /* renamed from: p, reason: collision with root package name */
        private int f23274p = 1;

        /* renamed from: q, reason: collision with root package name */
        private String f23275q;

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(Context context) {
            this.f23259a = context.getApplicationContext();
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(float f8) {
            this.f23263e = f8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b c(int i8) {
            this.f23265g = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b d(int i8) {
            this.f23268j = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b e(int i8) {
            this.f23271m = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b f(int i8) {
            this.f23273o = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b g(int i8) {
            this.f23274p = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(String str) {
            this.f23260b = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(int i8) {
            this.f23264f = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b c(String str) {
            this.f23275q = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(int i8) {
            this.f23261c = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(List<String> list) {
            this.f23270l = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(float f8) {
            this.f23262d = f8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(String str) {
            this.f23272n = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(View view) {
            this.f23266h = view;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(List<CampaignEx> list) {
            this.f23267i = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(boolean z8) {
            this.f23269k = z8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final c a() {
            return new c(this);
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        b a(float f8);

        b a(int i8);

        b a(Context context);

        b a(View view);

        b a(String str);

        b a(List<CampaignEx> list);

        b a(boolean z8);

        c a();

        b b(float f8);

        b b(int i8);

        b b(String str);

        b b(List<String> list);

        b c(int i8);

        b c(String str);

        b d(int i8);

        b e(int i8);

        b f(int i8);

        b g(int i8);
    }

    public final Context a() {
        return this.f23242a;
    }

    public final String b() {
        return this.f23243b;
    }

    public final float c() {
        return this.f23245d;
    }

    public final float d() {
        return this.f23246e;
    }

    public final int e() {
        return this.f23247f;
    }

    public final View f() {
        return this.f23249h;
    }

    public final List<CampaignEx> g() {
        return this.f23250i;
    }

    public final int h() {
        return this.f23244c;
    }

    public final int i() {
        return this.f23251j;
    }

    public final int j() {
        return this.f23248g;
    }

    public final boolean k() {
        return this.f23252k;
    }

    public final List<String> l() {
        return this.f23253l;
    }

    public final int m() {
        return this.f23256o;
    }

    public final int n() {
        return this.f23257p;
    }

    public final String o() {
        return this.f23258q;
    }

    private c(a aVar) {
        this.f23246e = aVar.f23263e;
        this.f23245d = aVar.f23262d;
        this.f23247f = aVar.f23264f;
        this.f23248g = aVar.f23265g;
        this.f23242a = aVar.f23259a;
        this.f23243b = aVar.f23260b;
        this.f23244c = aVar.f23261c;
        this.f23249h = aVar.f23266h;
        this.f23250i = aVar.f23267i;
        this.f23251j = aVar.f23268j;
        this.f23252k = aVar.f23269k;
        this.f23253l = aVar.f23270l;
        this.f23254m = aVar.f23271m;
        this.f23255n = aVar.f23272n;
        this.f23256o = aVar.f23273o;
        this.f23257p = aVar.f23274p;
        this.f23258q = aVar.f23275q;
    }
}
