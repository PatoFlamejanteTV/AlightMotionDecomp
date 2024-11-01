package Z4;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Build;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import b5.InterfaceC1984h;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import org.json.JSONObject;
import q5.AbstractC3768A;
import q5.C3775H;
import q5.C3791p;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* loaded from: classes5.dex */
public final class v2 extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f13857a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f13858b;

    /* renamed from: c, reason: collision with root package name */
    private final q6.w f13859c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f13860d;

    /* renamed from: e, reason: collision with root package name */
    private final q6.w f13861e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3813L f13862f;

    /* renamed from: g, reason: collision with root package name */
    private final q6.w f13863g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3813L f13864h;

    /* renamed from: i, reason: collision with root package name */
    private final q6.w f13865i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3813L f13866j;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f13867a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f13868b;

        public a(boolean z8, boolean z9) {
            this.f13867a = z8;
            this.f13868b = z9;
        }

        public final boolean a() {
            return this.f13867a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f13867a == aVar.f13867a && this.f13868b == aVar.f13868b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (androidx.compose.foundation.a.a(this.f13867a) * 31) + androidx.compose.foundation.a.a(this.f13868b);
        }

        public String toString() {
            return "UptodownProtectData(hasPositives=" + this.f13867a + ", isLoading=" + this.f13868b + ')';
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f13869a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13870b;

        public b(int i8, int i9) {
            this.f13869a = i8;
            this.f13870b = i9;
        }

        public final int a() {
            return this.f13869a;
        }

        public final int b() {
            return this.f13870b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f13869a == bVar.f13869a && this.f13870b == bVar.f13870b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f13869a * 31) + this.f13870b;
        }

        public String toString() {
            return "UserNotifiersData(downloadsCount=" + this.f13869a + ", updatesCount=" + this.f13870b + ')';
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13871a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f13872b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, U5.d dVar) {
            super(2, dVar);
            this.f13872b = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f13872b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f13871a == 0) {
                Q5.t.b(obj);
                c5.T.f15689k.a(this.f13872b);
                AccountManager accountManager = AccountManager.get(this.f13872b);
                String string = this.f13872b.getString(R.string.account);
                AbstractC3292y.h(string, "getString(...)");
                Account[] accountsByType = accountManager.getAccountsByType(string);
                AbstractC3292y.h(accountsByType, "getAccountsByType(...)");
                for (Account account : accountsByType) {
                    if (l6.n.s(account.type, string, true)) {
                        if (Build.VERSION.SDK_INT >= 22) {
                            accountManager.removeAccount(account, null, null, null);
                        } else {
                            accountManager.removeAccount(account, null, null);
                        }
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

    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13873a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f13874b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v2 f13875c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, v2 v2Var, U5.d dVar) {
            super(2, dVar);
            this.f13874b = context;
            this.f13875c = v2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f13874b, this.f13875c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int Z8;
            V5.b.e();
            if (this.f13873a == 0) {
                Q5.t.b(obj);
                int a9 = c5.Q.f15674l.a(this.f13874b);
                C3791p a10 = C3791p.f37286s.a(this.f13874b);
                a10.a();
                ArrayList c02 = a10.c0();
                a10.i();
                Iterator it = c02.iterator();
                AbstractC3292y.h(it, "iterator(...)");
                int i8 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    c5.r rVar = (c5.r) next;
                    if (rVar.p() == 0 && (1 > (Z8 = rVar.Z()) || Z8 >= 100 || rVar.z() != 0)) {
                        i8++;
                    }
                }
                this.f13875c.f13859c.setValue(new AbstractC3768A.c(new b(i8, a9)));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13876a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f13878c;

        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC1984h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ v2 f13879a;

            a(v2 v2Var) {
                this.f13879a = v2Var;
            }

            @Override // b5.InterfaceC1984h
            public void a(ArrayList positives) {
                AbstractC3292y.i(positives, "positives");
                if (!positives.isEmpty()) {
                    this.f13879a.f13865i.setValue(new AbstractC3768A.c(new a(true, false)));
                    UptodownApp.f29249C.A0(positives);
                }
            }

            @Override // b5.InterfaceC1984h
            public void b() {
                this.f13879a.f13865i.setValue(new AbstractC3768A.c(new a(false, false)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, U5.d dVar) {
            super(2, dVar);
            this.f13878c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f13878c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f13876a == 0) {
                Q5.t.b(obj);
                v2.this.f13865i.setValue(AbstractC3768A.a.f37253a);
                new X4.a(this.f13878c, new a(v2.this), ViewModelKt.getViewModelScope(v2.this));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13880a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f13881b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c5.T f13882c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ v2 f13883d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context, c5.T t8, v2 v2Var, U5.d dVar) {
            super(2, dVar);
            this.f13881b = context;
            this.f13882c = t8;
            this.f13883d = v2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f13881b, this.f13882c, this.f13883d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f13880a == 0) {
                Q5.t.b(obj);
                C3775H c3775h = new C3775H(this.f13881b);
                String id = this.f13882c.getId();
                AbstractC3292y.f(id);
                c5.K s02 = c3775h.s0(id);
                if (!s02.b() && s02.d() != null) {
                    String d8 = s02.d();
                    AbstractC3292y.f(d8);
                    JSONObject jSONObject = new JSONObject(d8);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        if (!jSONObject2.isNull("reviewsCount")) {
                            this.f13883d.f13857a.setValue(kotlin.coroutines.jvm.internal.b.c(jSONObject2.getInt("reviewsCount")));
                        }
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13884a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f13885b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v2 f13886c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, v2 v2Var, U5.d dVar) {
            super(2, dVar);
            this.f13885b = context;
            this.f13886c = v2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f13885b, this.f13886c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f13884a == 0) {
                Q5.t.b(obj);
                c5.K R8 = new C3775H(this.f13885b).R();
                if (!R8.b() && R8.d() != null) {
                    String d8 = R8.d();
                    AbstractC3292y.f(d8);
                    JSONObject jSONObject = new JSONObject(d8);
                    if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        if (!jSONObject2.isNull("url")) {
                            this.f13886c.f13863g.setValue(new AbstractC3768A.c(jSONObject2.getString("url")));
                        }
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13887a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f13888b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v2 f13889c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context, v2 v2Var, U5.d dVar) {
            super(2, dVar);
            this.f13888b = context;
            this.f13889c = v2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new h(this.f13888b, this.f13889c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String id;
            String d8;
            V5.b.e();
            if (this.f13887a == 0) {
                Q5.t.b(obj);
                C3775H c3775h = new C3775H(this.f13888b);
                c5.T e8 = c5.T.f15689k.e(this.f13888b);
                if (e8 != null && (id = e8.getId()) != null && id.length() != 0) {
                    String id2 = e8.getId();
                    AbstractC3292y.f(id2);
                    c5.K a02 = c3775h.a0(id2);
                    if (!a02.b() && (d8 = a02.d()) != null && d8.length() != 0) {
                        String d9 = a02.d();
                        AbstractC3292y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            if (!jSONObject2.isNull("url")) {
                                this.f13889c.f13861e.setValue(new AbstractC3768A.c(jSONObject2.getString("url")));
                            }
                        }
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public v2() {
        q6.w a9 = AbstractC3815N.a(0);
        this.f13857a = a9;
        this.f13858b = a9;
        q6.w a10 = AbstractC3815N.a(AbstractC3768A.b.f37254a);
        this.f13859c = a10;
        this.f13860d = a10;
        AbstractC3768A.a aVar = AbstractC3768A.a.f37253a;
        q6.w a11 = AbstractC3815N.a(aVar);
        this.f13861e = a11;
        this.f13862f = a11;
        q6.w a12 = AbstractC3815N.a(aVar);
        this.f13863g = a12;
        this.f13864h = a12;
        q6.w a13 = AbstractC3815N.a(aVar);
        this.f13865i = a13;
        this.f13866j = a13;
    }

    public final void f(Context context) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new c(context, null), 2, null);
    }

    public final void g(Context context) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new d(context, this, null), 2, null);
    }

    public final void h(Context context) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new e(context, null), 2, null);
    }

    public final void i(Context context, c5.T user) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(user, "user");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new f(context, user, this, null), 2, null);
    }

    public final InterfaceC3813L j() {
        return this.f13864h;
    }

    public final void k(Context context) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new g(context, this, null), 2, null);
    }

    public final InterfaceC3813L l() {
        return this.f13862f;
    }

    public final void m(Context context) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new h(context, this, null), 2, null);
    }

    public final InterfaceC3813L n() {
        return this.f13866j;
    }

    public final InterfaceC3813L o() {
        return this.f13860d;
    }

    public final InterfaceC3813L p() {
        return this.f13858b;
    }
}
