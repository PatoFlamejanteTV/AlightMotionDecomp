package com.uptodown.activities;

import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1412g;
import Q5.InterfaceC1416k;
import Y4.s0;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import c5.C2051p;
import c5.T;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.stripe.android.paymentsheet.w;
import com.stripe.android.paymentsheet.z;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.I;
import com.uptodown.activities.UptodownTurboActivity;
import com.uptodown.workers.GetUserDataWorker;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import kotlin.jvm.internal.InterfaceC3286s;
import kotlin.jvm.internal.U;
import n2.r;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3769B;
import q5.C3788m;
import q5.C3795t;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class UptodownTurboActivity extends AbstractActivityC2691a {

    /* renamed from: S, reason: collision with root package name */
    public static final a f30235S = new a(null);

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1416k f30236O = Q5.l.b(new Function0() { // from class: F4.M4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.s0 r32;
            r32 = UptodownTurboActivity.r3(UptodownTurboActivity.this);
            return r32;
        }
    });

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1416k f30237P = new ViewModelLazy(U.b(I.class), new k(this), new j(this), new l(null, this));

    /* renamed from: Q, reason: collision with root package name */
    private com.stripe.android.paymentsheet.w f30238Q;

    /* renamed from: R, reason: collision with root package name */
    private final ActivityResultLauncher f30239R;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class b implements v3.p, InterfaceC3286s {
        b() {
        }

        @Override // v3.p
        public final void a(com.stripe.android.paymentsheet.z p02) {
            AbstractC3292y.i(p02, "p0");
            UptodownTurboActivity.this.H3(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof v3.p) && (obj instanceof InterfaceC3286s)) {
                return AbstractC3292y.d(getFunctionDelegate(), ((InterfaceC3286s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3286s
        public final InterfaceC1412g getFunctionDelegate() {
            return new C3289v(1, UptodownTurboActivity.this, UptodownTurboActivity.class, "onPaymentSheetResult", "onPaymentSheetResult(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30241a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UptodownTurboActivity f30243a;

            a(UptodownTurboActivity uptodownTurboActivity) {
                this.f30243a = uptodownTurboActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3769B abstractC3769B, U5.d dVar) {
                if (!AbstractC3292y.d(abstractC3769B, AbstractC3769B.b.f37257a)) {
                    if (abstractC3769B instanceof AbstractC3769B.d) {
                        AbstractC3769B.d dVar2 = (AbstractC3769B.d) abstractC3769B;
                        r.a.c(n2.r.f35413c, this.f30243a, ((I.d) dVar2.a()).c(), null, 4, null);
                        this.f30243a.E3(((I.d) dVar2.a()).b(), ((I.d) dVar2.a()).a());
                    } else if (!AbstractC3292y.d(abstractC3769B, AbstractC3769B.c.f37258a)) {
                        if (AbstractC3292y.d(abstractC3769B, AbstractC3769B.a.f37256a)) {
                            UptodownTurboActivity uptodownTurboActivity = this.f30243a;
                            String string = uptodownTurboActivity.getString(R.string.error_turbo);
                            AbstractC3292y.h(string, "getString(...)");
                            uptodownTurboActivity.Z1(string);
                        } else {
                            throw new Q5.p();
                        }
                    }
                }
                return Q5.I.f8786a;
            }
        }

        c(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30241a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L i9 = UptodownTurboActivity.this.t3().i();
                a aVar = new a(UptodownTurboActivity.this);
                this.f30241a = 1;
                if (i9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30244a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UptodownTurboActivity f30246a;

            a(UptodownTurboActivity uptodownTurboActivity) {
                this.f30246a = uptodownTurboActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void h(T t8, UptodownTurboActivity uptodownTurboActivity, AbstractC3769B abstractC3769B, View view) {
                if (t8 == null) {
                    uptodownTurboActivity.I3();
                    return;
                }
                uptodownTurboActivity.s3().f12933A.setVisibility(0);
                I t32 = uptodownTurboActivity.t3();
                String a9 = ((I.c) ((AbstractC3769B.d) abstractC3769B).a()).b().a();
                String id = t8.getId();
                AbstractC3292y.f(id);
                t32.d(uptodownTurboActivity, a9, id, "year");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void i(T t8, UptodownTurboActivity uptodownTurboActivity, AbstractC3769B abstractC3769B, View view) {
                if (t8 == null) {
                    uptodownTurboActivity.I3();
                    return;
                }
                uptodownTurboActivity.s3().f12933A.setVisibility(0);
                I t32 = uptodownTurboActivity.t3();
                String a9 = ((I.c) ((AbstractC3769B.d) abstractC3769B).a()).a().a();
                String id = t8.getId();
                AbstractC3292y.f(id);
                t32.d(uptodownTurboActivity, a9, id, "month");
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object emit(final AbstractC3769B abstractC3769B, U5.d dVar) {
                if (AbstractC3292y.d(abstractC3769B, AbstractC3769B.b.f37257a)) {
                    this.f30246a.s3().f12987z.setVisibility(0);
                    this.f30246a.s3().f12986y.setVisibility(0);
                } else if (abstractC3769B instanceof AbstractC3769B.d) {
                    final T e8 = T.f15689k.e(this.f30246a);
                    this.f30246a.s3().f12987z.setVisibility(8);
                    this.f30246a.s3().f12986y.setVisibility(8);
                    AbstractC3769B.d dVar2 = (AbstractC3769B.d) abstractC3769B;
                    this.f30246a.s3().f12964c0.setText(((I.c) dVar2.a()).b().b());
                    this.f30246a.s3().f12956X.setText(((I.c) dVar2.a()).a().b());
                    RelativeLayout relativeLayout = this.f30246a.s3().f12935C;
                    final UptodownTurboActivity uptodownTurboActivity = this.f30246a;
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.G
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UptodownTurboActivity.d.a.h(T.this, uptodownTurboActivity, abstractC3769B, view);
                        }
                    });
                    RelativeLayout relativeLayout2 = this.f30246a.s3().f12934B;
                    final UptodownTurboActivity uptodownTurboActivity2 = this.f30246a;
                    relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.H
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UptodownTurboActivity.d.a.i(T.this, uptodownTurboActivity2, abstractC3769B, view);
                        }
                    });
                } else if (!AbstractC3292y.d(abstractC3769B, AbstractC3769B.c.f37258a)) {
                    if (AbstractC3292y.d(abstractC3769B, AbstractC3769B.a.f37256a)) {
                        UptodownTurboActivity uptodownTurboActivity3 = this.f30246a;
                        String string = uptodownTurboActivity3.getString(R.string.error_turbo);
                        AbstractC3292y.h(string, "getString(...)");
                        uptodownTurboActivity3.Z1(string);
                    } else {
                        throw new Q5.p();
                    }
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
            int i8 = this.f30244a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L e9 = UptodownTurboActivity.this.t3().e();
                a aVar = new a(UptodownTurboActivity.this);
                this.f30244a = 1;
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
        int f30247a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UptodownTurboActivity f30249a;

            a(UptodownTurboActivity uptodownTurboActivity) {
                this.f30249a = uptodownTurboActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3769B abstractC3769B, U5.d dVar) {
                if (!AbstractC3292y.d(abstractC3769B, AbstractC3769B.b.f37257a)) {
                    if (abstractC3769B instanceof AbstractC3769B.d) {
                        new C3788m().q(this.f30249a, (String) ((AbstractC3769B.d) abstractC3769B).a(), this.f30249a.getString(R.string.uptodown_turbo));
                    } else if (!AbstractC3292y.d(abstractC3769B, AbstractC3769B.c.f37258a)) {
                        if (AbstractC3292y.d(abstractC3769B, AbstractC3769B.a.f37256a)) {
                            UptodownTurboActivity uptodownTurboActivity = this.f30249a;
                            String string = uptodownTurboActivity.getString(R.string.error_turbo);
                            AbstractC3292y.h(string, "getString(...)");
                            uptodownTurboActivity.Z1(string);
                        } else {
                            throw new Q5.p();
                        }
                    }
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
            int i8 = this.f30247a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L g8 = UptodownTurboActivity.this.t3().g();
                a aVar = new a(UptodownTurboActivity.this);
                this.f30247a = 1;
                if (g8.collect(aVar, this) == e8) {
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
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30250a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f30252c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(g gVar, U5.d dVar) {
            super(2, dVar);
            this.f30252c = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f30252c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30250a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                GetUserDataWorker.a aVar = GetUserDataWorker.f31222b;
                UptodownTurboActivity uptodownTurboActivity = UptodownTurboActivity.this;
                g gVar = this.f30252c;
                this.f30250a = 1;
                if (aVar.b(uptodownTurboActivity, gVar, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements b5.H {
        g() {
        }

        @Override // b5.H
        public void a() {
            UptodownTurboActivity.this.setResult(100);
            UptodownTurboActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends ClickableSpan {
        h() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3292y.i(widget, "widget");
            String string = UptodownTurboActivity.this.getString(R.string.url_support);
            AbstractC3292y.h(string, "getString(...)");
            String string2 = UptodownTurboActivity.this.getString(R.string.support_title);
            AbstractC3292y.h(string2, "getString(...)");
            new C3788m().q(UptodownTurboActivity.this, string, string2);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3292y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(UptodownTurboActivity.this, R.color.blue_primary));
            ds.setTypeface(J4.j.f4395g.u());
            ds.setUnderlineText(false);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends ClickableSpan {
        i() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3292y.i(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3292y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(UptodownTurboActivity.this, R.color.turbo_main));
            ds.setTypeface(J4.j.f4395g.u());
            ds.setUnderlineText(false);
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30256a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f30256a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30256a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30257a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f30257a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30257a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30258a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30259b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30258a = function0;
            this.f30259b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30258a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30259b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public UptodownTurboActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.Q4
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                UptodownTurboActivity.G3(UptodownTurboActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f30239R = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A3(s0 s0Var, View view) {
        if (s0Var.f12943K.getVisibility() == 0) {
            s0Var.f12943K.setVisibility(8);
        } else {
            s0Var.f12943K.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B3(s0 s0Var, View view) {
        if (s0Var.f12944L.getVisibility() == 0) {
            s0Var.f12944L.setVisibility(8);
        } else {
            s0Var.f12944L.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C3(s0 s0Var, View view) {
        if (s0Var.f12945M.getVisibility() == 0) {
            s0Var.f12945M.setVisibility(8);
        } else {
            s0Var.f12945M.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D3(UptodownTurboActivity uptodownTurboActivity, View view) {
        uptodownTurboActivity.t3().h(uptodownTurboActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E3(String str, String str2) {
        com.stripe.android.paymentsheet.w wVar = this.f30238Q;
        if (wVar == null) {
            AbstractC3292y.y("paymentSheet");
            wVar = null;
        }
        String string = getString(R.string.app_name);
        AbstractC3292y.h(string, "getString(...)");
        wVar.a(str, new w.g(string, null, null, null, null, null, true, false, null, str2, null, null, 3518, null));
        F3("shown");
    }

    private final void F3(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        new C3795t(this).e("turbo_stripe_form", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(UptodownTurboActivity uptodownTurboActivity, ActivityResult activityResult) {
        String str;
        if (activityResult.getResultCode() == 1) {
            T e8 = T.f15689k.e(uptodownTurboActivity);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null && e8.x(uptodownTurboActivity)) {
                UptodownApp.a aVar = UptodownApp.f29249C;
                aVar.j0(uptodownTurboActivity);
                aVar.i0(uptodownTurboActivity);
                uptodownTurboActivity.N3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H3(com.stripe.android.paymentsheet.z zVar) {
        if (zVar instanceof z.a) {
            s3().f12933A.setVisibility(8);
            F3("cancelled");
        } else if (zVar instanceof z.c) {
            s3().f12933A.setVisibility(8);
            F3("failed");
        } else {
            if (zVar instanceof z.b) {
                AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.b(), null, new f(new g(), null), 2, null);
                F3("success");
                return;
            }
            throw new Q5.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I3() {
        this.f30239R.launch(new Intent(this, (Class<?>) LoginActivity.class), UptodownApp.f29249C.b(this));
    }

    private final void J3(TextView textView) {
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String obj = textView.getText().toString();
        List<C2051p> d8 = C2051p.f15893f.d(obj, "\\[xx](.*?)\\[/xx]");
        SpannableString spannableString = new SpannableString(new l6.j("\\[xx](.*?)\\[/xx]").g(obj, new Function1() { // from class: F4.P4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CharSequence K32;
                K32 = UptodownTurboActivity.K3((l6.h) obj2);
                return K32;
            }
        }));
        for (C2051p c2051p : d8) {
            int R8 = l6.n.R(spannableString, c2051p.d(), 0, false, 6, null);
            int length = c2051p.d().length() + R8;
            if (R8 >= 0) {
                spannableString.setSpan(new h(), R8, length, 33);
            }
        }
        textView.setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence K3(l6.h it) {
        AbstractC3292y.i(it, "it");
        return (CharSequence) it.a().get(1);
    }

    private final void L3(TextView textView) {
        String obj = textView.getText().toString();
        List<C2051p> d8 = C2051p.f15893f.d(obj, "\\[xx](.*?)\\[/xx]");
        SpannableString spannableString = new SpannableString(new l6.j("\\[xx](.*?)\\[/xx]").g(obj, new Function1() { // from class: F4.O4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CharSequence M32;
                M32 = UptodownTurboActivity.M3((l6.h) obj2);
                return M32;
            }
        }));
        for (C2051p c2051p : d8) {
            int R8 = l6.n.R(spannableString, c2051p.d(), 0, false, 6, null);
            int length = c2051p.d().length() + R8;
            if (R8 >= 0) {
                spannableString.setSpan(new i(), R8, length, 33);
            }
        }
        textView.setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence M3(l6.h it) {
        AbstractC3292y.i(it, "it");
        return (CharSequence) it.a().get(1);
    }

    private final void N3() {
        T e8 = T.f15689k.e(this);
        s0 s32 = s3();
        if (e8 != null && e8.y()) {
            s32.f12955W.setVisibility(0);
            s32.f12934B.setVisibility(8);
            s32.f12936D.setVisibility(8);
            s32.f12960a0.setVisibility(8);
            return;
        }
        s32.f12955W.setVisibility(8);
        s32.f12934B.setVisibility(0);
        s32.f12936D.setVisibility(0);
        s32.f12960a0.setVisibility(0);
        t3().f(this);
    }

    private final void q3(ImageView imageView, long j8) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "translationY", -20.0f, 40.0f);
        ofFloat.setDuration(j8);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s0 r3(UptodownTurboActivity uptodownTurboActivity) {
        return s0.c(uptodownTurboActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s0 s3() {
        return (s0) this.f30236O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final I t3() {
        return (I) this.f30237P.getValue();
    }

    private final void u3() {
        final s0 s32 = s3();
        s32.f12963c.setOnClickListener(new View.OnClickListener() { // from class: F4.R4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.v3(UptodownTurboActivity.this, view);
            }
        });
        s32.f12961b.b(s3().getRoot(), new C5.e(this)).b(getWindow().getDecorView().getBackground()).d(20.0f);
        TextView textView = s32.f12938F;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.v());
        TextView tvDescTurbo = s32.f12938F;
        AbstractC3292y.h(tvDescTurbo, "tvDescTurbo");
        L3(tvDescTurbo);
        s32.f12962b0.setTypeface(aVar.u());
        s32.f12964c0.setTypeface(aVar.u());
        s32.f12956X.setTypeface(aVar.u());
        s32.f12955W.setTypeface(aVar.u());
        s32.f12960a0.setTypeface(aVar.v());
        s32.f12957Y.setTypeface(aVar.u());
        s32.f12958Z.setTypeface(aVar.u());
        s32.f12939G.setTypeface(aVar.u());
        s32.f12954V.setTypeface(aVar.u());
        s32.f12952T.setTypeface(aVar.u());
        s32.f12946N.setTypeface(aVar.u());
        s32.f12940H.setTypeface(aVar.v());
        s32.f12947O.setTypeface(aVar.u());
        s32.f12941I.setTypeface(aVar.v());
        s32.f12948P.setTypeface(aVar.u());
        s32.f12942J.setTypeface(aVar.v());
        s32.f12949Q.setTypeface(aVar.u());
        s32.f12943K.setTypeface(aVar.v());
        s32.f12950R.setTypeface(aVar.u());
        s32.f12944L.setTypeface(aVar.v());
        s32.f12951S.setTypeface(aVar.u());
        s32.f12945M.setTypeface(aVar.v());
        s32.f12933A.setOnClickListener(new View.OnClickListener() { // from class: F4.S4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.w3(view);
            }
        });
        s32.f12978q.setOnClickListener(new View.OnClickListener() { // from class: F4.T4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.x3(Y4.s0.this, view);
            }
        });
        s32.f12979r.setOnClickListener(new View.OnClickListener() { // from class: F4.U4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.y3(Y4.s0.this, view);
            }
        });
        s32.f12980s.setOnClickListener(new View.OnClickListener() { // from class: F4.V4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.z3(Y4.s0.this, view);
            }
        });
        s32.f12981t.setOnClickListener(new View.OnClickListener() { // from class: F4.W4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.A3(Y4.s0.this, view);
            }
        });
        s32.f12982u.setOnClickListener(new View.OnClickListener() { // from class: F4.X4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.B3(Y4.s0.this, view);
            }
        });
        s32.f12983v.setOnClickListener(new View.OnClickListener() { // from class: F4.Y4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.C3(Y4.s0.this, view);
            }
        });
        s32.f12955W.setOnClickListener(new View.OnClickListener() { // from class: F4.N4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.D3(UptodownTurboActivity.this, view);
            }
        });
        s32.f12953U.setTypeface(aVar.v());
        TextView tvFooterTurbo = s32.f12953U;
        AbstractC3292y.h(tvFooterTurbo, "tvFooterTurbo");
        J3(tvFooterTurbo);
        ImageView ivDiamond1Turbo = s32.f12966e;
        AbstractC3292y.h(ivDiamond1Turbo, "ivDiamond1Turbo");
        q3(ivDiamond1Turbo, 3000L);
        ImageView ivDiamond2Turbo = s32.f12967f;
        AbstractC3292y.h(ivDiamond2Turbo, "ivDiamond2Turbo");
        q3(ivDiamond2Turbo, 5000L);
        ImageView ivDiamond3Turbo = s32.f12968g;
        AbstractC3292y.h(ivDiamond3Turbo, "ivDiamond3Turbo");
        q3(ivDiamond3Turbo, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        N3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(UptodownTurboActivity uptodownTurboActivity, View view) {
        uptodownTurboActivity.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(s0 s0Var, View view) {
        if (s0Var.f12940H.getVisibility() == 0) {
            s0Var.f12940H.setVisibility(8);
        } else {
            s0Var.f12940H.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(s0 s0Var, View view) {
        if (s0Var.f12941I.getVisibility() == 0) {
            s0Var.f12941I.setVisibility(8);
        } else {
            s0Var.f12941I.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z3(s0 s0Var, View view) {
        if (s0Var.f12942J.getVisibility() == 0) {
            s0Var.f12942J.setVisibility(8);
        } else {
            s0Var.f12942J.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(s3().getRoot());
        u3();
        Bundle bundle2 = new Bundle();
        bundle2.putString("type", "shown");
        new C3795t(this).e("turbo_landing", bundle2);
        this.f30238Q = new com.stripe.android.paymentsheet.w(this, new b());
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new c(null), 2, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new d(null), 2, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new e(null), 2, null);
    }
}
