package com.uptodown.activities;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c5.C2032B;
import c6.InterfaceC2072n;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3791p;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public final class q extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f30534a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f30535b;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f30536a;

        public a(ArrayList notificationsRegistry) {
            AbstractC3292y.i(notificationsRegistry, "notificationsRegistry");
            this.f30536a = notificationsRegistry;
        }

        public final ArrayList a() {
            return this.f30536a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3292y.d(this.f30536a, ((a) obj).f30536a);
        }

        public int hashCode() {
            return this.f30536a.hashCode();
        }

        public String toString() {
            return "NotificationRegistryData(notificationsRegistry=" + this.f30536a + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30537a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30538b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f30539c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, q qVar, U5.d dVar) {
            super(2, dVar);
            this.f30538b = context;
            this.f30539c = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f30538b, this.f30539c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30537a == 0) {
                Q5.t.b(obj);
                C3791p a9 = C3791p.f37286s.a(this.f30538b);
                a9.a();
                a9.p();
                a9.i();
                this.f30539c.d(this.f30538b);
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
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30540a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30541b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f30542c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i8, U5.d dVar) {
            super(2, dVar);
            this.f30541b = context;
            this.f30542c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f30541b, this.f30542c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30540a == 0) {
                Q5.t.b(obj);
                C3791p a9 = C3791p.f37286s.a(this.f30541b);
                a9.a();
                a9.H(this.f30542c);
                a9.i();
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
        int f30543a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30544b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f30545c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, q qVar, U5.d dVar) {
            super(2, dVar);
            this.f30544b = context;
            this.f30545c = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f30544b, this.f30545c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30543a == 0) {
                Q5.t.b(obj);
                C3791p a9 = C3791p.f37286s.a(this.f30544b);
                a9.a();
                ArrayList l02 = a9.l0();
                a9.i();
                this.f30545c.f30534a.setValue(new AbstractC3768A.c(new a(l02)));
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
        int f30546a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30547b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2032B f30548c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30549d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, C2032B c2032b, String str, U5.d dVar) {
            super(2, dVar);
            this.f30547b = context;
            this.f30548c = c2032b;
            this.f30549d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f30547b, this.f30548c, this.f30549d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30546a == 0) {
                Q5.t.b(obj);
                C3791p a9 = C3791p.f37286s.a(this.f30547b);
                a9.a();
                C2032B c2032b = this.f30548c;
                String string = this.f30547b.getString(R.string.file_deleted_notification, this.f30549d);
                AbstractC3292y.h(string, "getString(...)");
                a9.s1(c2032b, "no_action", string);
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public q() {
        q6.w a9 = AbstractC3815N.a(AbstractC3768A.a.f37253a);
        this.f30534a = a9;
        this.f30535b = a9;
    }

    public final void b(Context context) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new b(context, this, null), 2, null);
    }

    public final void c(Context context, int i8) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new c(context, i8, null), 2, null);
    }

    public final void d(Context context) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new d(context, this, null), 2, null);
    }

    public final InterfaceC3813L e() {
        return this.f30535b;
    }

    public final void f(Context context, C2032B notification, String dateString) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(notification, "notification");
        AbstractC3292y.i(dateString, "dateString");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new e(context, notification, dateString, null), 2, null);
    }
}
