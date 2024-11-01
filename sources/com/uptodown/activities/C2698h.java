package com.uptodown.activities;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import n6.AbstractC3462k;
import n6.C3445b0;
import org.json.JSONObject;
import q5.AbstractC3768A;
import q5.C3775H;
import q5.C3795t;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* renamed from: com.uptodown.activities.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2698h extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f30447a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f30448b;

    /* renamed from: c, reason: collision with root package name */
    private final q6.w f30449c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f30450d;

    /* renamed from: com.uptodown.activities.h$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f30451a;

        /* renamed from: b, reason: collision with root package name */
        private final String f30452b;

        /* renamed from: c, reason: collision with root package name */
        private final String f30453c;

        public a(int i8, String str, String str2) {
            this.f30451a = i8;
            this.f30452b = str;
            this.f30453c = str2;
        }

        public final String a() {
            return this.f30452b;
        }

        public final String b() {
            return this.f30453c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f30451a == aVar.f30451a && AbstractC3292y.d(this.f30452b, aVar.f30452b) && AbstractC3292y.d(this.f30453c, aVar.f30453c);
        }

        public int hashCode() {
            int i8 = this.f30451a * 31;
            String str = this.f30452b;
            int hashCode = (i8 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f30453c;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "LoginData(loginResult=" + this.f30451a + ", loginMessage=" + this.f30452b + ", regErrors=" + this.f30453c + ')';
        }
    }

    /* renamed from: com.uptodown.activities.h$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f30454a;

        /* renamed from: b, reason: collision with root package name */
        private final String f30455b;

        /* renamed from: c, reason: collision with root package name */
        private final String f30456c;

        public b(int i8, String str, String str2) {
            this.f30454a = i8;
            this.f30455b = str;
            this.f30456c = str2;
        }

        public final String a() {
            return this.f30456c;
        }

        public final String b() {
            return this.f30455b;
        }

        public final int c() {
            return this.f30454a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f30454a == bVar.f30454a && AbstractC3292y.d(this.f30455b, bVar.f30455b) && AbstractC3292y.d(this.f30456c, bVar.f30456c);
        }

        public int hashCode() {
            int i8 = this.f30454a * 31;
            String str = this.f30455b;
            int hashCode = (i8 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f30456c;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "SignUpData(success=" + this.f30454a + ", signUpMessage=" + this.f30455b + ", regErrors=" + this.f30456c + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.h$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30457a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30459c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30460d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f30461e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f30462f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f30463g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ T f30464h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ T f30465i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, String str, String str2, T t8, Q q8, T t9, T t10, U5.d dVar) {
            super(2, dVar);
            this.f30459c = context;
            this.f30460d = str;
            this.f30461e = str2;
            this.f30462f = t8;
            this.f30463g = q8;
            this.f30464h = t9;
            this.f30465i = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f30459c, this.f30460d, this.f30461e, this.f30462f, this.f30463g, this.f30464h, this.f30465i, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            V5.b.e();
            if (this.f30457a == 0) {
                Q5.t.b(obj);
                C2698h.this.f30447a.setValue(AbstractC3768A.a.f37253a);
                c5.K B02 = new C3775H(this.f30459c).B0(this.f30460d, this.f30461e);
                if (!B02.b() && (d8 = B02.d()) != null && d8.length() != 0) {
                    T t8 = new T();
                    String d9 = B02.d();
                    AbstractC3292y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    t8.f34573a = jSONObject;
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        t8.f34573a = ((JSONObject) t8.f34573a).getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        T t9 = this.f30462f;
                        c5.T t10 = new c5.T();
                        t10.l(this.f30459c, (JSONObject) t8.f34573a);
                        t9.f34573a = t10;
                        String I8 = SettingsPreferences.f30529b.I(this.f30459c);
                        if (I8 != null && I8.length() != 0) {
                            c5.T t11 = (c5.T) this.f30462f.f34573a;
                            if (t11 != null) {
                                t11.I(this.f30459c);
                            }
                            this.f30463g.f34571a = 1;
                        } else {
                            c5.T.f15689k.b(this.f30459c);
                        }
                        if (!((JSONObject) t8.f34573a).isNull("message")) {
                            this.f30464h.f34573a = ((JSONObject) t8.f34573a).getString("message");
                        }
                    }
                    this.f30465i.f34573a = B02.g((JSONObject) t8.f34573a);
                }
                if (this.f30462f.f34573a != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "success");
                    bundle.putString("loginSource", "signin");
                    new C3795t(this.f30459c).e("login", bundle);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("responseCode", String.valueOf(B02.e()));
                    String c8 = B02.c();
                    if (c8 != null && c8.length() != 0) {
                        String c9 = B02.c();
                        AbstractC3292y.f(c9);
                        bundle2.putString("exception", c9);
                    }
                    bundle2.putString("type", "fail");
                    bundle2.putString("loginSource", "signin");
                    new C3795t(this.f30459c).e("login", bundle2);
                }
                C2698h.this.f30447a.setValue(new AbstractC3768A.c(new a(this.f30463g.f34571a, (String) this.f30464h.f34573a, (String) this.f30465i.f34573a)));
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
    /* renamed from: com.uptodown.activities.h$d */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30466a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30468c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30469d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f30470e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f30471f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f30472g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ T f30473h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ T f30474i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, String str, String str2, String str3, Q q8, T t8, T t9, U5.d dVar) {
            super(2, dVar);
            this.f30468c = context;
            this.f30469d = str;
            this.f30470e = str2;
            this.f30471f = str3;
            this.f30472g = q8;
            this.f30473h = t8;
            this.f30474i = t9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f30468c, this.f30469d, this.f30470e, this.f30471f, this.f30472g, this.f30473h, this.f30474i, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            V5.b.e();
            if (this.f30466a == 0) {
                Q5.t.b(obj);
                C2698h.this.f30449c.setValue(AbstractC3768A.a.f37253a);
                c5.K R02 = new C3775H(this.f30468c).R0(this.f30469d, this.f30470e, this.f30471f);
                if (!R02.b() && (d8 = R02.d()) != null && d8.length() != 0) {
                    String d9 = R02.d();
                    AbstractC3292y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull("success")) {
                        this.f30472g.f34571a = jSONObject.getInt("success");
                    }
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        if (!jSONObject2.isNull("message")) {
                            this.f30473h.f34573a = jSONObject2.getString("message");
                        }
                    }
                    this.f30474i.f34573a = R02.g(jSONObject);
                }
                if (this.f30472g.f34571a == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "success");
                    bundle.putString("loginSource", "signup");
                    new C3795t(this.f30468c).e("login", bundle);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("type", "fail");
                    bundle2.putString("loginSource", "signup");
                    bundle2.putString("responseCode", String.valueOf(R02.e()));
                    if (R02.c() != null) {
                        String c8 = R02.c();
                        AbstractC3292y.f(c8);
                        bundle2.putString("exception", c8);
                    }
                    new C3795t(this.f30468c).e("login", bundle2);
                }
                C2698h.this.f30449c.setValue(new AbstractC3768A.c(new b(this.f30472g.f34571a, (String) this.f30473h.f34573a, (String) this.f30474i.f34573a)));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public C2698h() {
        AbstractC3768A.b bVar = AbstractC3768A.b.f37254a;
        q6.w a9 = AbstractC3815N.a(bVar);
        this.f30447a = a9;
        this.f30448b = a9;
        q6.w a10 = AbstractC3815N.a(bVar);
        this.f30449c = a10;
        this.f30450d = a10;
    }

    public final void c(Context context, String username, String password) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(username, "username");
        AbstractC3292y.i(password, "password");
        Q q8 = new Q();
        q8.f34571a = -2;
        T t8 = new T();
        T t9 = new T();
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new c(context, username, password, new T(), q8, t8, t9, null), 2, null);
    }

    public final void d(Context context, String username, String email, String pass) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(username, "username");
        AbstractC3292y.i(email, "email");
        AbstractC3292y.i(pass, "pass");
        T t8 = new T();
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new d(context, username, pass, email, new Q(), t8, new T(), null), 2, null);
    }

    public final InterfaceC3813L e() {
        return this.f30448b;
    }

    public final InterfaceC3813L f() {
        return this.f30450d;
    }

    public final boolean g(String username, String password) {
        AbstractC3292y.i(username, "username");
        AbstractC3292y.i(password, "password");
        if (username.length() > 0 && password.length() > 0) {
            return true;
        }
        return false;
    }

    public final boolean h(String username, String email, String password) {
        AbstractC3292y.i(username, "username");
        AbstractC3292y.i(email, "email");
        AbstractC3292y.i(password, "password");
        if (username.length() > 0 && email.length() > 0 && password.length() > 5) {
            return true;
        }
        return false;
    }

    public final boolean i(String email) {
        AbstractC3292y.i(email, "email");
        return Pattern.compile("^(([^<>()\\[\\]\\\\.,;:\\s@“]+(\\.[^<>()\\[\\]\\\\.,;:\\s@“]+)*)|(“.+“))@((\\[\\d{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher(email).matches();
    }
}
