package h2;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import i2.InterfaceC2969c;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final a f32547c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final b f32548a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f32549b;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a();

        e getInstance();

        Collection getListeners();
    }

    public q(b youTubePlayerOwner) {
        AbstractC3292y.i(youTubePlayerOwner, "youTubePlayerOwner");
        this.f32548a = youTubePlayerOwner;
        this.f32549b = new Handler(Looper.getMainLooper());
    }

    private final EnumC2930a l(String str) {
        if (l6.n.s(str, "small", true)) {
            return EnumC2930a.SMALL;
        }
        if (l6.n.s(str, "medium", true)) {
            return EnumC2930a.MEDIUM;
        }
        if (l6.n.s(str, "large", true)) {
            return EnumC2930a.LARGE;
        }
        if (l6.n.s(str, "hd720", true)) {
            return EnumC2930a.HD720;
        }
        if (l6.n.s(str, "hd1080", true)) {
            return EnumC2930a.HD1080;
        }
        if (l6.n.s(str, "highres", true)) {
            return EnumC2930a.HIGH_RES;
        }
        if (l6.n.s(str, "default", true)) {
            return EnumC2930a.DEFAULT;
        }
        return EnumC2930a.UNKNOWN;
    }

    private final EnumC2931b m(String str) {
        if (l6.n.s(str, "0.25", true)) {
            return EnumC2931b.RATE_0_25;
        }
        if (l6.n.s(str, "0.5", true)) {
            return EnumC2931b.RATE_0_5;
        }
        if (l6.n.s(str, "1", true)) {
            return EnumC2931b.RATE_1;
        }
        if (l6.n.s(str, "1.5", true)) {
            return EnumC2931b.RATE_1_5;
        }
        if (l6.n.s(str, "2", true)) {
            return EnumC2931b.RATE_2;
        }
        return EnumC2931b.UNKNOWN;
    }

    private final c n(String str) {
        if (l6.n.s(str, "2", true)) {
            return c.INVALID_PARAMETER_IN_REQUEST;
        }
        if (l6.n.s(str, CampaignEx.CLICKMODE_ON, true)) {
            return c.HTML_5_PLAYER;
        }
        if (l6.n.s(str, "100", true)) {
            return c.VIDEO_NOT_FOUND;
        }
        if (l6.n.s(str, "101", true)) {
            return c.VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER;
        }
        if (l6.n.s(str, "150", true)) {
            return c.VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER;
        }
        return c.UNKNOWN;
    }

    private final d o(String str) {
        if (l6.n.s(str, "UNSTARTED", true)) {
            return d.UNSTARTED;
        }
        if (l6.n.s(str, "ENDED", true)) {
            return d.ENDED;
        }
        if (l6.n.s(str, "PLAYING", true)) {
            return d.PLAYING;
        }
        if (l6.n.s(str, "PAUSED", true)) {
            return d.PAUSED;
        }
        if (l6.n.s(str, "BUFFERING", true)) {
            return d.BUFFERING;
        }
        if (l6.n.s(str, "CUED", true)) {
            return d.VIDEO_CUED;
        }
        return d.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(q this$0) {
        AbstractC3292y.i(this$0, "this$0");
        Iterator it = this$0.f32548a.getListeners().iterator();
        while (it.hasNext()) {
            ((InterfaceC2969c) it.next()).c(this$0.f32548a.getInstance());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(q this$0, c playerError) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(playerError, "$playerError");
        Iterator it = this$0.f32548a.getListeners().iterator();
        while (it.hasNext()) {
            ((InterfaceC2969c) it.next()).b(this$0.f32548a.getInstance(), playerError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(q this$0, EnumC2930a playbackQuality) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(playbackQuality, "$playbackQuality");
        Iterator it = this$0.f32548a.getListeners().iterator();
        while (it.hasNext()) {
            ((InterfaceC2969c) it.next()).g(this$0.f32548a.getInstance(), playbackQuality);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(q this$0, EnumC2931b playbackRate) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(playbackRate, "$playbackRate");
        Iterator it = this$0.f32548a.getListeners().iterator();
        while (it.hasNext()) {
            ((InterfaceC2969c) it.next()).d(this$0.f32548a.getInstance(), playbackRate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(q this$0) {
        AbstractC3292y.i(this$0, "this$0");
        Iterator it = this$0.f32548a.getListeners().iterator();
        while (it.hasNext()) {
            ((InterfaceC2969c) it.next()).a(this$0.f32548a.getInstance());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(q this$0, d playerState) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(playerState, "$playerState");
        Iterator it = this$0.f32548a.getListeners().iterator();
        while (it.hasNext()) {
            ((InterfaceC2969c) it.next()).i(this$0.f32548a.getInstance(), playerState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(q this$0, float f8) {
        AbstractC3292y.i(this$0, "this$0");
        Iterator it = this$0.f32548a.getListeners().iterator();
        while (it.hasNext()) {
            ((InterfaceC2969c) it.next()).j(this$0.f32548a.getInstance(), f8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(q this$0, float f8) {
        AbstractC3292y.i(this$0, "this$0");
        Iterator it = this$0.f32548a.getListeners().iterator();
        while (it.hasNext()) {
            ((InterfaceC2969c) it.next()).f(this$0.f32548a.getInstance(), f8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(q this$0, String videoId) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(videoId, "$videoId");
        Iterator it = this$0.f32548a.getListeners().iterator();
        while (it.hasNext()) {
            ((InterfaceC2969c) it.next()).h(this$0.f32548a.getInstance(), videoId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(q this$0, float f8) {
        AbstractC3292y.i(this$0, "this$0");
        Iterator it = this$0.f32548a.getListeners().iterator();
        while (it.hasNext()) {
            ((InterfaceC2969c) it.next()).e(this$0.f32548a.getInstance(), f8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(q this$0) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.f32548a.a();
    }

    @JavascriptInterface
    public final boolean sendApiChange() {
        return this.f32549b.post(new Runnable() { // from class: h2.l
            @Override // java.lang.Runnable
            public final void run() {
                q.p(q.this);
            }
        });
    }

    @JavascriptInterface
    public final void sendError(String error) {
        AbstractC3292y.i(error, "error");
        final c n8 = n(error);
        this.f32549b.post(new Runnable() { // from class: h2.o
            @Override // java.lang.Runnable
            public final void run() {
                q.q(q.this, n8);
            }
        });
    }

    @JavascriptInterface
    public final void sendPlaybackQualityChange(String quality) {
        AbstractC3292y.i(quality, "quality");
        final EnumC2930a l8 = l(quality);
        this.f32549b.post(new Runnable() { // from class: h2.h
            @Override // java.lang.Runnable
            public final void run() {
                q.r(q.this, l8);
            }
        });
    }

    @JavascriptInterface
    public final void sendPlaybackRateChange(String rate) {
        AbstractC3292y.i(rate, "rate");
        final EnumC2931b m8 = m(rate);
        this.f32549b.post(new Runnable() { // from class: h2.j
            @Override // java.lang.Runnable
            public final void run() {
                q.s(q.this, m8);
            }
        });
    }

    @JavascriptInterface
    public final boolean sendReady() {
        return this.f32549b.post(new Runnable() { // from class: h2.m
            @Override // java.lang.Runnable
            public final void run() {
                q.t(q.this);
            }
        });
    }

    @JavascriptInterface
    public final void sendStateChange(String state) {
        AbstractC3292y.i(state, "state");
        final d o8 = o(state);
        this.f32549b.post(new Runnable() { // from class: h2.p
            @Override // java.lang.Runnable
            public final void run() {
                q.u(q.this, o8);
            }
        });
    }

    @JavascriptInterface
    public final void sendVideoCurrentTime(String seconds) {
        AbstractC3292y.i(seconds, "seconds");
        try {
            final float parseFloat = Float.parseFloat(seconds);
            this.f32549b.post(new Runnable() { // from class: h2.f
                @Override // java.lang.Runnable
                public final void run() {
                    q.v(q.this, parseFloat);
                }
            });
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void sendVideoDuration(String seconds) {
        AbstractC3292y.i(seconds, "seconds");
        try {
            if (TextUtils.isEmpty(seconds)) {
                seconds = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            }
            final float parseFloat = Float.parseFloat(seconds);
            this.f32549b.post(new Runnable() { // from class: h2.i
                @Override // java.lang.Runnable
                public final void run() {
                    q.w(q.this, parseFloat);
                }
            });
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendVideoId(final String videoId) {
        AbstractC3292y.i(videoId, "videoId");
        return this.f32549b.post(new Runnable() { // from class: h2.k
            @Override // java.lang.Runnable
            public final void run() {
                q.x(q.this, videoId);
            }
        });
    }

    @JavascriptInterface
    public final void sendVideoLoadedFraction(String fraction) {
        AbstractC3292y.i(fraction, "fraction");
        try {
            final float parseFloat = Float.parseFloat(fraction);
            this.f32549b.post(new Runnable() { // from class: h2.n
                @Override // java.lang.Runnable
                public final void run() {
                    q.y(q.this, parseFloat);
                }
            });
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendYouTubeIFrameAPIReady() {
        return this.f32549b.post(new Runnable() { // from class: h2.g
            @Override // java.lang.Runnable
            public final void run() {
                q.z(q.this);
            }
        });
    }
}
