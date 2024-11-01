package com.uptodown.activities;

import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import Y4.v0;
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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import b5.InterfaceC1982f;
import c5.C2044i;
import c5.T;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.activities.J;
import com.uptodown.activities.UserAvatarActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3775H;
import q5.C3788m;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class UserAvatarActivity extends AbstractActivityC2691a {

    /* renamed from: Q, reason: collision with root package name */
    private I4.O f30262Q;

    /* renamed from: R, reason: collision with root package name */
    private I4.O f30263R;

    /* renamed from: S, reason: collision with root package name */
    private int f30264S;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1416k f30260O = Q5.l.b(new Function0() { // from class: F4.c5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.v0 k32;
            k32 = UserAvatarActivity.k3(UserAvatarActivity.this);
            return k32;
        }
    });

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1416k f30261P = new ViewModelLazy(U.b(J.class), new g(this), new f(this), new h(null, this));

    /* renamed from: T, reason: collision with root package name */
    private final AtomicBoolean f30265T = new AtomicBoolean(false);

    /* renamed from: U, reason: collision with root package name */
    private final c f30266U = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30267a;

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
            int i8 = this.f30267a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                if (UserAvatarActivity.this.f30265T.compareAndSet(false, true)) {
                    UserAvatarActivity userAvatarActivity = UserAvatarActivity.this;
                    this.f30267a = 1;
                    if (userAvatarActivity.u3(this) == e8) {
                        return e8;
                    }
                }
                return Q5.I.f8786a;
            }
            UserAvatarActivity.this.f30265T.set(false);
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30269a;

        b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30269a == 0) {
                Q5.t.b(obj);
                UserAvatarActivity.this.o3();
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC1982f {
        c() {
        }

        @Override // b5.InterfaceC1982f
        public void a(C2044i avatar, int i8) {
            AbstractC3292y.i(avatar, "avatar");
            if (UserAvatarActivity.this.f30263R != null) {
                I4.O o8 = UserAvatarActivity.this.f30263R;
                AbstractC3292y.f(o8);
                if (o8.c() != -1) {
                    I4.O o9 = UserAvatarActivity.this.f30263R;
                    AbstractC3292y.f(o9);
                    I4.O o10 = UserAvatarActivity.this.f30263R;
                    AbstractC3292y.f(o10);
                    o9.notifyItemChanged(o10.c());
                    I4.O o11 = UserAvatarActivity.this.f30263R;
                    AbstractC3292y.f(o11);
                    o11.d(-1);
                    I4.O o12 = UserAvatarActivity.this.f30263R;
                    AbstractC3292y.f(o12);
                    o12.notifyItemChanged(i8);
                }
            }
            I4.O o13 = UserAvatarActivity.this.f30262Q;
            AbstractC3292y.f(o13);
            o13.d(i8);
            I4.O o14 = UserAvatarActivity.this.f30262Q;
            AbstractC3292y.f(o14);
            o14.notifyDataSetChanged();
        }

        @Override // b5.InterfaceC1982f
        public void b(C2044i avatar, int i8) {
            AbstractC3292y.i(avatar, "avatar");
            if (UserAvatarActivity.this.p3().f().getValue() != null) {
                Object value = UserAvatarActivity.this.p3().f().getValue();
                AbstractC3292y.f(value);
                if (((T) value).x(UserAvatarActivity.this)) {
                    Object value2 = UserAvatarActivity.this.p3().f().getValue();
                    AbstractC3292y.f(value2);
                    if (((T) value2).y()) {
                        I4.O o8 = UserAvatarActivity.this.f30262Q;
                        if (o8 == null || o8.c() != -1) {
                            I4.O o9 = UserAvatarActivity.this.f30262Q;
                            AbstractC3292y.f(o9);
                            o9.d(-1);
                            I4.O o10 = UserAvatarActivity.this.f30262Q;
                            AbstractC3292y.f(o10);
                            o10.notifyDataSetChanged();
                        }
                        I4.O o11 = UserAvatarActivity.this.f30263R;
                        if (o11 != null) {
                            I4.O o12 = UserAvatarActivity.this.f30263R;
                            AbstractC3292y.f(o12);
                            o11.notifyItemChanged(o12.c());
                        }
                        I4.O o13 = UserAvatarActivity.this.f30263R;
                        if (o13 != null) {
                            o13.d(i8);
                        }
                        I4.O o14 = UserAvatarActivity.this.f30263R;
                        if (o14 != null) {
                            o14.notifyItemChanged(i8);
                            return;
                        }
                        return;
                    }
                }
            }
            C3788m.r(new C3788m(), UserAvatarActivity.this, C3775H.f37269c.c(UserAvatarActivity.this), null, 4, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30272a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserAvatarActivity f30274a;

            a(UserAvatarActivity userAvatarActivity) {
                this.f30274a = userAvatarActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (abstractC3768A instanceof AbstractC3768A.a) {
                    this.f30274a.m3().f13038d.f12236b.setVisibility(0);
                } else if (abstractC3768A instanceof AbstractC3768A.c) {
                    this.f30274a.m3().f13038d.f12236b.setVisibility(8);
                    this.f30274a.m3().f13044j.setVisibility(0);
                    AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                    this.f30274a.l3(((J.a) cVar.a()).a(), ((J.a) cVar.a()).b());
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
            int i8 = this.f30272a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L d8 = UserAvatarActivity.this.p3().d();
                a aVar = new a(UserAvatarActivity.this);
                this.f30272a = 1;
                if (d8.collect(aVar, this) == e8) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30275a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserAvatarActivity f30277a;

            a(UserAvatarActivity userAvatarActivity) {
                this.f30277a = userAvatarActivity;
            }

            public final Object b(boolean z8, U5.d dVar) {
                if (z8) {
                    UserAvatarActivity userAvatarActivity = this.f30277a;
                    Toast.makeText(userAvatarActivity, userAvatarActivity.getString(R.string.avatar_activity_changed_success), 1).show();
                    this.f30277a.finish();
                }
                return Q5.I.f8786a;
            }

            @Override // q6.InterfaceC3822g
            public /* bridge */ /* synthetic */ Object emit(Object obj, U5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
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
            int i8 = this.f30275a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L e9 = UserAvatarActivity.this.p3().e();
                a aVar = new a(UserAvatarActivity.this);
                this.f30275a = 1;
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

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30278a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f30278a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30278a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30279a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f30279a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30279a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30280a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30281b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30280a = function0;
            this.f30281b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30280a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30281b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v0 k3(UserAvatarActivity userAvatarActivity) {
        return v0.c(userAvatarActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l3(ArrayList arrayList, ArrayList arrayList2) {
        boolean z8;
        int i8 = 0;
        if (this.f30262Q == null) {
            this.f30262Q = new I4.O(arrayList, this.f30266U, 0, this.f30264S, false, 16, null);
            m3().f13039e.setAdapter(this.f30262Q);
            m3().f13042h.setVisibility(0);
        }
        m3().f13037c.setVisibility(8);
        if (!arrayList2.isEmpty()) {
            m3().f13037c.setVisibility(0);
            T e8 = T.f15689k.e(this);
            if (e8 != null) {
                z8 = e8.y();
            } else {
                z8 = false;
            }
            if (this.f30263R == null) {
                this.f30263R = new I4.O(arrayList2, this.f30266U, 1, 0, z8, 8, null);
                m3().f13040f.setAdapter(this.f30263R);
                m3().f13040f.setVisibility(0);
            }
        } else {
            m3().f13037c.setVisibility(8);
            m3().f13040f.setVisibility(8);
        }
        Iterator it = arrayList.iterator();
        int i9 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((C2044i) it.next()).b() == 1) {
                    break;
                } else {
                    i9++;
                }
            } else {
                i9 = -1;
                break;
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((C2044i) it2.next()).b() == 1) {
                    break;
                } else {
                    i8++;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        if (i9 > -1) {
            I4.O o8 = this.f30262Q;
            if (o8 != null) {
                o8.d(i9);
            }
            I4.O o9 = this.f30262Q;
            if (o9 != null) {
                o9.notifyItemChanged(i9);
                return;
            }
            return;
        }
        if (i8 > -1) {
            I4.O o10 = this.f30263R;
            if (o10 != null) {
                o10.d(i8);
            }
            I4.O o11 = this.f30263R;
            if (o11 != null) {
                o11.notifyItemChanged(i8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v0 m3() {
        return (v0) this.f30260O.getValue();
    }

    private final int n3() {
        int i8 = getResources().getDisplayMetrics().widthPixels;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.margin_m);
        int i9 = 6;
        while (true) {
            if ((i8 - ((i9 + 1) * dimensionPixelSize)) / i9 > getResources().getDimensionPixelSize(R.dimen.icon_size_l)) {
                break;
            }
            i9--;
            if (i9 <= 0) {
                i9 = 1;
                break;
            }
        }
        this.f30264S = (i8 - (dimensionPixelSize * (i9 + 1))) / i9;
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o3() {
        p3().c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final J p3() {
        return (J) this.f30261P.getValue();
    }

    private final void q3() {
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        v0 m32 = m3();
        if (drawable != null) {
            m32.f13041g.setNavigationIcon(drawable);
            m32.f13041g.setNavigationContentDescription(getString(R.string.back));
        }
        m32.f13041g.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.Z4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserAvatarActivity.r3(UserAvatarActivity.this, view);
            }
        });
        TextView textView = m32.f13045k;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        m32.f13044j.setTypeface(aVar.u());
        m32.f13043i.setTypeface(aVar.u());
        m32.f13042h.setTypeface(aVar.u());
        m32.f13046l.setTypeface(aVar.u());
        m32.f13043i.setOnClickListener(new View.OnClickListener() { // from class: F4.a5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserAvatarActivity.s3(UserAvatarActivity.this, view);
            }
        });
        if (p3().f().getValue() != null) {
            Object value = p3().f().getValue();
            AbstractC3292y.f(value);
            if (((T) value).y()) {
                m32.f13036b.setOnClickListener(new View.OnClickListener() { // from class: F4.b5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UserAvatarActivity.t3(UserAvatarActivity.this, view);
                    }
                });
            }
        }
        m32.f13039e.setLayoutManager(new GridLayoutManager(this, n3()));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        m32.f13039e.setItemAnimator(defaultItemAnimator);
        m32.f13040f.setLayoutManager(new LinearLayoutManager(this, 0, false));
        m32.f13040f.addItemDecoration(new s5.t(this));
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(UserAvatarActivity userAvatarActivity, View view) {
        userAvatarActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s3(UserAvatarActivity userAvatarActivity, View view) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(userAvatarActivity), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(UserAvatarActivity userAvatarActivity, View view) {
        C3788m.r(new C3788m(), userAvatarActivity, C3775H.f37269c.c(userAvatarActivity), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u3(U5.d r7) {
        /*
            r6 = this;
            androidx.lifecycle.LifecycleCoroutineScope r0 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r6)
            n6.J0 r1 = n6.C3445b0.c()
            com.uptodown.activities.UserAvatarActivity$e r3 = new com.uptodown.activities.UserAvatarActivity$e
            r7 = 0
            r3.<init>(r7)
            r4 = 2
            r5 = 0
            r2 = 0
            n6.AbstractC3458i.d(r0, r1, r2, r3, r4, r5)
            I4.O r0 = r6.f30262Q
            r1 = -1
            if (r0 == 0) goto L3b
            kotlin.jvm.internal.AbstractC3292y.f(r0)
            int r0 = r0.c()
            if (r0 == r1) goto L3b
            I4.O r7 = r6.f30262Q
            kotlin.jvm.internal.AbstractC3292y.f(r7)
            java.util.ArrayList r7 = r7.b()
            I4.O r0 = r6.f30262Q
            kotlin.jvm.internal.AbstractC3292y.f(r0)
            int r0 = r0.c()
            java.lang.Object r7 = r7.get(r0)
            c5.i r7 = (c5.C2044i) r7
            goto L60
        L3b:
            I4.O r0 = r6.f30263R
            if (r0 == 0) goto L60
            kotlin.jvm.internal.AbstractC3292y.f(r0)
            int r0 = r0.c()
            if (r0 == r1) goto L60
            I4.O r7 = r6.f30263R
            kotlin.jvm.internal.AbstractC3292y.f(r7)
            java.util.ArrayList r7 = r7.b()
            I4.O r0 = r6.f30263R
            kotlin.jvm.internal.AbstractC3292y.f(r0)
            int r0 = r0.c()
            java.lang.Object r7 = r7.get(r0)
            c5.i r7 = (c5.C2044i) r7
        L60:
            if (r7 == 0) goto L69
            com.uptodown.activities.J r0 = r6.p3()
            r0.g(r6, r7)
        L69:
            Q5.I r7 = Q5.I.f8786a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.UserAvatarActivity.u3(U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m3().getRoot());
        p3().f().setValue(T.f15689k.e(this));
        q3();
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new d(null), 2, null);
    }
}
