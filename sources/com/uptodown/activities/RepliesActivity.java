package com.uptodown.activities;

import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import Y4.C1505c0;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
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
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import c5.M;
import c5.T;
import c6.InterfaceC2072n;
import com.google.android.material.snackbar.Snackbar;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.RepliesActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.activities.u;
import com.uptodown.util.views.UsernameTextView;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Y;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3770C;
import q5.C3788m;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class RepliesActivity extends AbstractActivityC2691a {

    /* renamed from: Q, reason: collision with root package name */
    private I4.B f30043Q;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1416k f30041O = Q5.l.b(new Function0() { // from class: F4.r3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            C1505c0 p32;
            p32 = RepliesActivity.p3(RepliesActivity.this);
            return p32;
        }
    });

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1416k f30042P = new ViewModelLazy(U.b(u.class), new g(this), new f(this), new h(null, this));

    /* renamed from: R, reason: collision with root package name */
    private final e f30044R = new e();

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30045a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.activities.RepliesActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0697a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RepliesActivity f30047a;

            C0697a(RepliesActivity repliesActivity) {
                this.f30047a = repliesActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (abstractC3768A instanceof AbstractC3768A.a) {
                    this.f30047a.q3().f12564d.f12236b.setVisibility(0);
                } else if (abstractC3768A instanceof AbstractC3768A.c) {
                    AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                    if (!((u.a) cVar.a()).a().isEmpty()) {
                        RepliesActivity repliesActivity = this.f30047a;
                        ArrayList a9 = ((u.a) cVar.a()).a();
                        Context applicationContext = this.f30047a.getApplicationContext();
                        AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
                        repliesActivity.f30043Q = new I4.B(a9, applicationContext, this.f30047a.f30044R);
                        this.f30047a.q3().f12570j.setAdapter(this.f30047a.f30043Q);
                    } else {
                        this.f30047a.q3().f12573m.setVisibility(0);
                    }
                    this.f30047a.q3().f12566f.setVisibility(0);
                    this.f30047a.q3().f12564d.f12236b.setVisibility(8);
                } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                    throw new Q5.p();
                }
                return Q5.I.f8786a;
            }
        }

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
            int i8 = this.f30045a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L g8 = RepliesActivity.this.s3().g();
                C0697a c0697a = new C0697a(RepliesActivity.this);
                this.f30045a = 1;
                if (g8.collect(c0697a, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30048a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RepliesActivity f30050a;

            a(RepliesActivity repliesActivity) {
                this.f30050a = repliesActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (!AbstractC3292y.d(abstractC3768A, AbstractC3768A.a.f37253a)) {
                    if (abstractC3768A instanceof AbstractC3768A.c) {
                        AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                        if (((M.c) cVar.a()).b() == 1) {
                            this.f30050a.q3().f12567g.f12592p.setText(String.valueOf(((M.c) cVar.a()).a().p()));
                        } else {
                            Snackbar.make(this.f30050a.q3().f12570j, R.string.error_generico, -1).show();
                        }
                    } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                        throw new Q5.p();
                    }
                }
                return Q5.I.f8786a;
            }
        }

        b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30048a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L i9 = RepliesActivity.this.s3().i();
                a aVar = new a(RepliesActivity.this);
                this.f30048a = 1;
                if (i9.collect(aVar, this) == e8) {
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
        int f30051a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RepliesActivity f30053a;

            a(RepliesActivity repliesActivity) {
                this.f30053a = repliesActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (!AbstractC3292y.d(abstractC3768A, AbstractC3768A.a.f37253a)) {
                    if (abstractC3768A instanceof AbstractC3768A.c) {
                        AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                        if (((u.b) cVar.a()).a() == 1) {
                            I4.B b9 = this.f30053a.f30043Q;
                            if (b9 != null) {
                                b9.c(((u.b) cVar.a()).b());
                            }
                        } else {
                            Snackbar.make(this.f30053a.q3().f12570j, R.string.error_generico, -1).show();
                        }
                    } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                        throw new Q5.p();
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
            int i8 = this.f30051a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L h8 = RepliesActivity.this.s3().h();
                a aVar = new a(RepliesActivity.this);
                this.f30051a = 1;
                if (h8.collect(aVar, this) == e8) {
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
        int f30054a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RepliesActivity f30056a;

            a(RepliesActivity repliesActivity) {
                this.f30056a = repliesActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (!AbstractC3292y.d(abstractC3768A, AbstractC3768A.a.f37253a)) {
                    if (abstractC3768A instanceof AbstractC3768A.c) {
                        AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                        if (((u.c) cVar.a()).c() == 1) {
                            c5.M m8 = new c5.M();
                            T e8 = T.f15689k.e(this.f30056a);
                            if (e8 != null) {
                                m8.g0(e8.s());
                                m8.Y(e8.h());
                            }
                            m8.c0(((u.c) cVar.a()).d());
                            this.f30056a.q3().f12562b.setText("");
                            RepliesActivity repliesActivity = this.f30056a;
                            Toast.makeText(repliesActivity, repliesActivity.getString(R.string.review_sended), 1).show();
                        } else if (((u.c) cVar.a()).b() == 401) {
                            this.f30056a.z3();
                        } else if (((u.c) cVar.a()).b() == 403) {
                            Toast.makeText(this.f30056a, R.string.email_validation_msg, 1).show();
                        } else {
                            Toast.makeText(this.f30056a, ((u.c) cVar.a()).a(), 1).show();
                        }
                    } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
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
            int i8 = this.f30054a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L k8 = RepliesActivity.this.s3().k();
                a aVar = new a(RepliesActivity.this);
                this.f30054a = 1;
                if (k8.collect(aVar, this) == e8) {
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
    public static final class e implements b5.z {
        e() {
        }

        @Override // b5.z
        public void b() {
            RepliesActivity.this.V2();
        }

        @Override // b5.z
        public void c(c5.I reply) {
            AbstractC3292y.i(reply, "reply");
            if (UptodownApp.f29249C.a0()) {
                if (!C3770C.f37260a.g(reply.f())) {
                    RepliesActivity.this.s3().m(RepliesActivity.this, reply);
                } else {
                    Snackbar.make(RepliesActivity.this.q3().f12570j, R.string.review_already_liked, -1).show();
                }
            }
        }

        @Override // b5.z
        public void d(String userID) {
            AbstractC3292y.i(userID, "userID");
            RepliesActivity.this.C3(userID);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30058a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f30058a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30058a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30059a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f30059a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30059a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30060a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30061b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30060a = function0;
            this.f30061b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30060a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30061b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    private final void A3() {
        t3();
        if (q3().f12562b.getText() != null && l6.n.M0(q3().f12562b.getText().toString()).toString().length() > 0) {
            if (!c5.M.f15633o.b(this, q3().f12562b.getText().toString())) {
                SettingsPreferences.a aVar = SettingsPreferences.f30529b;
                Context applicationContext = getApplicationContext();
                AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
                aVar.K0(applicationContext, q3().f12562b.getText().toString());
                Context applicationContext2 = getApplicationContext();
                AbstractC3292y.h(applicationContext2, "getApplicationContext(...)");
                aVar.L0(applicationContext2, String.valueOf(System.currentTimeMillis()));
                u s32 = s3();
                String obj = q3().f12562b.getText().toString();
                Object value = s3().j().getValue();
                AbstractC3292y.f(value);
                s32.o(this, obj, ((c5.M) value).l());
                return;
            }
            q3().f12562b.setText("");
            return;
        }
        if (l6.n.M0(q3().f12562b.getText().toString()).toString().length() == 0) {
            String string = getString(R.string.empty_answer_error);
            AbstractC3292y.h(string, "getString(...)");
            Z1(string);
        }
    }

    private final void B3() {
        if (!isFinishing()) {
            startActivity(new Intent(getApplicationContext(), (Class<?>) LoginActivity.class), UptodownApp.f29249C.a(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C3(String str) {
        Intent intent = new Intent(this, (Class<?>) UserCommentsActivity.class);
        intent.putExtra("userID", str);
        startActivity(intent, UptodownApp.f29249C.a(this));
    }

    private final void D3(final c5.M m8) {
        if (m8.I()) {
            q3().f12568h.f12634l.setVisibility(8);
            q3().f12568h.f12633k.setOnClickListener(new View.OnClickListener() { // from class: F4.y3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RepliesActivity.E3(RepliesActivity.this, m8, view);
                }
            });
            if (C3770C.f37260a.h(m8.l())) {
                q3().f12568h.f12626d.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_heart_red));
            }
            TextView textView = q3().f12568h.f12638p;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.v());
            q3().f12568h.f12638p.setText(String.valueOf(m8.p()));
            q3().f12568h.f12627e.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            q3().f12568h.f12628f.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
            q3().f12568h.f12629g.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
            q3().f12568h.f12630h.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
            q3().f12568h.f12631i.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
            if (m8.s() >= 2) {
                q3().f12568h.f12628f.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            }
            if (m8.s() >= 3) {
                q3().f12568h.f12629g.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            }
            if (m8.s() >= 4) {
                q3().f12568h.f12630h.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            }
            if (m8.s() == 5) {
                q3().f12568h.f12631i.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            }
            q3().f12568h.f12642t.setTypeface(aVar.u());
            q3().f12568h.f12637o.setTypeface(aVar.v());
            q3().f12568h.f12636n.setTypeface(aVar.v());
            q3().f12568h.f12639q.setTypeface(aVar.v());
            T.b bVar = T.f15689k;
            String c8 = bVar.c(m8.i());
            if (c8 != null && c8.length() != 0) {
                com.squareup.picasso.s.h().l(bVar.c(m8.i())).n(UptodownApp.f29249C.f0(this)).i(q3().f12568h.f12625c);
            } else {
                com.squareup.picasso.s.h().j(R.drawable.vector_user_default).n(UptodownApp.f29249C.f0(this)).i(q3().f12568h.f12625c);
            }
            String y8 = m8.y();
            if (y8 != null && y8.length() != 0) {
                q3().f12568h.f12642t.setText(m8.y());
                UsernameTextView.a aVar2 = UsernameTextView.f31178k;
                UsernameTextView tvUsernameReview = q3().f12568h.f12642t;
                AbstractC3292y.h(tvUsernameReview, "tvUsernameReview");
                aVar2.a(tvUsernameReview, m8.I(), m8.z());
            } else {
                CharSequence charSequence = (CharSequence) s3().l().getValue();
                if (charSequence != null && charSequence.length() != 0) {
                    q3().f12568h.f12642t.setText((CharSequence) s3().l().getValue());
                    UsernameTextView.a aVar3 = UsernameTextView.f31178k;
                    UsernameTextView tvUsernameReview2 = q3().f12568h.f12642t;
                    AbstractC3292y.h(tvUsernameReview2, "tvUsernameReview");
                    aVar3.a(tvUsernameReview2, m8.I(), m8.z());
                }
            }
            String w8 = m8.w();
            if (w8 != null && w8.length() != 0) {
                q3().f12568h.f12637o.setText(m8.w());
            }
            String u8 = m8.u();
            if (u8 != null && u8.length() != 0) {
                q3().f12568h.f12636n.setMaxLines(Integer.MAX_VALUE);
                TextView textView2 = q3().f12568h.f12636n;
                Spanned v8 = m8.v();
                textView2.setText(v8 != null ? l6.n.M0(v8) : null);
                if (m8.a() == 1) {
                    TextView textView3 = q3().f12568h.f12639q;
                    Y y9 = Y.f34578a;
                    String string = getString(R.string.replies_counter_single);
                    AbstractC3292y.h(string, "getString(...)");
                    String format = String.format(string, Arrays.copyOf(new Object[0], 0));
                    AbstractC3292y.h(format, "format(...)");
                    textView3.setText(format);
                } else if (m8.a() > 1) {
                    TextView textView4 = q3().f12568h.f12639q;
                    Y y10 = Y.f34578a;
                    String string2 = getString(R.string.replies_counter_multiple);
                    AbstractC3292y.h(string2, "getString(...)");
                    String format2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(m8.a())}, 1));
                    AbstractC3292y.h(format2, "format(...)");
                    textView4.setText(format2);
                }
            } else {
                q3().f12568h.f12636n.setVisibility(8);
            }
            if (m8.h() == 1) {
                q3().f12568h.f12624b.setVisibility(0);
            }
            String x8 = m8.x();
            if (x8 != null && x8.length() != 0) {
                q3().f12568h.f12642t.setOnClickListener(new View.OnClickListener() { // from class: F4.z3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RepliesActivity.F3(RepliesActivity.this, m8, view);
                    }
                });
                q3().f12568h.f12625c.setOnClickListener(new View.OnClickListener() { // from class: F4.A3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RepliesActivity.G3(RepliesActivity.this, m8, view);
                    }
                });
            }
            q3().f12568h.f12632j.setOnClickListener(new View.OnClickListener() { // from class: F4.B3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RepliesActivity.H3(RepliesActivity.this, view);
                }
            });
            q3().f12568h.f12632j.setVisibility(0);
            C3788m.a aVar4 = C3788m.f37279a;
            ImageView ivAvatarReview = q3().f12568h.f12625c;
            AbstractC3292y.h(ivAvatarReview, "ivAvatarReview");
            aVar4.a(ivAvatarReview);
            q3().f12568h.getRoot().setVisibility(0);
            q3().f12567g.getRoot().setVisibility(8);
            return;
        }
        q3().f12567g.f12588l.setVisibility(8);
        q3().f12567g.f12587k.setOnClickListener(new View.OnClickListener() { // from class: F4.C3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RepliesActivity.I3(RepliesActivity.this, m8, view);
            }
        });
        if (C3770C.f37260a.h(m8.l())) {
            q3().f12567g.f12580d.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_heart_red));
        }
        TextView textView5 = q3().f12567g.f12592p;
        j.a aVar5 = J4.j.f4395g;
        textView5.setTypeface(aVar5.v());
        q3().f12567g.f12592p.setText(String.valueOf(m8.p()));
        q3().f12567g.f12581e.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        q3().f12567g.f12582f.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
        q3().f12567g.f12583g.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
        q3().f12567g.f12584h.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
        q3().f12567g.f12585i.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
        if (m8.s() >= 2) {
            q3().f12567g.f12582f.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        }
        if (m8.s() >= 3) {
            q3().f12567g.f12583g.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        }
        if (m8.s() >= 4) {
            q3().f12567g.f12584h.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        }
        if (m8.s() == 5) {
            q3().f12567g.f12585i.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        }
        q3().f12567g.f12596t.setTypeface(aVar5.u());
        q3().f12567g.f12591o.setTypeface(aVar5.v());
        q3().f12567g.f12590n.setTypeface(aVar5.v());
        q3().f12567g.f12593q.setTypeface(aVar5.v());
        T.b bVar2 = T.f15689k;
        String c9 = bVar2.c(m8.i());
        if (c9 != null && c9.length() != 0) {
            com.squareup.picasso.s.h().l(bVar2.c(m8.i())).n(UptodownApp.f29249C.f0(this)).i(q3().f12567g.f12579c);
        } else {
            com.squareup.picasso.s.h().j(R.drawable.vector_user_default).n(UptodownApp.f29249C.f0(this)).i(q3().f12567g.f12579c);
        }
        String y11 = m8.y();
        if (y11 != null && y11.length() != 0) {
            q3().f12567g.f12596t.setText(m8.y());
            UsernameTextView.a aVar6 = UsernameTextView.f31178k;
            UsernameTextView tvUsernameReview3 = q3().f12567g.f12596t;
            AbstractC3292y.h(tvUsernameReview3, "tvUsernameReview");
            aVar6.a(tvUsernameReview3, m8.I(), m8.z());
        } else {
            CharSequence charSequence2 = (CharSequence) s3().l().getValue();
            if (charSequence2 != null && charSequence2.length() != 0) {
                q3().f12567g.f12596t.setText((CharSequence) s3().l().getValue());
                UsernameTextView.a aVar7 = UsernameTextView.f31178k;
                UsernameTextView tvUsernameReview4 = q3().f12567g.f12596t;
                AbstractC3292y.h(tvUsernameReview4, "tvUsernameReview");
                aVar7.a(tvUsernameReview4, m8.I(), m8.z());
            }
        }
        String w9 = m8.w();
        if (w9 != null && w9.length() != 0) {
            q3().f12567g.f12591o.setText(m8.w());
        }
        String u9 = m8.u();
        if (u9 != null && u9.length() != 0) {
            TextView textView6 = q3().f12567g.f12590n;
            Spanned v9 = m8.v();
            textView6.setText(v9 != null ? l6.n.M0(v9) : null);
            if (m8.a() == 1) {
                TextView textView7 = q3().f12567g.f12593q;
                Y y12 = Y.f34578a;
                String string3 = getString(R.string.replies_counter_single);
                AbstractC3292y.h(string3, "getString(...)");
                String format3 = String.format(string3, Arrays.copyOf(new Object[0], 0));
                AbstractC3292y.h(format3, "format(...)");
                textView7.setText(format3);
            } else if (m8.a() > 1) {
                TextView textView8 = q3().f12567g.f12593q;
                Y y13 = Y.f34578a;
                String string4 = getString(R.string.replies_counter_multiple);
                AbstractC3292y.h(string4, "getString(...)");
                String format4 = String.format(string4, Arrays.copyOf(new Object[]{String.valueOf(m8.a())}, 1));
                AbstractC3292y.h(format4, "format(...)");
                textView8.setText(format4);
            }
        } else {
            q3().f12567g.f12590n.setVisibility(8);
        }
        if (m8.h() == 1) {
            q3().f12567g.f12578b.setVisibility(0);
        }
        String x9 = m8.x();
        if (x9 == null || x9.length() == 0) {
            return;
        }
        q3().f12567g.f12596t.setOnClickListener(new View.OnClickListener() { // from class: F4.s3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RepliesActivity.J3(RepliesActivity.this, m8, view);
            }
        });
        q3().f12567g.f12579c.setOnClickListener(new View.OnClickListener() { // from class: F4.t3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RepliesActivity.K3(RepliesActivity.this, m8, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E3(RepliesActivity repliesActivity, c5.M m8, View view) {
        if (UptodownApp.f29249C.a0()) {
            ImageView ivLikesCounterReview = repliesActivity.q3().f12568h.f12626d;
            AbstractC3292y.h(ivLikesCounterReview, "ivLikesCounterReview");
            s5.k.a(repliesActivity, ivLikesCounterReview);
            if (!C3770C.f37260a.h(m8.l())) {
                repliesActivity.s3().n(repliesActivity, m8);
                repliesActivity.q3().f12568h.f12638p.setText(String.valueOf(m8.p() + 1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(RepliesActivity repliesActivity, c5.M m8, View view) {
        String x8 = m8.x();
        AbstractC3292y.f(x8);
        repliesActivity.C3(x8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(RepliesActivity repliesActivity, c5.M m8, View view) {
        String x8 = m8.x();
        AbstractC3292y.f(x8);
        repliesActivity.C3(x8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H3(RepliesActivity repliesActivity, View view) {
        repliesActivity.V2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I3(RepliesActivity repliesActivity, c5.M m8, View view) {
        if (UptodownApp.f29249C.a0()) {
            ImageView ivLikesCounterReview = repliesActivity.q3().f12567g.f12580d;
            AbstractC3292y.h(ivLikesCounterReview, "ivLikesCounterReview");
            s5.k.a(repliesActivity, ivLikesCounterReview);
            if (!C3770C.f37260a.h(m8.l())) {
                repliesActivity.s3().n(repliesActivity, m8);
                repliesActivity.q3().f12567g.f12592p.setText(String.valueOf(m8.p() + 1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J3(RepliesActivity repliesActivity, c5.M m8, View view) {
        String x8 = m8.x();
        AbstractC3292y.f(x8);
        repliesActivity.C3(x8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K3(RepliesActivity repliesActivity, c5.M m8, View view) {
        String x8 = m8.x();
        AbstractC3292y.f(x8);
        repliesActivity.C3(x8);
    }

    private final void L3() {
        String str;
        T.b bVar = T.f15689k;
        T e8 = bVar.e(this);
        if (e8 != null) {
            str = e8.b();
        } else {
            str = null;
        }
        if (str != null) {
            com.squareup.picasso.s.h().l(bVar.c(e8.b())).l(R.drawable.shape_bg_placeholder).n(UptodownApp.f29249C.f0(this)).i(q3().f12563c);
            if (e8.y()) {
                C3788m.a aVar = C3788m.f37279a;
                ImageView ivUserAvatarReply = q3().f12563c;
                AbstractC3292y.h(ivUserAvatarReply, "ivUserAvatarReply");
                aVar.b(ivUserAvatarReply);
                return;
            }
            return;
        }
        q3().f12563c.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_user_default));
    }

    private final void M3() {
        String str;
        T e8 = T.f15689k.e(this);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str != null) {
            String id = e8.getId();
            AbstractC3292y.f(id);
            if (id.length() > 0) {
                q3().f12565e.setVisibility(8);
                return;
            }
        }
        q3().f12565e.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1505c0 p3(RepliesActivity repliesActivity) {
        return C1505c0.c(repliesActivity.getLayoutInflater());
    }

    private final void r3(long j8) {
        s3().e(this, j8);
    }

    private final void t3() {
        Object systemService = getSystemService("input_method");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(q3().f12562b.getWindowToken(), 0);
    }

    private final void u3() {
        String str;
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            q3().f12571k.setNavigationIcon(drawable);
            q3().f12571k.setNavigationContentDescription(getString(R.string.back));
        }
        q3().f12571k.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.u3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RepliesActivity.x3(RepliesActivity.this, view);
            }
        });
        TextView textView = q3().f12572l;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        c5.M m8 = (c5.M) s3().j().getValue();
        String str2 = null;
        if (m8 != null) {
            str = m8.f();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            TextView textView2 = q3().f12572l;
            c5.M m9 = (c5.M) s3().j().getValue();
            if (m9 != null) {
                str2 = m9.f();
            }
            textView2.setText(str2);
        } else {
            CharSequence charSequence = (CharSequence) s3().f().getValue();
            if (charSequence != null && charSequence.length() != 0) {
                q3().f12572l.setText((CharSequence) s3().f().getValue());
            }
        }
        q3().f12573m.setTypeface(aVar.v());
        L3();
        q3().f12574n.setTypeface(aVar.u());
        q3().f12574n.setOnClickListener(new View.OnClickListener() { // from class: F4.v3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RepliesActivity.y3(RepliesActivity.this, view);
            }
        });
        q3().f12565e.setOnClickListener(new View.OnClickListener() { // from class: F4.w3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RepliesActivity.v3(RepliesActivity.this, view);
            }
        });
        q3().f12562b.setTypeface(aVar.v());
        q3().f12562b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: F4.x3
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i8, KeyEvent keyEvent) {
                boolean w32;
                w32 = RepliesActivity.w3(RepliesActivity.this, textView3, i8, keyEvent);
                return w32;
            }
        });
        M3();
        q3().f12570j.setLayoutManager(new LinearLayoutManager(this, 1, false));
        q3().f12570j.setItemAnimator(new DefaultItemAnimator());
        if (s3().j().getValue() != null) {
            Object value = s3().j().getValue();
            AbstractC3292y.f(value);
            r3(((c5.M) value).l());
            Object value2 = s3().j().getValue();
            AbstractC3292y.f(value2);
            D3((c5.M) value2);
            return;
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(RepliesActivity repliesActivity, View view) {
        repliesActivity.B3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w3(RepliesActivity repliesActivity, TextView textView, int i8, KeyEvent keyEvent) {
        if (i8 == 6) {
            repliesActivity.A3();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(RepliesActivity repliesActivity, View view) {
        repliesActivity.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(RepliesActivity repliesActivity, View view) {
        repliesActivity.A3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z3() {
        T.f15689k.a(this);
        B3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        setContentView(q3().getRoot());
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("review")) {
                q6.w j8 = s3().j();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("review", c5.M.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("review");
                }
                j8.setValue(parcelable);
            }
            if (extras.containsKey("appName")) {
                s3().f().setValue(extras.getString("appName"));
            }
            if (extras.containsKey(HintConstants.AUTOFILL_HINT_USERNAME)) {
                s3().l().setValue(extras.getString(HintConstants.AUTOFILL_HINT_USERNAME));
            }
        }
        u3();
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new a(null), 2, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new b(null), 2, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new c(null), 2, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new d(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, K4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        M3();
        L3();
    }

    public final C1505c0 q3() {
        return (C1505c0) this.f30041O.getValue();
    }

    public final u s3() {
        return (u) this.f30042P.getValue();
    }
}
