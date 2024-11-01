package c5;

import android.content.Context;
import android.os.Bundle;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3784i;
import q5.C3795t;

/* renamed from: c5.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2038c {

    /* renamed from: j, reason: collision with root package name */
    public static final a f15738j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f15739a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15740b;

    /* renamed from: c, reason: collision with root package name */
    private String f15741c;

    /* renamed from: d, reason: collision with root package name */
    private String f15742d;

    /* renamed from: e, reason: collision with root package name */
    private long f15743e;

    /* renamed from: f, reason: collision with root package name */
    private int f15744f;

    /* renamed from: g, reason: collision with root package name */
    private long f15745g;

    /* renamed from: h, reason: collision with root package name */
    private int f15746h;

    /* renamed from: i, reason: collision with root package name */
    private long f15747i;

    /* renamed from: c5.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final boolean a(AbstractC2038c abstractC2038c, long j8) {
            if (abstractC2038c != null && abstractC2038c.o() > -1 && abstractC2038c.k() == j8 && System.currentTimeMillis() - abstractC2038c.o() < ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
                return true;
            }
            return false;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public AbstractC2038c(long j8, String packageName, String imageUrl, String type) {
        AbstractC3292y.i(packageName, "packageName");
        AbstractC3292y.i(imageUrl, "imageUrl");
        AbstractC3292y.i(type, "type");
        this.f15739a = j8;
        this.f15740b = packageName;
        this.f15741c = imageUrl;
        this.f15742d = type;
        this.f15743e = -1L;
        this.f15744f = -1;
        this.f15745g = -1L;
        this.f15747i = -1L;
    }

    private final boolean b(Context context) {
        if (new C3784i().B(context, r()) == null) {
            return true;
        }
        return false;
    }

    private final boolean c(Context context) {
        boolean z8;
        boolean z9;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long j8 = this.f15743e;
        if (currentTimeMillis - j8 > 3600 && this.f15746h < 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (currentTimeMillis - j8 > 86400) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.f15746h = 0;
            t(context);
        }
        if (z8 || z9) {
            return true;
        }
        return false;
    }

    public final boolean a(Context context) {
        AbstractC3292y.i(context, "context");
        if (c(context)) {
            return b(context);
        }
        return false;
    }

    public final boolean d() {
        if ((System.currentTimeMillis() / 1000) - this.f15747i > 86400) {
            return true;
        }
        return false;
    }

    public final void e(Context context) {
        AbstractC3292y.i(context, "context");
        this.f15745g = System.currentTimeMillis();
        t(context);
        Bundle bundle = new Bundle();
        bundle.putString("appId", String.valueOf(k()));
        bundle.putString("type", CampaignEx.JSON_NATIVE_VIDEO_CLICK);
        bundle.putString("adView", this.f15742d);
        new C3795t(context).e("ad", bundle);
    }

    public final void f(Context context) {
        AbstractC3292y.i(context, "context");
        Bundle bundle = new Bundle();
        bundle.putString("appId", String.valueOf(k()));
        bundle.putString("type", CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        bundle.putString("adView", this.f15742d);
        new C3795t(context).e("ad", bundle);
    }

    public final void g(Context context) {
        AbstractC3292y.i(context, "context");
        Bundle bundle = new Bundle();
        bundle.putString("appId", String.valueOf(k()));
        bundle.putString("type", "imageFailed");
        bundle.putString("adView", this.f15742d);
        new C3795t(context).e("ad", bundle);
    }

    public final void h(Context context) {
        AbstractC3292y.i(context, "context");
        Bundle bundle = new Bundle();
        bundle.putString("appId", String.valueOf(k()));
        bundle.putString("type", "imageLoaded");
        bundle.putString("adView", this.f15742d);
        new C3795t(context).e("ad", bundle);
    }

    public final void i(Context context) {
        AbstractC3292y.i(context, "context");
        this.f15744f = -1;
        t(context);
    }

    public final void j(Context context) {
        AbstractC3292y.i(context, "context");
        this.f15743e = System.currentTimeMillis() / 1000;
        this.f15746h++;
        t(context);
        Bundle bundle = new Bundle();
        bundle.putString("appId", String.valueOf(k()));
        bundle.putString("type", CampaignEx.JSON_NATIVE_VIDOE_IMPRESSION);
        bundle.putString("adView", this.f15742d);
        new C3795t(context).e("ad", bundle);
    }

    public abstract long k();

    public final int l() {
        return this.f15746h;
    }

    public final int m() {
        return this.f15744f;
    }

    public abstract String n();

    public final long o() {
        return this.f15745g;
    }

    public final long p() {
        return this.f15747i;
    }

    public final long q() {
        return this.f15743e;
    }

    public abstract String r();

    public final String s() {
        return this.f15742d;
    }

    public abstract void t(Context context);

    public String toString() {
        return "AdInfo(appId=" + k() + ", packageName=" + r() + ", imageUrl=" + n() + ", lastTimeShown=" + this.f15743e + ", downloadId=" + this.f15744f + ", lastTimeClicked=" + this.f15745g + ", type=" + this.f15742d + ", counterImpressions=" + this.f15746h + ", lastTimeRequested=" + this.f15747i + ')';
    }

    public final void u(int i8) {
        this.f15746h = i8;
    }

    public final void v(int i8) {
        this.f15744f = i8;
    }

    public final void w(Context context, int i8) {
        AbstractC3292y.i(context, "context");
        this.f15744f = i8;
        t(context);
    }

    public final void x(long j8) {
        this.f15745g = j8;
    }

    public final void y(long j8) {
        this.f15747i = j8;
    }

    public final void z(long j8) {
        this.f15743e = j8;
    }
}
