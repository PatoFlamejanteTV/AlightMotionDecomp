package k2;

import i2.AbstractC2967a;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class g extends AbstractC2967a {

    /* renamed from: a, reason: collision with root package name */
    private h2.d f34397a = h2.d.UNKNOWN;

    /* renamed from: b, reason: collision with root package name */
    private float f34398b;

    /* renamed from: c, reason: collision with root package name */
    private float f34399c;

    /* renamed from: d, reason: collision with root package name */
    private String f34400d;

    @Override // i2.AbstractC2967a, i2.InterfaceC2969c
    public void f(h2.e youTubePlayer, float f8) {
        AbstractC3292y.i(youTubePlayer, "youTubePlayer");
        this.f34399c = f8;
    }

    @Override // i2.AbstractC2967a, i2.InterfaceC2969c
    public void h(h2.e youTubePlayer, String videoId) {
        AbstractC3292y.i(youTubePlayer, "youTubePlayer");
        AbstractC3292y.i(videoId, "videoId");
        this.f34400d = videoId;
    }

    @Override // i2.AbstractC2967a, i2.InterfaceC2969c
    public void i(h2.e youTubePlayer, h2.d state) {
        AbstractC3292y.i(youTubePlayer, "youTubePlayer");
        AbstractC3292y.i(state, "state");
        this.f34397a = state;
    }

    @Override // i2.AbstractC2967a, i2.InterfaceC2969c
    public void j(h2.e youTubePlayer, float f8) {
        AbstractC3292y.i(youTubePlayer, "youTubePlayer");
        this.f34398b = f8;
    }
}
