package com.uptodown.activities;

import J4.j;
import Q5.InterfaceC1416k;
import Y4.C1501a0;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.activities.PasswordRecoveryActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import org.json.JSONObject;
import q5.C3775H;

/* loaded from: classes4.dex */
public final class PasswordRecoveryActivity extends AbstractActivityC2691a {

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1416k f30014O = Q5.l.b(new Function0() { // from class: F4.n3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            C1501a0 f32;
            f32 = PasswordRecoveryActivity.f3(PasswordRecoveryActivity.this);
            return f32;
        }
    });

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30015a;

        a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30015a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                PasswordRecoveryActivity passwordRecoveryActivity = PasswordRecoveryActivity.this;
                this.f30015a = 1;
                if (passwordRecoveryActivity.h3(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30017a;

        /* renamed from: b, reason: collision with root package name */
        Object f30018b;

        /* renamed from: c, reason: collision with root package name */
        Object f30019c;

        /* renamed from: d, reason: collision with root package name */
        Object f30020d;

        /* renamed from: e, reason: collision with root package name */
        Object f30021e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f30022f;

        /* renamed from: h, reason: collision with root package name */
        int f30024h;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30022f = obj;
            this.f30024h |= Integer.MIN_VALUE;
            return PasswordRecoveryActivity.this.h3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30025a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f30026b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PasswordRecoveryActivity f30027c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f30028d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f30029e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(T t8, PasswordRecoveryActivity passwordRecoveryActivity, T t9, T t10, U5.d dVar) {
            super(2, dVar);
            this.f30026b = t8;
            this.f30027c = passwordRecoveryActivity;
            this.f30028d = t9;
            this.f30029e = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f30026b, this.f30027c, this.f30028d, this.f30029e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30025a == 0) {
                Q5.t.b(obj);
                this.f30026b.f34573a = this.f30027c.getString(R.string.error_generico);
                this.f30027c.i3().f12473d.f12236b.setVisibility(0);
                this.f30028d.f34573a = this.f30027c.i3().f12472c.getText().toString();
                this.f30029e.f34573a = this.f30027c.i3().f12471b.getText().toString();
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30030a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f30032c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f30033d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f30034e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Q f30035f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30036a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Q f30037b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c5.K f30038c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ PasswordRecoveryActivity f30039d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ T f30040e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Q q8, c5.K k8, PasswordRecoveryActivity passwordRecoveryActivity, T t8, U5.d dVar) {
                super(2, dVar);
                this.f30037b = q8;
                this.f30038c = k8;
                this.f30039d = passwordRecoveryActivity;
                this.f30040e = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f30037b, this.f30038c, this.f30039d, this.f30040e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30036a == 0) {
                    Q5.t.b(obj);
                    if (this.f30037b.f34571a == 0 || this.f30038c.b()) {
                        this.f30039d.m3((String) this.f30040e.f34573a);
                    } else {
                        PasswordRecoveryActivity passwordRecoveryActivity = this.f30039d;
                        passwordRecoveryActivity.m3(passwordRecoveryActivity.getString(R.string.msg_success_recuperar_pass));
                        this.f30039d.finish();
                    }
                    this.f30039d.i3().f12473d.f12236b.setVisibility(8);
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
        d(T t8, T t9, T t10, Q q8, U5.d dVar) {
            super(2, dVar);
            this.f30032c = t8;
            this.f30033d = t9;
            this.f30034e = t10;
            this.f30035f = q8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f30032c, this.f30033d, this.f30034e, this.f30035f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30030a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                c5.K K02 = new C3775H(PasswordRecoveryActivity.this).K0((String) this.f30032c.f34573a, (String) this.f30033d.f34573a);
                if (K02.d() != null) {
                    String d8 = K02.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = K02.d();
                        AbstractC3292y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        this.f30034e.f34573a = K02.g(jSONObject);
                        if (!jSONObject.isNull("success")) {
                            this.f30035f.f34571a = jSONObject.getInt("success");
                        }
                    }
                }
                J0 c8 = C3445b0.c();
                a aVar = new a(this.f30035f, K02, PasswordRecoveryActivity.this, this.f30034e, null);
                this.f30030a = 1;
                if (AbstractC3458i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1501a0 f3(PasswordRecoveryActivity passwordRecoveryActivity) {
        return C1501a0.c(passwordRecoveryActivity.getLayoutInflater());
    }

    private final void g3() {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h3(U5.d r23) {
        /*
            r22 = this;
            r6 = r22
            r0 = r23
            boolean r1 = r0 instanceof com.uptodown.activities.PasswordRecoveryActivity.b
            if (r1 == 0) goto L18
            r1 = r0
            com.uptodown.activities.PasswordRecoveryActivity$b r1 = (com.uptodown.activities.PasswordRecoveryActivity.b) r1
            int r2 = r1.f30024h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f30024h = r2
        L16:
            r7 = r1
            goto L1e
        L18:
            com.uptodown.activities.PasswordRecoveryActivity$b r1 = new com.uptodown.activities.PasswordRecoveryActivity$b
            r1.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r7.f30022f
            java.lang.Object r8 = V5.b.e()
            int r1 = r7.f30024h
            r9 = 2
            r10 = 1
            if (r1 == 0) goto L5d
            if (r1 == r10) goto L3b
            if (r1 != r9) goto L33
            Q5.t.b(r0)
            goto Lc6
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            java.lang.Object r1 = r7.f30021e
            kotlin.jvm.internal.T r1 = (kotlin.jvm.internal.T) r1
            java.lang.Object r2 = r7.f30020d
            kotlin.jvm.internal.T r2 = (kotlin.jvm.internal.T) r2
            java.lang.Object r3 = r7.f30019c
            kotlin.jvm.internal.T r3 = (kotlin.jvm.internal.T) r3
            java.lang.Object r4 = r7.f30018b
            kotlin.jvm.internal.Q r4 = (kotlin.jvm.internal.Q) r4
            java.lang.Object r5 = r7.f30017a
            com.uptodown.activities.PasswordRecoveryActivity r5 = (com.uptodown.activities.PasswordRecoveryActivity) r5
            Q5.t.b(r0)
            r18 = r1
            r17 = r2
            r19 = r3
            r20 = r4
            r16 = r5
            goto La5
        L5d:
            Q5.t.b(r0)
            kotlin.jvm.internal.Q r11 = new kotlin.jvm.internal.Q
            r11.<init>()
            kotlin.jvm.internal.T r12 = new kotlin.jvm.internal.T
            r12.<init>()
            kotlin.jvm.internal.T r13 = new kotlin.jvm.internal.T
            r13.<init>()
            kotlin.jvm.internal.T r14 = new kotlin.jvm.internal.T
            r14.<init>()
            n6.J0 r15 = n6.C3445b0.c()
            com.uptodown.activities.PasswordRecoveryActivity$c r5 = new com.uptodown.activities.PasswordRecoveryActivity$c
            r16 = 0
            r0 = r5
            r1 = r12
            r2 = r22
            r3 = r13
            r4 = r14
            r9 = r5
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r7.f30017a = r6
            r7.f30018b = r11
            r7.f30019c = r12
            r7.f30020d = r13
            r7.f30021e = r14
            r7.f30024h = r10
            java.lang.Object r0 = n6.AbstractC3458i.g(r15, r9, r7)
            if (r0 != r8) goto L9b
            return r8
        L9b:
            r16 = r6
            r20 = r11
            r19 = r12
            r17 = r13
            r18 = r14
        La5:
            n6.I r0 = n6.C3445b0.b()
            com.uptodown.activities.PasswordRecoveryActivity$d r1 = new com.uptodown.activities.PasswordRecoveryActivity$d
            r21 = 0
            r15 = r1
            r15.<init>(r17, r18, r19, r20, r21)
            r2 = 0
            r7.f30017a = r2
            r7.f30018b = r2
            r7.f30019c = r2
            r7.f30020d = r2
            r7.f30021e = r2
            r2 = 2
            r7.f30024h = r2
            java.lang.Object r0 = n6.AbstractC3458i.g(r0, r1, r7)
            if (r0 != r8) goto Lc6
            return r8
        Lc6:
            Q5.I r0 = Q5.I.f8786a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.PasswordRecoveryActivity.h3(U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1501a0 i3() {
        return (C1501a0) this.f30014O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(PasswordRecoveryActivity passwordRecoveryActivity, View view) {
        passwordRecoveryActivity.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(PasswordRecoveryActivity passwordRecoveryActivity, View view) {
        if (!l6.n.s(passwordRecoveryActivity.i3().f12472c.getText().toString(), "", true) && !l6.n.s(passwordRecoveryActivity.i3().f12471b.getText().toString(), "", true)) {
            if (!l6.n.s(passwordRecoveryActivity.i3().f12472c.getText().toString(), passwordRecoveryActivity.i3().f12471b.getText().toString(), true)) {
                passwordRecoveryActivity.m3(passwordRecoveryActivity.getString(R.string.error_emails_no_coinciden));
                return;
            } else {
                passwordRecoveryActivity.g3();
                return;
            }
        }
        passwordRecoveryActivity.m3(passwordRecoveryActivity.getString(R.string.error_email_vacio_recuperar_pass));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m3(String str) {
        if (str != null) {
            Toast makeText = Toast.makeText(this, str, 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(i3().getRoot());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_password_recovery);
        if (toolbar != null) {
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
            if (drawable != null) {
                toolbar.setNavigationIcon(drawable);
                toolbar.setNavigationContentDescription(getString(R.string.back));
                toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.o3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PasswordRecoveryActivity.j3(PasswordRecoveryActivity.this, view);
                    }
                });
            }
            TextView textView = (TextView) findViewById(R.id.tv_title_toolbar_password_recovery);
            if (textView != null) {
                textView.setTypeface(J4.j.f4395g.u());
            }
        }
        EditText editText = i3().f12472c;
        j.a aVar = J4.j.f4395g;
        editText.setTypeface(aVar.v());
        i3().f12471b.setTypeface(aVar.v());
        i3().f12475f.setTypeface(aVar.u());
        i3().f12475f.setOnClickListener(new View.OnClickListener() { // from class: F4.p3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PasswordRecoveryActivity.k3(PasswordRecoveryActivity.this, view);
            }
        });
        i3().f12473d.f12236b.setOnClickListener(new View.OnClickListener() { // from class: F4.q3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PasswordRecoveryActivity.l3(view);
            }
        });
    }
}
