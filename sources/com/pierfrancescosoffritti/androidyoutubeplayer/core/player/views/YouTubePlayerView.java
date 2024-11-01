package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import g2.AbstractC2890b;
import h2.e;
import i2.AbstractC2967a;
import i2.InterfaceC2968b;
import i2.InterfaceC2969c;
import j2.C3149a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k2.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import l2.AbstractC3316b;
import l2.AbstractC3321g;
import l2.C3315a;

/* loaded from: classes4.dex */
public final class YouTubePlayerView extends AbstractC3316b implements LifecycleEventObserver {

    /* renamed from: a, reason: collision with root package name */
    private final List f24432a;

    /* renamed from: b, reason: collision with root package name */
    private final b f24433b;

    /* renamed from: c, reason: collision with root package name */
    private final C3315a f24434c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24435d;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24436a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f24436a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC2968b {
        b() {
        }

        @Override // i2.InterfaceC2968b
        public void a(View fullscreenView, Function0 exitFullscreen) {
            AbstractC3292y.i(fullscreenView, "fullscreenView");
            AbstractC3292y.i(exitFullscreen, "exitFullscreen");
            if (!YouTubePlayerView.this.f24432a.isEmpty()) {
                Iterator it = YouTubePlayerView.this.f24432a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2968b) it.next()).a(fullscreenView, exitFullscreen);
                }
                return;
            }
            throw new IllegalStateException("To enter fullscreen you need to first register a FullscreenListener.");
        }

        @Override // i2.InterfaceC2968b
        public void onExitFullscreen() {
            if (!YouTubePlayerView.this.f24432a.isEmpty()) {
                Iterator it = YouTubePlayerView.this.f24432a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2968b) it.next()).onExitFullscreen();
                }
                return;
            }
            throw new IllegalStateException("To enter fullscreen you need to first register a FullscreenListener.");
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC2967a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24438a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ YouTubePlayerView f24439b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24440c;

        c(String str, YouTubePlayerView youTubePlayerView, boolean z8) {
            this.f24438a = str;
            this.f24439b = youTubePlayerView;
            this.f24440c = z8;
        }

        @Override // i2.AbstractC2967a, i2.InterfaceC2969c
        public void a(e youTubePlayer) {
            boolean z8;
            AbstractC3292y.i(youTubePlayer, "youTubePlayer");
            String str = this.f24438a;
            if (str != null) {
                YouTubePlayerView youTubePlayerView = this.f24439b;
                boolean z9 = this.f24440c;
                if (youTubePlayerView.f24434c.getCanPlay$core_release() && z9) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                h.a(youTubePlayer, z8, str, 0.0f);
            }
            youTubePlayer.c(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        ViewGroup.LayoutParams b9;
        AbstractC3292y.i(context, "context");
        this.f24432a = new ArrayList();
        b bVar = new b();
        this.f24433b = bVar;
        C3315a c3315a = new C3315a(context, bVar, null, 0, 12, null);
        this.f24434c = c3315a;
        b9 = AbstractC3321g.b();
        addView(c3315a, b9);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC2890b.f31934a, 0, 0);
        AbstractC3292y.h(obtainStyledAttributes, "context.theme.obtainStyl….YouTubePlayerView, 0, 0)");
        this.f24435d = obtainStyledAttributes.getBoolean(AbstractC2890b.f31936c, true);
        boolean z8 = obtainStyledAttributes.getBoolean(AbstractC2890b.f31935b, false);
        boolean z9 = obtainStyledAttributes.getBoolean(AbstractC2890b.f31937d, true);
        String string = obtainStyledAttributes.getString(AbstractC2890b.f31938e);
        obtainStyledAttributes.recycle();
        if (z8 && string == null) {
            throw new IllegalStateException("YouTubePlayerView: videoId is not set but autoPlay is set to true. This combination is not allowed.");
        }
        c cVar = new c(string, this, z8);
        if (this.f24435d) {
            c3315a.e(cVar, z9, C3149a.f33666b.a());
        }
    }

    private final void f() {
        this.f24434c.h();
    }

    private final void g() {
        this.f24434c.i();
    }

    public final boolean c(InterfaceC2968b fullscreenListener) {
        AbstractC3292y.i(fullscreenListener, "fullscreenListener");
        return this.f24432a.add(fullscreenListener);
    }

    public final View d(int i8) {
        return this.f24434c.d(i8);
    }

    public final void e(InterfaceC2969c youTubePlayerListener, C3149a playerOptions) {
        AbstractC3292y.i(youTubePlayerListener, "youTubePlayerListener");
        AbstractC3292y.i(playerOptions, "playerOptions");
        if (!this.f24435d) {
            this.f24434c.e(youTubePlayerListener, true, playerOptions);
            return;
        }
        throw new IllegalStateException("YouTubePlayerView: If you want to initialize this view manually, you need to set 'enableAutomaticInitialization' to false.");
    }

    public final boolean getEnableAutomaticInitialization() {
        return this.f24435d;
    }

    public final void h() {
        this.f24434c.j();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        AbstractC3292y.i(source, "source");
        AbstractC3292y.i(event, "event");
        int i8 = a.f24436a[event.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    h();
                    return;
                }
                return;
            }
            g();
            return;
        }
        f();
    }

    public final void setCustomPlayerUi(View view) {
        AbstractC3292y.i(view, "view");
        this.f24434c.setCustomPlayerUi(view);
    }

    public final void setEnableAutomaticInitialization(boolean z8) {
        this.f24435d = z8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context) {
        this(context, null, 0);
        AbstractC3292y.i(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC3292y.i(context, "context");
    }
}
