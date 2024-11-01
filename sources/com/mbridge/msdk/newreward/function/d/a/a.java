package com.mbridge.msdk.newreward.function.d.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.function.d.c.d;
import com.mbridge.msdk.newreward.function.d.c.f;
import com.mbridge.msdk.newreward.function.d.c.g;
import com.mbridge.msdk.newreward.function.d.c.h;
import com.mbridge.msdk.newreward.function.d.c.j;
import com.mbridge.msdk.newreward.function.d.c.k;
import com.mbridge.msdk.newreward.function.d.c.l;
import com.mbridge.msdk.newreward.function.d.c.m;
import com.mbridge.msdk.newreward.function.d.c.n;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private b f22262a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f22263b;

    /* renamed from: c, reason: collision with root package name */
    private String f22264c;

    /* renamed from: d, reason: collision with root package name */
    private String f22265d;

    /* renamed from: e, reason: collision with root package name */
    private String f22266e;

    /* renamed from: f, reason: collision with root package name */
    private d<?> f22267f;

    /* renamed from: g, reason: collision with root package name */
    private n f22268g;

    /* renamed from: h, reason: collision with root package name */
    private d<?> f22269h;

    /* renamed from: i, reason: collision with root package name */
    private l f22270i;

    /* renamed from: j, reason: collision with root package name */
    private h f22271j;

    /* renamed from: k, reason: collision with root package name */
    private m f22272k;

    public a(b bVar) {
        this.f22262a = bVar;
    }

    public final m a() {
        CampaignEx.c rewardTemplateMode;
        m mVar = this.f22272k;
        if (mVar != null) {
            return mVar;
        }
        CampaignEx campaignEx = this.f22263b;
        if (campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null) {
            return null;
        }
        String c8 = rewardTemplateMode.c();
        if (TextUtils.isEmpty(c8)) {
            return null;
        }
        if (this.f22272k == null) {
            this.f22272k = new m(this.f22262a, this, c8);
        }
        return this.f22272k;
    }

    public final h b() {
        h hVar = this.f22271j;
        if (hVar != null) {
            return hVar;
        }
        CampaignEx campaignEx = this.f22263b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getEndScreenUrl())) {
            return null;
        }
        if (this.f22271j == null) {
            this.f22271j = new h(this.f22262a, this);
        }
        return this.f22271j;
    }

    public final d<?> c() {
        d<?> dVar = this.f22267f;
        if (dVar != null) {
            return dVar;
        }
        CampaignEx campaignEx = this.f22263b;
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
            return null;
        }
        String e8 = campaignEx.getRewardTemplateMode().e();
        if (TextUtils.isEmpty(e8)) {
            return null;
        }
        if (this.f22267f == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(e8)) {
                this.f22267f = new g(this.f22262a, this);
            } else {
                this.f22267f = new k(this.f22262a, this);
            }
        }
        return this.f22267f;
    }

    public final n d() {
        n nVar = this.f22268g;
        if (nVar != null) {
            return nVar;
        }
        CampaignEx campaignEx = this.f22263b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            return null;
        }
        if (this.f22268g == null) {
            this.f22268g = new n(this.f22262a, this);
        }
        return this.f22268g;
    }

    public final l e() {
        l lVar = this.f22270i;
        if (lVar != null) {
            return lVar;
        }
        CampaignEx campaignEx = this.f22263b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getMraid())) {
            return null;
        }
        if (this.f22270i == null) {
            this.f22270i = new l(this.f22262a, this);
        }
        return this.f22270i;
    }

    public final d<?> f() {
        d<?> dVar = this.f22269h;
        if (dVar != null) {
            return dVar;
        }
        CampaignEx campaignEx = this.f22263b;
        if (campaignEx == null) {
            return null;
        }
        String str = campaignEx.getendcard_url();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f22269h == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(str)) {
                if (ai.l(str)) {
                    this.f22269h = new j(this.f22262a, this);
                } else {
                    this.f22269h = new f(this.f22262a, this);
                }
            } else {
                this.f22269h = new j(this.f22262a, this);
            }
        }
        return this.f22269h;
    }

    public final CampaignEx g() {
        return this.f22263b;
    }

    public final b h() {
        return this.f22262a;
    }

    public final boolean i() {
        CampaignEx campaignEx = this.f22263b;
        if (campaignEx != null) {
            return campaignEx.isMraid();
        }
        return false;
    }

    public final void b(String str) {
        this.f22265d = str;
    }

    public final void a(String str) {
        this.f22264c = str;
    }

    public final void a(CampaignEx campaignEx) {
        this.f22263b = campaignEx;
    }

    public final void c(String str) {
        this.f22266e = str;
    }
}
