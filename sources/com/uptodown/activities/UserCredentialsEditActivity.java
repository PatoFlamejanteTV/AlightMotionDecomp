package com.uptodown.activities;

import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import Y4.B0;
import Y4.Z;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import c5.T;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.uptodown.R;
import com.uptodown.activities.M;
import com.uptodown.activities.UserCredentialsEditActivity;
import com.uptodown.util.views.UsernameTextView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.U;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class UserCredentialsEditActivity extends AbstractActivityC2691a {

    /* renamed from: O, reason: collision with root package name */
    private T f30300O;

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1416k f30301P = new ViewModelLazy(U.b(M.class), new e(this), new d(this), new f(null, this));

    /* renamed from: Q, reason: collision with root package name */
    private Z f30302Q;

    /* renamed from: R, reason: collision with root package name */
    private B0 f30303R;

    /* loaded from: classes4.dex */
    public static final class a implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ B0 f30304a;

        public a(B0 b02) {
            this.f30304a = b02;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            this.f30304a.f12101o.setText(charSequence);
            this.f30304a.f12102p.setText(charSequence);
            this.f30304a.f12103q.setText(charSequence);
            this.f30304a.f12104r.setText(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30305a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ B0 f30307c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Q f30308d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.T f30309e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B0 f30310a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Q f30311b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.T f30312c;

            a(B0 b02, Q q8, kotlin.jvm.internal.T t8) {
                this.f30310a = b02;
                this.f30311b = q8;
                this.f30312c = t8;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(ArrayList arrayList, U5.d dVar) {
                Iterator it = arrayList.iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    c5.U u8 = (c5.U) next;
                    int b9 = u8.b();
                    if (b9 != 0) {
                        if (b9 != 1) {
                            if (b9 != 2) {
                                if (b9 == 3) {
                                    this.f30310a.f12096j.setChecked(u8.d());
                                    UsernameTextView.a aVar = UsernameTextView.f31178k;
                                    UsernameTextView tvUsernameType3 = this.f30310a.f12104r;
                                    AbstractC3292y.h(tvUsernameType3, "tvUsernameType3");
                                    aVar.a(tvUsernameType3, u8.e(), u8.c());
                                }
                            } else {
                                this.f30310a.f12095i.setChecked(u8.d());
                                UsernameTextView.a aVar2 = UsernameTextView.f31178k;
                                UsernameTextView tvUsernameType2 = this.f30310a.f12103q;
                                AbstractC3292y.h(tvUsernameType2, "tvUsernameType2");
                                aVar2.a(tvUsernameType2, u8.e(), u8.c());
                            }
                        } else {
                            this.f30310a.f12094h.setChecked(u8.d());
                            UsernameTextView.a aVar3 = UsernameTextView.f31178k;
                            UsernameTextView tvUsernameType1 = this.f30310a.f12102p;
                            AbstractC3292y.h(tvUsernameType1, "tvUsernameType1");
                            aVar3.a(tvUsernameType1, u8.e(), u8.c());
                        }
                    } else {
                        this.f30310a.f12093g.setChecked(u8.d());
                        UsernameTextView.a aVar4 = UsernameTextView.f31178k;
                        UsernameTextView tvUsernameType0 = this.f30310a.f12101o;
                        AbstractC3292y.h(tvUsernameType0, "tvUsernameType0");
                        aVar4.a(tvUsernameType0, u8.e(), u8.c());
                    }
                    if (u8.d()) {
                        this.f30311b.f34571a = u8.b();
                        kotlin.jvm.internal.T t8 = this.f30312c;
                        String c8 = u8.c();
                        AbstractC3292y.f(c8);
                        if (c8.length() == 0) {
                            c8 = "type0";
                        }
                        t8.f34573a = c8;
                    }
                }
                return Q5.I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(B0 b02, Q q8, kotlin.jvm.internal.T t8, U5.d dVar) {
            super(2, dVar);
            this.f30307c = b02;
            this.f30308d = q8;
            this.f30309e = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f30307c, this.f30308d, this.f30309e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30305a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L g8 = UserCredentialsEditActivity.this.m3().g();
                a aVar = new a(this.f30307c, this.f30308d, this.f30309e);
                this.f30305a = 1;
                if (g8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30313a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserCredentialsEditActivity f30315a;

            /* renamed from: com.uptodown.activities.UserCredentialsEditActivity$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C0700a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f30316a;

                static {
                    int[] iArr = new int[M.a.values().length];
                    try {
                        iArr[M.a.f29658a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[M.a.f29659b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f30316a = iArr;
                }
            }

            a(UserCredentialsEditActivity userCredentialsEditActivity) {
                this.f30315a = userCredentialsEditActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                Z z8 = null;
                B0 b02 = null;
                Z z9 = null;
                B0 b03 = null;
                if (abstractC3768A instanceof AbstractC3768A.a) {
                    if (this.f30315a.f30303R != null) {
                        B0 b04 = this.f30315a.f30303R;
                        if (b04 == null) {
                            AbstractC3292y.y("usernameEditBinding");
                        } else {
                            b02 = b04;
                        }
                        b02.f12092f.f12236b.setVisibility(0);
                    } else if (this.f30315a.f30302Q != null) {
                        Z z10 = this.f30315a.f30302Q;
                        if (z10 == null) {
                            AbstractC3292y.y("passwordEditBinding");
                        } else {
                            z9 = z10;
                        }
                        z9.f12462f.f12236b.setVisibility(0);
                    }
                } else if (abstractC3768A instanceof AbstractC3768A.c) {
                    AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                    int i8 = C0700a.f30316a[((M.b) cVar.a()).a().ordinal()];
                    if (i8 != 1) {
                        if (i8 == 2) {
                            if (((M.b) cVar.a()).d() != 0 && !((M.b) cVar.a()).b()) {
                                UserCredentialsEditActivity userCredentialsEditActivity = this.f30315a;
                                String string = userCredentialsEditActivity.getString(R.string.password_edit_complete);
                                AbstractC3292y.h(string, "getString(...)");
                                userCredentialsEditActivity.A3(string);
                                this.f30315a.finish();
                            } else {
                                String c8 = ((M.b) cVar.a()).c();
                                if (c8 != null && c8.length() != 0) {
                                    this.f30315a.A3(((M.b) cVar.a()).c());
                                } else {
                                    UserCredentialsEditActivity userCredentialsEditActivity2 = this.f30315a;
                                    String string2 = userCredentialsEditActivity2.getString(R.string.error_generico);
                                    AbstractC3292y.h(string2, "getString(...)");
                                    userCredentialsEditActivity2.A3(string2);
                                }
                            }
                        } else {
                            throw new Q5.p();
                        }
                    } else if (((M.b) cVar.a()).d() != 0 && !((M.b) cVar.a()).b()) {
                        UserCredentialsEditActivity userCredentialsEditActivity3 = this.f30315a;
                        String string3 = userCredentialsEditActivity3.getString(R.string.username_edit_complete);
                        AbstractC3292y.h(string3, "getString(...)");
                        userCredentialsEditActivity3.A3(string3);
                        this.f30315a.finish();
                    } else {
                        String c9 = ((M.b) cVar.a()).c();
                        if (c9 != null && c9.length() != 0) {
                            this.f30315a.A3(((M.b) cVar.a()).c());
                        } else {
                            UserCredentialsEditActivity userCredentialsEditActivity4 = this.f30315a;
                            String string4 = userCredentialsEditActivity4.getString(R.string.error_generico);
                            AbstractC3292y.h(string4, "getString(...)");
                            userCredentialsEditActivity4.A3(string4);
                        }
                    }
                    if (this.f30315a.f30303R != null) {
                        B0 b05 = this.f30315a.f30303R;
                        if (b05 == null) {
                            AbstractC3292y.y("usernameEditBinding");
                        } else {
                            b03 = b05;
                        }
                        b03.f12092f.f12236b.setVisibility(0);
                    } else if (this.f30315a.f30302Q != null) {
                        Z z11 = this.f30315a.f30302Q;
                        if (z11 == null) {
                            AbstractC3292y.y("passwordEditBinding");
                        } else {
                            z8 = z11;
                        }
                        z8.f12462f.f12236b.setVisibility(0);
                    }
                } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                    throw new Q5.p();
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
            int i8 = this.f30313a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L f8 = UserCredentialsEditActivity.this.m3().f();
                a aVar = new a(UserCredentialsEditActivity.this);
                this.f30313a = 1;
                if (f8.collect(aVar, this) == e8) {
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
    public static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30317a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f30317a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30317a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30318a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f30318a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30318a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30319a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30320b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30319a = function0;
            this.f30320b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30319a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30320b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A3(String str) {
        Toast makeText = Toast.makeText(this, str, 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final M m3() {
        return (M) this.f30301P.getValue();
    }

    private final void n3(final Z z8) {
        setContentView(z8.getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            z8.f12463g.setNavigationIcon(drawable);
            z8.f12463g.setNavigationContentDescription(getString(R.string.back));
            z8.f12463g.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.l5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserCredentialsEditActivity.p3(UserCredentialsEditActivity.this, view);
                }
            });
        }
        TextView textView = z8.f12465i;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        z8.f12459c.setTypeface(aVar.v());
        z8.f12458b.setTypeface(aVar.v());
        z8.f12464h.setTypeface(aVar.u());
        z8.f12461e.setOnClickListener(new View.OnClickListener() { // from class: F4.m5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.q3(UserCredentialsEditActivity.this, z8, view);
            }
        });
        z8.f12460d.setOnClickListener(new View.OnClickListener() { // from class: F4.n5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.r3(UserCredentialsEditActivity.this, z8, view);
            }
        });
        z8.f12464h.setOnClickListener(new View.OnClickListener() { // from class: F4.o5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.o3(UserCredentialsEditActivity.this, z8, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o3(UserCredentialsEditActivity userCredentialsEditActivity, Z z8, View view) {
        J4.j.f4395g.d(userCredentialsEditActivity, z8.f12459c);
        if (!l6.n.s(z8.f12459c.getText().toString(), "", true) && !l6.n.s(z8.f12458b.getText().toString(), "", true)) {
            if (!l6.n.s(z8.f12459c.getText().toString(), z8.f12458b.getText().toString(), true)) {
                String string = userCredentialsEditActivity.getString(R.string.password_edit_not_match);
                AbstractC3292y.h(string, "getString(...)");
                userCredentialsEditActivity.A3(string);
                return;
            }
            userCredentialsEditActivity.m3().c(userCredentialsEditActivity, z8.f12459c.getText().toString(), z8.f12458b.getText().toString());
            return;
        }
        String string2 = userCredentialsEditActivity.getString(R.string.error_email_vacio_recuperar_pass);
        AbstractC3292y.h(string2, "getString(...)");
        userCredentialsEditActivity.A3(string2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p3(UserCredentialsEditActivity userCredentialsEditActivity, View view) {
        userCredentialsEditActivity.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q3(UserCredentialsEditActivity userCredentialsEditActivity, Z z8, View view) {
        EditText etPasswordEdit = z8.f12459c;
        AbstractC3292y.h(etPasswordEdit, "etPasswordEdit");
        ImageView ivPasswordEdit = z8.f12461e;
        AbstractC3292y.h(ivPasswordEdit, "ivPasswordEdit");
        userCredentialsEditActivity.z3(etPasswordEdit, ivPasswordEdit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(UserCredentialsEditActivity userCredentialsEditActivity, Z z8, View view) {
        EditText etConfirmPasswordEdit = z8.f12458b;
        AbstractC3292y.h(etConfirmPasswordEdit, "etConfirmPasswordEdit");
        ImageView ivConfirmPasswordEdit = z8.f12460d;
        AbstractC3292y.h(ivConfirmPasswordEdit, "ivConfirmPasswordEdit");
        userCredentialsEditActivity.z3(etConfirmPasswordEdit, ivConfirmPasswordEdit);
    }

    private final void s3(final B0 b02) {
        setContentView(b02.getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            b02.f12097k.setNavigationIcon(drawable);
            b02.f12097k.setNavigationContentDescription(getString(R.string.back));
            b02.f12097k.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.f5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserCredentialsEditActivity.t3(UserCredentialsEditActivity.this, view);
                }
            });
        }
        TextView textView = b02.f12098l;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        b02.f12099m.setTypeface(aVar.u());
        b02.f12088b.setTypeface(aVar.v());
        EditText editText = b02.f12088b;
        T t8 = this.f30300O;
        AbstractC3292y.f(t8);
        editText.setText(t8.s());
        b02.f12100n.setTypeface(aVar.u());
        b02.f12101o.setTypeface(aVar.u());
        b02.f12102p.setTypeface(aVar.u());
        b02.f12103q.setTypeface(aVar.u());
        b02.f12104r.setTypeface(aVar.u());
        UsernameTextView usernameTextView = b02.f12101o;
        T t9 = this.f30300O;
        AbstractC3292y.f(t9);
        usernameTextView.setText(t9.s());
        UsernameTextView usernameTextView2 = b02.f12102p;
        T t10 = this.f30300O;
        AbstractC3292y.f(t10);
        usernameTextView2.setText(t10.s());
        UsernameTextView usernameTextView3 = b02.f12103q;
        T t11 = this.f30300O;
        AbstractC3292y.f(t11);
        usernameTextView3.setText(t11.s());
        UsernameTextView usernameTextView4 = b02.f12104r;
        T t12 = this.f30300O;
        AbstractC3292y.f(t12);
        usernameTextView4.setText(t12.s());
        final Q q8 = new Q();
        final kotlin.jvm.internal.T t13 = new kotlin.jvm.internal.T();
        t13.f34573a = "type0";
        b02.f12093g.setOnClickListener(new View.OnClickListener() { // from class: F4.g5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.u3(Y4.B0.this, q8, t13, view);
            }
        });
        b02.f12094h.setOnClickListener(new View.OnClickListener() { // from class: F4.h5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.v3(Y4.B0.this, q8, t13, view);
            }
        });
        b02.f12095i.setOnClickListener(new View.OnClickListener() { // from class: F4.i5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.w3(Y4.B0.this, q8, t13, view);
            }
        });
        b02.f12096j.setOnClickListener(new View.OnClickListener() { // from class: F4.j5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.x3(Y4.B0.this, q8, t13, view);
            }
        });
        T t14 = this.f30300O;
        AbstractC3292y.f(t14);
        if (!t14.y()) {
            b02.f12093g.setChecked(true);
            b02.f12094h.setEnabled(false);
            b02.f12095i.setEnabled(false);
            b02.f12096j.setEnabled(false);
        }
        b02.f12100n.setOnClickListener(new View.OnClickListener() { // from class: F4.k5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.y3(UserCredentialsEditActivity.this, b02, q8, t13, view);
            }
        });
        EditText etUsernameEdit = b02.f12088b;
        AbstractC3292y.h(etUsernameEdit, "etUsernameEdit");
        etUsernameEdit.addTextChangedListener(new a(b02));
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new b(b02, q8, t13, null), 2, null);
        m3().e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(UserCredentialsEditActivity userCredentialsEditActivity, View view) {
        userCredentialsEditActivity.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(B0 b02, Q q8, kotlin.jvm.internal.T t8, View view) {
        b02.f12094h.setChecked(false);
        b02.f12095i.setChecked(false);
        b02.f12096j.setChecked(false);
        q8.f34571a = 0;
        t8.f34573a = "type0";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(B0 b02, Q q8, kotlin.jvm.internal.T t8, View view) {
        b02.f12093g.setChecked(false);
        b02.f12095i.setChecked(false);
        b02.f12096j.setChecked(false);
        q8.f34571a = 1;
        t8.f34573a = "type1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(B0 b02, Q q8, kotlin.jvm.internal.T t8, View view) {
        b02.f12093g.setChecked(false);
        b02.f12094h.setChecked(false);
        b02.f12096j.setChecked(false);
        q8.f34571a = 2;
        t8.f34573a = "type2";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(B0 b02, Q q8, kotlin.jvm.internal.T t8, View view) {
        b02.f12093g.setChecked(false);
        b02.f12094h.setChecked(false);
        b02.f12095i.setChecked(false);
        q8.f34571a = 3;
        t8.f34573a = "type3";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(UserCredentialsEditActivity userCredentialsEditActivity, B0 b02, Q q8, kotlin.jvm.internal.T t8, View view) {
        J4.j.f4395g.d(userCredentialsEditActivity, b02.f12088b);
        if (l6.n.s(b02.f12088b.getText().toString(), "", true)) {
            String string = userCredentialsEditActivity.getString(R.string.error_email_vacio_recuperar_pass);
            AbstractC3292y.h(string, "getString(...)");
            userCredentialsEditActivity.A3(string);
        } else {
            if (b02.f12088b.getText().toString().length() >= 3 && b02.f12088b.getText().toString().length() <= 99) {
                userCredentialsEditActivity.m3().d(userCredentialsEditActivity, b02.f12088b.getText().toString(), userCredentialsEditActivity.f30300O, q8.f34571a, (String) t8.f34573a);
                return;
            }
            String string2 = userCredentialsEditActivity.getString(R.string.username_not_valid);
            AbstractC3292y.h(string2, "getString(...)");
            userCredentialsEditActivity.A3(string2);
        }
    }

    private final void z3(EditText editText, ImageView imageView) {
        if (editText.getInputType() == 129) {
            editText.setInputType(145);
            imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_show_password));
            editText.setSelection(editText.length());
        } else {
            editText.setInputType(TsExtractor.TS_STREAM_TYPE_AC3);
            imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_hide_password));
            editText.setSelection(editText.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        Object parcelable;
        super.onCreate(bundle);
        if (getIntent() != null && (extras = getIntent().getExtras()) != null) {
            if (extras.containsKey("user")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = extras.getParcelable("user", T.class);
                    this.f30300O = (T) parcelable;
                } else {
                    this.f30300O = (T) extras.getParcelable("user");
                }
                B0 c8 = B0.c(getLayoutInflater());
                this.f30303R = c8;
                if (c8 == null) {
                    AbstractC3292y.y("usernameEditBinding");
                    c8 = null;
                }
                s3(c8);
            }
            if (extras.containsKey(HintConstants.AUTOFILL_HINT_PASSWORD)) {
                Z c9 = Z.c(getLayoutInflater());
                this.f30302Q = c9;
                if (c9 == null) {
                    AbstractC3292y.y("passwordEditBinding");
                    c9 = null;
                }
                n3(c9);
            }
        }
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new c(null), 2, null);
    }
}
