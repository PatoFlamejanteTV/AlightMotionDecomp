package k2;

import i2.AbstractC2967a;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class f extends AbstractC2967a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f34391a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f34392b;

    /* renamed from: c, reason: collision with root package name */
    private h2.c f34393c;

    /* renamed from: d, reason: collision with root package name */
    private String f34394d;

    /* renamed from: e, reason: collision with root package name */
    private float f34395e;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34396a;

        static {
            int[] iArr = new int[h2.d.values().length];
            try {
                iArr[h2.d.ENDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h2.d.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h2.d.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34396a = iArr;
        }
    }

    @Override // i2.AbstractC2967a, i2.InterfaceC2969c
    public void b(h2.e youTubePlayer, h2.c error) {
        AbstractC3292y.i(youTubePlayer, "youTubePlayer");
        AbstractC3292y.i(error, "error");
        if (error == h2.c.HTML_5_PLAYER) {
            this.f34393c = error;
        }
    }

    @Override // i2.AbstractC2967a, i2.InterfaceC2969c
    public void h(h2.e youTubePlayer, String videoId) {
        AbstractC3292y.i(youTubePlayer, "youTubePlayer");
        AbstractC3292y.i(videoId, "videoId");
        this.f34394d = videoId;
    }

    @Override // i2.AbstractC2967a, i2.InterfaceC2969c
    public void i(h2.e youTubePlayer, h2.d state) {
        AbstractC3292y.i(youTubePlayer, "youTubePlayer");
        AbstractC3292y.i(state, "state");
        int i8 = a.f34396a[state.ordinal()];
        if (i8 != 1 && i8 != 2) {
            if (i8 == 3) {
                this.f34392b = true;
                return;
            }
            return;
        }
        this.f34392b = false;
    }

    @Override // i2.AbstractC2967a, i2.InterfaceC2969c
    public void j(h2.e youTubePlayer, float f8) {
        AbstractC3292y.i(youTubePlayer, "youTubePlayer");
        this.f34395e = f8;
    }

    public final void k() {
        this.f34391a = true;
    }

    public final void l() {
        this.f34391a = false;
    }

    public final void m(h2.e youTubePlayer) {
        AbstractC3292y.i(youTubePlayer, "youTubePlayer");
        String str = this.f34394d;
        if (str == null) {
            return;
        }
        boolean z8 = this.f34392b;
        if (z8 && this.f34393c == h2.c.HTML_5_PLAYER) {
            h.a(youTubePlayer, this.f34391a, str, this.f34395e);
        } else if (!z8 && this.f34393c == h2.c.HTML_5_PLAYER) {
            youTubePlayer.b(str, this.f34395e);
        }
        this.f34393c = null;
    }
}
