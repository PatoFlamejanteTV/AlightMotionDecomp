package F4;

import J4.j;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.LifecycleOwnerKt;
import c6.InterfaceC2072n;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.tasks.Task;
import com.uptodown.R;
import com.uptodown.activities.AbstractActivityC2691a;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.C3795t;
import q5.C3798w;

/* renamed from: F4.z0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC1214z0 extends AbstractActivityC2691a {

    /* renamed from: O, reason: collision with root package name */
    private TextView f2664O;

    /* renamed from: P, reason: collision with root package name */
    private com.google.android.gms.auth.api.signin.b f2665P;

    /* renamed from: Q, reason: collision with root package name */
    private final ActivityResultLauncher f2666Q;

    /* renamed from: R, reason: collision with root package name */
    private final ActivityResultLauncher f2667R;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F4.z0$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f2668a;

        /* renamed from: b, reason: collision with root package name */
        int f2669b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ GoogleSignInAccount f2670c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC1214z0 f2671d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: F4.z0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0038a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f2672a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC1214z0 f2673b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0038a(AbstractActivityC1214z0 abstractActivityC1214z0, U5.d dVar) {
                super(2, dVar);
                this.f2673b = abstractActivityC1214z0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0038a(this.f2673b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f2672a == 0) {
                    Q5.t.b(obj);
                    this.f2673b.q3();
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((C0038a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: F4.z0$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f2674a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3798w f2675b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC1214z0 f2676c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C3798w c3798w, AbstractActivityC1214z0 abstractActivityC1214z0, U5.d dVar) {
                super(2, dVar);
                this.f2675b = c3798w;
                this.f2676c = abstractActivityC1214z0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f2675b, this.f2676c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f2674a == 0) {
                    Q5.t.b(obj);
                    if (this.f2675b.e()) {
                        this.f2676c.p3(this.f2675b.c(), this.f2675b.b());
                        this.f2676c.setResult(-1);
                    } else {
                        this.f2676c.n3(this.f2675b.c());
                        this.f2676c.r3();
                        this.f2676c.setResult(1);
                        Bundle bundle = new Bundle();
                        bundle.putString("type", "success");
                        bundle.putString("loginSource", "google");
                        C3795t q22 = this.f2676c.q2();
                        if (q22 != null) {
                            q22.e("login", bundle);
                        }
                    }
                    this.f2676c.f3();
                    c5.T e8 = c5.T.f15689k.e(this.f2676c);
                    if (e8 != null && e8.x(this.f2676c)) {
                        this.f2676c.finish();
                    } else {
                        this.f2676c.getOnBackPressedDispatcher().onBackPressed();
                    }
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(GoogleSignInAccount googleSignInAccount, AbstractActivityC1214z0 abstractActivityC1214z0, U5.d dVar) {
            super(2, dVar);
            this.f2670c = googleSignInAccount;
            this.f2671d = abstractActivityC1214z0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f2670c, this.f2671d, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r8.f2669b
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                Q5.t.b(r9)
                goto L8b
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f2668a
                q5.w r1 = (q5.C3798w) r1
                Q5.t.b(r9)
                goto L75
            L27:
                java.lang.Object r1 = r8.f2668a
                q5.w r1 = (q5.C3798w) r1
                Q5.t.b(r9)
                goto L4e
            L2f:
                Q5.t.b(r9)
                q5.w r9 = new q5.w
                r9.<init>()
                n6.J0 r1 = n6.C3445b0.c()
                F4.z0$a$a r6 = new F4.z0$a$a
                F4.z0 r7 = r8.f2671d
                r6.<init>(r7, r5)
                r8.f2668a = r9
                r8.f2669b = r4
                java.lang.Object r1 = n6.AbstractC3458i.g(r1, r6, r8)
                if (r1 != r0) goto L4d
                return r0
            L4d:
                r1 = r9
            L4e:
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r9 = r8.f2670c
                java.lang.String r9 = r9.z()
                if (r9 == 0) goto L75
                int r9 = r9.length()
                if (r9 != 0) goto L5d
                goto L75
            L5d:
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r9 = r8.f2670c
                java.lang.String r9 = r9.z()
                kotlin.jvm.internal.AbstractC3292y.f(r9)
                F4.z0 r4 = r8.f2671d
                r8.f2668a = r1
                r8.f2669b = r3
                java.lang.String r3 = "google"
                java.lang.Object r9 = r1.g(r9, r3, r4, r8)
                if (r9 != r0) goto L75
                return r0
            L75:
                n6.J0 r9 = n6.C3445b0.c()
                F4.z0$a$b r3 = new F4.z0$a$b
                F4.z0 r4 = r8.f2671d
                r3.<init>(r1, r4, r5)
                r8.f2668a = r5
                r8.f2669b = r2
                java.lang.Object r9 = n6.AbstractC3458i.g(r9, r3, r8)
                if (r9 != r0) goto L8b
                return r0
            L8b:
                Q5.I r9 = Q5.I.f8786a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: F4.AbstractActivityC1214z0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F4.z0$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f2677a;

        /* renamed from: b, reason: collision with root package name */
        int f2678b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ GoogleSignInAccount f2679c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC1214z0 f2680d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: F4.z0$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f2681a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3798w f2682b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC1214z0 f2683c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3798w c3798w, AbstractActivityC1214z0 abstractActivityC1214z0, U5.d dVar) {
                super(2, dVar);
                this.f2682b = c3798w;
                this.f2683c = abstractActivityC1214z0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f2682b, this.f2683c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f2681a == 0) {
                    Q5.t.b(obj);
                    if (!this.f2682b.e()) {
                        this.f2683c.o3(this.f2682b.c());
                        Toast.makeText(this.f2683c, R.string.login_successful, 0).show();
                        this.f2683c.setResult(1);
                        Bundle bundle = new Bundle();
                        bundle.putString("type", "success");
                        bundle.putString("loginSource", "google");
                        C3795t q22 = this.f2683c.q2();
                        if (q22 != null) {
                            q22.e("login", bundle);
                        }
                    } else {
                        this.f2683c.setResult(-1);
                    }
                    c5.T e8 = c5.T.f15689k.e(this.f2683c);
                    if (e8 != null && e8.x(this.f2683c)) {
                        this.f2683c.h3();
                        this.f2683c.m3();
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(GoogleSignInAccount googleSignInAccount, AbstractActivityC1214z0 abstractActivityC1214z0, U5.d dVar) {
            super(2, dVar);
            this.f2679c = googleSignInAccount;
            this.f2680d = abstractActivityC1214z0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f2679c, this.f2680d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C3798w c3798w;
            Object e8 = V5.b.e();
            int i8 = this.f2678b;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        Q5.t.b(obj);
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3798w = (C3798w) this.f2677a;
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                c3798w = new C3798w();
                String z8 = this.f2679c.z();
                if (z8 != null && z8.length() != 0) {
                    String z9 = this.f2679c.z();
                    AbstractC3292y.f(z9);
                    AbstractActivityC1214z0 abstractActivityC1214z0 = this.f2680d;
                    this.f2677a = c3798w;
                    this.f2678b = 1;
                    if (c3798w.g(z9, "google", abstractActivityC1214z0, this) == e8) {
                        return e8;
                    }
                }
            }
            n6.J0 c8 = C3445b0.c();
            a aVar = new a(c3798w, this.f2680d, null);
            this.f2677a = null;
            this.f2678b = 2;
            if (AbstractC3458i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public AbstractActivityC1214z0() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.x0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AbstractActivityC1214z0.i3(AbstractActivityC1214z0.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f2666Q = registerForActivityResult;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.y0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AbstractActivityC1214z0.j3(AbstractActivityC1214z0.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult2, "registerForActivityResult(...)");
        this.f2667R = registerForActivityResult2;
    }

    private final void d3(RelativeLayout relativeLayout) {
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: F4.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC1214z0.e3(AbstractActivityC1214z0.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(AbstractActivityC1214z0 abstractActivityC1214z0, View view) {
        abstractActivityC1214z0.q3();
        abstractActivityC1214z0.k3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(AbstractActivityC1214z0 abstractActivityC1214z0, ActivityResult activityResult) {
        GoogleSignInAccount googleSignInAccount;
        if (activityResult.getData() != null) {
            Task b9 = com.google.android.gms.auth.api.signin.a.b(activityResult.getData());
            AbstractC3292y.h(b9, "getSignedInAccountFromIntent(...)");
            if (b9.n() && (googleSignInAccount = (GoogleSignInAccount) b9.j()) != null) {
                AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(abstractActivityC1214z0), null, null, new a(googleSignInAccount, abstractActivityC1214z0, null), 3, null);
            }
        }
        abstractActivityC1214z0.f3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(AbstractActivityC1214z0 abstractActivityC1214z0, ActivityResult activityResult) {
        GoogleSignInAccount googleSignInAccount;
        if (activityResult.getData() != null) {
            Task b9 = com.google.android.gms.auth.api.signin.a.b(activityResult.getData());
            AbstractC3292y.h(b9, "getSignedInAccountFromIntent(...)");
            if (b9.n() && (googleSignInAccount = (GoogleSignInAccount) b9.j()) != null) {
                AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(abstractActivityC1214z0), null, null, new b(googleSignInAccount, abstractActivityC1214z0, null), 3, null);
            }
        }
    }

    private final void k3() {
        com.google.android.gms.auth.api.signin.b bVar = this.f2665P;
        AbstractC3292y.f(bVar);
        Intent s8 = bVar.s();
        AbstractC3292y.h(s8, "getSignInIntent(...)");
        this.f2666Q.launch(s8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o3(c5.T t8) {
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

    public final TextView c3() {
        return this.f2664O;
    }

    protected abstract void f3();

    public final void g3(Y4.L binding) {
        AbstractC3292y.i(binding, "binding");
        TextView textView = binding.f12268c.f12280i;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        RelativeLayout rlGoogleLogin = binding.f12268c.f12277f;
        AbstractC3292y.h(rlGoogleLogin, "rlGoogleLogin");
        d3(rlGoogleLogin);
        binding.f12269d.f12845k.setTypeface(aVar.u());
        RelativeLayout rlGoogleLogin2 = binding.f12269d.f12842h;
        AbstractC3292y.h(rlGoogleLogin2, "rlGoogleLogin");
        d3(rlGoogleLogin2);
    }

    public c5.T h3() {
        return null;
    }

    public final void l3() {
        Intent s8 = new C3798w().d(this).s();
        AbstractC3292y.h(s8, "getSignInIntent(...)");
        this.f2667R.launch(s8);
    }

    protected abstract void n3(c5.T t8);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2665P = new C3798w().d(this);
    }

    protected abstract void p3(c5.T t8, String str);

    protected abstract void q3();

    protected abstract void r3();

    public void m3() {
    }
}
