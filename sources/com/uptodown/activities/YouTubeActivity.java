package com.uptodown.activities;

import Q5.InterfaceC1416k;
import Y4.D0;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedCallback;
import com.uptodown.activities.YouTubeActivity;
import i2.AbstractC2967a;
import i2.InterfaceC2968b;
import j2.C3149a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class YouTubeActivity extends AbstractActivityC2691a {

    /* renamed from: R, reason: collision with root package name */
    public static final a f30368R = new a(null);

    /* renamed from: P, reason: collision with root package name */
    private h2.e f30370P;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1416k f30369O = Q5.l.b(new Function0() { // from class: F4.z5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.D0 b32;
            b32 = YouTubeActivity.b3(YouTubeActivity.this);
            return b32;
        }
    });

    /* renamed from: Q, reason: collision with root package name */
    private final d f30371Q = new d();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
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
            YouTubeActivity.this.c3().f12124c.setVisibility(8);
            YouTubeActivity.this.c3().f12123b.setVisibility(0);
            YouTubeActivity.this.c3().f12123b.addView(fullscreenView);
        }

        @Override // i2.InterfaceC2968b
        public void onExitFullscreen() {
            YouTubeActivity.this.c3().f12124c.setVisibility(0);
            YouTubeActivity.this.c3().f12123b.setVisibility(8);
            YouTubeActivity.this.c3().f12123b.removeAllViews();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC2967a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30374b;

        c(String str) {
            this.f30374b = str;
        }

        @Override // i2.AbstractC2967a, i2.InterfaceC2969c
        public void a(h2.e youTubePlayer) {
            AbstractC3292y.i(youTubePlayer, "youTubePlayer");
            YouTubeActivity.this.f30370P = youTubePlayer;
            youTubePlayer.d(this.f30374b, 0.0f);
        }

        @Override // i2.AbstractC2967a, i2.InterfaceC2969c
        public void b(h2.e youTubePlayer, h2.c error) {
            AbstractC3292y.i(youTubePlayer, "youTubePlayer");
            AbstractC3292y.i(error, "error");
            super.b(youTubePlayer, error);
            YouTubeActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends OnBackPressedCallback {
        d() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            YouTubeActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D0 b3(YouTubeActivity youTubeActivity) {
        return D0.c(youTubeActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D0 c3() {
        return (D0) this.f30369O.getValue();
    }

    private final void d3(String str) {
        C3149a c8 = new C3149a.C0772a().e(1).f(1).c();
        c3().f12124c.e(new c(str), c8);
        c3().f12124c.c(new b());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        h2.e eVar;
        AbstractC3292y.i(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i8 = newConfig.orientation;
        if ((i8 == 1 || i8 == 2) && (eVar = this.f30370P) != null) {
            AbstractC3292y.f(eVar);
            eVar.a();
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        Bundle extras;
        super.onCreate(bundle);
        setContentView(c3().getRoot());
        Window window = getWindow();
        AbstractC3292y.h(window, "getWindow(...)");
        O2(window);
        getOnBackPressedDispatcher().addCallback(this, this.f30371Q);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("id_youtube")) {
            str = extras.getString("id_youtube");
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            d3(str);
        } else {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c3().f12124c.h();
    }
}
