package com.stripe.android.view;

import Q5.C1413h;
import Q5.InterfaceC1416k;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.view.C2665n0;
import e4.C2817a;
import k3.C3237c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import n2.AbstractC3390A;
import n2.AbstractC3393D;
import n6.AbstractC3462k;
import p3.i;
import q6.AbstractC3815N;
import q6.InterfaceC3822g;
import v2.d;
import x2.k;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaymentAuthWebViewActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f28708a = Q5.l.b(new j());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1416k f28709b = Q5.l.b(new a());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1416k f28710c = Q5.l.b(new b());

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1416k f28711d = new ViewModelLazy(kotlin.jvm.internal.U.b(C2665n0.class), new h(this), new k(), new i(null, this));

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentBrowserAuthContract.a invoke() {
            PaymentBrowserAuthContract.b bVar = PaymentBrowserAuthContract.f24688a;
            Intent intent = PaymentAuthWebViewActivity.this.getIntent();
            AbstractC3292y.h(intent, "getIntent(...)");
            return bVar.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v2.d invoke() {
            d.a aVar = v2.d.f40434a;
            PaymentBrowserAuthContract.a u8 = PaymentAuthWebViewActivity.this.u();
            boolean z8 = false;
            if (u8 != null && u8.f()) {
                z8 = true;
            }
            return aVar.a(z8);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OnBackPressedCallback) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(OnBackPressedCallback addCallback) {
            AbstractC3292y.i(addCallback, "$this$addCallback");
            if (PaymentAuthWebViewActivity.this.s().f5351d.canGoBack()) {
                PaymentAuthWebViewActivity.this.s().f5351d.goBack();
            } else {
                PaymentAuthWebViewActivity.this.o();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f28715a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q6.w f28716b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PaymentAuthWebViewActivity f28717c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentAuthWebViewActivity f28718a;

            a(PaymentAuthWebViewActivity paymentAuthWebViewActivity) {
                this.f28718a = paymentAuthWebViewActivity;
            }

            public final Object b(boolean z8, U5.d dVar) {
                if (z8) {
                    CircularProgressIndicator progressBar = this.f28718a.s().f5349b;
                    AbstractC3292y.h(progressBar, "progressBar");
                    progressBar.setVisibility(8);
                }
                return Q5.I.f8786a;
            }

            @Override // q6.InterfaceC3822g
            public /* bridge */ /* synthetic */ Object emit(Object obj, U5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(q6.w wVar, PaymentAuthWebViewActivity paymentAuthWebViewActivity, U5.d dVar) {
            super(2, dVar);
            this.f28716b = wVar;
            this.f28717c = paymentAuthWebViewActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f28716b, this.f28717c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f28715a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                q6.w wVar = this.f28716b;
                a aVar = new a(this.f28717c);
                this.f28715a = 1;
                if (wVar.collect(aVar, this) == e8) {
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
    static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2667o0 f28719a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C2667o0 c2667o0) {
            super(0);
            this.f28719a = c2667o0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5535invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5535invoke() {
            this.f28719a.j(true);
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class f extends C3289v implements Function1 {
        f(Object obj) {
            super(1, obj, PaymentAuthWebViewActivity.class, "startActivity", "startActivity(Landroid/content/Intent;)V", 0);
        }

        public final void d(Intent intent) {
            ((PaymentAuthWebViewActivity) this.receiver).startActivity(intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((Intent) obj);
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class g extends C3289v implements Function1 {
        g(Object obj) {
            super(1, obj, PaymentAuthWebViewActivity.class, "onAuthComplete", "onAuthComplete$payments_core_release(Ljava/lang/Throwable;)V", 0);
        }

        public final void d(Throwable th) {
            ((PaymentAuthWebViewActivity) this.receiver).v(th);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((Throwable) obj);
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28720a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f28720a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28720a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28721a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28722b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28721a = function0;
            this.f28722b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28721a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28722b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3293z implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L2.o invoke() {
            L2.o c8 = L2.o.c(PaymentAuthWebViewActivity.this.getLayoutInflater());
            AbstractC3292y.h(c8, "inflate(...)");
            return c8;
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends AbstractC3293z implements Function0 {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            Application application = PaymentAuthWebViewActivity.this.getApplication();
            AbstractC3292y.h(application, "getApplication(...)");
            v2.d r8 = PaymentAuthWebViewActivity.this.r();
            PaymentBrowserAuthContract.a u8 = PaymentAuthWebViewActivity.this.u();
            if (u8 != null) {
                return new C2665n0.a(application, r8, u8);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        setResult(-1, t().d());
        finish();
    }

    private final Intent p(C3237c c3237c) {
        Intent putExtras = new Intent().putExtras(c3237c.u());
        AbstractC3292y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    private final void q() {
        r().b("PaymentAuthWebViewActivity#customizeToolbar()");
        C2665n0.b h8 = t().h();
        if (h8 != null) {
            r().b("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar title");
            s().f5350c.setTitle(C2817a.f31704a.b(this, h8.a(), h8.b()));
        }
        String g8 = t().g();
        if (g8 != null) {
            r().b("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar background color");
            int parseColor = Color.parseColor(g8);
            s().f5350c.setBackgroundColor(parseColor);
            C2817a.f31704a.e(this, parseColor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v2.d r() {
        return (v2.d) this.f28710c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L2.o s() {
        return (L2.o) this.f28708a.getValue();
    }

    private final C2665n0 t() {
        return (C2665n0) this.f28711d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentBrowserAuthContract.a u() {
        return (PaymentBrowserAuthContract.a) this.f28709b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentBrowserAuthContract.a u8 = u();
        if (u8 == null) {
            setResult(0);
            finish();
            i.a aVar = p3.i.f36196a;
            Context applicationContext = getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            i.b.a(i.a.b(aVar, applicationContext, null, 2, null), i.d.f36199c, null, null, 6, null);
            return;
        }
        r().b("PaymentAuthWebViewActivity#onCreate()");
        setContentView(s().getRoot());
        setSupportActionBar(s().f5350c);
        q();
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        AbstractC3292y.h(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new c(), 3, null);
        String d8 = u8.d();
        setResult(-1, p(t().f()));
        if (l6.n.T(d8)) {
            r().b("PaymentAuthWebViewActivity#onCreate() - clientSecret is blank");
            finish();
            i.a aVar2 = p3.i.f36196a;
            Context applicationContext2 = getApplicationContext();
            AbstractC3292y.h(applicationContext2, "getApplicationContext(...)");
            i.b.a(i.a.b(aVar2, applicationContext2, null, 2, null), i.f.f36231b, null, null, 6, null);
            return;
        }
        r().b("PaymentAuthWebViewActivity#onCreate() - PaymentAuthWebView init and loadUrl");
        q6.w a9 = AbstractC3815N.a(Boolean.FALSE);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(a9, this, null), 3, null);
        C2667o0 c2667o0 = new C2667o0(r(), a9, d8, u8.A(), new f(this), new g(this));
        s().f5351d.setOnLoadBlank$payments_core_release(new e(c2667o0));
        s().f5351d.setWebViewClient(c2667o0);
        s().f5351d.setWebChromeClient(new C2663m0(this, r()));
        t().k();
        s().f5351d.loadUrl(u8.y(), t().e());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        AbstractC3292y.i(menu, "menu");
        r().b("PaymentAuthWebViewActivity#onCreateOptionsMenu()");
        getMenuInflater().inflate(AbstractC3393D.f35179b, menu);
        String c8 = t().c();
        if (c8 != null) {
            r().b("PaymentAuthWebViewActivity#customizeToolbar() - updating close button text");
            menu.findItem(AbstractC3390A.f35115a).setTitle(c8);
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        s().f5352e.removeAllViews();
        s().f5351d.destroy();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        AbstractC3292y.i(item, "item");
        r().b("PaymentAuthWebViewActivity#onOptionsItemSelected()");
        if (item.getItemId() == AbstractC3390A.f35115a) {
            o();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public final void v(Throwable th) {
        if (th != null) {
            i.a aVar = p3.i.f36196a;
            Context applicationContext = getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            p3.i b9 = i.a.b(aVar, applicationContext, null, 2, null);
            i.d dVar = i.d.f36198b;
            k.a aVar2 = x2.k.f40948e;
            i.b.a(b9, dVar, aVar2.b(th), null, 4, null);
            t().j();
            setResult(-1, p(C3237c.b(t().f(), null, 2, aVar2.b(th), true, null, null, null, 113, null)));
        } else {
            t().i();
        }
        finish();
    }
}
