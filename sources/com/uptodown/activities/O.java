package com.uptodown.activities;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c5.C2043h;
import c5.W;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3791p;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public final class O extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f29961a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f29962b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29963c;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f29964a;

        public a(ArrayList wishlist) {
            AbstractC3292y.i(wishlist, "wishlist");
            this.f29964a = wishlist;
        }

        public final ArrayList a() {
            return this.f29964a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3292y.d(this.f29964a, ((a) obj).f29964a);
        }

        public int hashCode() {
            return this.f29964a.hashCode();
        }

        public String toString() {
            return "WishlistData(wishlist=" + this.f29964a + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29965a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29966b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ O f29967c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f29968d;

        /* loaded from: classes4.dex */
        public static final class a implements b5.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ W f29969a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f29970b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1 f29971c;

            a(W w8, Context context, Function1 function1) {
                this.f29969a = w8;
                this.f29970b = context;
                this.f29971c = function1;
            }

            @Override // b5.r
            public void b(int i8) {
                if (i8 == 404) {
                    this.f29969a.i(this.f29970b);
                    this.f29971c.invoke(this.f29969a);
                }
            }

            @Override // b5.r
            public void c(C2043h appInfo) {
                AbstractC3292y.i(appInfo, "appInfo");
                if (!appInfo.g1()) {
                    this.f29969a.q(this.f29970b, 0);
                    this.f29971c.invoke(this.f29969a);
                } else if (appInfo.g1() && this.f29969a.b() == 0) {
                    this.f29969a.q(this.f29970b, 1);
                    this.f29971c.invoke(this.f29969a);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, O o8, Function1 function1, U5.d dVar) {
            super(2, dVar);
            this.f29966b = context;
            this.f29967c = o8;
            this.f29968d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f29966b, this.f29967c, this.f29968d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29965a == 0) {
                Q5.t.b(obj);
                C3791p a9 = C3791p.f37286s.a(this.f29966b);
                a9.a();
                ArrayList u02 = a9.u0();
                ArrayList c02 = a9.c0();
                if (!this.f29967c.f29963c) {
                    Iterator it = u02.iterator();
                    AbstractC3292y.h(it, "iterator(...)");
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC3292y.h(next, "next(...)");
                        W w8 = (W) next;
                        new X4.i(this.f29966b, w8.a(), new a(w8, this.f29966b, this.f29968d), ViewModelKt.getViewModelScope(this.f29967c));
                    }
                }
                a9.i();
                Iterator it2 = u02.iterator();
                AbstractC3292y.h(it2, "iterator(...)");
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    AbstractC3292y.h(next2, "next(...)");
                    W w9 = (W) next2;
                    Iterator it3 = c02.iterator();
                    AbstractC3292y.h(it3, "iterator(...)");
                    while (it3.hasNext()) {
                        Object next3 = it3.next();
                        AbstractC3292y.h(next3, "next(...)");
                        c5.r rVar = (c5.r) next3;
                        if (w9.a() == rVar.h()) {
                            String w10 = rVar.w();
                            AbstractC3292y.f(w10);
                            w9.l(w10);
                        }
                    }
                }
                this.f29967c.f29963c = true;
                this.f29967c.f29961a.setValue(new AbstractC3768A.c(new a(u02)));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public O() {
        q6.w a9 = AbstractC3815N.a(AbstractC3768A.a.f37253a);
        this.f29961a = a9;
        this.f29962b = a9;
    }

    public final void d(Context context, Function1 callback) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(callback, "callback");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new b(context, this, callback, null), 2, null);
    }

    public final InterfaceC3813L e() {
        return this.f29962b;
    }
}
