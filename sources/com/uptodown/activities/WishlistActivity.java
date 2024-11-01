package com.uptodown.activities;

import F4.AbstractActivityC1198w2;
import I4.W;
import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import R5.AbstractC1435t;
import Y4.I0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import c5.C2043h;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.O;
import com.uptodown.activities.WishlistActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Y;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3776a;
import q5.C3784i;
import q5.C3791p;
import q5.C3794s;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class WishlistActivity extends AbstractActivityC1198w2 {

    /* renamed from: u0, reason: collision with root package name */
    public static final a f30331u0 = new a(null);

    /* renamed from: s0, reason: collision with root package name */
    private W f30334s0;

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1416k f30332q0 = Q5.l.b(new Function0() { // from class: F4.u5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.I0 K42;
            K42 = WishlistActivity.K4(WishlistActivity.this);
            return K42;
        }
    });

    /* renamed from: r0, reason: collision with root package name */
    private final InterfaceC1416k f30333r0 = new ViewModelLazy(U.b(O.class), new j(this), new i(this), new k(null, this));

    /* renamed from: t0, reason: collision with root package name */
    private c f30335t0 = new c();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30336a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c5.W f30338c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f30339d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c5.W w8, int i8, U5.d dVar) {
            super(2, dVar);
            this.f30338c = w8;
            this.f30339d = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f30338c, this.f30339d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30336a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                WishlistActivity wishlistActivity = WishlistActivity.this;
                c5.W w8 = this.f30338c;
                int i9 = this.f30339d;
                this.f30336a = 1;
                if (wishlistActivity.Z4(w8, i9, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements b5.L {

        /* loaded from: classes4.dex */
        public static final class a implements b5.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WishlistActivity f30341a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f30342b;

            a(WishlistActivity wishlistActivity, int i8) {
                this.f30341a = wishlistActivity;
                this.f30342b = i8;
            }

            @Override // b5.r
            public void b(int i8) {
                WishlistActivity wishlistActivity = this.f30341a;
                String string = wishlistActivity.getString(R.string.error_cant_enqueue_download);
                AbstractC3292y.h(string, "getString(...)");
                wishlistActivity.Z1(string);
            }

            @Override // b5.r
            public void c(C2043h appInfo) {
                AbstractC3292y.i(appInfo, "appInfo");
                String z8 = appInfo.z();
                if (z8 != null && z8.length() != 0) {
                    if (!new C3784i().t(appInfo.v0(), this.f30341a)) {
                        this.f30341a.Y4(appInfo, this.f30342b);
                        return;
                    } else {
                        this.f30341a.l4(new C3784i().B(this.f30341a, appInfo.v0()));
                        return;
                    }
                }
                WishlistActivity wishlistActivity = this.f30341a;
                String string = wishlistActivity.getString(R.string.dialog_msg_download_not_available, appInfo.q0());
                AbstractC3292y.h(string, "getString(...)");
                wishlistActivity.Z1(string);
            }
        }

        c() {
        }

        @Override // b5.I
        public void a(int i8) {
            if (UptodownApp.f29249C.a0() && WishlistActivity.this.f30334s0 != null) {
                AbstractC3292y.f(WishlistActivity.this.f30334s0);
                if (!r0.a().isEmpty()) {
                    W w8 = WishlistActivity.this.f30334s0;
                    AbstractC3292y.f(w8);
                    Object obj = w8.a().get(i8);
                    AbstractC3292y.h(obj, "get(...)");
                    WishlistActivity.this.C2(((c5.W) obj).a());
                }
            }
        }

        @Override // b5.I
        public void b(View v8, int i8) {
            AbstractC3292y.i(v8, "v");
            if (UptodownApp.f29249C.a0() && WishlistActivity.this.f30334s0 != null) {
                AbstractC3292y.f(WishlistActivity.this.f30334s0);
                if (!r3.a().isEmpty()) {
                    WishlistActivity wishlistActivity = WishlistActivity.this;
                    W w8 = wishlistActivity.f30334s0;
                    AbstractC3292y.f(w8);
                    Object obj = w8.a().get(i8);
                    AbstractC3292y.h(obj, "get(...)");
                    wishlistActivity.M4((c5.W) obj, i8);
                }
            }
        }

        @Override // b5.L
        public void c(int i8) {
            if (WishlistActivity.this.f30334s0 != null) {
                AbstractC3292y.f(WishlistActivity.this.f30334s0);
                if (!r0.a().isEmpty()) {
                    WishlistActivity wishlistActivity = WishlistActivity.this;
                    W w8 = wishlistActivity.f30334s0;
                    AbstractC3292y.f(w8);
                    new X4.i(wishlistActivity, ((c5.W) w8.a().get(i8)).a(), new a(WishlistActivity.this, i8), LifecycleOwnerKt.getLifecycleScope(WishlistActivity.this));
                }
            }
        }

        @Override // b5.L
        public void d(int i8) {
            if (WishlistActivity.this.f30334s0 != null) {
                AbstractC3292y.f(WishlistActivity.this.f30334s0);
                if (!r2.a().isEmpty()) {
                    W w8 = WishlistActivity.this.f30334s0;
                    AbstractC3292y.f(w8);
                    Object obj = w8.a().get(i8);
                    AbstractC3292y.h(obj, "get(...)");
                    c5.W w9 = (c5.W) obj;
                    String f8 = w9.f();
                    if (f8 != null && f8.length() != 0) {
                        PackageManager packageManager = WishlistActivity.this.getPackageManager();
                        String f9 = w9.f();
                        AbstractC3292y.f(f9);
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(f9);
                        if (launchIntentForPackage != null) {
                            WishlistActivity.this.startActivity(launchIntentForPackage);
                            return;
                        }
                        WishlistActivity wishlistActivity = WishlistActivity.this;
                        String string = wishlistActivity.getString(R.string.error_open_app, w9.e());
                        AbstractC3292y.h(string, "getString(...)");
                        wishlistActivity.Z1(string);
                        return;
                    }
                    WishlistActivity wishlistActivity2 = WishlistActivity.this;
                    String string2 = wishlistActivity2.getString(R.string.error_open_app, w9.e());
                    AbstractC3292y.h(string2, "getString(...)");
                    wishlistActivity2.Z1(string2);
                }
            }
        }

        @Override // b5.I
        public void e(int i8) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30343a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c5.W f30345c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c5.W w8, U5.d dVar) {
            super(2, dVar);
            this.f30345c = w8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f30345c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            W w8;
            ArrayList a9;
            V5.b.e();
            if (this.f30343a == 0) {
                Q5.t.b(obj);
                W w9 = WishlistActivity.this.f30334s0;
                if (w9 != null && (a9 = w9.a()) != null) {
                    i8 = a9.indexOf(this.f30345c);
                } else {
                    i8 = -1;
                }
                if (i8 > -1 && (w8 = WishlistActivity.this.f30334s0) != null) {
                    w8.notifyItemChanged(i8);
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30346a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WishlistActivity f30348a;

            a(WishlistActivity wishlistActivity) {
                this.f30348a = wishlistActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (abstractC3768A instanceof AbstractC3768A.a) {
                    this.f30348a.P4().f12210b.f12236b.setVisibility(0);
                } else if (abstractC3768A instanceof AbstractC3768A.c) {
                    AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                    this.f30348a.L4(((O.a) cVar.a()).a());
                    if (((O.a) cVar.a()).a().size() == 0) {
                        this.f30348a.P4().f12214f.setVisibility(0);
                        this.f30348a.P4().f12213e.setVisibility(0);
                    }
                    this.f30348a.P4().f12210b.f12236b.setVisibility(8);
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
            int i8 = this.f30346a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L e9 = WishlistActivity.this.Q4().e();
                a aVar = new a(WishlistActivity.this);
                this.f30346a = 1;
                if (e9.collect(aVar, this) == e8) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30349a;

        /* renamed from: b, reason: collision with root package name */
        int f30350b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f30351c;

        /* renamed from: e, reason: collision with root package name */
        int f30353e;

        f(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30351c = obj;
            this.f30353e |= Integer.MIN_VALUE;
            return WishlistActivity.this.Z4(null, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30354a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c5.W f30355b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WishlistActivity f30356c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f30357d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(c5.W w8, WishlistActivity wishlistActivity, int i8, U5.d dVar) {
            super(2, dVar);
            this.f30355b = w8;
            this.f30356c = wishlistActivity;
            this.f30357d = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f30355b, this.f30356c, this.f30357d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30354a == 0) {
                Q5.t.b(obj);
                this.f30355b.i(this.f30356c);
                W w8 = this.f30356c.f30334s0;
                AbstractC3292y.f(w8);
                return w8.a().remove(this.f30357d);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30358a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f30360c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i8, U5.d dVar) {
            super(2, dVar);
            this.f30360c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new h(this.f30360c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30358a == 0) {
                Q5.t.b(obj);
                W w8 = WishlistActivity.this.f30334s0;
                AbstractC3292y.f(w8);
                w8.notifyItemRemoved(this.f30360c);
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30361a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f30361a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30361a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30362a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f30362a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30362a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30363a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30364b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30363a = function0;
            this.f30364b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30363a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30364b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30365a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30367c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, U5.d dVar) {
            super(2, dVar);
            this.f30367c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new l(this.f30367c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object obj2;
            V5.b.e();
            if (this.f30365a == 0) {
                Q5.t.b(obj);
                if (WishlistActivity.this.f30334s0 != null) {
                    AbstractC3292y.f(WishlistActivity.this.f30334s0);
                    if ((!r4.a().isEmpty()) && (str = this.f30367c) != null && str.length() != 0) {
                        W w8 = WishlistActivity.this.f30334s0;
                        AbstractC3292y.f(w8);
                        ArrayList a9 = w8.a();
                        String str2 = this.f30367c;
                        Iterator it = a9.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (AbstractC3292y.d(((c5.W) obj2).f(), str2)) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        W w9 = WishlistActivity.this.f30334s0;
                        AbstractC3292y.f(w9);
                        int r02 = AbstractC1435t.r0(w9.a(), (c5.W) obj2);
                        if (r02 > -1) {
                            W w10 = WishlistActivity.this.f30334s0;
                            AbstractC3292y.f(w10);
                            w10.notifyItemChanged(r02);
                        } else {
                            WishlistActivity.this.X4();
                        }
                        return Q5.I.f8786a;
                    }
                }
                WishlistActivity.this.X4();
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I0 K4(WishlistActivity wishlistActivity) {
        return I0.c(wishlistActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L4(ArrayList arrayList) {
        W w8 = this.f30334s0;
        if (w8 == null) {
            this.f30334s0 = new W(arrayList, this, this.f30335t0);
            P4().f12211c.setAdapter(this.f30334s0);
        } else {
            AbstractC3292y.f(w8);
            w8.d(arrayList);
            X4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M4(final c5.W w8, final int i8) {
        Y y8 = Y.f34578a;
        String string = getString(R.string.dialog_wishlist_msg);
        AbstractC3292y.h(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[]{w8.e()}, 1));
        AbstractC3292y.h(format, "format(...)");
        T1(format, new Function0() { // from class: F4.y5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Q5.I N42;
                N42 = WishlistActivity.N4(WishlistActivity.this, w8, i8);
                return N42;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I N4(WishlistActivity wishlistActivity, c5.W w8, int i8) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(wishlistActivity), null, null, new b(w8, i8, null), 3, null);
        return Q5.I.f8786a;
    }

    private final void O4(C2043h c2043h, c5.r rVar) {
        rVar.a(c2043h);
        int l02 = rVar.l0(this);
        if (l02 >= 0) {
            I2(this, l02);
            return;
        }
        Toast.makeText(this, getString(R.string.error_cant_enqueue_download) + " (108)", 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final I0 P4() {
        return (I0) this.f30332q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O Q4() {
        return (O) this.f30333r0.getValue();
    }

    private final void R4() {
        setContentView(P4().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        I0 P42 = P4();
        if (drawable != null) {
            P42.f12212d.setNavigationIcon(drawable);
            P42.f12212d.setNavigationContentDescription(getString(R.string.back));
        }
        P42.f12212d.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.v5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WishlistActivity.S4(WishlistActivity.this, view);
            }
        });
        TextView textView = P42.f12215g;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        P42.f12211c.setLayoutManager(new LinearLayoutManager(this, 1, false));
        P42.f12211c.setItemAnimator(new DefaultItemAnimator());
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        P4().f12211c.addItemDecoration(new s5.m(dimension, dimension));
        P42.f12211c.setItemAnimator(defaultItemAnimator);
        P42.f12214f.setTypeface(aVar.v());
        P42.f12213e.setTypeface(aVar.v());
        P42.f12213e.setOnClickListener(new View.OnClickListener() { // from class: F4.w5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WishlistActivity.T4(WishlistActivity.this, view);
            }
        });
        P42.f12210b.f12236b.setOnClickListener(new View.OnClickListener() { // from class: F4.x5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WishlistActivity.U4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S4(WishlistActivity wishlistActivity, View view) {
        wishlistActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T4(WishlistActivity wishlistActivity, View view) {
        wishlistActivity.setResult(1);
        wishlistActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U4(View view) {
    }

    private final void V4() {
        Q4().d(this, new Function1() { // from class: F4.t5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Q5.I W42;
                W42 = WishlistActivity.W4(WishlistActivity.this, (c5.W) obj);
                return W42;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I W4(WishlistActivity wishlistActivity, c5.W wishlist) {
        AbstractC3292y.i(wishlist, "wishlist");
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(wishlistActivity), C3445b0.c(), null, new d(wishlist, null), 2, null);
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X4() {
        W w8 = this.f30334s0;
        if (w8 != null) {
            w8.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y4(C2043h c2043h, int i8) {
        C3791p.a aVar = C3791p.f37286s;
        Context applicationContext = getApplicationContext();
        AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
        C3791p a9 = aVar.a(applicationContext);
        a9.a();
        c5.r Z8 = a9.Z(String.valueOf(c2043h.d0()));
        a9.i();
        if (Z8 != null) {
            int Z9 = Z8.Z();
            if (1 <= Z9 && Z9 < 100) {
                if (Z8.X() != null) {
                    C3776a c3776a = new C3776a();
                    Context applicationContext2 = getApplicationContext();
                    AbstractC3292y.h(applicationContext2, "getApplicationContext(...)");
                    c3776a.a(applicationContext2, Z8.X());
                    W w8 = this.f30334s0;
                    if (w8 != null) {
                        w8.notifyItemChanged(i8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (Z8.Z() == 100) {
                File f8 = new C3794s().f(this);
                String X8 = Z8.X();
                AbstractC3292y.f(X8);
                UptodownApp.f29249C.Y(new File(f8, X8), this, c2043h.r0());
                return;
            }
            Z8.n0(this);
            W w9 = this.f30334s0;
            if (w9 != null) {
                w9.notifyItemChanged(i8);
                return;
            }
            return;
        }
        c5.r rVar = new c5.r();
        try {
            String P02 = c2043h.P0();
            AbstractC3292y.f(P02);
            rVar.G0(Long.parseLong(P02));
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
        }
        O4(c2043h, rVar);
        W w10 = this.f30334s0;
        AbstractC3292y.f(w10);
        ((c5.W) w10.a().get(i8)).l(String.valueOf(c2043h.d0()));
        W w11 = this.f30334s0;
        if (w11 != null) {
            w11.notifyItemChanged(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Z4(c5.W r7, int r8, U5.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.uptodown.activities.WishlistActivity.f
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.activities.WishlistActivity$f r0 = (com.uptodown.activities.WishlistActivity.f) r0
            int r1 = r0.f30353e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30353e = r1
            goto L18
        L13:
            com.uptodown.activities.WishlistActivity$f r0 = new com.uptodown.activities.WishlistActivity$f
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f30351c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f30353e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Q5.t.b(r9)
            goto L6d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            int r8 = r0.f30350b
            java.lang.Object r7 = r0.f30349a
            com.uptodown.activities.WishlistActivity r7 = (com.uptodown.activities.WishlistActivity) r7
            Q5.t.b(r9)
            goto L59
        L3f:
            Q5.t.b(r9)
            n6.I r9 = n6.C3445b0.b()
            com.uptodown.activities.WishlistActivity$g r2 = new com.uptodown.activities.WishlistActivity$g
            r2.<init>(r7, r6, r8, r5)
            r0.f30349a = r6
            r0.f30350b = r8
            r0.f30353e = r4
            java.lang.Object r7 = n6.AbstractC3458i.g(r9, r2, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            r7 = r6
        L59:
            n6.J0 r9 = n6.C3445b0.c()
            com.uptodown.activities.WishlistActivity$h r2 = new com.uptodown.activities.WishlistActivity$h
            r2.<init>(r8, r5)
            r0.f30349a = r5
            r0.f30353e = r3
            java.lang.Object r7 = n6.AbstractC3458i.g(r9, r2, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            Q5.I r7 = Q5.I.f8786a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.WishlistActivity.Z4(c5.W, int, U5.d):java.lang.Object");
    }

    public final void a5(String str) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new l(str, null), 2, null);
    }

    @Override // F4.AbstractActivityC1198w2
    protected void o4() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R4();
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new e(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, K4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        V4();
    }
}
