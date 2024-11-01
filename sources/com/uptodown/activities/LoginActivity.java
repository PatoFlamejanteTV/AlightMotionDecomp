package com.uptodown.activities;

import F4.AbstractActivityC1214z0;
import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import c5.T;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.C2698h;
import com.uptodown.activities.LoginActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import n6.AbstractC3458i;
import n6.C3445b0;
import q5.AbstractC3768A;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class LoginActivity extends AbstractActivityC1214z0 {

    /* renamed from: X, reason: collision with root package name */
    public static final a f29633X = new a(null);

    /* renamed from: U, reason: collision with root package name */
    private Drawable f29636U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f29637V;

    /* renamed from: S, reason: collision with root package name */
    private final InterfaceC1416k f29634S = Q5.l.b(new Function0() { // from class: F4.m0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.L M32;
            M32 = LoginActivity.M3(LoginActivity.this);
            return M32;
        }
    });

    /* renamed from: T, reason: collision with root package name */
    private final InterfaceC1416k f29635T = new ViewModelLazy(U.b(C2698h.class), new i(this), new h(this), new j(null, this));

    /* renamed from: W, reason: collision with root package name */
    private final c f29638W = new c();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Animation.AnimationListener {
        b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3292y.i(animation, "animation");
            LoginActivity.this.N3().f12268c.getRoot().setVisibility(8);
            LoginActivity.this.l4();
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
    public static final class c extends OnBackPressedCallback {

        /* loaded from: classes4.dex */
        public static final class a implements Animation.AnimationListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LoginActivity f29641a;

            a(LoginActivity loginActivity) {
                this.f29641a = loginActivity;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                AbstractC3292y.i(animation, "animation");
                this.f29641a.N3().f12269d.getRoot().setVisibility(8);
                this.f29641a.k4();
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

        c() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (LoginActivity.this.N3().f12269d.getRoot().getVisibility() == 0) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setInterpolator(new AccelerateInterpolator());
                alphaAnimation.setDuration(200L);
                alphaAnimation.setAnimationListener(new a(LoginActivity.this));
                LoginActivity.this.N3().f12269d.getRoot().startAnimation(alphaAnimation);
                return;
            }
            LoginActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29642a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LoginActivity f29644a;

            a(LoginActivity loginActivity) {
                this.f29644a = loginActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (abstractC3768A instanceof AbstractC3768A.a) {
                    this.f29644a.N3().f12267b.f12236b.setVisibility(0);
                } else if (abstractC3768A instanceof AbstractC3768A.c) {
                    T e8 = T.f15689k.e(this.f29644a);
                    if (e8 != null && e8.x(this.f29644a)) {
                        AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                        if (((C2698h.a) cVar.a()).a() != null) {
                            this.f29644a.Z1(((C2698h.a) cVar.a()).a());
                        }
                        this.f29644a.r3();
                        this.f29644a.setResult(1);
                    } else {
                        AbstractC3768A.c cVar2 = (AbstractC3768A.c) abstractC3768A;
                        if (((C2698h.a) cVar2.a()).b() != null) {
                            this.f29644a.Z1(((C2698h.a) cVar2.a()).b());
                        } else {
                            LoginActivity loginActivity = this.f29644a;
                            String string = loginActivity.getString(R.string.login_error_message);
                            AbstractC3292y.h(string, "getString(...)");
                            loginActivity.Z1(string);
                        }
                    }
                    this.f29644a.N3().f12267b.f12236b.setVisibility(8);
                    if (e8 != null && e8.x(this.f29644a) && ((C2698h.a) ((AbstractC3768A.c) abstractC3768A).a()).a() == null) {
                        this.f29644a.getOnBackPressedDispatcher().onBackPressed();
                    }
                } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                    throw new Q5.p();
                }
                return Q5.I.f8786a;
            }
        }

        d(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29642a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L e9 = LoginActivity.this.O3().e();
                a aVar = new a(LoginActivity.this);
                this.f29642a = 1;
                if (e9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29645a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LoginActivity f29647a;

            a(LoginActivity loginActivity) {
                this.f29647a = loginActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (abstractC3768A instanceof AbstractC3768A.a) {
                    this.f29647a.N3().f12267b.f12236b.setVisibility(0);
                } else if (abstractC3768A instanceof AbstractC3768A.c) {
                    AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                    if (((C2698h.b) cVar.a()).c() == 1) {
                        String b9 = ((C2698h.b) cVar.a()).b();
                        if (b9 != null && b9.length() != 0) {
                            this.f29647a.Z1(((C2698h.b) cVar.a()).b());
                        }
                        this.f29647a.i4();
                        this.f29647a.j4();
                    } else {
                        String a9 = ((C2698h.b) cVar.a()).a();
                        if (a9 != null && a9.length() != 0) {
                            this.f29647a.Z1(((C2698h.b) cVar.a()).a());
                        } else {
                            LoginActivity loginActivity = this.f29647a;
                            String string = loginActivity.getString(R.string.signup_error_message);
                            AbstractC3292y.h(string, "getString(...)");
                            loginActivity.Z1(string);
                        }
                    }
                    this.f29647a.N3().f12267b.f12236b.setVisibility(8);
                } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                    throw new Q5.p();
                }
                return Q5.I.f8786a;
            }
        }

        e(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29645a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L f8 = LoginActivity.this.O3().f();
                a aVar = new a(LoginActivity.this);
                this.f29645a = 1;
                if (f8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements Animation.AnimationListener {
        f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3292y.i(animation, "animation");
            LoginActivity.this.N3().f12268c.getRoot().setVisibility(0);
            LoginActivity.this.N3().f12271f.setText(R.string.title_login);
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
    public static final class g implements Animation.AnimationListener {
        g() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3292y.i(animation, "animation");
            LoginActivity.this.N3().f12269d.getRoot().setVisibility(0);
            LoginActivity.this.N3().f12271f.setText(R.string.title_sign_up);
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
    public static final class h extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29650a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f29650a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29650a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29651a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f29651a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29651a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29652a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29653b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29652a = function0;
            this.f29653b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29652a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29653b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4.L M3(LoginActivity loginActivity) {
        return Y4.L.c(loginActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y4.L N3() {
        return (Y4.L) this.f29634S.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2698h O3() {
        return (C2698h) this.f29635T.getValue();
    }

    private final void P3() {
        Object systemService = getSystemService("input_method");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        inputMethodManager.hideSoftInputFromWindow(N3().f12269d.f12837c.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(N3().f12269d.f12839e.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(N3().f12269d.f12838d.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(N3().f12268c.f12274c.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(N3().f12268c.f12273b.getWindowToken(), 0);
    }

    private final void Q3() {
        TextView textView = (TextView) findViewById(R.id.tv_title_download_benefit);
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        ((TextView) findViewById(R.id.tv_desc_download_benefit)).setTypeface(aVar.v());
        ((TextView) findViewById(R.id.tv_title_discover_benefit)).setTypeface(aVar.u());
        ((TextView) findViewById(R.id.tv_desc_discover_benefit)).setTypeface(aVar.v());
        ((TextView) findViewById(R.id.tv_title_share_benefit)).setTypeface(aVar.u());
        ((TextView) findViewById(R.id.tv_desc_share_benefit)).setTypeface(aVar.v());
    }

    private final void R3() {
        setContentView(N3().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        this.f29636U = drawable;
        if (drawable != null) {
            AbstractC3292y.f(drawable);
            Q2(drawable, ContextCompat.getColor(this, R.color.toolbar_icon));
            N3().f12270e.setNavigationIcon(this.f29636U);
            N3().f12270e.setNavigationContentDescription(getString(R.string.back));
        }
        N3().f12270e.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.S3(LoginActivity.this, view);
            }
        });
        TextView textView = N3().f12271f;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        N3().f12268c.f12281j.setTypeface(aVar.u());
        N3().f12268c.f12278g.setTypeface(aVar.v());
        N3().f12269d.f12844j.setTypeface(aVar.v());
        N3().f12267b.f12236b.setOnClickListener(new View.OnClickListener() { // from class: F4.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.X3(view);
            }
        });
        N3().f12268c.f12281j.setOnClickListener(new View.OnClickListener() { // from class: F4.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.Y3(LoginActivity.this, view);
            }
        });
        N3().f12268c.f12279h.setTypeface(aVar.u());
        N3().f12268c.f12279h.setOnClickListener(new View.OnClickListener() { // from class: F4.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.Z3(LoginActivity.this, view);
            }
        });
        N3().f12268c.f12274c.setTypeface(aVar.v());
        N3().f12268c.f12274c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: F4.t0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.a4(LoginActivity.this, view, z8);
            }
        });
        N3().f12268c.f12273b.setTypeface(aVar.v());
        N3().f12268c.f12273b.setImeOptions(6);
        N3().f12268c.f12273b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: F4.u0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i8, KeyEvent keyEvent) {
                boolean b42;
                b42 = LoginActivity.b4(LoginActivity.this, textView2, i8, keyEvent);
                return b42;
            }
        });
        N3().f12268c.f12273b.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: F4.v0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.c4(LoginActivity.this, view, z8);
            }
        });
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 23) {
            Drawable[] compoundDrawables = N3().f12268c.f12273b.getCompoundDrawables();
            AbstractC3292y.h(compoundDrawables, "getCompoundDrawables(...)");
            Drawable drawable2 = compoundDrawables[0];
            if (drawable2 != null) {
                AbstractC3292y.f(drawable2);
                drawable2.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.SRC_ATOP);
            }
        }
        TextView textView2 = (TextView) findViewById(R.id.tv_pass_forget_login);
        if (textView2 != null) {
            textView2.setTypeface(aVar.u());
            textView2.setOnClickListener(new View.OnClickListener() { // from class: F4.j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.d4(LoginActivity.this, view);
                }
            });
        }
        N3().f12269d.f12846l.setTypeface(aVar.u());
        N3().f12269d.f12846l.setOnClickListener(new View.OnClickListener() { // from class: F4.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.e4(LoginActivity.this, view);
            }
        });
        N3().f12269d.f12839e.setTypeface(aVar.v());
        N3().f12269d.f12839e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: F4.l0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.T3(LoginActivity.this, view, z8);
            }
        });
        N3().f12269d.f12843i.setTypeface(aVar.u());
        N3().f12269d.f12843i.setOnClickListener(new View.OnClickListener() { // from class: F4.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.U3(LoginActivity.this, view);
            }
        });
        N3().f12269d.f12837c.setTypeface(aVar.v());
        N3().f12269d.f12837c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: F4.o0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.V3(LoginActivity.this, view, z8);
            }
        });
        N3().f12269d.f12838d.setTypeface(aVar.v());
        N3().f12269d.f12838d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: F4.p0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.W3(LoginActivity.this, view, z8);
            }
        });
        if (i8 < 23) {
            Drawable[] compoundDrawables2 = N3().f12269d.f12838d.getCompoundDrawables();
            AbstractC3292y.h(compoundDrawables2, "getCompoundDrawables(...)");
            Drawable drawable3 = compoundDrawables2[0];
            if (drawable3 != null) {
                AbstractC3292y.f(drawable3);
                drawable3.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.SRC_ATOP);
            }
        }
        N3().f12269d.f12836b.setTypeface(aVar.v());
        N3().f12269d.f12836b.setMovementMethod(LinkMovementMethod.getInstance());
        g3(N3());
        Q3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S3(LoginActivity loginActivity, View view) {
        loginActivity.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(LoginActivity loginActivity, View view, boolean z8) {
        if (z8) {
            loginActivity.N3().f12269d.f12839e.setHint("");
        } else {
            loginActivity.N3().f12269d.f12839e.setHint(loginActivity.getString(R.string.hint_nombre_usuario_login_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U3(LoginActivity loginActivity, View view) {
        loginActivity.f29638W.handleOnBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V3(LoginActivity loginActivity, View view, boolean z8) {
        if (z8) {
            loginActivity.N3().f12269d.f12837c.setHint("");
        } else {
            loginActivity.N3().f12269d.f12837c.setHint(loginActivity.getString(R.string.hint_email_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W3(LoginActivity loginActivity, View view, boolean z8) {
        if (z8) {
            loginActivity.N3().f12269d.f12838d.setHint("");
        } else {
            loginActivity.N3().f12269d.f12838d.setHint(loginActivity.getString(R.string.hint_pass_login_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y3(LoginActivity loginActivity, View view) {
        if (loginActivity.N3().f12269d.getRoot().getVisibility() != 0) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setInterpolator(new AccelerateInterpolator());
            alphaAnimation.setDuration(200L);
            alphaAnimation.setAnimationListener(new b());
            loginActivity.N3().f12268c.getRoot().startAnimation(alphaAnimation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z3(LoginActivity loginActivity, View view) {
        loginActivity.h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(LoginActivity loginActivity, View view, boolean z8) {
        if (z8) {
            loginActivity.N3().f12268c.f12274c.setHint("");
        } else {
            loginActivity.N3().f12268c.f12274c.setHint(loginActivity.getString(R.string.hint_nombre_usuario_login_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b4(LoginActivity loginActivity, TextView textView, int i8, KeyEvent keyEvent) {
        if (i8 == 6) {
            loginActivity.h4();
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c4(LoginActivity loginActivity, View view, boolean z8) {
        if (z8) {
            loginActivity.N3().f12268c.f12273b.setHint("");
        } else {
            loginActivity.N3().f12268c.f12273b.setHint(loginActivity.getString(R.string.hint_pass_login_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d4(LoginActivity loginActivity, View view) {
        loginActivity.startActivity(new Intent(loginActivity.getApplicationContext(), (Class<?>) PasswordRecoveryActivity.class), UptodownApp.f29249C.a(loginActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e4(LoginActivity loginActivity, View view) {
        loginActivity.m4();
    }

    private final void f4(String str, String str2) {
        O3().c(this, str, str2);
    }

    private final void g4(String str, String str2, String str3) {
        O3().d(this, str, str2, str3);
    }

    private final void h4() {
        P3();
        if (O3().g(N3().f12268c.f12274c.getText().toString(), N3().f12268c.f12273b.getText().toString())) {
            f4(N3().f12268c.f12274c.getText().toString(), N3().f12268c.f12273b.getText().toString());
            return;
        }
        Toast makeText = Toast.makeText(getApplicationContext(), R.string.faltan_datos_login, 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i4() {
        Y4.L N32 = N3();
        N32.f12269d.f12839e.setText("");
        N32.f12268c.f12274c.setText("");
        N32.f12269d.f12837c.setText("");
        N32.f12269d.f12837c.setEnabled(true);
        N32.f12269d.f12838d.setText("");
        N32.f12268c.f12273b.setText("");
        N32.f12269d.f12836b.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j4() {
        Y4.L N32 = N3();
        N32.f12271f.setText(getString(R.string.title_login));
        N32.f12268c.getRoot().setVisibility(0);
        N32.f12269d.getRoot().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k4() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new f());
        TextView c32 = c3();
        if (c32 != null) {
            c32.setText(getString(R.string.title_login));
        }
        N3().f12268c.getRoot().setVisibility(0);
        N3().f12268c.getRoot().startAnimation(alphaAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l4() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new g());
        TextView c32 = c3();
        if (c32 != null) {
            c32.setText(getString(R.string.sign_up_with_google));
        }
        N3().f12269d.getRoot().setVisibility(0);
        N3().f12269d.getRoot().startAnimation(alphaAnimation);
    }

    private final void m4() {
        P3();
        boolean i8 = O3().i(N3().f12269d.f12837c.getText().toString());
        if (O3().h(N3().f12269d.f12839e.getText().toString(), N3().f12269d.f12837c.getText().toString(), N3().f12269d.f12838d.getText().toString()) && i8 && N3().f12269d.f12836b.isChecked()) {
            g4(N3().f12269d.f12839e.getText().toString(), N3().f12269d.f12837c.getText().toString(), N3().f12269d.f12838d.getText().toString());
            return;
        }
        if (!N3().f12269d.f12836b.isChecked()) {
            Toast makeText = Toast.makeText(getApplicationContext(), R.string.falta_condiciones_uso, 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
        } else if (N3().f12269d.f12838d.length() < 6) {
            Toast makeText2 = Toast.makeText(getApplicationContext(), R.string.error_password_too_short, 1);
            makeText2.setGravity(17, 0, 0);
            makeText2.show();
        } else if (!i8) {
            Toast makeText3 = Toast.makeText(getApplicationContext(), R.string.error_email_not_valid, 1);
            makeText3.setGravity(17, 0, 0);
            makeText3.show();
        } else {
            Toast makeText4 = Toast.makeText(getApplicationContext(), getString(R.string.faltan_datos_registro), 1);
            makeText4.setGravity(17, 0, 0);
            makeText4.show();
        }
    }

    @Override // F4.AbstractActivityC1214z0
    protected void f3() {
        N3().f12267b.f12236b.setVisibility(8);
    }

    @Override // com.uptodown.activities.AbstractActivityC2691a, android.app.Activity
    public void finish() {
        if (this.f29637V) {
            setResult(2);
        }
        super.finish();
    }

    @Override // F4.AbstractActivityC1214z0
    protected void n3(T t8) {
        String str;
        if (t8 != null) {
            t8.I(this);
        }
        try {
            if (t8 != null) {
                str = t8.s();
            } else {
                str = null;
            }
            AccountManager.get(getBaseContext()).addAccountExplicitly(new Account(str, getString(R.string.account)), null, null);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // F4.AbstractActivityC1214z0, com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getOnBackPressedDispatcher().addCallback(this, this.f29638W);
        R3();
        AbstractC3458i.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new d(null), 2, null);
        AbstractC3458i.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new e(null), 2, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        Drawable drawable = this.f29636U;
        if (drawable != null) {
            AbstractC3292y.f(drawable);
            DrawableCompat.setTintList(drawable, null);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            getWindow().getDecorView().setSystemUiVisibility(0);
        }
        super.onDestroy();
    }

    @Override // com.uptodown.activities.AbstractActivityC2691a, K4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        String str;
        super.onResume();
        P3();
        T e8 = T.f15689k.e(this);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str != null && e8.x(this)) {
            finish();
        }
    }

    @Override // F4.AbstractActivityC1214z0
    protected void p3(T t8, String str) {
        String str2;
        f3();
        EditText editText = N3().f12269d.f12839e;
        String str3 = null;
        if (t8 != null) {
            str2 = t8.s();
        } else {
            str2 = null;
        }
        editText.setText(str2);
        EditText editText2 = N3().f12269d.f12837c;
        if (t8 != null) {
            str3 = t8.p();
        }
        editText2.setText(str3);
        N3().f12269d.f12837c.setEnabled(false);
        if (str != null) {
            Toast.makeText(this, str, 1).show();
        }
    }

    @Override // F4.AbstractActivityC1214z0
    protected void q3() {
        N3().f12267b.f12236b.setVisibility(0);
    }

    @Override // F4.AbstractActivityC1214z0
    protected void r3() {
        Toast.makeText(this, R.string.login_successful, 0).show();
    }
}
