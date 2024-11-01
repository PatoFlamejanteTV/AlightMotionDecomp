package com.uptodown.activities;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c5.U;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import n6.AbstractC3462k;
import n6.C3445b0;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.AbstractC3768A;
import q5.C3775H;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public final class M extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f29654a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f29655b;

    /* renamed from: c, reason: collision with root package name */
    private final q6.w f29656c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f29657d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29658a = new a("USERNAME", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f29659b = new a("PASSWORD", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f29660c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ W5.a f29661d;

        static {
            a[] a9 = a();
            f29660c = a9;
            f29661d = W5.b.a(a9);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f29658a, f29659b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f29660c.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f29662a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f29663b;

        /* renamed from: c, reason: collision with root package name */
        private final String f29664c;

        /* renamed from: d, reason: collision with root package name */
        private final a f29665d;

        public b(int i8, boolean z8, String str, a credential) {
            AbstractC3292y.i(credential, "credential");
            this.f29662a = i8;
            this.f29663b = z8;
            this.f29664c = str;
            this.f29665d = credential;
        }

        public final a a() {
            return this.f29665d;
        }

        public final boolean b() {
            return this.f29663b;
        }

        public final String c() {
            return this.f29664c;
        }

        public final int d() {
            return this.f29662a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f29662a == bVar.f29662a && this.f29663b == bVar.f29663b && AbstractC3292y.d(this.f29664c, bVar.f29664c) && this.f29665d == bVar.f29665d;
        }

        public int hashCode() {
            int a9 = ((this.f29662a * 31) + androidx.compose.foundation.a.a(this.f29663b)) * 31;
            String str = this.f29664c;
            return ((a9 + (str == null ? 0 : str.hashCode())) * 31) + this.f29665d.hashCode();
        }

        public String toString() {
            return "CredentialChangeData(success=" + this.f29662a + ", error=" + this.f29663b + ", regErrors=" + this.f29664c + ", credential=" + this.f29665d + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29666a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29668c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29669d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f29670e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f29671f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f29672g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, String str, String str2, T t8, Q q8, U5.d dVar) {
            super(2, dVar);
            this.f29668c = context;
            this.f29669d = str;
            this.f29670e = str2;
            this.f29671f = t8;
            this.f29672g = q8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f29668c, this.f29669d, this.f29670e, this.f29671f, this.f29672g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            V5.b.e();
            if (this.f29666a == 0) {
                Q5.t.b(obj);
                M.this.f29654a.setValue(AbstractC3768A.a.f37253a);
                c5.K e8 = new C3775H(this.f29668c).e(this.f29669d, this.f29670e);
                if (!e8.b() && (d8 = e8.d()) != null && d8.length() != 0) {
                    String d9 = e8.d();
                    AbstractC3292y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    this.f29671f.f34573a = e8.g(jSONObject);
                    if (!jSONObject.isNull("success")) {
                        this.f29672g.f34571a = jSONObject.getInt("success");
                    }
                }
                M.this.f29654a.setValue(new AbstractC3768A.c(new b(this.f29672g.f34571a, e8.b(), (String) this.f29671f.f34573a, a.f29659b)));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29673a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29675c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29676d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f29677e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f29678f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f29679g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ c5.T f29680h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f29681i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, String str, int i8, T t8, Q q8, c5.T t9, String str2, U5.d dVar) {
            super(2, dVar);
            this.f29675c = context;
            this.f29676d = str;
            this.f29677e = i8;
            this.f29678f = t8;
            this.f29679g = q8;
            this.f29680h = t9;
            this.f29681i = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f29675c, this.f29676d, this.f29677e, this.f29678f, this.f29679g, this.f29680h, this.f29681i, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            V5.b.e();
            if (this.f29673a == 0) {
                Q5.t.b(obj);
                M.this.f29654a.setValue(AbstractC3768A.a.f37253a);
                c5.K f8 = new C3775H(this.f29675c).f(this.f29676d, this.f29677e);
                if (!f8.b() && (d8 = f8.d()) != null && d8.length() != 0) {
                    String d9 = f8.d();
                    AbstractC3292y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    this.f29678f.f34573a = f8.g(jSONObject);
                    if (!jSONObject.isNull("success")) {
                        this.f29679g.f34571a = jSONObject.getInt("success");
                        if (this.f29679g.f34571a == 1) {
                            c5.T t8 = this.f29680h;
                            if (t8 != null) {
                                t8.X(this.f29676d);
                            }
                            c5.T t9 = this.f29680h;
                            if (t9 != null) {
                                t9.a0(this.f29681i);
                            }
                            c5.T t10 = this.f29680h;
                            if (t10 != null) {
                                t10.I(this.f29675c);
                            }
                        }
                    }
                }
                M.this.f29654a.setValue(new AbstractC3768A.c(new b(this.f29679g.f34571a, f8.b(), (String) this.f29678f.f34573a, a.f29658a)));
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
        int f29682a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29683b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f29684c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ M f29685d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, ArrayList arrayList, M m8, U5.d dVar) {
            super(2, dVar);
            this.f29683b = context;
            this.f29684c = arrayList;
            this.f29685d = m8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f29683b, this.f29684c, this.f29685d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            V5.b.e();
            if (this.f29682a == 0) {
                Q5.t.b(obj);
                c5.K t02 = new C3775H(this.f29683b).t0();
                if (!t02.b() && (d8 = t02.d()) != null && d8.length() != 0) {
                    String d9 = t02.d();
                    AbstractC3292y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                        int length = jSONArray.length();
                        for (int i8 = 0; i8 < length; i8++) {
                            ArrayList arrayList = this.f29684c;
                            U u8 = new U();
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                            AbstractC3292y.h(jSONObject2, "getJSONObject(...)");
                            u8.a(jSONObject2);
                            arrayList.add(u8);
                        }
                    }
                }
                this.f29685d.f29656c.setValue(this.f29684c);
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public M() {
        q6.w a9 = AbstractC3815N.a(AbstractC3768A.b.f37254a);
        this.f29654a = a9;
        this.f29655b = a9;
        q6.w a10 = AbstractC3815N.a(new ArrayList());
        this.f29656c = a10;
        this.f29657d = a10;
    }

    public final void c(Context context, String newPassword, String confirmNewPassword) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(newPassword, "newPassword");
        AbstractC3292y.i(confirmNewPassword, "confirmNewPassword");
        Q q8 = new Q();
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new c(context, newPassword, confirmNewPassword, new T(), q8, null), 2, null);
    }

    public final void d(Context context, String newUsername, c5.T t8, int i8, String usernameFormat) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(newUsername, "newUsername");
        AbstractC3292y.i(usernameFormat, "usernameFormat");
        Q q8 = new Q();
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new d(context, newUsername, i8, new T(), q8, t8, usernameFormat, null), 2, null);
    }

    public final void e(Context context) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new e(context, new ArrayList(), this, null), 2, null);
    }

    public final InterfaceC3813L f() {
        return this.f29655b;
    }

    public final InterfaceC3813L g() {
        return this.f29657d;
    }
}
