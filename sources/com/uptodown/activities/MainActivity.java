package com.uptodown.activities;

import F4.AbstractActivityC1214z0;
import J4.j;
import R5.AbstractC1435t;
import Y4.C1521k0;
import Y4.C1527q;
import Y4.t0;
import Y4.u0;
import Z4.C1541b1;
import Z4.C1574e;
import Z4.C1606o1;
import Z4.C1609p1;
import Z4.C1635y1;
import Z4.t2;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import c5.C2031A;
import c5.C2040e;
import c5.C2043h;
import c5.C2045j;
import c5.C2046k;
import c5.C2051p;
import c5.Q;
import c5.T;
import c6.InterfaceC2072n;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.tv.ui.activity.TvMainActivity;
import com.uptodown.views.ScrollableTextView;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.GetUserDataWorker;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import n6.X;
import q5.C3770C;
import q5.C3775H;
import q5.C3784i;
import q5.C3788m;
import q5.C3791p;
import q5.C3794s;
import q5.C3795t;
import q5.C3800y;
import u5.C4086f;

/* loaded from: classes4.dex */
public final class MainActivity extends AbstractActivityC1214z0 {

    /* renamed from: T0, reason: collision with root package name */
    public static final C2683b f29686T0 = new C2683b(null);

    /* renamed from: A0, reason: collision with root package name */
    private t2 f29687A0;

    /* renamed from: F0, reason: collision with root package name */
    private FrameLayout f29692F0;

    /* renamed from: G0, reason: collision with root package name */
    private C1521k0 f29693G0;

    /* renamed from: H0, reason: collision with root package name */
    private FrameLayout f29694H0;

    /* renamed from: I0, reason: collision with root package name */
    private FrameLayout f29695I0;

    /* renamed from: J0, reason: collision with root package name */
    private int f29696J0;

    /* renamed from: L0, reason: collision with root package name */
    private RelativeLayout f29698L0;

    /* renamed from: O0, reason: collision with root package name */
    private final ActivityResultLauncher f29701O0;

    /* renamed from: P0, reason: collision with root package name */
    private final ActivityResultLauncher f29702P0;

    /* renamed from: Q0, reason: collision with root package name */
    private final ActivityResultLauncher f29703Q0;

    /* renamed from: R0, reason: collision with root package name */
    private final q f29704R0;

    /* renamed from: S, reason: collision with root package name */
    private RelativeLayout f29705S;

    /* renamed from: S0, reason: collision with root package name */
    private final ActivityResultLauncher f29706S0;

    /* renamed from: T, reason: collision with root package name */
    private int f29707T;

    /* renamed from: V, reason: collision with root package name */
    private boolean f29709V;

    /* renamed from: W, reason: collision with root package name */
    private RelativeLayout f29710W;

    /* renamed from: X, reason: collision with root package name */
    private Toolbar f29711X;

    /* renamed from: Y, reason: collision with root package name */
    private AppBarLayout f29712Y;

    /* renamed from: Z, reason: collision with root package name */
    private SwitchCompat f29713Z;

    /* renamed from: p0, reason: collision with root package name */
    private SwitchCompat f29714p0;

    /* renamed from: q0, reason: collision with root package name */
    private TabLayout f29715q0;

    /* renamed from: r0, reason: collision with root package name */
    private C2043h f29716r0;

    /* renamed from: s0, reason: collision with root package name */
    private ViewPager2 f29717s0;

    /* renamed from: t0, reason: collision with root package name */
    private RelativeLayout f29718t0;

    /* renamed from: u0, reason: collision with root package name */
    private RelativeLayout f29719u0;

    /* renamed from: v0, reason: collision with root package name */
    private ProgressBar f29720v0;

    /* renamed from: w0, reason: collision with root package name */
    private TabLayout f29721w0;

    /* renamed from: x0, reason: collision with root package name */
    private C1609p1 f29722x0;

    /* renamed from: y0, reason: collision with root package name */
    private C1635y1 f29723y0;

    /* renamed from: z0, reason: collision with root package name */
    private C1606o1 f29724z0;

    /* renamed from: U, reason: collision with root package name */
    private ArrayList f29708U = new ArrayList();

    /* renamed from: B0, reason: collision with root package name */
    private ArrayList f29688B0 = new ArrayList();

    /* renamed from: C0, reason: collision with root package name */
    private ArrayList f29689C0 = new ArrayList();

    /* renamed from: D0, reason: collision with root package name */
    private long f29690D0 = -1;

    /* renamed from: E0, reason: collision with root package name */
    private final int f29691E0 = 4;

    /* renamed from: K0, reason: collision with root package name */
    private final C4086f f29697K0 = new C4086f();

    /* renamed from: M0, reason: collision with root package name */
    private final m f29699M0 = new m();

    /* renamed from: N0, reason: collision with root package name */
    private b5.m f29700N0 = new k();

    /* loaded from: classes4.dex */
    public static final class A implements b5.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f29725a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MainActivity f29726b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q f29727c;

        A(TextView textView, MainActivity mainActivity, Q q8) {
            this.f29725a = textView;
            this.f29726b = mainActivity;
            this.f29727c = q8;
        }

        @Override // b5.r
        public void b(int i8) {
            this.f29725a.setText(this.f29726b.getResources().getString(R.string.msg_no_version_details, this.f29726b.getResources().getString(R.string.app_name) + " v." + this.f29727c.x()));
        }

        @Override // b5.r
        public void c(C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            String r02 = appInfo.r0();
            if (r02 != null && r02.length() != 0) {
                this.f29725a.setText(appInfo.r0());
                return;
            }
            this.f29725a.setText(this.f29726b.getResources().getString(R.string.msg_no_version_details, this.f29726b.getResources().getString(R.string.app_name) + " v." + this.f29727c.x()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class B implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f29728a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Animation f29729b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f29730c;

        B(ImageView imageView, Animation animation, ImageView imageView2) {
            this.f29728a = imageView;
            this.f29729b = animation;
            this.f29730c = imageView2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(ImageView imageView, Animation animation, ImageView imageView2, Animation animation2) {
            imageView.startAnimation(animation);
            imageView2.startAnimation(animation2);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(final Animation animation) {
            Handler handler = new Handler(Looper.getMainLooper());
            final ImageView imageView = this.f29728a;
            final Animation animation2 = this.f29729b;
            final ImageView imageView2 = this.f29730c;
            handler.postDelayed(new Runnable() { // from class: F4.J1
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.B.b(imageView, animation2, imageView2, animation);
                }
            }, 1500L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class C extends ClickableSpan {
        C() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3292y.i(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3292y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(MainActivity.this, R.color.main_blue));
            ds.setTypeface(J4.j.f4395g.u());
            ds.setUnderlineText(false);
        }
    }

    /* loaded from: classes4.dex */
    public static final class D extends ClickableSpan {
        D() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3292y.i(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3292y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(MainActivity.this, R.color.main_blue));
            ds.setTypeface(J4.j.f4395g.u());
            ds.setUnderlineText(true);
        }
    }

    /* loaded from: classes4.dex */
    public static final class E extends ClickableSpan {
        E() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3292y.i(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3292y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(MainActivity.this, R.color.turbo_text_featured));
            ds.setTypeface(J4.j.f4395g.u());
            ds.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class F extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29734a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29736c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        F(String str, U5.d dVar) {
            super(2, dVar);
            this.f29736c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new F(this.f29736c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29734a == 0) {
                Q5.t.b(obj);
                Fragment M52 = MainActivity.this.M5();
                if (M52 instanceof C1541b1) {
                    ((C1541b1) M52).A6(this.f29736c);
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((F) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class G extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29737a;

        G(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new G(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29737a == 0) {
                Q5.t.b(obj);
                Fragment M52 = MainActivity.this.M5();
                if (M52 instanceof C1541b1) {
                    MainActivity.this.runOnUiThread(new C1541b1.RunnableC1545d());
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((G) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class H extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29739a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.Q f29741c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.Q f29742d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f29743a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MainActivity f29744b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f29745c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.Q f29746d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.Q f29747e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MainActivity mainActivity, T t8, kotlin.jvm.internal.Q q8, kotlin.jvm.internal.Q q9, U5.d dVar) {
                super(2, dVar);
                this.f29744b = mainActivity;
                this.f29745c = t8;
                this.f29746d = q8;
                this.f29747e = q9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f29744b, this.f29745c, this.f29746d, this.f29747e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                boolean z8;
                V5.b.e();
                if (this.f29743a == 0) {
                    Q5.t.b(obj);
                    MainActivity mainActivity = this.f29744b;
                    Drawable drawable = (Drawable) this.f29745c.f34573a;
                    if (this.f29746d.f34571a + this.f29747e.f34571a > 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    mainActivity.m7(drawable, z8);
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        H(kotlin.jvm.internal.Q q8, kotlin.jvm.internal.Q q9, U5.d dVar) {
            super(2, dVar);
            this.f29741c = q8;
            this.f29742d = q9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new H(this.f29741c, this.f29742d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String h8;
            int Z8;
            Object e8 = V5.b.e();
            int i8 = this.f29739a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                if (MainActivity.this.getApplicationContext() != null) {
                    kotlin.jvm.internal.Q q8 = this.f29741c;
                    Q.b bVar = Q.f15674l;
                    Context applicationContext = MainActivity.this.getApplicationContext();
                    AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
                    q8.f34571a = bVar.a(applicationContext);
                    C3791p.a aVar = C3791p.f37286s;
                    Context applicationContext2 = MainActivity.this.getApplicationContext();
                    AbstractC3292y.h(applicationContext2, "getApplicationContext(...)");
                    C3791p a9 = aVar.a(applicationContext2);
                    a9.a();
                    ArrayList c02 = a9.c0();
                    a9.i();
                    Iterator it = c02.iterator();
                    AbstractC3292y.h(it, "iterator(...)");
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC3292y.h(next, "next(...)");
                        c5.r rVar = (c5.r) next;
                        if (rVar.p() == 0 && (1 > (Z8 = rVar.Z()) || Z8 >= 100 || rVar.z() != 0)) {
                            this.f29742d.f34571a++;
                        }
                    }
                    T t8 = new T();
                    T.b bVar2 = c5.T.f15689k;
                    c5.T e9 = bVar2.e(MainActivity.this);
                    if (e9 != null && (h8 = e9.h()) != null && h8.length() != 0) {
                        try {
                            t8.f34573a = new BitmapDrawable(MainActivity.this.getResources(), com.squareup.picasso.s.h().l(bVar2.c(e9.b())).n(UptodownApp.f29249C.f0(MainActivity.this)).g());
                        } catch (IOException unused) {
                        }
                    }
                    J0 c8 = C3445b0.c();
                    a aVar2 = new a(MainActivity.this, t8, this.f29742d, this.f29741c, null);
                    this.f29739a = 1;
                    if (AbstractC3458i.g(c8, aVar2, this) == e8) {
                        return e8;
                    }
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((H) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class I extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29748a;

        I(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new I(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29748a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        Q5.t.b(obj);
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                this.f29748a = 1;
                if (X.b(1000L, this) == e8) {
                    return e8;
                }
            }
            MainActivity mainActivity = MainActivity.this;
            this.f29748a = 2;
            if (mainActivity.f8(this) == e8) {
                return e8;
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((I) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$a, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2682a implements Runnable {
        public RunnableC2682a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout = (LinearLayout) MainActivity.this.findViewById(R.id.ll_auto_update);
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                MainActivity.this.d7();
            }
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$b, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2683b {
        private C2683b() {
        }

        public /* synthetic */ C2683b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$c, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2684c implements Runnable {
        public RunnableC2684c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity.this.h7();
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$d, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2685d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29752a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29753b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MainActivity f29754c;

        public RunnableC2685d(MainActivity mainActivity, int i8, String packagename) {
            AbstractC3292y.i(packagename, "packagename");
            this.f29754c = mainActivity;
            this.f29752a = i8;
            this.f29753b = packagename;
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment M52 = this.f29754c.M5();
            if (M52 instanceof C1541b1) {
                this.f29754c.runOnUiThread(new C1541b1.RunnableC1544c((C1541b1) M52, this.f29753b, this.f29752a));
            }
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$e, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2686e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29755a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29756b;

        public RunnableC2686e(int i8, String str) {
            this.f29755a = i8;
            this.f29756b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Q q8;
            if (this.f29756b != null) {
                C3791p.a aVar = C3791p.f37286s;
                Context baseContext = MainActivity.this.getBaseContext();
                AbstractC3292y.h(baseContext, "getBaseContext(...)");
                C3791p a9 = aVar.a(baseContext);
                a9.a();
                q8 = a9.s0(this.f29756b);
                a9.i();
            } else {
                q8 = null;
            }
            MainActivity.this.d8(this.f29755a, q8);
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$f, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2687f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29758a;

        /* renamed from: b, reason: collision with root package name */
        private final c5.r f29759b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MainActivity f29760c;

        public RunnableC2687f(MainActivity mainActivity, int i8, c5.r download) {
            AbstractC3292y.i(download, "download");
            this.f29760c = mainActivity;
            this.f29758a = i8;
            this.f29759b = download;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:            if (r0.h() == r5.f29759b.h()) goto L19;     */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r5 = this;
                int r0 = r5.f29758a
                r1 = 202(0xca, float:2.83E-43)
                if (r0 == r1) goto La
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 != r1) goto Lf
            La:
                com.uptodown.activities.MainActivity r0 = r5.f29760c
                r0.g8()
            Lf:
                com.uptodown.activities.MainActivity r0 = r5.f29760c
                int r1 = r5.f29758a
                c5.r r2 = r5.f29759b
                r0.c8(r1, r2)
                com.uptodown.activities.MainActivity r0 = r5.f29760c
                c5.r r1 = r5.f29759b
                java.lang.String r1 = r1.Y()
                r0.j8(r1)
                com.uptodown.activities.MainActivity r0 = r5.f29760c
                c5.r r1 = r5.f29759b
                java.lang.String r1 = r1.Y()
                r0.e8(r1)
                com.uptodown.activities.MainActivity r0 = r5.f29760c
                c5.r r1 = r5.f29759b
                java.lang.String r1 = r1.Y()
                r0.h8(r1)
                com.uptodown.activities.MainActivity r0 = r5.f29760c
                c5.r r1 = r5.f29759b
                java.lang.String r1 = r1.Y()
                r0.Z7(r1)
                com.uptodown.activities.MainActivity r0 = r5.f29760c
                u5.f r0 = com.uptodown.activities.MainActivity.C4(r0)
                c5.r r1 = r5.f29759b
                com.uptodown.activities.MainActivity r2 = r5.f29760c
                android.widget.RelativeLayout r2 = com.uptodown.activities.MainActivity.D4(r2)
                int r3 = r5.f29758a
                com.uptodown.activities.MainActivity r4 = r5.f29760c
                r0.W(r1, r2, r3, r4)
                com.uptodown.activities.MainActivity r0 = r5.f29760c
                androidx.fragment.app.Fragment r0 = r0.M5()
                boolean r0 = r0 instanceof Z4.C1541b1
                if (r0 != 0) goto L6d
                J4.j$a r0 = J4.j.f4395g
                android.app.Activity r0 = r0.f()
                boolean r0 = r0 instanceof com.uptodown.activities.MainActivity
                if (r0 != 0) goto L99
            L6d:
                com.uptodown.activities.MainActivity r0 = r5.f29760c
                androidx.fragment.app.Fragment r0 = r0.M5()
                boolean r0 = r0 instanceof Z4.C1541b1
                if (r0 == 0) goto L9b
                com.uptodown.activities.MainActivity r0 = r5.f29760c
                androidx.fragment.app.Fragment r0 = r0.M5()
                java.lang.String r1 = "null cannot be cast to non-null type com.uptodown.fragments.AppDetailsFragment"
                kotlin.jvm.internal.AbstractC3292y.g(r0, r1)
                Z4.b1 r0 = (Z4.C1541b1) r0
                c5.h r0 = r0.u3()
                if (r0 == 0) goto L99
                long r0 = r0.h()
                c5.r r2 = r5.f29759b
                long r2 = r2.h()
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L99
                goto L9b
            L99:
                r0 = 1
                goto L9c
            L9b:
                r0 = 0
            L9c:
                com.uptodown.activities.MainActivity r1 = r5.f29760c
                int r2 = r5.f29758a
                c5.r r3 = r5.f29759b
                r1.W2(r2, r3, r0)
                if (r0 == 0) goto Lba
                c5.r r0 = r5.f29759b
                int r0 = r0.Z()
                r1 = 100
                if (r0 != r1) goto Lba
                q5.y r0 = q5.C3800y.f37330a
                com.uptodown.activities.MainActivity r1 = r5.f29760c
                c5.r r2 = r5.f29759b
                r0.j(r1, r2)
            Lba:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MainActivity.RunnableC2687f.run():void");
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$g, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2688g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29761a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29762b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MainActivity f29763c;

        public RunnableC2688g(MainActivity mainActivity, int i8, String packagename) {
            AbstractC3292y.i(packagename, "packagename");
            this.f29763c = mainActivity;
            this.f29761a = i8;
            this.f29762b = packagename;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            C3791p a9 = C3791p.f37286s.a(this.f29763c);
            a9.a();
            c5.r a02 = a9.a0(this.f29762b);
            a9.i();
            this.f29763c.c8(this.f29761a, a02);
            this.f29763c.e8(this.f29762b);
            this.f29763c.h8(this.f29762b);
            this.f29763c.j8(this.f29762b);
            this.f29763c.Z7(this.f29762b);
            if (this.f29763c.M5() instanceof C1541b1) {
                if (this.f29763c.M5() instanceof C1541b1) {
                    Fragment M52 = this.f29763c.M5();
                    AbstractC3292y.g(M52, "null cannot be cast to non-null type com.uptodown.fragments.AppDetailsFragment");
                    C2043h u32 = ((C1541b1) M52).u3();
                    if (u32 != null) {
                        str = u32.v0();
                    } else {
                        str = null;
                    }
                    if (AbstractC3292y.d(str, this.f29762b)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C3800y.f37330a.k(this.f29763c, this.f29762b);
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$h, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class AnimationAnimationListenerC2689h implements Animation.AnimationListener {
        AnimationAnimationListenerC2689h() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3292y.i(animation, "animation");
            int J52 = MainActivity.this.J5();
            if (J52 >= 0 && J52 < MainActivity.this.f29708U.size()) {
                RelativeLayout relativeLayout = MainActivity.this.f29710W;
                if (relativeLayout != null) {
                    relativeLayout.removeAllViews();
                }
                RelativeLayout c8 = ((c5.X) MainActivity.this.f29708U.get(J52)).c();
                RelativeLayout relativeLayout2 = MainActivity.this.f29710W;
                if (relativeLayout2 != null) {
                    relativeLayout2.addView(c8);
                }
                c8.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_back_in));
            } else {
                ((c5.X) MainActivity.this.f29708U.get(MainActivity.this.f29707T)).c().setVisibility(8);
                MainActivity.this.finish();
            }
            MainActivity.this.f29709V = false;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3292y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3292y.i(animation, "animation");
            MainActivity.this.f29709V = true;
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$i, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class AnimationAnimationListenerC2690i implements Animation.AnimationListener {
        AnimationAnimationListenerC2690i() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3292y.i(animation, "animation");
            int N52 = MainActivity.this.N5();
            if (N52 < 0 || N52 >= MainActivity.this.f29708U.size()) {
                MainActivity.this.b7();
                return;
            }
            RelativeLayout relativeLayout = MainActivity.this.f29710W;
            AbstractC3292y.f(relativeLayout);
            relativeLayout.removeAllViews();
            RelativeLayout c8 = ((c5.X) MainActivity.this.f29708U.get(N52)).c();
            RelativeLayout relativeLayout2 = MainActivity.this.f29710W;
            AbstractC3292y.f(relativeLayout2);
            relativeLayout2.addView(c8);
            Bundle bundle = new Bundle();
            bundle.putString("type", ((c5.X) MainActivity.this.f29708U.get(N52)).b());
            C3795t q22 = MainActivity.this.q2();
            if (q22 != null) {
                q22.e("wizard", bundle);
            }
            if (((c5.X) MainActivity.this.f29708U.get(MainActivity.this.f29707T)).a() == 2 && ((c5.X) MainActivity.this.f29708U.get(0)).a() == 1) {
                ((c5.X) MainActivity.this.f29708U.get(0)).c().removeAllViews();
                MainActivity.this.f29708U.remove(0);
                MainActivity.this.f29707T = 0;
            }
            MainActivity.this.l8();
            c8.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_next_in));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3292y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3292y.i(animation, "animation");
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements Animation.AnimationListener {
        j() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3292y.i(animation, "animation");
            FrameLayout frameLayout = MainActivity.this.f29692F0;
            AbstractC3292y.f(frameLayout);
            frameLayout.removeAllViews();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3292y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3292y.i(animation, "animation");
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements b5.m {
        k() {
        }

        @Override // b5.m
        public void a() {
            FrameLayout frameLayout = MainActivity.this.f29695I0;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
        }

        @Override // b5.m
        public void b() {
            MainActivity.this.i6();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29768a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f29770a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MainActivity f29771b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.T f29772c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MainActivity mainActivity, kotlin.jvm.internal.T t8, U5.d dVar) {
                super(2, dVar);
                this.f29771b = mainActivity;
                this.f29772c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f29771b, this.f29772c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f29770a == 0) {
                    Q5.t.b(obj);
                    TabLayout tabLayout = this.f29771b.f29715q0;
                    AbstractC3292y.f(tabLayout);
                    TabLayout.Tab newTab = tabLayout.newTab();
                    AbstractC3292y.h(newTab, "newTab(...)");
                    View inflate = LayoutInflater.from(this.f29771b).inflate(R.layout.home_header_parent_category, (ViewGroup) this.f29771b.f29711X, false);
                    AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView = (TextView) inflate;
                    textView.setTypeface(J4.j.f4395g.u());
                    textView.setText(this.f29771b.getString(R.string.for_you_category));
                    newTab.setCustomView(textView);
                    newTab.setTag(kotlin.coroutines.jvm.internal.b.c(0));
                    TabLayout tabLayout2 = this.f29771b.f29715q0;
                    AbstractC3292y.f(tabLayout2);
                    tabLayout2.addTab(newTab);
                    Iterator it = ((ArrayList) this.f29772c.f34573a).iterator();
                    AbstractC3292y.h(it, "iterator(...)");
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC3292y.h(next, "next(...)");
                        C2046k c2046k = (C2046k) next;
                        TabLayout tabLayout3 = this.f29771b.f29715q0;
                        AbstractC3292y.f(tabLayout3);
                        TabLayout.Tab newTab2 = tabLayout3.newTab();
                        View inflate2 = LayoutInflater.from(this.f29771b).inflate(R.layout.home_header_parent_category, (ViewGroup) this.f29771b.f29711X, false);
                        AbstractC3292y.g(inflate2, "null cannot be cast to non-null type android.widget.TextView");
                        TextView textView2 = (TextView) inflate2;
                        textView2.setTypeface(J4.j.f4395g.v());
                        textView2.setText(c2046k.h());
                        newTab2.setCustomView(textView2);
                        newTab2.setTag(c2046k);
                        TabLayout tabLayout4 = this.f29771b.f29715q0;
                        AbstractC3292y.f(tabLayout4);
                        tabLayout4.addTab(newTab2);
                    }
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements TabLayout.OnTabSelectedListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MainActivity f29773a;

            b(MainActivity mainActivity) {
                this.f29773a = mainActivity;
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
                AbstractC3292y.i(tab, "tab");
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(TabLayout.Tab tab) {
                AbstractC3292y.i(tab, "tab");
                TabLayout tabLayout = this.f29773a.f29715q0;
                AbstractC3292y.f(tabLayout);
                View childAt = tabLayout.getChildAt(0);
                AbstractC3292y.g(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                View findViewById = ((ViewGroup) childAt).getChildAt(tab.getPosition()).findViewById(R.id.tv_home_header_parent_category);
                AbstractC3292y.h(findViewById, "findViewById(...)");
                ((TextView) findViewById).setTypeface(J4.j.f4395g.u());
                this.f29773a.P7();
                C1606o1 c1606o1 = this.f29773a.f29724z0;
                if (c1606o1 != null) {
                    c1606o1.B();
                }
                if (AbstractC3292y.d(tab.getTag(), 0)) {
                    this.f29773a.q8();
                    return;
                }
                Object tag = tab.getTag();
                AbstractC3292y.g(tag, "null cannot be cast to non-null type com.uptodown.models.Category");
                C2046k c2046k = (C2046k) tag;
                if (c2046k.b() != 523) {
                    this.f29773a.f29696J0 = tab.getPosition();
                }
                this.f29773a.s8(c2046k);
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
                AbstractC3292y.i(tab, "tab");
                TabLayout tabLayout = this.f29773a.f29715q0;
                AbstractC3292y.f(tabLayout);
                View childAt = tabLayout.getChildAt(0);
                AbstractC3292y.g(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                View findViewById = ((ViewGroup) childAt).getChildAt(tab.getPosition()).findViewById(R.id.tv_home_header_parent_category);
                AbstractC3292y.h(findViewById, "findViewById(...)");
                ((TextView) findViewById).setTypeface(J4.j.f4395g.v());
            }
        }

        l(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new l(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29768a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
                t8.f34573a = new ArrayList();
                C3791p a9 = C3791p.f37286s.a(MainActivity.this);
                a9.a();
                c5.L r02 = a9.r0("categories");
                if (r02 != null && r02.a()) {
                    t8.f34573a = C2046k.b.b(C2046k.f15883g, r02.b(), 0, 2, null);
                } else {
                    c5.K p8 = new C3775H(MainActivity.this).p();
                    if (p8.f()) {
                        C2046k.b bVar = C2046k.f15883g;
                        String d8 = p8.d();
                        AbstractC3292y.f(d8);
                        t8.f34573a = C2046k.b.b(bVar, d8, 0, 2, null);
                        String d9 = p8.d();
                        AbstractC3292y.f(d9);
                        c5.L l8 = new c5.L("categories", d9);
                        a9.L("categories");
                        a9.M0(l8);
                    }
                }
                a9.i();
                if (!((Collection) t8.f34573a).isEmpty()) {
                    J0 c8 = C3445b0.c();
                    a aVar = new a(MainActivity.this, t8, null);
                    this.f29768a = 1;
                    if (AbstractC3458i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            TabLayout tabLayout = MainActivity.this.f29715q0;
            AbstractC3292y.f(tabLayout);
            tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new b(MainActivity.this));
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements b5.r {
        m() {
        }

        @Override // b5.r
        public void b(int i8) {
        }

        @Override // b5.r
        public void c(C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            if (MainActivity.this.b6()) {
                MainActivity.this.X2(appInfo);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class n implements Animation.AnimationListener {
        n() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3292y.i(animation, "animation");
            FrameLayout frameLayout = MainActivity.this.f29694H0;
            AbstractC3292y.f(frameLayout);
            frameLayout.removeAllViews();
            MainActivity.this.f29694H0 = null;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3292y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3292y.i(animation, "animation");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29776a;

        /* loaded from: classes4.dex */
        public static final class a implements b5.p {
            a() {
            }

            @Override // b5.p
            public void a() {
            }

            @Override // b5.p
            public void b() {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f29778a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MainActivity f29779b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(MainActivity mainActivity, U5.d dVar) {
                super(2, dVar);
                this.f29779b = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f29779b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f29778a == 0) {
                    Q5.t.b(obj);
                    this.f29779b.i6();
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        o(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new o(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29776a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        Q5.t.b(obj);
                        Q5.I i9 = Q5.I.f8786a;
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                c5.T e9 = c5.T.f15689k.e(MainActivity.this);
                if (e9 == null || !e9.y()) {
                    this.f29776a = 1;
                    if (X.b(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS, this) == e8) {
                        return e8;
                    }
                }
                return Q5.I.f8786a;
            }
            C2045j d8 = C2045j.f15879n.d(MainActivity.this);
            if (d8 != null && !d8.d()) {
                J0 c8 = C3445b0.c();
                b bVar = new b(MainActivity.this, null);
                this.f29776a = 2;
                if (AbstractC3458i.g(c8, bVar, this) == e8) {
                    return e8;
                }
                Q5.I i92 = Q5.I.f8786a;
                return Q5.I.f8786a;
            }
            MainActivity mainActivity = MainActivity.this;
            new X4.b(mainActivity, mainActivity.f29700N0, LifecycleOwnerKt.getLifecycleScope(MainActivity.this));
            new X4.e(MainActivity.this, new a(), LifecycleOwnerKt.getLifecycleScope(MainActivity.this));
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((o) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class p implements m2.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2045j f29780a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MainActivity f29781b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f29782c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ImageView f29783d;

        p(C2045j c2045j, MainActivity mainActivity, View view, ImageView imageView) {
            this.f29780a = c2045j;
            this.f29781b = mainActivity;
            this.f29782c = view;
            this.f29783d = imageView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(ImageView imageView, C2045j c2045j, MainActivity mainActivity) {
            if (new C3788m().p(imageView)) {
                c2045j.j(mainActivity);
            }
        }

        @Override // m2.b
        public void a(Exception exc) {
            this.f29780a.g(this.f29781b);
            FrameLayout frameLayout = this.f29781b.f29695I0;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
        }

        @Override // m2.b
        public void b() {
            this.f29780a.h(this.f29781b);
            FrameLayout frameLayout = this.f29781b.f29695I0;
            if (frameLayout != null) {
                frameLayout.addView(this.f29782c);
            }
            Handler handler = new Handler(Looper.getMainLooper());
            final ImageView imageView = this.f29783d;
            final C2045j c2045j = this.f29780a;
            final MainActivity mainActivity = this.f29781b;
            handler.postDelayed(new Runnable() { // from class: F4.I1
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.p.d(imageView, c2045j, mainActivity);
                }
            }, 500L);
        }
    }

    /* loaded from: classes4.dex */
    public static final class q extends OnBackPressedCallback {
        q() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            RelativeLayout relativeLayout = MainActivity.this.f29698L0;
            if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                C4086f c4086f = MainActivity.this.f29697K0;
                MainActivity mainActivity = MainActivity.this;
                RelativeLayout relativeLayout2 = mainActivity.f29698L0;
                AbstractC3292y.f(relativeLayout2);
                c4086f.f(mainActivity, relativeLayout2);
                return;
            }
            boolean popBackStackImmediate = MainActivity.this.getSupportFragmentManager().popBackStackImmediate();
            int backStackEntryCount = MainActivity.this.getSupportFragmentManager().getBackStackEntryCount();
            if (popBackStackImmediate && backStackEntryCount >= 0) {
                if (MainActivity.this.M5() instanceof C1541b1) {
                    RelativeLayout O52 = MainActivity.this.O5();
                    if (O52 != null) {
                        O52.setVisibility(0);
                        return;
                    }
                    return;
                }
                RelativeLayout O53 = MainActivity.this.O5();
                if (O53 != null) {
                    O53.setVisibility(8);
                }
                if (MainActivity.this.M5() == null || (MainActivity.this.M5() instanceof C1606o1) || (MainActivity.this.M5() instanceof C1609p1)) {
                    TabLayout tabLayout = MainActivity.this.f29721w0;
                    if (tabLayout == null || tabLayout.getSelectedTabPosition() != 2) {
                        MainActivity.this.P7();
                        return;
                    }
                    return;
                }
                return;
            }
            RelativeLayout O54 = MainActivity.this.O5();
            if (O54 != null) {
                O54.setVisibility(8);
            }
            int size = MainActivity.this.f29688B0.size();
            if (size > 0) {
                Fragment fragment = (Fragment) AbstractC1435t.y0(MainActivity.this.f29688B0);
                MainActivity.this.f29688B0.remove(size - 1);
                if (fragment instanceof C1609p1) {
                    C1609p1 c1609p1 = (C1609p1) fragment;
                    if (c1609p1.r() != null) {
                        C2046k r8 = c1609p1.r();
                        AbstractC3292y.f(r8);
                        if (r8.b() == 523) {
                            MainActivity.this.z5(1);
                            return;
                        }
                    }
                    MainActivity.this.q8();
                    return;
                }
                if (!MainActivity.this.b6()) {
                    MainActivity.this.finish();
                    return;
                }
                if (MainActivity.this.f29710W != null) {
                    RelativeLayout relativeLayout3 = MainActivity.this.f29710W;
                    AbstractC3292y.f(relativeLayout3);
                    if (relativeLayout3.getVisibility() == 0) {
                        MainActivity.this.w5();
                        return;
                    }
                }
                ViewPager2 viewPager2 = MainActivity.this.f29717s0;
                if (viewPager2 != null && viewPager2.getCurrentItem() == 0) {
                    MainActivity.this.finish();
                    return;
                } else {
                    MainActivity.this.z5(0);
                    return;
                }
            }
            if (!MainActivity.this.b6()) {
                MainActivity.this.finish();
                return;
            }
            if (MainActivity.this.f29710W != null) {
                RelativeLayout relativeLayout4 = MainActivity.this.f29710W;
                AbstractC3292y.f(relativeLayout4);
                if (relativeLayout4.getVisibility() == 0) {
                    MainActivity.this.w5();
                    return;
                }
            }
            ViewPager2 viewPager22 = MainActivity.this.f29717s0;
            if (viewPager22 != null && viewPager22.getCurrentItem() == 0) {
                MainActivity.this.finish();
            } else {
                MainActivity.this.z5(0);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class r extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29785a;

        r(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new r(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29785a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                MainActivity mainActivity = MainActivity.this;
                this.f29785a = 1;
                if (mainActivity.K5(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((r) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class s extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29787a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f29789c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(t tVar, U5.d dVar) {
            super(2, dVar);
            this.f29789c = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new s(this.f29789c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29787a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                GetUserDataWorker.a aVar = GetUserDataWorker.f31222b;
                MainActivity mainActivity = MainActivity.this;
                t tVar = this.f29789c;
                this.f29787a = 1;
                if (aVar.b(mainActivity, tVar, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((s) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class t implements b5.H {
        t() {
        }

        @Override // b5.H
        public void a() {
            c5.T e8 = c5.T.f15689k.e(MainActivity.this);
            if (e8 != null && MainActivity.this.f29687A0 != null) {
                t2 t2Var = MainActivity.this.f29687A0;
                AbstractC3292y.f(t2Var);
                t2Var.b1(e8);
                MainActivity.this.V7();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class u implements b5.r {
        u() {
        }

        @Override // b5.r
        public void b(int i8) {
            MainActivity.this.f29690D0 = -1L;
        }

        @Override // b5.r
        public void c(C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            MainActivity.this.X2(appInfo);
            MainActivity.this.f29690D0 = -1L;
        }
    }

    /* loaded from: classes4.dex */
    static final class v extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29792a;

        v(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new v(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29792a == 0) {
                Q5.t.b(obj);
                Fragment M52 = MainActivity.this.M5();
                if (M52 instanceof C1541b1) {
                    ((C1541b1) M52).x5();
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((v) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class w implements Animation.AnimationListener {
        w() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3292y.i(animation, "animation");
            MainActivity.this.S5();
            MainActivity.this.a7();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3292y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3292y.i(animation, "animation");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class x extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29795a;

        x(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new x(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29795a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                MainActivity mainActivity = MainActivity.this;
                this.f29795a = 1;
                if (mainActivity.K5(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((x) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class y implements TabLayout.OnTabSelectedListener {
        y() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            C1635y1 c1635y1;
            AbstractC3292y.i(tab, "tab");
            if (tab.getPosition() == 0) {
                if (MainActivity.this.f29724z0 != null) {
                    MainActivity.this.q8();
                    MainActivity.this.P7();
                    C1606o1 c1606o1 = MainActivity.this.f29724z0;
                    AbstractC3292y.f(c1606o1);
                    c1606o1.B();
                    return;
                }
                return;
            }
            if (tab.getPosition() == 1) {
                if (MainActivity.this.f29722x0 != null) {
                    MainActivity.this.P7();
                    C1609p1 c1609p1 = MainActivity.this.f29722x0;
                    AbstractC3292y.f(c1609p1);
                    c1609p1.s();
                    return;
                }
                return;
            }
            if (tab.getPosition() == 2 && (c1635y1 = MainActivity.this.f29723y0) != null) {
                c1635y1.P();
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            AbstractC3292y.i(tab, "tab");
            ViewPager2 viewPager2 = MainActivity.this.f29717s0;
            AbstractC3292y.f(viewPager2);
            viewPager2.setCurrentItem(tab.getPosition(), false);
            MainActivity.this.Z6();
            TabLayout tabLayout = MainActivity.this.f29715q0;
            if (tabLayout != null) {
                tabLayout.setVisibility(0);
            }
            MainActivity.this.T2();
            MainActivity.this.P7();
            MainActivity.this.Q5();
            int position = tab.getPosition();
            if (position == 0) {
                TabLayout tabLayout2 = MainActivity.this.f29715q0;
                AbstractC3292y.f(tabLayout2);
                if (tabLayout2.getSelectedTabPosition() != 0) {
                    TabLayout tabLayout3 = MainActivity.this.f29715q0;
                    AbstractC3292y.f(tabLayout3);
                    TabLayout tabLayout4 = MainActivity.this.f29715q0;
                    AbstractC3292y.f(tabLayout4);
                    tabLayout3.selectTab(tabLayout4.getTabAt(MainActivity.this.f29696J0));
                } else {
                    MainActivity.this.q8();
                }
                MainActivity.this.x7();
                return;
            }
            if (position == 1) {
                TabLayout tabLayout5 = MainActivity.this.f29715q0;
                AbstractC3292y.f(tabLayout5);
                int tabCount = tabLayout5.getTabCount();
                int i8 = 0;
                for (int i9 = 0; i9 < tabCount; i9++) {
                    TabLayout tabLayout6 = MainActivity.this.f29715q0;
                    AbstractC3292y.f(tabLayout6);
                    TabLayout.Tab tabAt = tabLayout6.getTabAt(i9);
                    AbstractC3292y.f(tabAt);
                    if (tabAt.getTag() instanceof C2046k) {
                        Object tag = tabAt.getTag();
                        AbstractC3292y.g(tag, "null cannot be cast to non-null type com.uptodown.models.Category");
                        if (((C2046k) tag).b() == 523) {
                            i8 = i9;
                        }
                    }
                }
                TabLayout tabLayout7 = MainActivity.this.f29715q0;
                AbstractC3292y.f(tabLayout7);
                TabLayout tabLayout8 = MainActivity.this.f29715q0;
                AbstractC3292y.f(tabLayout8);
                tabLayout7.selectTab(tabLayout8.getTabAt(i8));
                return;
            }
            if (position == 2) {
                MainActivity.this.T5();
                TabLayout tabLayout9 = MainActivity.this.f29715q0;
                if (tabLayout9 != null) {
                    tabLayout9.setVisibility(8);
                    return;
                }
                return;
            }
            MainActivity.this.s2();
            MainActivity.this.T5();
            TabLayout tabLayout10 = MainActivity.this.f29715q0;
            if (tabLayout10 != null) {
                tabLayout10.setVisibility(8);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            AbstractC3292y.i(tab, "tab");
        }
    }

    /* loaded from: classes4.dex */
    public static final class z extends FragmentStateAdapter {
        z(FragmentManager fragmentManager, Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int i8) {
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        MainActivity.this.f29687A0 = new t2();
                        t2 t2Var = MainActivity.this.f29687A0;
                        AbstractC3292y.f(t2Var);
                        return t2Var;
                    }
                    C2046k c2046k = new C2046k(0, null, null, 7, null);
                    c2046k.Q(-1);
                    c2046k.U(MainActivity.this.getString(R.string.top_downloads_title));
                    MainActivity.this.f29723y0 = C1635y1.f13904i.a(c2046k);
                    C1635y1 c1635y1 = MainActivity.this.f29723y0;
                    AbstractC3292y.f(c1635y1);
                    return c1635y1;
                }
                C2046k c2046k2 = new C2046k(0, null, null, 7, null);
                c2046k2.Q(523);
                c2046k2.U(MainActivity.this.getString(R.string.top_games_title));
                MainActivity.this.f29722x0 = C1609p1.f13757n.a(c2046k2);
                C1609p1 c1609p1 = MainActivity.this.f29722x0;
                AbstractC3292y.f(c1609p1);
                return c1609p1;
            }
            MainActivity.this.f29724z0 = new C1606o1();
            C1606o1 c1606o1 = MainActivity.this.f29724z0;
            AbstractC3292y.f(c1606o1);
            return c1606o1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return MainActivity.this.f29691E0;
        }
    }

    public MainActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.S0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.I5(MainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f29701O0 = registerForActivityResult;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.T0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.o7(MainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult2, "registerForActivityResult(...)");
        this.f29702P0 = registerForActivityResult2;
        ActivityResultLauncher registerForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.U0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.L6(MainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult3, "registerForActivityResult(...)");
        this.f29703Q0 = registerForActivityResult3;
        this.f29704R0 = new q();
        ActivityResultLauncher registerForActivityResult4 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.V0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.Z5(MainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult4, "registerForActivityResult(...)");
        this.f29706S0 = registerForActivityResult4;
    }

    private final void A4() {
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        if (!aVar.U(this)) {
            aVar.D0(this, true);
            aVar.s0(this, true);
            aVar.y0(this, true);
            aVar.b1(this, true);
            UptodownApp.a aVar2 = UptodownApp.f29249C;
            UptodownApp.a.M0(aVar2, this, false, 2, null);
            aVar2.K(this);
            N2(new C3795t(this));
            C3795t q22 = q2();
            if (q22 != null) {
                q22.b();
            }
        }
        L2();
        if (!aVar.j0(this)) {
            new C3788m().g(o2(), this);
        } else {
            x5();
        }
    }

    private final void A5() {
        long currentTimeMillis = System.currentTimeMillis();
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        if (currentTimeMillis - aVar.B(this) >= TimeUnit.DAYS.toMillis(7L)) {
            aVar.S0(this, System.currentTimeMillis());
            if (Build.VERSION.SDK_INT >= 33) {
                if (!d6()) {
                    E5();
                    return;
                }
            } else if (!aVar.a0(this)) {
                E5();
                return;
            }
        }
        H7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A6(MainActivity mainActivity, View view) {
        SwitchCompat switchCompat = mainActivity.f29714p0;
        if (switchCompat != null && !switchCompat.isChecked()) {
            mainActivity.i0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A7(MainActivity mainActivity, View view) {
        mainActivity.h7();
    }

    private final void B5() {
        if (!C3800y.f37330a.a(this)) {
            C3791p a9 = C3791p.f37286s.a(this);
            a9.a();
            P2(a9.p0());
            a9.i();
            for (int i8 = 0; r2().size() > 0 && i8 < 2; i8++) {
                Object remove = r2().remove(0);
                AbstractC3292y.h(remove, "removeAt(...)");
                H2((c5.G) remove);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B6(MainActivity mainActivity, View view) {
        SwitchCompat switchCompat = mainActivity.f29713Z;
        if (switchCompat != null && !switchCompat.isChecked() && !mainActivity.T()) {
            mainActivity.k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B7(View view) {
    }

    private final void C5() {
        c5.T e8 = c5.T.f15689k.e(this);
        if ((e8 == null || !e8.y()) && SettingsPreferences.f30529b.G(this) == 0) {
            Q7();
        } else {
            A5();
            B5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C6(SwitchCompat switchCompat, MainActivity mainActivity, View view) {
        boolean z8 = !switchCompat.isChecked();
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        aVar.w0(mainActivity, z8);
        switchCompat.setChecked(aVar.N(mainActivity));
        mainActivity.l8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C7(MainActivity mainActivity, View view) {
        mainActivity.Y6();
    }

    private final void D5(Bundle bundle) {
        FrameLayout frameLayout = this.f29692F0;
        if (frameLayout != null) {
            AbstractC3292y.f(frameLayout);
            if (frameLayout.getChildCount() > 0 && this.f29693G0 != null) {
                new C3795t(this).e("login_popup", bundle);
                if (SettingsPreferences.f30529b.M(this) && !UptodownApp.f29249C.S()) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_out_bottom);
                    loadAnimation.setAnimationListener(new j());
                    C1521k0 c1521k0 = this.f29693G0;
                    AbstractC3292y.f(c1521k0);
                    c1521k0.getRoot().startAnimation(loadAnimation);
                    return;
                }
                FrameLayout frameLayout2 = this.f29692F0;
                AbstractC3292y.f(frameLayout2);
                frameLayout2.removeAllViews();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D6(MainActivity mainActivity, View view) {
        mainActivity.x5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D7(MainActivity mainActivity, View view) {
        mainActivity.U6();
    }

    private final void E5() {
        if (!isFinishing()) {
            AlertDialog o22 = o2();
            if (o22 != null) {
                o22.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            C1527q c8 = C1527q.c(getLayoutInflater());
            AbstractC3292y.h(c8, "inflate(...)");
            TextView textView = c8.f12902d;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.v());
            c8.f12902d.setText(getString(R.string.notification_permission_request));
            c8.f12903e.setTypeface(aVar.u());
            c8.f12903e.setOnClickListener(new View.OnClickListener() { // from class: F4.L0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.F5(MainActivity.this, view);
                }
            });
            c8.f12901c.setTypeface(aVar.u());
            c8.f12901c.setOnClickListener(new View.OnClickListener() { // from class: F4.W0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.G5(MainActivity.this, view);
                }
            });
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            K2(builder.create());
            if (!isFinishing() && o2() != null) {
                AlertDialog o23 = o2();
                AbstractC3292y.f(o23);
                Window window = o23.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog o24 = o2();
                AbstractC3292y.f(o24);
                o24.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E6(MainActivity mainActivity, View view) {
        mainActivity.w5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E7(MainActivity mainActivity, View view) {
        mainActivity.V6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F5(MainActivity mainActivity, View view) {
        AlertDialog o22 = mainActivity.o2();
        AbstractC3292y.f(o22);
        o22.dismiss();
        if (Build.VERSION.SDK_INT >= 33) {
            mainActivity.i0();
        }
        SettingsPreferences.f30529b.R0(mainActivity, true);
    }

    private final void F6() {
        y6();
        t6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F7(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G5(MainActivity mainActivity, View view) {
        AlertDialog o22 = mainActivity.o2();
        AbstractC3292y.f(o22);
        o22.dismiss();
    }

    private final void G6() {
        v5(H6(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G7(MainActivity mainActivity, View view) {
        mainActivity.b7();
    }

    private final RelativeLayout H6() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_welcome, (ViewGroup) this.f29710W, false);
        AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_welcome_to_wizard_welcome);
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.v());
        ((TextView) relativeLayout.findViewById(R.id.tv_app_name_wizard_welcome)).setTypeface(aVar.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_slogan_to_wizard_welcome)).setTypeface(aVar.v());
        ((TextView) relativeLayout.findViewById(R.id.tv_terms_wizard_welcome)).setTypeface(aVar.u());
        ((RelativeLayout) relativeLayout.findViewById(R.id.rl_terms_wizard_welcome)).setOnClickListener(new View.OnClickListener() { // from class: F4.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.I6(MainActivity.this, view);
            }
        });
        ((TextView) relativeLayout.findViewById(R.id.tv_privacy_settings_wizard_welcome)).setTypeface(aVar.u());
        ((RelativeLayout) relativeLayout.findViewById(R.id.rl_privacy_settings_wizard_welcome)).setOnClickListener(new View.OnClickListener() { // from class: F4.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.J6(MainActivity.this, view);
            }
        });
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_accept_wizard_welcome);
        textView2.setTypeface(aVar.u());
        textView2.setEnabled(false);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: F4.u1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.K6(MainActivity.this, view);
            }
        });
        if (p2()) {
            textView2.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_wizard_accept_button));
            textView2.setEnabled(true);
        }
        return relativeLayout;
    }

    private final boolean H7() {
        boolean z8;
        FrameLayout frameLayout;
        c5.T e8 = c5.T.f15689k.e(this);
        if (System.currentTimeMillis() - SettingsPreferences.f30529b.C(this) >= TimeUnit.DAYS.toMillis(14L)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (e8 != null || !z8 || (frameLayout = this.f29692F0) == null) {
            return false;
        }
        AbstractC3292y.f(frameLayout);
        frameLayout.removeAllViews();
        C1521k0 c8 = C1521k0.c(getLayoutInflater());
        this.f29693G0 = c8;
        AbstractC3292y.f(c8);
        TextView textView = c8.f12827h;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.v());
        c8.f12825f.setTypeface(aVar.v());
        c8.f12826g.setTypeface(aVar.u());
        c8.f12824e.setTypeface(aVar.u());
        String string = getString(R.string.reminder_login_msg_1);
        AbstractC3292y.h(string, "getString(...)");
        List<C2051p> d8 = C2051p.f15893f.d(string, "\\[xx](.*?)\\[/xx]");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(new l6.j("\\[xx](.*?)\\[/xx]").g(string, new Function1() { // from class: F4.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence I72;
                I72 = MainActivity.I7((l6.h) obj);
                return I72;
            }
        }));
        for (C2051p c2051p : d8) {
            int R8 = l6.n.R(spannableStringBuilder, c2051p.d(), 0, false, 6, null);
            int length = c2051p.d().length() + R8;
            if (R8 >= 0) {
                spannableStringBuilder.setSpan(new C(), R8, length, 33);
            }
        }
        c8.f12825f.setText(spannableStringBuilder);
        c8.f12824e.setOnClickListener(new View.OnClickListener() { // from class: F4.o1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.J7(MainActivity.this, view);
            }
        });
        c8.f12822c.setOnClickListener(new View.OnClickListener() { // from class: F4.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.K7(MainActivity.this, view);
            }
        });
        FrameLayout frameLayout2 = this.f29692F0;
        AbstractC3292y.f(frameLayout2);
        C1521k0 c1521k0 = this.f29693G0;
        AbstractC3292y.f(c1521k0);
        frameLayout2.addView(c1521k0.getRoot());
        SettingsPreferences.a aVar2 = SettingsPreferences.f30529b;
        if (aVar2.M(this) && !UptodownApp.f29249C.S()) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_bottom);
            C1521k0 c1521k02 = this.f29693G0;
            AbstractC3292y.f(c1521k02);
            c1521k02.getRoot().startAnimation(loadAnimation);
        }
        aVar2.Y0(this, System.currentTimeMillis());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I5(MainActivity mainActivity, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            mainActivity.L2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I6(MainActivity mainActivity, View view) {
        mainActivity.W6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence I7(l6.h it) {
        AbstractC3292y.i(it, "it");
        return (CharSequence) it.a().get(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int J5() {
        int i8 = this.f29707T;
        if (i8 <= 0 || i8 >= this.f29708U.size()) {
            return -1;
        }
        int i9 = this.f29707T - 1;
        this.f29707T = i9;
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J6(MainActivity mainActivity, View view) {
        mainActivity.T6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J7(MainActivity mainActivity, View view) {
        mainActivity.startActivity(new Intent(mainActivity, (Class<?>) LoginActivity.class), UptodownApp.f29249C.a(mainActivity));
        Bundle bundle = new Bundle();
        bundle.putString("type", "continue");
        mainActivity.D5(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object K5(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new l(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K6(MainActivity mainActivity, View view) {
        mainActivity.A4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K7(MainActivity mainActivity, View view) {
        Bundle bundle = new Bundle();
        bundle.putString("type", "closed");
        mainActivity.D5(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L6(MainActivity mainActivity, ActivityResult activityResult) {
        int resultCode = activityResult.getResultCode();
        if (resultCode != -1) {
            if (resultCode == 1) {
                c5.T h32 = mainActivity.h3();
                if (h32 != null) {
                    if (mainActivity.f29710W != null) {
                        int size = mainActivity.f29708U.size();
                        int i8 = mainActivity.f29707T;
                        if (size > i8 && ((c5.X) mainActivity.f29708U.get(i8)).a() == 5) {
                            mainActivity.x5();
                        }
                    }
                    UptodownApp.a aVar = UptodownApp.f29249C;
                    aVar.j0(mainActivity);
                    aVar.i0(mainActivity);
                    t2 t2Var = mainActivity.f29687A0;
                    if (t2Var != null) {
                        AbstractC3292y.f(t2Var);
                        t2Var.b1(h32);
                    }
                }
                mainActivity.i8();
                return;
            }
            return;
        }
        mainActivity.i8();
    }

    private final void L7() {
        c5.T e8 = c5.T.f15689k.e(this);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (!SettingsPreferences.f30529b.Z(this) && e8 != null && e8.v() < 1720483200 && currentTimeMillis < 1723161600 && !isFinishing()) {
            AlertDialog o22 = o2();
            if (o22 != null) {
                o22.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            C1527q c8 = C1527q.c(getLayoutInflater());
            AbstractC3292y.h(c8, "inflate(...)");
            String string = getString(R.string.terms_conditions_updated_popup);
            AbstractC3292y.h(string, "getString(...)");
            List<C2051p> d8 = C2051p.f15893f.d(string, "\\[xx](.*?)\\[/xx]");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(new l6.j("\\[xx](.*?)\\[/xx]").g(string, new Function1() { // from class: F4.N0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence M72;
                    M72 = MainActivity.M7((l6.h) obj);
                    return M72;
                }
            }));
            for (C2051p c2051p : d8) {
                int R8 = l6.n.R(spannableStringBuilder, c2051p.d(), 0, false, 6, null);
                int length = c2051p.d().length() + R8;
                if (R8 >= 0) {
                    spannableStringBuilder.setSpan(new D(), R8, length, 33);
                }
            }
            TextView textView = c8.f12902d;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.v());
            c8.f12902d.setText(spannableStringBuilder);
            c8.f12902d.setOnClickListener(new View.OnClickListener() { // from class: F4.O0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.N7(MainActivity.this, view);
                }
            });
            c8.f12901c.setVisibility(8);
            c8.f12903e.setTypeface(aVar.u());
            c8.f12903e.setOnClickListener(new View.OnClickListener() { // from class: F4.P0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.O7(MainActivity.this, view);
                }
            });
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            K2(builder.create());
            S2();
            Bundle bundle = new Bundle();
            bundle.putString("type", "shown");
            new C3795t(this).e("new_terms_popup", bundle);
            SettingsPreferences.f30529b.P0(this, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M6(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence M7(l6.h it) {
        AbstractC3292y.i(it, "it");
        return (CharSequence) it.a().get(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int N5() {
        int i8 = this.f29707T;
        if (i8 >= 0 && i8 < this.f29708U.size() - 1) {
            int i9 = this.f29707T + 1;
            this.f29707T = i9;
            return i9;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N6(MainActivity mainActivity, View view) {
        Integer num;
        if (UptodownApp.f29249C.a0()) {
            TabLayout tabLayout = mainActivity.f29721w0;
            if (tabLayout != null) {
                num = Integer.valueOf(tabLayout.getSelectedTabPosition());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                C1606o1 c1606o1 = mainActivity.f29724z0;
                if (c1606o1 != null) {
                    c1606o1.B();
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 1) {
                C1606o1 c1606o12 = mainActivity.f29724z0;
                if (c1606o12 != null) {
                    c1606o12.B();
                }
                mainActivity.z5(0);
                C1609p1 c1609p1 = mainActivity.f29722x0;
                if (c1609p1 != null) {
                    c1609p1.s();
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 2) {
                C1606o1 c1606o13 = mainActivity.f29724z0;
                if (c1606o13 != null) {
                    c1606o13.B();
                }
                mainActivity.z5(0);
                C1635y1 c1635y1 = mainActivity.f29723y0;
                if (c1635y1 != null) {
                    c1635y1.P();
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 3) {
                C1606o1 c1606o14 = mainActivity.f29724z0;
                if (c1606o14 != null) {
                    c1606o14.B();
                }
                mainActivity.z5(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N7(MainActivity mainActivity, View view) {
        C3788m c3788m = new C3788m();
        String string = mainActivity.getString(R.string.url_tos);
        AbstractC3292y.h(string, "getString(...)");
        c3788m.q(mainActivity, string, mainActivity.getString(R.string.tos_title));
        AlertDialog o22 = mainActivity.o2();
        if (o22 != null) {
            o22.dismiss();
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "opened");
        new C3795t(mainActivity).e("new_terms_popup", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O6(MainActivity mainActivity, View view) {
        mainActivity.startActivity(new Intent(mainActivity, (Class<?>) SearchActivity.class), UptodownApp.f29249C.a(mainActivity));
        mainActivity.W5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O7(MainActivity mainActivity, View view) {
        AlertDialog o22 = mainActivity.o2();
        if (o22 != null) {
            o22.dismiss();
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "closed");
        new C3795t(mainActivity).e("new_terms_popup", bundle);
    }

    private final Bitmap P5(Bitmap bitmap, int i8) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        AbstractC3292y.h(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        float f8 = i8;
        paint.setAntiAlias(true);
        canvas.drawRoundRect(rectF, f8, f8, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P6(MainActivity mainActivity, View view) {
        mainActivity.V2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P7() {
        AppBarLayout appBarLayout = this.f29712Y;
        AbstractC3292y.f(appBarLayout);
        appBarLayout.setVisibility(0);
        AppBarLayout appBarLayout2 = this.f29712Y;
        AbstractC3292y.f(appBarLayout2);
        appBarLayout2.setExpanded(true);
        TabLayout tabLayout = this.f29721w0;
        AbstractC3292y.f(tabLayout);
        int selectedTabPosition = tabLayout.getSelectedTabPosition();
        if (selectedTabPosition != 2 && selectedTabPosition != 3) {
            TabLayout tabLayout2 = this.f29715q0;
            AbstractC3292y.f(tabLayout2);
            tabLayout2.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q5() {
        FrameLayout frameLayout = this.f29695I0;
        if (frameLayout != null) {
            AbstractC3292y.f(frameLayout);
            if (frameLayout.getChildCount() > 0) {
                FrameLayout frameLayout2 = this.f29695I0;
                AbstractC3292y.f(frameLayout2);
                frameLayout2.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q6(final MainActivity mainActivity) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: F4.v1
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.R6(MainActivity.this);
            }
        }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    private final void Q7() {
        Float f8;
        if (!isFinishing()) {
            t0 c8 = t0.c(getLayoutInflater());
            AbstractC3292y.h(c8, "inflate(...)");
            TextView textView = c8.f13002f;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.u());
            float height = c8.f13002f.getHeight();
            int color = ContextCompat.getColor(this, R.color.turbo_text_gradient_start);
            int color2 = ContextCompat.getColor(this, R.color.turbo_text_gradient_end);
            TextPaint paint = c8.f13002f.getPaint();
            if (paint != null) {
                f8 = Float.valueOf(paint.measureText(c8.f13002f.getText().toString()));
            } else {
                f8 = null;
            }
            AbstractC3292y.f(f8);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f8.floatValue(), height, new int[]{color, color2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            TextPaint paint2 = c8.f13002f.getPaint();
            if (paint2 != null) {
                paint2.setShader(linearGradient);
            }
            float dimension = getResources().getDimension(R.dimen.turbo_popup_lines_max_width);
            int i8 = getResources().getDisplayMetrics().widthPixels;
            float dimension2 = getResources().getDimension(R.dimen.margin_l);
            float f9 = (i8 - dimension2) - dimension2;
            if (dimension > f9) {
                int i9 = (int) f9;
                c8.f13000d.setMaxWidth(i9);
                c8.f13001e.setMaxWidth(i9);
            }
            c8.f13000d.setTypeface(aVar.v());
            String obj = c8.f13000d.getText().toString();
            List<C2051p> d8 = C2051p.f15893f.d(obj, "\\[xx](.*?)\\[/xx]");
            SpannableString spannableString = new SpannableString(new l6.j("\\[xx](.*?)\\[/xx]").g(obj, new Function1() { // from class: F4.X0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    CharSequence R72;
                    R72 = MainActivity.R7((l6.h) obj2);
                    return R72;
                }
            }));
            for (C2051p c2051p : d8) {
                int R8 = l6.n.R(spannableString, c2051p.d(), 0, false, 6, null);
                int length = c2051p.d().length() + R8;
                if (R8 >= 0) {
                    spannableString.setSpan(new E(), R8, length, 33);
                }
            }
            c8.f13000d.setText(spannableString);
            c8.f13001e.setTypeface(J4.j.f4395g.u());
            c8.f12998b.setOnClickListener(new View.OnClickListener() { // from class: F4.Y0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.S7(MainActivity.this, view);
                }
            });
            c8.f13001e.setOnClickListener(new View.OnClickListener() { // from class: F4.Z0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.T7(MainActivity.this, view);
                }
            });
            Locale locale = Locale.getDefault();
            AbstractC3292y.h(locale, "getDefault(...)");
            if (TextUtils.getLayoutDirectionFromLocale(locale) == 1) {
                c8.f12999c.setCropType(0);
            }
            c8.f12999c.setOnClickListener(new View.OnClickListener() { // from class: F4.a1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.U7(view);
                }
            });
            FrameLayout frameLayout = this.f29694H0;
            AbstractC3292y.f(frameLayout);
            frameLayout.addView(c8.getRoot());
            SettingsPreferences.a aVar2 = SettingsPreferences.f30529b;
            if (aVar2.M(this) && !UptodownApp.f29249C.S()) {
                c8.getRoot().startAnimation(AnimationUtils.loadAnimation(this, R.anim.popup_turbo_in));
            }
            aVar2.d1(this, System.currentTimeMillis());
            Bundle bundle = new Bundle();
            bundle.putString("type", "shown");
            new C3795t(this).e("turbo_popup", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R6(MainActivity mainActivity) {
        ProgressBar progressBar = (ProgressBar) mainActivity.findViewById(R.id.pb_splash);
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence R7(l6.h it) {
        AbstractC3292y.i(it, "it");
        return (CharSequence) it.a().get(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S5() {
        RelativeLayout relativeLayout = this.f29705S;
        if (relativeLayout != null) {
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
            RelativeLayout relativeLayout2 = this.f29705S;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
            this.f29705S = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S6(MainActivity mainActivity, ActivityResult activityResult) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(mainActivity), C3445b0.b(), null, new s(new t(), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S7(MainActivity mainActivity, View view) {
        Bundle bundle = new Bundle();
        bundle.putString("type", "closed");
        mainActivity.V5(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T5() {
        AppBarLayout appBarLayout = this.f29712Y;
        AbstractC3292y.f(appBarLayout);
        appBarLayout.setVisibility(0);
        AppBarLayout appBarLayout2 = this.f29712Y;
        AbstractC3292y.f(appBarLayout2);
        appBarLayout2.setExpanded(false);
        TabLayout tabLayout = this.f29715q0;
        AbstractC3292y.f(tabLayout);
        tabLayout.setVisibility(8);
    }

    private final void T6() {
        this.f29701O0.launch(new Intent(this, (Class<?>) GdprPrivacySettings.class), UptodownApp.f29249C.b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T7(MainActivity mainActivity, View view) {
        Bundle bundle = new Bundle();
        bundle.putString("type", "subscribe");
        mainActivity.V5(bundle);
        mainActivity.V2();
    }

    private final void U5() {
        AppBarLayout appBarLayout = this.f29712Y;
        AbstractC3292y.f(appBarLayout);
        appBarLayout.setVisibility(8);
        TabLayout tabLayout = this.f29715q0;
        AbstractC3292y.f(tabLayout);
        tabLayout.setVisibility(8);
    }

    private final void U6() {
        startActivity(new Intent(this, (Class<?>) MyApps.class), UptodownApp.f29249C.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U7(View view) {
    }

    private final void V5(Bundle bundle) {
        FrameLayout frameLayout = this.f29694H0;
        if (frameLayout != null) {
            AbstractC3292y.f(frameLayout);
            if (frameLayout.getChildCount() > 0) {
                new C3795t(this).e("turbo_popup", bundle);
                if (SettingsPreferences.f30529b.M(this) && !UptodownApp.f29249C.S()) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.popup_turbo_out);
                    loadAnimation.setAnimationListener(new n());
                    FrameLayout frameLayout2 = this.f29694H0;
                    AbstractC3292y.f(frameLayout2);
                    frameLayout2.startAnimation(loadAnimation);
                    return;
                }
                FrameLayout frameLayout3 = this.f29694H0;
                AbstractC3292y.f(frameLayout3);
                frameLayout3.removeAllViews();
                this.f29694H0 = null;
            }
        }
    }

    private final void V6() {
        startActivity(new Intent(this, (Class<?>) MyDownloads.class), UptodownApp.f29249C.a(this));
    }

    private final void W5() {
        Bundle bundle = new Bundle();
        bundle.putString("type", "ignored");
        D5(bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putString("type", "ignored");
        V5(bundle2);
    }

    private final void W6() {
        String string = getString(R.string.tos_title);
        AbstractC3292y.h(string, "getString(...)");
        String string2 = getString(R.string.url_privacy);
        AbstractC3292y.h(string2, "getString(...)");
        new C3788m().q(this, string2, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W7(MainActivity mainActivity, View view) {
        AlertDialog o22 = mainActivity.o2();
        if (o22 != null) {
            o22.dismiss();
        }
    }

    private final void X5() {
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        String e8 = aVar.e(this);
        if (e8 != null) {
            C2043h c2043h = new C2043h();
            c2043h.m1(Long.parseLong(e8));
            X2(c2043h);
            aVar.v0(this, null);
            return;
        }
        if (!aVar.m0(this)) {
            aVar.Y0(this, System.currentTimeMillis());
            RelativeLayout relativeLayout = this.f29710W;
            AbstractC3292y.f(relativeLayout);
            relativeLayout.setVisibility(0);
            RelativeLayout relativeLayout2 = this.f29710W;
            AbstractC3292y.f(relativeLayout2);
            relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: F4.w1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.Y5(view);
                }
            });
            if (R()) {
                S1();
            } else {
                l0();
            }
            if (aVar.n0(1, this) && aVar.U(this)) {
                l6();
                if (!aVar.n0(4, this)) {
                    y6();
                }
                if (!aVar.n0(5, this)) {
                    t6();
                }
            } else {
                G6();
            }
            this.f29707T = 0;
            RelativeLayout relativeLayout3 = this.f29710W;
            if (relativeLayout3 != null) {
                relativeLayout3.addView(((c5.X) this.f29708U.get(0)).c());
                return;
            }
            return;
        }
        S1();
    }

    private final void X6() {
        this.f29702P0.launch(new Intent(this, (Class<?>) SettingsPreferences.class), UptodownApp.f29249C.b(this));
    }

    private final void X7() {
        String H8 = SettingsPreferences.f30529b.H(this);
        if (H8 == null) {
            H8 = "https://uptodown-android.uptodown.com/android";
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(H8)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y5(View view) {
    }

    private final void Y6() {
        startActivity(new Intent(this, (Class<?>) Updates.class), UptodownApp.f29249C.a(this));
    }

    private final Bitmap Y7() {
        View rootView = getWindow().getDecorView().getRootView();
        Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
        AbstractC3292y.h(createBitmap, "createBitmap(...)");
        rootView.draw(new Canvas(createBitmap));
        float applyDimension = TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics());
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, rootView.getWidth() / 2, rootView.getHeight() / 2, true);
        AbstractC3292y.h(createScaledBitmap, "createScaledBitmap(...)");
        return P5(createScaledBitmap, (int) applyDimension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z5(MainActivity mainActivity, ActivityResult activityResult) {
        String str;
        Bundle extras;
        if (activityResult.getResultCode() == 10) {
            Intent data = activityResult.getData();
            if (data != null && (extras = data.getExtras()) != null) {
                str = extras.getString("realPath");
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                AbstractActivityC2691a.x2(mainActivity, new File(str), null, 2, null);
            }
        }
    }

    private final boolean a6() {
        TextView textView = (TextView) findViewById(R.id.tv_title_auto_update);
        if (textView != null && textView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a7() {
        if (!g6()) {
            C5();
            V7();
            L7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b6() {
        if (!a6() && !e6()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b7() {
        if (!g6()) {
            return;
        }
        Iterator it = this.f29708U.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            ((c5.X) next).c().removeAllViews();
        }
        RelativeLayout relativeLayout = this.f29710W;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.f29710W;
        if (relativeLayout2 != null) {
            relativeLayout2.removeAllViews();
        }
        this.f29710W = null;
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        boolean n02 = aVar.n0(4, this);
        boolean n03 = aVar.n0(5, this);
        if (n02 && n03) {
            aVar.i1(this, true);
        }
        h6();
        a7();
    }

    private final boolean d6() {
        if (ContextCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            return true;
        }
        return false;
    }

    private final boolean e6() {
        TextView textView = (TextView) findViewById(R.id.tv_msg_status_526);
        if (textView != null && textView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    private final void e7() {
        if (this.f29705S != null) {
            if (SettingsPreferences.f30529b.M(this)) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_out_splash);
                loadAnimation.setAnimationListener(new w());
                RelativeLayout relativeLayout = this.f29705S;
                if (relativeLayout != null) {
                    relativeLayout.startAnimation(loadAnimation);
                    return;
                }
                return;
            }
            S5();
            a7();
        }
    }

    private final boolean f6() {
        File n8 = new C3788m().n(this);
        if (SettingsPreferences.f30529b.i0(this)) {
            k7();
            return true;
        }
        if (n8 != null) {
            t7();
            return true;
        }
        return false;
    }

    private final void f7() {
        int i8;
        if (!isFinishing() && this.f29710W != null && !SettingsPreferences.f30529b.m0(this)) {
            RelativeLayout relativeLayout = this.f29710W;
            AbstractC3292y.f(relativeLayout);
            relativeLayout.setVisibility(0);
            RelativeLayout relativeLayout2 = this.f29710W;
            AbstractC3292y.f(relativeLayout2);
            relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: F4.Q0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.g7(view);
                }
            });
            Iterator it = this.f29708U.iterator();
            AbstractC3292y.h(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                c5.X x8 = (c5.X) next;
                int a9 = x8.a();
                if (a9 != 1) {
                    if (a9 != 2) {
                        if (a9 != 3) {
                            if (a9 != 4) {
                                if (a9 == 5) {
                                    x8.e(u6());
                                }
                            } else {
                                x8.e(z6());
                            }
                        } else {
                            x8.e(m6());
                        }
                    } else {
                        C2043h c2043h = this.f29716r0;
                        if (c2043h != null) {
                            AbstractC3292y.f(c2043h);
                            x8.e(p6(c2043h));
                        }
                    }
                } else {
                    x8.e(H6());
                }
            }
            if (this.f29708U.size() > 0 && (i8 = this.f29707T) >= 0 && i8 < this.f29708U.size()) {
                RelativeLayout relativeLayout3 = this.f29710W;
                AbstractC3292y.f(relativeLayout3);
                relativeLayout3.removeAllViews();
                RelativeLayout relativeLayout4 = this.f29710W;
                AbstractC3292y.f(relativeLayout4);
                relativeLayout4.addView(((c5.X) this.f29708U.get(this.f29707T)).c());
                return;
            }
            b7();
            return;
        }
        b7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f8(U5.d dVar) {
        kotlin.jvm.internal.Q q8 = new kotlin.jvm.internal.Q();
        Object g8 = AbstractC3458i.g(C3445b0.b(), new H(new kotlin.jvm.internal.Q(), q8, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return Q5.I.f8786a;
    }

    private final boolean g6() {
        RelativeLayout relativeLayout = this.f29710W;
        if (relativeLayout != null) {
            AbstractC3292y.f(relativeLayout);
            if (relativeLayout.getVisibility() == 0) {
                RelativeLayout relativeLayout2 = this.f29710W;
                AbstractC3292y.f(relativeLayout2);
                if (relativeLayout2.getChildCount() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g7(View view) {
    }

    private final void h6() {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new o(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h7() {
        ProgressBar progressBar = this.f29720v0;
        if (progressBar != null) {
            AbstractC3292y.f(progressBar);
            if (progressBar.getVisibility() != 0) {
                ProgressBar progressBar2 = this.f29720v0;
                AbstractC3292y.f(progressBar2);
                progressBar2.setVisibility(0);
                AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.b(), null, new x(null), 2, null);
                C1606o1 c1606o1 = this.f29724z0;
                if (c1606o1 != null) {
                    c1606o1.y();
                }
                C1609p1 c1609p1 = this.f29722x0;
                if (c1609p1 != null) {
                    c1609p1.q();
                }
                C1635y1 c1635y1 = this.f29723y0;
                if (c1635y1 != null) {
                    c1635y1.I();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i6() {
        c5.T e8 = c5.T.f15689k.e(this);
        if ((e8 == null || !e8.y()) && this.f29695I0 != null) {
            final C2045j d8 = C2045j.f15879n.d(this);
            if (d8 != null && d8.a(this)) {
                View inflate = getLayoutInflater().inflate(R.layout.ad_banner_floating, (ViewGroup) this.f29695I0, false);
                View findViewById = inflate.findViewById(R.id.tv_download_banner);
                AbstractC3292y.h(findViewById, "findViewById(...)");
                ((TextView) findViewById).setTypeface(J4.j.f4395g.u());
                View findViewById2 = inflate.findViewById(R.id.rl_close_banner);
                AbstractC3292y.h(findViewById2, "findViewById(...)");
                ((RelativeLayout) findViewById2).setOnClickListener(new View.OnClickListener() { // from class: F4.H0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MainActivity.j6(C2045j.this, this, view);
                    }
                });
                View findViewById3 = inflate.findViewById(R.id.iv_banner);
                AbstractC3292y.h(findViewById3, "findViewById(...)");
                ImageView imageView = (ImageView) findViewById3;
                com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
                Resources resources = getResources();
                AbstractC3292y.h(resources, "getResources(...)");
                h8.l(d8.A(resources)).n(UptodownApp.f29249C.e0(this)).j(imageView, new p(d8, this, inflate, imageView));
                imageView.setOnClickListener(new View.OnClickListener() { // from class: F4.I0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MainActivity.k6(C2045j.this, this, view);
                    }
                });
                return;
            }
            FrameLayout frameLayout = this.f29695I0;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
        }
    }

    private final void i7() {
        z zVar = new z(getSupportFragmentManager(), getLifecycle());
        ViewPager2 viewPager2 = this.f29717s0;
        if (viewPager2 != null) {
            viewPager2.setAdapter(zVar);
        }
        TabLayout tabLayout = this.f29721w0;
        if (tabLayout != null && this.f29717s0 != null) {
            AbstractC3292y.f(tabLayout);
            ViewPager2 viewPager22 = this.f29717s0;
            AbstractC3292y.f(viewPager22);
            new TabLayoutMediator(tabLayout, viewPager22, new TabLayoutMediator.TabConfigurationStrategy() { // from class: F4.q1
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i8) {
                    MainActivity.j7(MainActivity.this, tab, i8);
                }
            }).attach();
            TabLayout tabLayout2 = this.f29721w0;
            AbstractC3292y.f(tabLayout2);
            tabLayout2.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new y());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j6(C2045j c2045j, MainActivity mainActivity, View view) {
        c2045j.f(mainActivity);
        FrameLayout frameLayout = mainActivity.f29695I0;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j7(MainActivity mainActivity, TabLayout.Tab tab, int i8) {
        AbstractC3292y.i(tab, "tab");
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        tab.setContentDescription(mainActivity.getString(R.string.profile_title));
                        mainActivity.n7(R.drawable.vector_user_profile, tab);
                        return;
                    }
                    return;
                }
                tab.setContentDescription(mainActivity.getString(R.string.top_downloads_title));
                mainActivity.n7(R.drawable.selector_icon_tab_top, tab);
                return;
            }
            tab.setContentDescription(mainActivity.getString(R.string.top_games_title));
            mainActivity.n7(R.drawable.selector_icon_tab_games, tab);
            return;
        }
        tab.setContentDescription(mainActivity.getString(R.string.cd_home_tab));
        mainActivity.n7(R.drawable.selector_icon_tab_home, tab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k6(C2045j c2045j, MainActivity mainActivity, View view) {
        if (UptodownApp.f29249C.a0()) {
            c2045j.e(mainActivity);
            FrameLayout frameLayout = mainActivity.f29695I0;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            mainActivity.C2(c2045j.k());
        }
    }

    private final void k7() {
        setContentView(R.layout.status_526);
        TextView textView = (TextView) findViewById(R.id.tv_msg_status_526);
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.v());
        textView.setText(C3770C.f37260a.c(getString(R.string.msg_update_app_status_526)));
        TextView textView2 = (TextView) findViewById(R.id.tv_update_status_526);
        textView2.setTypeface(aVar.v());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: F4.G0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.l7(MainActivity.this, view);
            }
        });
    }

    private final void l6() {
        v5(m6(), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l7(MainActivity mainActivity, View view) {
        File n8 = new C3788m().n(mainActivity);
        if (n8 != null) {
            UptodownApp.a.Z(UptodownApp.f29249C, n8, mainActivity, null, 4, null);
        } else {
            mainActivity.X7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l8() {
        if (this.f29710W != null && this.f29707T >= 0) {
            int size = this.f29708U.size();
            int i8 = this.f29707T;
            if (size > i8 && ((c5.X) this.f29708U.get(i8)).a() == 4 && T() && S() && SettingsPreferences.f30529b.O(this)) {
                ((TextView) findViewById(R.id.tv_next_wp)).setBackground(ContextCompat.getDrawable(this, R.drawable.selector_wizard_accept_button));
                ((TextView) findViewById(R.id.tv_next_wp)).setTextColor(ContextCompat.getColor(this, R.color.text_color_wizard_button));
            }
        }
    }

    private final RelativeLayout m6() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_continue, (ViewGroup) this.f29710W, false);
        AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_welcome_to_wizard_continue);
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.v());
        ((TextView) relativeLayout.findViewById(R.id.tv_app_name_wizard_continue)).setTypeface(aVar.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_continue_to_wizard_continue)).setTypeface(aVar.v());
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_next_wizard_continue);
        textView2.setTypeface(aVar.u());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: F4.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.n6(MainActivity.this, view);
            }
        });
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m7(Drawable drawable, boolean z8) {
        View inflate = getLayoutInflater().inflate(R.layout.tab_icon_user, (ViewGroup) null);
        if (drawable != null) {
            View findViewById = inflate.findViewById(R.id.iv_avatar_user);
            AbstractC3292y.h(findViewById, "findViewById(...)");
            ((ImageView) findViewById).setImageDrawable(drawable);
        }
        View findViewById2 = inflate.findViewById(R.id.iv_badge_user);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById2;
        if (z8) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        TabLayout tabLayout = this.f29721w0;
        AbstractC3292y.f(tabLayout);
        TabLayout.Tab tabAt = tabLayout.getTabAt(3);
        AbstractC3292y.f(tabAt);
        tabAt.setCustomView(inflate);
    }

    private final void m8() {
        TextView textView = (TextView) findViewById(R.id.tv_accept_wizard_welcome);
        if (textView != null) {
            textView.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_wizard_accept_button));
        }
        if (textView != null) {
            textView.setEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n6(MainActivity mainActivity, View view) {
        mainActivity.x5();
    }

    private final void n7(int i8, TabLayout.Tab tab) {
        View inflate = getLayoutInflater().inflate(R.layout.tab_icon_user, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.iv_avatar_user);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        ((ImageView) findViewById).setImageDrawable(ContextCompat.getDrawable(this, i8));
        ((ImageView) inflate.findViewById(R.id.iv_badge_user)).setVisibility(8);
        tab.setCustomView(inflate);
    }

    private final void o6(C2043h c2043h) {
        this.f29716r0 = c2043h;
        v5(p6(c2043h), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o7(MainActivity mainActivity, ActivityResult activityResult) {
        int resultCode = activityResult.getResultCode();
        if (resultCode != 1003) {
            if (resultCode != 1004) {
                mainActivity.t2();
                return;
            }
            UptodownApp.f29249C.e(mainActivity);
            mainActivity.finish();
            mainActivity.startActivity(mainActivity.getIntent());
            return;
        }
        C3791p a9 = C3791p.f37286s.a(mainActivity);
        a9.a();
        a9.q();
        a9.i();
        mainActivity.finish();
        mainActivity.startActivity(mainActivity.getIntent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o8(View view) {
    }

    private final RelativeLayout p6(C2043h c2043h) {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_deep_link, (ViewGroup) this.f29710W, false);
        AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.iv_header_feature_wizard_deep_link);
        ImageView imageView2 = (ImageView) relativeLayout.findViewById(R.id.iv_logo_wizard_deep_link);
        com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(c2043h.j0());
        UptodownApp.a aVar = UptodownApp.f29249C;
        l8.n(aVar.f0(this)).i(imageView2);
        com.squareup.picasso.s.h().l(c2043h.c0()).n(aVar.e0(this)).i(imageView);
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_name_app_wizard_deep_link);
        j.a aVar2 = J4.j.f4395g;
        textView.setTypeface(aVar2.u());
        textView.setText(c2043h.q0());
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_author_wizard_deep_link);
        textView2.setTypeface(aVar2.v());
        textView2.setText(c2043h.l());
        ((TextView) relativeLayout.findViewById(R.id.tv_app_name_wizard_deep_link)).setTypeface(aVar2.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_welcome_to_wizard_deep_link)).setTypeface(aVar2.v());
        ((TextView) relativeLayout.findViewById(R.id.tv_slogan_to_wizard_deep_link)).setTypeface(aVar2.v());
        ((TextView) relativeLayout.findViewById(R.id.tv_terms_wizard_deep_link)).setTypeface(aVar2.v());
        ((RelativeLayout) relativeLayout.findViewById(R.id.rl_terms_wizard_deep_link)).setOnClickListener(new View.OnClickListener() { // from class: F4.D0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.q6(MainActivity.this, view);
            }
        });
        ((TextView) relativeLayout.findViewById(R.id.tv_privacy_settings_wizard_deep_link)).setTypeface(aVar2.v());
        ((RelativeLayout) relativeLayout.findViewById(R.id.rl_privacy_settings_wizard_deep_link)).setOnClickListener(new View.OnClickListener() { // from class: F4.E0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.r6(MainActivity.this, view);
            }
        });
        TextView textView3 = (TextView) relativeLayout.findViewById(R.id.tv_accept_wizard_deep_link);
        textView3.setTypeface(aVar2.u());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: F4.F0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.s6(MainActivity.this, view);
            }
        });
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q6(MainActivity mainActivity, View view) {
        mainActivity.W6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q7(MainActivity mainActivity, C2043h c2043h, View view) {
        RelativeLayout relativeLayout = mainActivity.f29698L0;
        AbstractC3292y.f(relativeLayout);
        relativeLayout.setVisibility(8);
        mainActivity.f29697K0.E(0L);
        mainActivity.X2(c2043h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r6(MainActivity mainActivity, View view) {
        mainActivity.T6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r7(MainActivity mainActivity, C2043h c2043h, View view) {
        RelativeLayout relativeLayout = mainActivity.f29698L0;
        AbstractC3292y.f(relativeLayout);
        relativeLayout.setVisibility(8);
        mainActivity.f29697K0.E(0L);
        mainActivity.X2(c2043h);
    }

    private final void r8(C1606o1 c1606o1) {
        TabLayout tabLayout = this.f29715q0;
        AbstractC3292y.f(tabLayout);
        TabLayout tabLayout2 = this.f29715q0;
        AbstractC3292y.f(tabLayout2);
        tabLayout.selectTab(tabLayout2.getTabAt(0));
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3292y.h(beginTransaction, "beginTransaction(...)");
        beginTransaction.replace(R.id.fl_home_fragment, c1606o1);
        if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
            try {
                beginTransaction.commitAllowingStateLoss();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        this.f29696J0 = 0;
        z5(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s6(MainActivity mainActivity, View view) {
        mainActivity.A4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s7(MainActivity mainActivity, C2043h c2043h, Function0 function0, View view) {
        mainActivity.f29697K0.g(c2043h, mainActivity);
        C4086f c4086f = mainActivity.f29697K0;
        RelativeLayout relativeLayout = mainActivity.f29698L0;
        AbstractC3292y.f(relativeLayout);
        c4086f.f(mainActivity, relativeLayout);
        function0.invoke();
    }

    private final void t6() {
        v5(u6(), 5);
    }

    private final void t7() {
        C3791p a9 = C3791p.f37286s.a(this);
        a9.a();
        String packageName = getPackageName();
        AbstractC3292y.h(packageName, "getPackageName(...)");
        Q s02 = a9.s0(packageName);
        a9.i();
        if (s02 != null && s02.u() == 100) {
            setContentView(R.layout.dialog_auto_update);
            TextView textView = (TextView) findViewById(R.id.tv_title_auto_update);
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.u());
            ((TextView) findViewById(R.id.tv_desc_auto_update)).setTypeface(aVar.v());
            ((TextView) findViewById(R.id.tv_info_auto_update)).setTypeface(aVar.v());
            TextView textView2 = (TextView) findViewById(R.id.tv_installed_version_auto_update);
            textView2.setTypeface(aVar.v());
            PackageManager packageManager = getPackageManager();
            AbstractC3292y.h(packageManager, "getPackageManager(...)");
            String packageName2 = getPackageName();
            AbstractC3292y.h(packageName2, "getPackageName(...)");
            textView2.setText(getString(R.string.autoupdate_installed_version, S4.r.d(packageManager, packageName2, 0).versionName));
            TextView textView3 = (TextView) findViewById(R.id.tv_update_version_auto_update);
            textView3.setTypeface(aVar.u());
            textView3.setText(getString(R.string.autoupdate_update_version, s02.x()));
            TextView textView4 = (TextView) findViewById(R.id.tv_update_size_auto_update);
            textView4.setTypeface(aVar.v());
            textView4.setText(getString(R.string.autoupdate_update_size, new S4.g().c(s02.v())));
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_uptodown_version_details);
            ((TextView) findViewById(R.id.tv_uptodown_version_details_label)).setTypeface(aVar.v());
            final ImageView imageView = (ImageView) findViewById(R.id.iv_uptodown_version_details_label);
            final TextView textView5 = (TextView) findViewById(R.id.tv_uptodown_version_details);
            textView5.setTypeface(aVar.v());
            new X4.j(this, s02.s(), new A(textView5, this, s02), LifecycleOwnerKt.getLifecycleScope(this));
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: F4.H1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.u7(textView5, imageView, view);
                }
            });
            ((TextView) findViewById(R.id.tv_update)).setTypeface(aVar.u());
            ((RelativeLayout) findViewById(R.id.rl_update)).setOnClickListener(new View.OnClickListener() { // from class: F4.B0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.v7(MainActivity.this, view);
                }
            });
            ((TextView) findViewById(R.id.tv_cancel)).setTypeface(aVar.u());
            ((RelativeLayout) findViewById(R.id.rl_cancel)).setOnClickListener(new View.OnClickListener() { // from class: F4.C0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.w7(MainActivity.this, view);
                }
            });
        }
    }

    private final boolean t8(Intent intent) {
        if ((intent.getFlags() & 1048576) == 1048576) {
            return true;
        }
        return false;
    }

    private final RelativeLayout u6() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_login, (ViewGroup) this.f29710W, false);
        AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_header_wl);
        if (relativeLayout2 != null) {
            ((TextView) relativeLayout2.findViewById(R.id.tv_title_header_wizard)).setTypeface(J4.j.f4395g.u());
        }
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_title_wl);
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_login_google_wl);
        if (UptodownApp.f29249C.S()) {
            textView2.setVisibility(8);
        } else {
            textView2.setTypeface(aVar.u());
            textView2.setOnClickListener(new View.OnClickListener() { // from class: F4.J0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.v6(MainActivity.this, view);
                }
            });
        }
        TextView textView3 = (TextView) relativeLayout.findViewById(R.id.tv_login_email_wl);
        textView3.setTypeface(aVar.u());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: F4.K0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.w6(MainActivity.this, view);
            }
        });
        ((TextView) relativeLayout.findViewById(R.id.tv_login_anonymous_wl)).setTypeface(aVar.v());
        ((TextView) relativeLayout.findViewById(R.id.tv_login_anonymous_wl)).setOnClickListener(new View.OnClickListener() { // from class: F4.M0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.x6(MainActivity.this, view);
            }
        });
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u7(TextView textView, ImageView imageView, View view) {
        if (textView.getVisibility() == 0) {
            textView.setVisibility(8);
            imageView.setScaleY(1.0f);
        } else {
            textView.setVisibility(0);
            imageView.setScaleY(-1.0f);
        }
    }

    private final void v5(RelativeLayout relativeLayout, int i8) {
        c5.X x8 = new c5.X();
        x8.d(i8);
        x8.e(relativeLayout);
        this.f29708U.add(x8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v6(MainActivity mainActivity, View view) {
        mainActivity.l3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v7(MainActivity mainActivity, View view) {
        try {
            File n8 = new C3788m().n(mainActivity);
            if (n8 != null && n8.exists()) {
                mainActivity.X1(n8);
            } else {
                mainActivity.d7();
            }
        } catch (Exception unused) {
            mainActivity.X7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w5() {
        int i8;
        if (!this.f29709V && this.f29708U.size() > 0 && (i8 = this.f29707T) >= 0) {
            RelativeLayout c8 = ((c5.X) this.f29708U.get(i8)).c();
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_back_out);
            loadAnimation.setAnimationListener(new AnimationAnimationListenerC2689h());
            c8.startAnimation(loadAnimation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w6(MainActivity mainActivity, View view) {
        mainActivity.f29703Q0.launch(new Intent(mainActivity, (Class<?>) LoginActivity.class), UptodownApp.f29249C.b(mainActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w7(MainActivity mainActivity, View view) {
        mainActivity.finish();
    }

    private final void x5() {
        SettingsPreferences.f30529b.j1(this, ((c5.X) this.f29708U.get(this.f29707T)).a());
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_next_out);
        loadAnimation.setAnimationListener(new AnimationAnimationListenerC2690i());
        ((c5.X) this.f29708U.get(this.f29707T)).c().startAnimation(loadAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x6(MainActivity mainActivity, View view) {
        mainActivity.x5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x7() {
        FrameLayout frameLayout = this.f29695I0;
        if (frameLayout != null) {
            AbstractC3292y.f(frameLayout);
            if (frameLayout.getChildCount() > 0) {
                FrameLayout frameLayout2 = this.f29695I0;
                AbstractC3292y.f(frameLayout2);
                frameLayout2.setVisibility(0);
            }
        }
    }

    private final void y5(C2043h c2043h, boolean z8) {
        C1541b1 a9 = C1541b1.f13378n.a(c2043h, c2043h.h());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3292y.h(beginTransaction, "beginTransaction(...)");
        if (((CoordinatorLayout) findViewById(R.id.rl_main_scrollable)) != null) {
            try {
                beginTransaction.replace(R.id.rl_main_scrollable, a9);
                beginTransaction.addToBackStack(null);
                if (z8) {
                    beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                }
                if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
                    beginTransaction.commitAllowingStateLoss();
                    return;
                }
                return;
            } catch (Exception e8) {
                e8.printStackTrace();
                String string = getString(R.string.error_generico);
                AbstractC3292y.h(string, "getString(...)");
                Z1(string);
                return;
            }
        }
        String string2 = getString(R.string.error_generico);
        AbstractC3292y.h(string2, "getString(...)");
        Z1(string2);
    }

    private final void y6() {
        v5(z6(), 4);
    }

    private final RelativeLayout z6() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_permissions, (ViewGroup) this.f29710W, false);
        AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_header_wp);
        if (relativeLayout2 != null) {
            ((TextView) relativeLayout2.findViewById(R.id.tv_title_header_wizard)).setTypeface(J4.j.f4395g.u());
        }
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_title_wp);
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        RelativeLayout relativeLayout3 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_notifications_wp);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            ((TextView) relativeLayout.findViewById(R.id.tv_notifications_title_wp)).setTypeface(aVar.u());
            ((TextView) relativeLayout.findViewById(R.id.tv_notifications_msg_wp)).setTypeface(aVar.v());
            SwitchCompat switchCompat = (SwitchCompat) relativeLayout.findViewById(R.id.sc_notifications_wp);
            this.f29714p0 = switchCompat;
            AbstractC3292y.f(switchCompat);
            switchCompat.setChecked(d6());
            SwitchCompat switchCompat2 = this.f29714p0;
            AbstractC3292y.f(switchCompat2);
            switchCompat2.setClickable(false);
            relativeLayout3.setOnClickListener(new View.OnClickListener() { // from class: F4.i1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.A6(MainActivity.this, view);
                }
            });
        } else if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(8);
        }
        RelativeLayout relativeLayout4 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_unknown_sources_wp);
        ((ScrollableTextView) relativeLayout.findViewById(R.id.tv_unknown_sources_title_wp)).setTypeface(aVar.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_unknown_sources_badge_wp)).setTypeface(aVar.u());
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_unknown_sources_msg_wp);
        textView2.setText(getString(R.string.msg_install_from_unknown_source, getString(R.string.app_name)));
        textView2.setTypeface(aVar.v());
        SwitchCompat switchCompat3 = (SwitchCompat) relativeLayout.findViewById(R.id.sc_unknown_sources_wp);
        this.f29713Z = switchCompat3;
        AbstractC3292y.f(switchCompat3);
        switchCompat3.setChecked(T());
        SwitchCompat switchCompat4 = this.f29713Z;
        AbstractC3292y.f(switchCompat4);
        switchCompat4.setClickable(false);
        relativeLayout4.setOnClickListener(new View.OnClickListener() { // from class: F4.j1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.B6(MainActivity.this, view);
            }
        });
        boolean z8 = new C3784i().z(this);
        RelativeLayout relativeLayout5 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_autoupdate_wp);
        if (i8 > 31 && !UptodownApp.f29249C.S() && !z8) {
            SettingsPreferences.a aVar2 = SettingsPreferences.f30529b;
            if (!aVar2.O(this)) {
                aVar2.w0(this, true);
            }
            ((TextView) relativeLayout.findViewById(R.id.tv_autoupdate_title_wp)).setTypeface(aVar.u());
            ((TextView) relativeLayout.findViewById(R.id.tv_autoupdate_msg_wp)).setTypeface(aVar.v());
            final SwitchCompat switchCompat5 = (SwitchCompat) relativeLayout.findViewById(R.id.sc_autoupdate_wp);
            switchCompat5.setChecked(aVar2.N(this));
            switchCompat5.setClickable(false);
            relativeLayout5.setOnClickListener(new View.OnClickListener() { // from class: F4.k1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.C6(SwitchCompat.this, this, view);
                }
            });
        } else {
            SettingsPreferences.a aVar3 = SettingsPreferences.f30529b;
            if (!aVar3.O(this)) {
                aVar3.w0(this, false);
            }
            relativeLayout5.setVisibility(8);
            relativeLayout.findViewById(R.id.v_notifications_wp).setVisibility(4);
        }
        if (relativeLayout3.getVisibility() == 8 && relativeLayout5.getVisibility() == 8) {
            relativeLayout.findViewById(R.id.v_unknown_sources_separator).setVisibility(4);
        }
        TextView textView3 = (TextView) relativeLayout.findViewById(R.id.tv_next_wp);
        textView3.setTypeface(aVar.u());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: F4.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.D6(MainActivity.this, view);
            }
        });
        TextView textView4 = (TextView) relativeLayout.findViewById(R.id.tv_back_wp);
        textView4.setTypeface(aVar.u());
        textView4.setOnClickListener(new View.OnClickListener() { // from class: F4.m1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.E6(MainActivity.this, view);
            }
        });
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z7(MainActivity mainActivity, View view) {
        mainActivity.X6();
    }

    @Override // com.uptodown.activities.AbstractActivityC2691a
    public void A2(C2043h appInfo) {
        AbstractC3292y.i(appInfo, "appInfo");
        super.A2(appInfo);
        if (this.f29710W != null && this.f29707T == 0 && this.f29708U.size() == 1 && ((c5.X) this.f29708U.get(this.f29707T)).a() == 1) {
            o6(appInfo);
            x5();
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2691a
    public void B2() {
        if (this.f29710W != null && this.f29707T == 0 && this.f29708U.size() == 1 && ((c5.X) this.f29708U.get(this.f29707T)).a() == 1) {
            m8();
            F6();
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2691a
    public void C2(long j8) {
        W5();
        if (j8 > 0) {
            if (this.f29690D0 == -1) {
                this.f29690D0 = j8;
                new X4.i(this, j8, new u(), LifecycleOwnerKt.getLifecycleScope(this));
                return;
            }
            return;
        }
        E2();
    }

    public final void H5() {
        e7();
        if (!g6()) {
            h6();
        }
    }

    public final ActivityResultLauncher L5() {
        return this.f29701O0;
    }

    public final Fragment M5() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            List<Fragment> fragments = getSupportFragmentManager().getFragments();
            AbstractC3292y.h(fragments, "getFragments(...)");
            return (Fragment) AbstractC1435t.y0(fragments);
        }
        if (!this.f29688B0.isEmpty()) {
            return (Fragment) AbstractC1435t.y0(this.f29688B0);
        }
        return null;
    }

    public final RelativeLayout O5() {
        return this.f29719u0;
    }

    public final void R5() {
        RelativeLayout relativeLayout = this.f29718t0;
        if (relativeLayout != null) {
            AbstractC3292y.f(relativeLayout);
            if (relativeLayout.getVisibility() == 0) {
                RelativeLayout relativeLayout2 = this.f29718t0;
                AbstractC3292y.f(relativeLayout2);
                relativeLayout2.setVisibility(8);
            }
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2691a
    public void U2(long j8) {
        SettingsPreferences.f30529b.v0(this, String.valueOf(j8));
        Bitmap Y72 = Y7();
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_wizard);
        this.f29710W = relativeLayout;
        AbstractC3292y.f(relativeLayout);
        relativeLayout.setVisibility(0);
        RelativeLayout relativeLayout2 = this.f29710W;
        AbstractC3292y.f(relativeLayout2);
        relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: F4.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.F7(view);
            }
        });
        RelativeLayout relativeLayout3 = this.f29710W;
        AbstractC3292y.f(relativeLayout3);
        relativeLayout3.removeAllViews();
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_kill, (ViewGroup) this.f29710W, false);
        AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout4 = (RelativeLayout) inflate;
        TextView textView = (TextView) relativeLayout4.findViewById(R.id.tv_title_wizard_kill);
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        TextView textView2 = (TextView) relativeLayout4.findViewById(R.id.tv_slogan_to_wizard_kill);
        textView2.setTypeface(aVar.v());
        textView2.setText(getString(R.string.core_kill_this_app, getString(R.string.app_name)));
        ((TextView) relativeLayout4.findViewById(R.id.tv_slide_wizard_kill)).setTypeface(aVar.u());
        TextView textView3 = (TextView) relativeLayout4.findViewById(R.id.tv_accept_wizard_kill);
        textView3.setTypeface(aVar.v());
        textView3.setEnabled(true);
        textView3.setOnClickListener(new View.OnClickListener() { // from class: F4.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.G7(MainActivity.this, view);
            }
        });
        RelativeLayout relativeLayout5 = this.f29710W;
        AbstractC3292y.f(relativeLayout5);
        relativeLayout5.addView(relativeLayout4);
        ImageView imageView = (ImageView) relativeLayout4.findViewById(R.id.iv_tap_screen_kill);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_up_tap);
        loadAnimation.setStartOffset(500L);
        loadAnimation.setFillAfter(true);
        ImageView imageView2 = (ImageView) relativeLayout4.findViewById(R.id.iv_screenshot_kill);
        imageView2.setImageBitmap(Y72);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.slide_up_out);
        loadAnimation2.setFillAfter(true);
        loadAnimation2.setStartOffset(500L);
        loadAnimation2.setAnimationListener(new B(imageView, loadAnimation, imageView2));
        imageView.startAnimation(loadAnimation);
        imageView2.startAnimation(loadAnimation2);
    }

    public final void V7() {
        c5.T e8 = c5.T.f15689k.e(this);
        if (!isFinishing() && e8 != null && e8.y()) {
            SettingsPreferences.a aVar = SettingsPreferences.f30529b;
            if (!aVar.l0(this)) {
                AlertDialog o22 = o2();
                if (o22 != null) {
                    o22.dismiss();
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                u0 c8 = u0.c(getLayoutInflater());
                AbstractC3292y.h(c8, "inflate(...)");
                TextView textView = c8.f13023o;
                j.a aVar2 = J4.j.f4395g;
                textView.setTypeface(aVar2.u());
                String string = getString(R.string.uptodown_turbo);
                AbstractC3292y.h(string, "getString(...)");
                int color = ContextCompat.getColor(this, R.color.turbo_text_gradient_start);
                int color2 = ContextCompat.getColor(this, R.color.turbo_text_gradient_end);
                TextView tvTitleTurboWelcomePopup = c8.f13023o;
                AbstractC3292y.h(tvTitleTurboWelcomePopup, "tvTitleTurboWelcomePopup");
                String obj = tvTitleTurboWelcomePopup.getText().toString();
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, tvTitleTurboWelcomePopup.getPaint().measureText(string), tvTitleTurboWelcomePopup.getHeight(), new int[]{color, color2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                SpannableString spannableString = new SpannableString(obj);
                int R8 = l6.n.R(obj, string, 0, false, 6, null);
                if (R8 >= 0) {
                    spannableString.setSpan(new C3788m.a.C0829a(linearGradient, getResources().getDimension(R.dimen.font_size_26)), R8, string.length() + R8, 33);
                }
                tvTitleTurboWelcomePopup.setText(spannableString);
                Spanned c9 = C3770C.f37260a.c(getString(R.string.turbo_welcome_popup_description, getString(R.string.turbo_welcome_popup_manage_subscription)));
                String string2 = getString(R.string.turbo_welcome_popup_manage_subscription);
                AbstractC3292y.h(string2, "getString(...)");
                SpannableString spannableString2 = new SpannableString(c9);
                int R9 = l6.n.R(c9, string2, 0, false, 6, null);
                if (R9 >= 0) {
                    spannableString2.setSpan(new StyleSpan(1), R9, string2.length() + R9, 33);
                }
                c8.f13017i.setText(spannableString2);
                c8.f13017i.setTypeface(aVar2.v());
                c8.f13021m.setTypeface(aVar2.u());
                c8.f13020l.setTypeface(aVar2.v());
                c8.f13016h.setTypeface(aVar2.u());
                c8.f13015g.setTypeface(aVar2.v());
                c8.f13019k.setTypeface(aVar2.u());
                c8.f13018j.setTypeface(aVar2.v());
                c8.f13022n.setTypeface(aVar2.u());
                c8.f13022n.setOnClickListener(new View.OnClickListener() { // from class: F4.R0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MainActivity.W7(MainActivity.this, view);
                    }
                });
                builder.setView(c8.getRoot());
                builder.setCancelable(true);
                K2(builder.create());
                if (!isFinishing() && o2() != null) {
                    AlertDialog o23 = o2();
                    AbstractC3292y.f(o23);
                    Window window = o23.getWindow();
                    if (window != null) {
                        window.setBackgroundDrawable(new ColorDrawable(0));
                    }
                    AlertDialog o24 = o2();
                    AbstractC3292y.f(o24);
                    o24.show();
                    aVar.h1(this, true);
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "shown");
                    new C3795t(this).e("turbo_welcome_popup", bundle);
                }
            }
        }
    }

    @Override // K4.r
    public void W() {
        super.W();
        SwitchCompat switchCompat = this.f29714p0;
        if (switchCompat != null) {
            switchCompat.setChecked(false);
        }
        l8();
    }

    @Override // K4.r
    public void X() {
        super.X();
        SwitchCompat switchCompat = this.f29714p0;
        if (switchCompat != null) {
            switchCompat.setChecked(true);
        }
        l8();
    }

    @Override // com.uptodown.activities.AbstractActivityC2691a
    public void X2(C2043h appInfo) {
        AbstractC3292y.i(appInfo, "appInfo");
        Fragment M52 = M5();
        RelativeLayout relativeLayout = this.f29719u0;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: F4.A0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.o8(view);
                }
            });
        }
        RelativeLayout relativeLayout2 = this.f29719u0;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
        if (M52 instanceof C1541b1) {
            C2043h u32 = ((C1541b1) M52).u3();
            if (u32 == null || u32.h() != appInfo.h()) {
                y5(appInfo, true);
            }
        } else {
            y5(appInfo, false);
        }
        U5();
    }

    public final void Z6() {
        TabLayout tabLayout;
        TabLayout tabLayout2;
        RelativeLayout relativeLayout;
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStackImmediate((String) null, 1);
        }
        RelativeLayout relativeLayout2 = this.f29719u0;
        if (relativeLayout2 != null && relativeLayout2.getVisibility() == 0 && (relativeLayout = this.f29719u0) != null) {
            relativeLayout.setVisibility(8);
        }
        P7();
        TabLayout tabLayout3 = this.f29721w0;
        if (((tabLayout3 != null && tabLayout3.getSelectedTabPosition() == 1) || ((tabLayout = this.f29721w0) != null && tabLayout.getSelectedTabPosition() == 0)) && (tabLayout2 = this.f29715q0) != null) {
            tabLayout2.setVisibility(0);
        }
    }

    public final void Z7(String str) {
        if (M5() instanceof C1574e) {
            Fragment M52 = M5();
            AbstractC3292y.g(M52, "null cannot be cast to non-null type com.uptodown.fragments.AlternativesFragment");
            ((C1574e) M52).E(str);
        }
    }

    public final Object a8(String str, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.c(), new F(str, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return Q5.I.f8786a;
    }

    @Override // com.uptodown.activities.AbstractActivityC2691a, K4.r
    public void b0() {
        super.b0();
        d2();
    }

    public final Object b8(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.c(), new G(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return Q5.I.f8786a;
    }

    @Override // K4.r
    public void c0() {
        super.c0();
        d2();
    }

    public final boolean c6() {
        RelativeLayout relativeLayout = this.f29718t0;
        if (relativeLayout != null) {
            AbstractC3292y.f(relativeLayout);
            if (relativeLayout.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void c7() {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new v(null), 2, null);
    }

    public final void c8(int i8, c5.r rVar) {
        Fragment M52 = M5();
        if (M52 instanceof C1541b1) {
            runOnUiThread(new C1541b1.RunnableC1546e(i8, rVar));
        } else if (M52 instanceof t2) {
            ((t2) M52).d1();
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2691a, K4.r
    public void d0() {
        super.d0();
        S1();
    }

    public final void d7() {
        b7();
        if (!f6()) {
            f7();
            e7();
            y2();
            g8();
        }
    }

    public final void d8(int i8, Q q8) {
        Fragment M52 = M5();
        if (q8 != null && (M52 instanceof C1541b1)) {
            runOnUiThread(new C1541b1.RunnableC1543b(i8, q8));
        }
    }

    @Override // K4.r
    public void e0() {
        super.e0();
        S1();
    }

    public final void e8(String str) {
        if (M5() instanceof C1606o1) {
            Fragment M52 = M5();
            AbstractC3292y.g(M52, "null cannot be cast to non-null type com.uptodown.fragments.HomeFragment");
            ((C1606o1) M52).C(str);
        } else {
            C1606o1 c1606o1 = this.f29724z0;
            if (c1606o1 != null) {
                AbstractC3292y.f(c1606o1);
                c1606o1.C(str);
            }
        }
    }

    @Override // F4.AbstractActivityC1214z0
    protected void f3() {
    }

    public final void g8() {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new I(null), 3, null);
    }

    @Override // K4.r
    public void h0() {
        SwitchCompat switchCompat = this.f29713Z;
        if (switchCompat != null) {
            switchCompat.setChecked(T());
        }
        l8();
    }

    @Override // F4.AbstractActivityC1214z0
    public c5.T h3() {
        String str;
        c5.T e8 = c5.T.f15689k.e(this);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str == null || !e8.x(this)) {
            return null;
        }
        return e8;
    }

    public final void h8(String str) {
        if (M5() instanceof C1609p1) {
            Fragment M52 = M5();
            AbstractC3292y.g(M52, "null cannot be cast to non-null type com.uptodown.fragments.ParentCategoryFragment");
            ((C1609p1) M52).t(str);
        } else {
            C1609p1 c1609p1 = this.f29722x0;
            if (c1609p1 != null) {
                AbstractC3292y.f(c1609p1);
                c1609p1.t(str);
            }
        }
    }

    public final void i8() {
        ImageView imageView = (ImageView) findViewById(R.id.home_uptodown_turbo);
        c5.T e8 = c5.T.f15689k.e(this);
        if (!isFinishing() && e8 != null && e8.y()) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else if (imageView != null) {
            imageView.setVisibility(0);
        }
        g8();
    }

    public final void j8(String str) {
        if (M5() instanceof C1635y1) {
            Fragment M52 = M5();
            AbstractC3292y.g(M52, "null cannot be cast to non-null type com.uptodown.fragments.TopByCategoryFragment");
            ((C1635y1) M52).S(str);
        } else {
            C1635y1 c1635y1 = this.f29723y0;
            if (c1635y1 != null) {
                AbstractC3292y.f(c1635y1);
                c1635y1.S(str);
            }
        }
    }

    public final void k8() {
        Fragment M52 = M5();
        if (M52 instanceof t2) {
            ((t2) M52).c1();
        }
    }

    @Override // F4.AbstractActivityC1214z0
    public void m3() {
        t2 t2Var;
        if (this.f29710W != null) {
            int size = this.f29708U.size();
            int i8 = this.f29707T;
            if (size > i8 && ((c5.X) this.f29708U.get(i8)).a() == 5) {
                x5();
                c5.T h32 = h3();
                if (h32 != null && (t2Var = this.f29687A0) != null) {
                    t2Var.b1(h32);
                }
            }
        }
    }

    public final void n8(C2040e alternatives) {
        AbstractC3292y.i(alternatives, "alternatives");
        W5();
        T5();
        C1574e a9 = C1574e.f13529f.a(alternatives);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3292y.h(beginTransaction, "beginTransaction(...)");
        if (((CoordinatorLayout) findViewById(R.id.rl_main_scrollable)) != null) {
            try {
                beginTransaction.setCustomAnimations(R.anim.slide_next_in, R.anim.slide_back_out);
                beginTransaction.add(R.id.rl_main_scrollable, a9);
                beginTransaction.addToBackStack(alternatives.c());
                if (M5() instanceof C1635y1) {
                    beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                }
                if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
                    try {
                        beginTransaction.commitAllowingStateLoss();
                        return;
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        String string = getString(R.string.error_generico);
                        AbstractC3292y.h(string, "getString(...)");
                        Z1(string);
                        return;
                    }
                }
                return;
            } catch (Exception e9) {
                e9.printStackTrace();
                String string2 = getString(R.string.error_generico);
                AbstractC3292y.h(string2, "getString(...)");
                Z1(string2);
                return;
            }
        }
        String string3 = getString(R.string.error_generico);
        AbstractC3292y.h(string3, "getString(...)");
        Z1(string3);
    }

    @Override // F4.AbstractActivityC1214z0, com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        String str;
        long j8;
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.main);
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (aVar.U(this)) {
            C3795t q22 = q2();
            if (q22 != null) {
                q22.d("change_to_tv");
            }
            finish();
            startActivity(new Intent(this, (Class<?>) TvMainActivity.class));
        }
        this.f29692F0 = (FrameLayout) findViewById(R.id.fl_sign_in_popup);
        this.f29694H0 = (FrameLayout) findViewById(R.id.fl_uptodown_turbo_popup);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_splash);
        this.f29705S = relativeLayout;
        AbstractC3292y.f(relativeLayout);
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: F4.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.M6(view);
            }
        });
        this.f29695I0 = (FrameLayout) findViewById(R.id.fl_banner_floating);
        this.f29698L0 = (RelativeLayout) findViewById(R.id.app_info_selected_popup);
        if (aVar.L()) {
            RelativeLayout relativeLayout2 = this.f29705S;
            AbstractC3292y.f(relativeLayout2);
            relativeLayout2.setVisibility(8);
            aVar.q0(false);
        }
        this.f29710W = (RelativeLayout) findViewById(R.id.rl_wizard);
        t2();
        this.f29711X = (Toolbar) findViewById(R.id.toolbar_main);
        this.f29712Y = (AppBarLayout) findViewById(R.id.abl_toolbar);
        this.f29715q0 = (TabLayout) findViewById(R.id.tab_parent_categories);
        ((ImageView) findViewById(R.id.home_uptodown_logo)).setOnClickListener(new View.OnClickListener() { // from class: F4.s1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.N6(MainActivity.this, view);
            }
        });
        RelativeLayout relativeLayout3 = (RelativeLayout) findViewById(R.id.rl_main_search_view);
        ((TextView) findViewById(R.id.tv_main_search_view)).setTypeface(J4.j.f4395g.v());
        relativeLayout3.setOnClickListener(new View.OnClickListener() { // from class: F4.D1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.O6(MainActivity.this, view);
            }
        });
        ((ImageView) findViewById(R.id.home_uptodown_turbo)).setOnClickListener(new View.OnClickListener() { // from class: F4.E1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.P6(MainActivity.this, view);
            }
        });
        i8();
        i8();
        String str2 = null;
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new r(null), 3, null);
        X5();
        runOnUiThread(new Runnable() { // from class: F4.F1
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.Q6(MainActivity.this);
            }
        });
        UptodownApp.a.M0(aVar, this, false, 2, null);
        if (!SettingsPreferences.f30529b.W(this)) {
            Context applicationContext = getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            new X4.n(applicationContext);
        }
        if (getIntent() != null) {
            Intent intent = getIntent();
            AbstractC3292y.h(intent, "getIntent(...)");
            if (!t8(intent)) {
                Uri data = getIntent().getData();
                if (data != null) {
                    String uri = data.toString();
                    AbstractC3292y.h(uri, "toString(...)");
                    String j9 = new S4.f().j(data, this);
                    if (j9 != null && l6.n.r(j9, ".apk", false, 2, null)) {
                        String i8 = new C3794s().i(j9);
                        if (i8 != null) {
                            D2(i8, null);
                        } else {
                            Intent intent2 = new Intent(getApplicationContext(), (Class<?>) InstallerActivity.class);
                            intent2.setData(data);
                            this.f29706S0.launch(intent2);
                        }
                    } else if (j9 != null && S4.x.f9510b.a(j9)) {
                        Intent intent3 = new Intent(getApplicationContext(), (Class<?>) InstallerActivity.class);
                        intent3.setData(data);
                        this.f29706S0.launch(intent3);
                    } else if (l6.n.B(uri, "https://dw.uptodown.com/dwn/", false, 2, null)) {
                        DownloadApkWorker.a aVar2 = DownloadApkWorker.f31190k;
                        Context applicationContext2 = getApplicationContext();
                        AbstractC3292y.h(applicationContext2, "getApplicationContext(...)");
                        aVar2.g(applicationContext2, uri);
                        startActivity(new Intent(this, (Class<?>) MyDownloads.class));
                    } else if (l6.n.G(uri, "preregister-available", false, 2, null)) {
                        String queryParameter = data.getQueryParameter("appID");
                        if (queryParameter != null && queryParameter.length() != 0) {
                            try {
                                String queryParameter2 = data.getQueryParameter("appID");
                                AbstractC3292y.f(queryParameter2);
                                C2(Long.parseLong(queryParameter2));
                            } catch (NumberFormatException e8) {
                                e8.printStackTrace();
                            }
                        }
                    } else if (!aVar.U(this)) {
                        new X4.j(this, new C3788m().l(data), this.f29699M0, LifecycleOwnerKt.getLifecycleScope(this));
                    }
                }
                Intent intent4 = getIntent();
                if (intent4 != null && (extras = intent4.getExtras()) != null) {
                    str = extras.getString("appId");
                } else {
                    str = null;
                }
                if (str != null) {
                    try {
                        j8 = Long.parseLong(str);
                    } catch (NumberFormatException e9) {
                        e9.printStackTrace();
                        j8 = -1;
                    }
                    long j10 = j8;
                    if (j10 > 0) {
                        Bundle extras2 = getIntent().getExtras();
                        if (extras2 != null) {
                            str2 = extras2.getString("packageName");
                        }
                        C2031A c2031a = new C2031A();
                        c2031a.j(j10);
                        c2031a.m(str2);
                        c2031a.n(this);
                        new X4.i(this, j10, this.f29699M0, LifecycleOwnerKt.getLifecycleScope(this));
                    }
                } else {
                    C2031A b9 = C2031A.f15554f.b(this);
                    if (b9 != null && !b9.g()) {
                        new X4.i(this, b9.b(), this.f29699M0, LifecycleOwnerKt.getLifecycleScope(this));
                    }
                }
            }
        }
        getOnBackPressedDispatcher().addCallback(this, this.f29704R0);
        R2(registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.G1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.S6(MainActivity.this, (ActivityResult) obj);
            }
        }));
        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.view_pager);
        this.f29717s0 = viewPager2;
        if (viewPager2 != null) {
            viewPager2.setOffscreenPageLimit(this.f29691E0);
        }
        ViewPager2 viewPager22 = this.f29717s0;
        if (viewPager22 != null) {
            viewPager22.setUserInputEnabled(false);
        }
        this.f29721w0 = (TabLayout) findViewById(R.id.tabs);
        this.f29719u0 = (RelativeLayout) findViewById(R.id.rl_app_detail_open);
        i7();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent event) {
        AbstractC3292y.i(event, "event");
        return super.onKeyDown(i8, event);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, K4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!f6()) {
            g8();
            C3800y.f37330a.g(this);
            if (c6()) {
                h7();
            }
        }
    }

    public final void p7(final C2043h appInfo, final Function0 updateCard) {
        AbstractC3292y.i(appInfo, "appInfo");
        AbstractC3292y.i(updateCard, "updateCard");
        RelativeLayout relativeLayout = this.f29698L0;
        if (relativeLayout != null) {
            C4086f c4086f = this.f29697K0;
            AbstractC3292y.f(relativeLayout);
            c4086f.H(appInfo, this, relativeLayout);
            this.f29697K0.m().setOnClickListener(new View.OnClickListener() { // from class: F4.A1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.q7(MainActivity.this, appInfo, view);
                }
            });
            this.f29697K0.s().setOnClickListener(new View.OnClickListener() { // from class: F4.B1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.r7(MainActivity.this, appInfo, view);
                }
            });
            this.f29697K0.q().setOnClickListener(new View.OnClickListener() { // from class: F4.C1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.s7(MainActivity.this, appInfo, updateCard, view);
                }
            });
            RelativeLayout relativeLayout2 = this.f29698L0;
            AbstractC3292y.f(relativeLayout2);
            if (relativeLayout2.getVisibility() != 0) {
                RelativeLayout relativeLayout3 = this.f29698L0;
                AbstractC3292y.f(relativeLayout3);
                relativeLayout3.setVisibility(0);
                if (SettingsPreferences.f30529b.M(this) && !UptodownApp.f29249C.S()) {
                    this.f29697K0.p().startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_in_bottom));
                }
                this.f29697K0.p().setVisibility(0);
            }
            this.f29697K0.p().setVisibility(0);
        }
    }

    public final void p8(C2046k category) {
        AbstractC3292y.i(category, "category");
        W5();
        T5();
        C1635y1 a9 = C1635y1.f13904i.a(category);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3292y.h(beginTransaction, "beginTransaction(...)");
        if (((CoordinatorLayout) findViewById(R.id.rl_main_scrollable)) != null) {
            try {
                beginTransaction.setCustomAnimations(R.anim.slide_next_in, R.anim.slide_back_out);
                beginTransaction.add(R.id.rl_main_scrollable, a9);
                beginTransaction.addToBackStack(a9.H().h());
                if (M5() instanceof C1635y1) {
                    beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                }
                if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
                    try {
                        beginTransaction.commitAllowingStateLoss();
                        return;
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        String string = getString(R.string.error_generico);
                        AbstractC3292y.h(string, "getString(...)");
                        Z1(string);
                        return;
                    }
                }
                return;
            } catch (Exception e9) {
                e9.printStackTrace();
                String string2 = getString(R.string.error_generico);
                AbstractC3292y.h(string2, "getString(...)");
                Z1(string2);
                return;
            }
        }
        String string3 = getString(R.string.error_generico);
        AbstractC3292y.h(string3, "getString(...)");
        Z1(string3);
    }

    @Override // F4.AbstractActivityC1214z0
    protected void q3() {
    }

    public final void q8() {
        C1606o1 c1606o1 = this.f29724z0;
        if (c1606o1 != null) {
            AbstractC3292y.f(c1606o1);
            r8(c1606o1);
        } else {
            C1606o1 c1606o12 = new C1606o1();
            this.f29724z0 = c1606o12;
            AbstractC3292y.f(c1606o12);
            r8(c1606o12);
        }
    }

    @Override // F4.AbstractActivityC1214z0
    protected void r3() {
    }

    public final void s8(C2046k parentCategory) {
        C1609p1 c1609p1;
        AbstractC3292y.i(parentCategory, "parentCategory");
        if (parentCategory.b() == 523) {
            z5(1);
            return;
        }
        this.f29688B0 = new ArrayList();
        TabLayout tabLayout = this.f29715q0;
        AbstractC3292y.f(tabLayout);
        int tabCount = tabLayout.getTabCount();
        int i8 = 1;
        while (true) {
            c1609p1 = null;
            Object obj = null;
            if (i8 >= tabCount) {
                break;
            }
            TabLayout tabLayout2 = this.f29715q0;
            AbstractC3292y.f(tabLayout2);
            TabLayout.Tab tabAt = tabLayout2.getTabAt(i8);
            if (tabAt != null) {
                obj = tabAt.getTag();
            }
            AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.Category");
            if (((C2046k) obj).b() == parentCategory.b()) {
                TabLayout tabLayout3 = this.f29715q0;
                AbstractC3292y.f(tabLayout3);
                TabLayout tabLayout4 = this.f29715q0;
                AbstractC3292y.f(tabLayout4);
                tabLayout3.selectTab(tabLayout4.getTabAt(i8));
            }
            i8++;
        }
        Iterator it = this.f29689C0.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            C1609p1 c1609p12 = (C1609p1) next;
            if (c1609p12.r() != null) {
                C2046k r8 = c1609p12.r();
                AbstractC3292y.f(r8);
                if (r8.b() == parentCategory.b()) {
                    c1609p1 = c1609p12;
                    break;
                }
            }
        }
        if (c1609p1 == null) {
            c1609p1 = C1609p1.f13757n.a(parentCategory);
            this.f29689C0.add(c1609p1);
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3292y.h(beginTransaction, "beginTransaction(...)");
        beginTransaction.replace(R.id.fl_home_fragment, c1609p1);
        if (this.f29688B0.size() < 1) {
            this.f29688B0.add(c1609p1);
        }
        if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
            try {
                beginTransaction.commitAllowingStateLoss();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        z5(0);
    }

    public final void y7() {
        if (this.f29718t0 == null) {
            this.f29718t0 = (RelativeLayout) findViewById(R.id.rl_container_error_no_connection);
            View inflate = LayoutInflater.from(this).inflate(R.layout.error_no_connection, (ViewGroup) this.f29718t0, false);
            RelativeLayout relativeLayout = this.f29718t0;
            AbstractC3292y.f(relativeLayout);
            relativeLayout.addView(inflate);
            RelativeLayout relativeLayout2 = this.f29718t0;
            AbstractC3292y.f(relativeLayout2);
            TextView textView = (TextView) relativeLayout2.findViewById(R.id.tv_msg_enc);
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.u());
            RelativeLayout relativeLayout3 = this.f29718t0;
            AbstractC3292y.f(relativeLayout3);
            ((TextView) relativeLayout3.findViewById(R.id.tv_my_apps_label_enc)).setTypeface(aVar.u());
            RelativeLayout relativeLayout4 = this.f29718t0;
            AbstractC3292y.f(relativeLayout4);
            TextView textView2 = (TextView) relativeLayout4.findViewById(R.id.tv_updates_available_enc);
            textView2.setTypeface(aVar.v());
            textView2.setOnClickListener(new View.OnClickListener() { // from class: F4.b1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.C7(MainActivity.this, view);
                }
            });
            RelativeLayout relativeLayout5 = this.f29718t0;
            AbstractC3292y.f(relativeLayout5);
            TextView textView3 = (TextView) relativeLayout5.findViewById(R.id.tv_installed_enc);
            textView3.setTypeface(aVar.v());
            textView3.setOnClickListener(new View.OnClickListener() { // from class: F4.c1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.D7(MainActivity.this, view);
                }
            });
            RelativeLayout relativeLayout6 = this.f29718t0;
            AbstractC3292y.f(relativeLayout6);
            TextView textView4 = (TextView) relativeLayout6.findViewById(R.id.tv_downloads_enc);
            textView4.setTypeface(aVar.v());
            textView4.setOnClickListener(new View.OnClickListener() { // from class: F4.d1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.E7(MainActivity.this, view);
                }
            });
            RelativeLayout relativeLayout7 = this.f29718t0;
            AbstractC3292y.f(relativeLayout7);
            ((TextView) relativeLayout7.findViewById(R.id.tv_settings_enc)).setTypeface(aVar.u());
            RelativeLayout relativeLayout8 = this.f29718t0;
            AbstractC3292y.f(relativeLayout8);
            ((LinearLayout) relativeLayout8.findViewById(R.id.ll_container_settings_enc)).setOnClickListener(new View.OnClickListener() { // from class: F4.e1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.z7(MainActivity.this, view);
                }
            });
            RelativeLayout relativeLayout9 = this.f29718t0;
            AbstractC3292y.f(relativeLayout9);
            TextView textView5 = (TextView) relativeLayout9.findViewById(R.id.tv_refresh_enc);
            textView5.setTypeface(aVar.u());
            textView5.setOnClickListener(new View.OnClickListener() { // from class: F4.f1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.A7(MainActivity.this, view);
                }
            });
            RelativeLayout relativeLayout10 = this.f29718t0;
            AbstractC3292y.f(relativeLayout10);
            this.f29720v0 = (ProgressBar) relativeLayout10.findViewById(R.id.pb_loading_refresh_enc);
            RelativeLayout relativeLayout11 = this.f29718t0;
            AbstractC3292y.f(relativeLayout11);
            ((RelativeLayout) relativeLayout11.findViewById(R.id.rl_container_progressbar_enc)).setOnClickListener(new View.OnClickListener() { // from class: F4.g1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.B7(view);
                }
            });
        }
        RelativeLayout relativeLayout12 = this.f29718t0;
        AbstractC3292y.f(relativeLayout12);
        relativeLayout12.setVisibility(0);
        ProgressBar progressBar = this.f29720v0;
        AbstractC3292y.f(progressBar);
        progressBar.setVisibility(4);
    }

    public final void z5(int i8) {
        TabLayout tabLayout = this.f29721w0;
        AbstractC3292y.f(tabLayout);
        if (i8 < tabLayout.getTabCount()) {
            TabLayout tabLayout2 = this.f29721w0;
            AbstractC3292y.f(tabLayout2);
            if (tabLayout2.getSelectedTabPosition() != i8) {
                TabLayout tabLayout3 = this.f29721w0;
                AbstractC3292y.f(tabLayout3);
                TabLayout.Tab tabAt = tabLayout3.getTabAt(i8);
                if (tabAt != null) {
                    tabAt.select();
                }
            }
        }
    }

    @Override // F4.AbstractActivityC1214z0
    protected void n3(c5.T t8) {
    }

    @Override // F4.AbstractActivityC1214z0
    protected void p3(c5.T t8, String str) {
    }
}
