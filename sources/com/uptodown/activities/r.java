package com.uptodown.activities;

import R5.AbstractC1435t;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c5.C2033C;
import c5.C2041f;
import c5.C2043h;
import c6.InterfaceC2072n;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.activities.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3775H;
import q5.C3784i;
import q5.C3794s;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public final class r extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f30550a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f30551b;

    /* renamed from: c, reason: collision with root package name */
    private final q6.w f30552c;

    /* renamed from: d, reason: collision with root package name */
    private final q6.w f30553d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30554e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30555f;

    /* renamed from: g, reason: collision with root package name */
    private int f30556g;

    /* renamed from: h, reason: collision with root package name */
    private int f30557h;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C2041f f30558a;

        /* renamed from: b, reason: collision with root package name */
        private final C2043h f30559b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f30560c;

        public a(C2041f c2041f, C2043h appInfo, boolean z8) {
            AbstractC3292y.i(appInfo, "appInfo");
            this.f30558a = c2041f;
            this.f30559b = appInfo;
            this.f30560c = z8;
        }

        public final C2041f a() {
            return this.f30558a;
        }

        public final C2043h b() {
            return this.f30559b;
        }

        public final boolean c() {
            return this.f30560c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3292y.d(this.f30558a, aVar.f30558a) && AbstractC3292y.d(this.f30559b, aVar.f30559b) && this.f30560c == aVar.f30560c;
        }

        public int hashCode() {
            C2041f c2041f = this.f30558a;
            return ((((c2041f == null ? 0 : c2041f.hashCode()) * 31) + this.f30559b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f30560c);
        }

        public String toString() {
            return "OldVersionsData(app=" + this.f30558a + ", appInfo=" + this.f30559b + ", isOldVersionsAvailable=" + this.f30560c + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30561a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30562b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f30563c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, r rVar, U5.d dVar) {
            super(2, dVar);
            this.f30562b = context;
            this.f30563c = rVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(C2033C c2033c, C2033C c2033c2) {
            if (c2033c != null && c2033c2 != null) {
                long l8 = c2033c2.l() - c2033c.l();
                if (l8 == 0 && c2033c.a() != null && c2033c2.a() != null) {
                    String a9 = c2033c2.a();
                    AbstractC3292y.f(a9);
                    long parseLong = Long.parseLong(a9);
                    String a10 = c2033c.a();
                    AbstractC3292y.f(a10);
                    l8 = parseLong - Long.parseLong(a10);
                }
                return (int) l8;
            }
            return 0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f30562b, this.f30563c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            V5.b.e();
            if (this.f30561a == 0) {
                Q5.t.b(obj);
                C3775H c3775h = new C3775H(this.f30562b);
                Object value = this.f30563c.d().getValue();
                AbstractC3292y.f(value);
                c5.K C02 = c3775h.C0(((C2043h) value).h(), 20, this.f30563c.h());
                if (!C02.b() && C02.d() != null) {
                    String d8 = C02.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        C3784i c3784i = new C3784i();
                        Context context = this.f30562b;
                        C2043h c2043h = (C2043h) this.f30563c.d().getValue();
                        if (c2043h != null) {
                            str = c2043h.v0();
                        } else {
                            str = null;
                        }
                        C2041f B8 = c3784i.B(context, str);
                        C2033C.b bVar = C2033C.f15567h;
                        String d9 = C02.d();
                        AbstractC3292y.f(d9);
                        ArrayList a9 = bVar.a(d9);
                        if (a9 == null || a9.size() <= 0) {
                            q6.w wVar = this.f30563c.f30550a;
                            Object value2 = this.f30563c.d().getValue();
                            AbstractC3292y.f(value2);
                            wVar.setValue(new AbstractC3768A.c(new a(B8, (C2043h) value2, false)));
                        } else {
                            AbstractC1435t.B(a9, new Comparator() { // from class: com.uptodown.activities.s
                                @Override // java.util.Comparator
                                public final int compare(Object obj2, Object obj3) {
                                    int j8;
                                    j8 = r.b.j((C2033C) obj2, (C2033C) obj3);
                                    return j8;
                                }
                            });
                            Object value3 = this.f30563c.d().getValue();
                            AbstractC3292y.f(value3);
                            ((C2043h) value3).p1(a9);
                            q6.w wVar2 = this.f30563c.f30550a;
                            Object value4 = this.f30563c.d().getValue();
                            AbstractC3292y.f(value4);
                            wVar2.setValue(new AbstractC3768A.c(new a(B8, (C2043h) value4, true)));
                        }
                    }
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30564a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30566c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f30567d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Context context, U5.d dVar) {
            super(2, dVar);
            this.f30566c = str;
            this.f30567d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f30566c, this.f30567d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            V5.b.e();
            if (this.f30564a == 0) {
                Q5.t.b(obj);
                Object value = r.this.d().getValue();
                AbstractC3292y.f(value);
                if (((C2043h) value).v0() != null) {
                    Object value2 = r.this.d().getValue();
                    AbstractC3292y.f(value2);
                    if (l6.n.s(((C2043h) value2).v0(), this.f30566c, true) && (d8 = SettingsPreferences.f30529b.d(this.f30567d)) != null) {
                        File file = new File(new C3794s().f(this.f30567d), d8);
                        UptodownApp.a aVar = UptodownApp.f29249C;
                        Context context = this.f30567d;
                        Object value3 = r.this.d().getValue();
                        AbstractC3292y.f(value3);
                        aVar.Y(file, context, ((C2043h) value3).r0());
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public r() {
        q6.w a9 = AbstractC3815N.a(AbstractC3768A.a.f37253a);
        this.f30550a = a9;
        this.f30551b = a9;
        this.f30552c = AbstractC3815N.a(null);
        this.f30553d = AbstractC3815N.a(null);
    }

    public final void b(Context context) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new b(context, this, null), 2, null);
    }

    public final q6.w c() {
        return this.f30552c;
    }

    public final q6.w d() {
        return this.f30553d;
    }

    public final InterfaceC3813L e() {
        return this.f30551b;
    }

    public final boolean f() {
        return this.f30555f;
    }

    public final boolean g() {
        return this.f30554e;
    }

    public final int h() {
        return this.f30556g;
    }

    public final int i() {
        return this.f30557h;
    }

    public final void j(Context context, String packageName) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(packageName, "packageName");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new c(packageName, context, null), 2, null);
    }

    public final void k(boolean z8) {
        this.f30555f = z8;
    }

    public final void l(boolean z8) {
        this.f30554e = z8;
    }

    public final void m(int i8) {
        this.f30556g = i8;
    }

    public final void n(int i8) {
        this.f30557h = i8;
    }
}
