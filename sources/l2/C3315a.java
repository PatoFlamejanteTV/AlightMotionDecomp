package l2;

import Q5.I;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import i2.AbstractC2967a;
import i2.InterfaceC2968b;
import i2.InterfaceC2969c;
import j2.C3149a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k2.C3231b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3315a extends AbstractC3316b {

    /* renamed from: a, reason: collision with root package name */
    private final C3317c f34633a;

    /* renamed from: b, reason: collision with root package name */
    private final C3231b f34634b;

    /* renamed from: c, reason: collision with root package name */
    private final k2.f f34635c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f34636d;

    /* renamed from: e, reason: collision with root package name */
    private Function0 f34637e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f34638f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f34639g;

    /* renamed from: l2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0790a extends AbstractC2967a {
        C0790a() {
        }

        @Override // i2.AbstractC2967a, i2.InterfaceC2969c
        public void i(h2.e youTubePlayer, h2.d state) {
            AbstractC3292y.i(youTubePlayer, "youTubePlayer");
            AbstractC3292y.i(state, "state");
            if (state == h2.d.PLAYING && !C3315a.this.f()) {
                youTubePlayer.pause();
            }
        }
    }

    /* renamed from: l2.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC2967a {
        b() {
        }

        @Override // i2.AbstractC2967a, i2.InterfaceC2969c
        public void a(h2.e youTubePlayer) {
            AbstractC3292y.i(youTubePlayer, "youTubePlayer");
            C3315a.this.setYouTubePlayerReady$core_release(true);
            Iterator it = C3315a.this.f34638f.iterator();
            if (!it.hasNext()) {
                C3315a.this.f34638f.clear();
                youTubePlayer.c(this);
            } else {
                android.support.v4.media.a.a(it.next());
                throw null;
            }
        }
    }

    /* renamed from: l2.a$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f34643a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5561invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5561invoke() {
        }
    }

    /* renamed from: l2.a$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3149a f34645b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2969c f34646c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l2.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0791a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2969c f34647a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0791a(InterfaceC2969c interfaceC2969c) {
                super(1);
                this.f34647a = interfaceC2969c;
            }

            public final void a(h2.e it) {
                AbstractC3292y.i(it, "it");
                it.f(this.f34647a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((h2.e) obj);
                return I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3149a c3149a, InterfaceC2969c interfaceC2969c) {
            super(0);
            this.f34645b = c3149a;
            this.f34646c = interfaceC2969c;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5562invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5562invoke() {
            C3315a.this.getWebViewYouTubePlayer$core_release().e(new C0791a(this.f34646c), this.f34645b);
        }
    }

    public /* synthetic */ C3315a(Context context, InterfaceC2968b interfaceC2968b, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, interfaceC2968b, (i9 & 4) != 0 ? null : attributeSet, (i9 & 8) != 0 ? 0 : i8);
    }

    public final View d(int i8) {
        removeViews(1, getChildCount() - 1);
        View inflate = View.inflate(getContext(), i8, this);
        AbstractC3292y.h(inflate, "inflate(context, layoutId, this)");
        return inflate;
    }

    public final void e(InterfaceC2969c youTubePlayerListener, boolean z8, C3149a playerOptions) {
        AbstractC3292y.i(youTubePlayerListener, "youTubePlayerListener");
        AbstractC3292y.i(playerOptions, "playerOptions");
        if (!this.f34636d) {
            if (z8) {
                this.f34634b.e();
            }
            e eVar = new e(playerOptions, youTubePlayerListener);
            this.f34637e = eVar;
            if (!z8) {
                eVar.invoke();
                return;
            }
            return;
        }
        throw new IllegalStateException("This YouTubePlayerView has already been initialized.");
    }

    public final boolean f() {
        if (!this.f34639g && !this.f34633a.f()) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        return this.f34636d;
    }

    public final boolean getCanPlay$core_release() {
        return this.f34639g;
    }

    public final C3317c getWebViewYouTubePlayer$core_release() {
        return this.f34633a;
    }

    public final void h() {
        this.f34635c.k();
        this.f34639g = true;
    }

    public final void i() {
        this.f34633a.getYoutubePlayer$core_release().pause();
        this.f34635c.l();
        this.f34639g = false;
    }

    public final void j() {
        this.f34634b.a();
        removeView(this.f34633a);
        this.f34633a.removeAllViews();
        this.f34633a.destroy();
    }

    public final void setCustomPlayerUi(View view) {
        AbstractC3292y.i(view, "view");
        removeViews(1, getChildCount() - 1);
        addView(view);
    }

    public final void setYouTubePlayerReady$core_release(boolean z8) {
        this.f34636d = z8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3315a(Context context, InterfaceC2968b listener, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        C3317c c3317c = new C3317c(context, listener, null, 0, 12, null);
        this.f34633a = c3317c;
        Context applicationContext = context.getApplicationContext();
        AbstractC3292y.h(applicationContext, "context.applicationContext");
        C3231b c3231b = new C3231b(applicationContext);
        this.f34634b = c3231b;
        k2.f fVar = new k2.f();
        this.f34635c = fVar;
        this.f34637e = d.f34643a;
        this.f34638f = new LinkedHashSet();
        this.f34639g = true;
        addView(c3317c, new FrameLayout.LayoutParams(-1, -1));
        c3317c.c(fVar);
        c3317c.c(new C0790a());
        c3317c.c(new b());
        c3231b.d().add(new c());
    }

    /* renamed from: l2.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements C3231b.a {
        c() {
        }

        @Override // k2.C3231b.a
        public void a() {
            if (!C3315a.this.g()) {
                C3315a.this.f34637e.invoke();
            } else {
                C3315a.this.f34635c.m(C3315a.this.getWebViewYouTubePlayer$core_release().getYoutubePlayer$core_release());
            }
        }

        @Override // k2.C3231b.a
        public void b() {
        }
    }
}
