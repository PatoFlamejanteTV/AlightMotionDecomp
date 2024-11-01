package com.uptodown.activities;

import I4.S;
import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import Y4.y0;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c5.C2043h;
import c5.M;
import c5.T;
import c6.InterfaceC2072n;
import com.google.android.material.snackbar.Snackbar;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.L;
import com.uptodown.activities.UserCommentsActivity;
import com.uptodown.util.views.UsernameTextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3770C;
import q5.C3788m;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class UserCommentsActivity extends AbstractActivityC2691a {

    /* renamed from: Q, reason: collision with root package name */
    private S f30284Q;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1416k f30282O = Q5.l.b(new Function0() { // from class: F4.e5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.y0 g32;
            g32 = UserCommentsActivity.g3(UserCommentsActivity.this);
            return g32;
        }
    });

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1416k f30283P = new ViewModelLazy(U.b(L.class), new f(this), new e(this), new g(null, this));

    /* renamed from: R, reason: collision with root package name */
    private b f30285R = new b();

    /* loaded from: classes4.dex */
    public static final class a extends RecyclerView.OnScrollListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LinearLayoutManager f30286a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UserCommentsActivity f30287b;

        a(LinearLayoutManager linearLayoutManager, UserCommentsActivity userCommentsActivity) {
            this.f30286a = linearLayoutManager;
            this.f30287b = userCommentsActivity;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            AbstractC3292y.i(recyclerView, "recyclerView");
            if (i9 > 0) {
                int findFirstVisibleItemPosition = this.f30286a.findFirstVisibleItemPosition();
                int childCount = this.f30286a.getChildCount();
                int itemCount = this.f30286a.getItemCount();
                if (!this.f30287b.k3().i() && childCount + findFirstVisibleItemPosition >= itemCount) {
                    S s8 = this.f30287b.f30284Q;
                    if (s8 != null) {
                        s8.c(true);
                    }
                    this.f30287b.i3();
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements b5.G {

        /* loaded from: classes4.dex */
        public static final class a implements b5.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserCommentsActivity f30289a;

            a(UserCommentsActivity userCommentsActivity) {
                this.f30289a = userCommentsActivity;
            }

            @Override // b5.r
            public void b(int i8) {
            }

            @Override // b5.r
            public void c(C2043h appInfo) {
                AbstractC3292y.i(appInfo, "appInfo");
                Intent intent = new Intent(this.f30289a, (Class<?>) AppDetailActivity.class);
                intent.putExtra("appInfo", appInfo);
                UserCommentsActivity userCommentsActivity = this.f30289a;
                userCommentsActivity.startActivity(intent, UptodownApp.f29249C.a(userCommentsActivity));
            }
        }

        b() {
        }

        @Override // b5.G
        public void a(int i8) {
            if (UptodownApp.f29249C.a0()) {
                C3770C c3770c = C3770C.f37260a;
                S s8 = UserCommentsActivity.this.f30284Q;
                AbstractC3292y.f(s8);
                if (!c3770c.h(((c5.M) s8.b().get(i8)).l())) {
                    L k32 = UserCommentsActivity.this.k3();
                    UserCommentsActivity userCommentsActivity = UserCommentsActivity.this;
                    S s9 = userCommentsActivity.f30284Q;
                    AbstractC3292y.f(s9);
                    Object obj = s9.b().get(i8);
                    AbstractC3292y.h(obj, "get(...)");
                    k32.q(userCommentsActivity, (c5.M) obj);
                }
            }
        }

        @Override // b5.G
        public void b(int i8) {
            Intent intent = new Intent(UserCommentsActivity.this, (Class<?>) RepliesActivity.class);
            S s8 = UserCommentsActivity.this.f30284Q;
            AbstractC3292y.f(s8);
            Object obj = s8.b().get(i8);
            c5.M m8 = (c5.M) obj;
            m8.Y((String) UserCommentsActivity.this.k3().l().getValue());
            AbstractC3292y.h(obj, "apply(...)");
            m8.e0(((Boolean) UserCommentsActivity.this.k3().p().getValue()).booleanValue() ? 1 : 0);
            m8.h0((String) UserCommentsActivity.this.k3().o().getValue());
            intent.putExtra("review", m8);
            intent.putExtra(HintConstants.AUTOFILL_HINT_USERNAME, (String) UserCommentsActivity.this.k3().n().getValue());
            UserCommentsActivity userCommentsActivity = UserCommentsActivity.this;
            userCommentsActivity.startActivity(intent, UptodownApp.f29249C.a(userCommentsActivity));
        }

        @Override // b5.G
        public void c(int i8) {
            if (UptodownApp.f29249C.a0()) {
                UserCommentsActivity userCommentsActivity = UserCommentsActivity.this;
                S s8 = userCommentsActivity.f30284Q;
                AbstractC3292y.f(s8);
                new X4.i(userCommentsActivity, ((c5.M) s8.b().get(i8)).b(), new a(UserCommentsActivity.this), LifecycleOwnerKt.getLifecycleScope(UserCommentsActivity.this));
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30290a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserCommentsActivity f30292a;

            a(UserCommentsActivity userCommentsActivity) {
                this.f30292a = userCommentsActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void f(UserCommentsActivity userCommentsActivity, View view) {
                userCommentsActivity.V2();
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (abstractC3768A instanceof AbstractC3768A.a) {
                    this.f30292a.h3().f13096d.f12236b.setVisibility(0);
                } else if (abstractC3768A instanceof AbstractC3768A.c) {
                    AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                    if (((L.a) cVar.a()).b() != null && ((L.a) cVar.a()).c()) {
                        String h8 = ((L.a) cVar.a()).b().h();
                        if (h8 != null && h8.length() != 0) {
                            com.squareup.picasso.s.h().l(T.f15689k.c(((L.a) cVar.a()).b().b())).n(UptodownApp.f29249C.f0(this.f30292a)).i(this.f30292a.h3().f13094b);
                        }
                        this.f30292a.h3().f13103k.setText(((L.a) cVar.a()).b().s());
                        UsernameTextView.a aVar = UsernameTextView.f31178k;
                        UsernameTextView tvUsernameUserComment = this.f30292a.h3().f13103k;
                        AbstractC3292y.h(tvUsernameUserComment, "tvUsernameUserComment");
                        aVar.a(tvUsernameUserComment, ((L.a) cVar.a()).b().z(), ((L.a) cVar.a()).b().w());
                        this.f30292a.h3().f13100h.setText(((L.a) cVar.a()).b().u());
                        if (((L.a) cVar.a()).b().z()) {
                            this.f30292a.h3().f13095c.setVisibility(0);
                            ImageView imageView = this.f30292a.h3().f13095c;
                            final UserCommentsActivity userCommentsActivity = this.f30292a;
                            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.K
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    UserCommentsActivity.c.a.f(UserCommentsActivity.this, view);
                                }
                            });
                            C3788m.a aVar2 = C3788m.f37279a;
                            ImageView ivAvatarUserComment = this.f30292a.h3().f13094b;
                            AbstractC3292y.h(ivAvatarUserComment, "ivAvatarUserComment");
                            aVar2.a(ivAvatarUserComment);
                        }
                        if (!((L.a) cVar.a()).a().isEmpty()) {
                            if (this.f30292a.f30284Q != null) {
                                S s8 = this.f30292a.f30284Q;
                                AbstractC3292y.f(s8);
                                s8.a(((L.a) cVar.a()).a());
                            } else {
                                this.f30292a.f30284Q = new S(((L.a) cVar.a()).a(), this.f30292a.f30285R);
                                this.f30292a.h3().f13098f.setAdapter(this.f30292a.f30284Q);
                            }
                        }
                        S s9 = this.f30292a.f30284Q;
                        if (s9 != null) {
                            s9.c(false);
                        }
                        this.f30292a.h3().f13104l.setVisibility(0);
                    } else {
                        this.f30292a.h3().f13101i.setTypeface(J4.j.f4395g.v());
                        this.f30292a.h3().f13101i.setVisibility(0);
                        this.f30292a.h3().f13097e.setVisibility(8);
                    }
                    this.f30292a.k3().r(false);
                    this.f30292a.h3().f13096d.f12236b.setVisibility(8);
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
            int i8 = this.f30290a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L h8 = UserCommentsActivity.this.k3().h();
                a aVar = new a(UserCommentsActivity.this);
                this.f30290a = 1;
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
        int f30293a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserCommentsActivity f30295a;

            a(UserCommentsActivity userCommentsActivity) {
                this.f30295a = userCommentsActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (abstractC3768A instanceof AbstractC3768A.c) {
                    AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                    if (((M.c) cVar.a()).b() == 1) {
                        S s8 = this.f30295a.f30284Q;
                        if (s8 != null) {
                            s8.d(((M.c) cVar.a()).a());
                        }
                    } else {
                        Snackbar.make(this.f30295a.h3().f13098f, R.string.error_generico, -1).show();
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
            int i8 = this.f30293a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L k8 = UserCommentsActivity.this.k3().k();
                a aVar = new a(UserCommentsActivity.this);
                this.f30293a = 1;
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
    public static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30296a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f30296a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30296a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30297a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f30297a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30297a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30298a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30299b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30298a = function0;
            this.f30299b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30298a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30299b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y0 g3(UserCommentsActivity userCommentsActivity) {
        return y0.c(userCommentsActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y0 h3() {
        return (y0) this.f30282O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i3() {
        CharSequence charSequence = (CharSequence) k3().m().getValue();
        if (charSequence != null && charSequence.length() != 0) {
            k3().r(true);
            k3().g(this);
        }
    }

    private final String j3() {
        Bundle extras;
        if (getIntent() != null && (extras = getIntent().getExtras()) != null && extras.containsKey("userID")) {
            return extras.getString("userID");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L k3() {
        return (L) this.f30283P.getValue();
    }

    private final void l3() {
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            h3().f13099g.setNavigationIcon(drawable);
            h3().f13099g.setNavigationContentDescription(getString(R.string.back));
        }
        h3().f13099g.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.d5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCommentsActivity.m3(UserCommentsActivity.this, view);
            }
        });
        TextView textView = h3().f13102j;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        h3().f13103k.setTypeface(aVar.u());
        h3().f13100h.setTypeface(aVar.v());
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        h3().f13098f.addItemDecoration(new s5.q(dimension, dimension, dimension, dimension));
        h3().f13098f.setLayoutManager(linearLayoutManager);
        String str = null;
        h3().f13098f.setItemAnimator(null);
        h3().f13098f.addOnScrollListener(new a(linearLayoutManager, this));
        Object value = k3().m().getValue();
        T e8 = T.f15689k.e(this);
        if (e8 != null) {
            str = e8.getId();
        }
        if (AbstractC3292y.d(value, str)) {
            h3().f13097e.setVisibility(8);
        }
        i3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m3(UserCommentsActivity userCommentsActivity, View view) {
        userCommentsActivity.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(h3().getRoot());
        k3().m().setValue(j3());
        l3();
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new c(null), 2, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new d(null), 2, null);
    }
}
