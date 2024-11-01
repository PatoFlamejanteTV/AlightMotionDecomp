package com.google.android.gms.auth.api.signin;

import O.a;
import Q.AbstractC1396p;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes3.dex */
public class GoogleSignInOptions extends R.a implements a.d, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: l, reason: collision with root package name */
    public static final GoogleSignInOptions f16013l;

    /* renamed from: m, reason: collision with root package name */
    public static final GoogleSignInOptions f16014m;

    /* renamed from: n, reason: collision with root package name */
    public static final Scope f16015n = new Scope("profile");

    /* renamed from: o, reason: collision with root package name */
    public static final Scope f16016o = new Scope(NotificationCompat.CATEGORY_EMAIL);

    /* renamed from: p, reason: collision with root package name */
    public static final Scope f16017p = new Scope("openid");

    /* renamed from: q, reason: collision with root package name */
    public static final Scope f16018q;

    /* renamed from: r, reason: collision with root package name */
    public static final Scope f16019r;

    /* renamed from: s, reason: collision with root package name */
    private static final Comparator f16020s;

    /* renamed from: a, reason: collision with root package name */
    final int f16021a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f16022b;

    /* renamed from: c, reason: collision with root package name */
    private Account f16023c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16024d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f16025e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f16026f;

    /* renamed from: g, reason: collision with root package name */
    private String f16027g;

    /* renamed from: h, reason: collision with root package name */
    private String f16028h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f16029i;

    /* renamed from: j, reason: collision with root package name */
    private String f16030j;

    /* renamed from: k, reason: collision with root package name */
    private Map f16031k;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f16018q = scope;
        f16019r = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.c();
        aVar.e();
        f16013l = aVar.a();
        a aVar2 = new a();
        aVar2.f(scope, new Scope[0]);
        f16014m = aVar2.a();
        CREATOR = new e();
        f16020s = new d();
    }

    public static GoogleSignInOptions W(String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            hashSet.add(new Scope(jSONArray.getString(i8)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z8 = jSONObject.getBoolean("idTokenRequested");
        boolean z9 = jSONObject.getBoolean("serverAuthRequested");
        boolean z10 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z8, z9, z10, str3, str4, new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map h0(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                K.a aVar = (K.a) it.next();
                hashMap.put(Integer.valueOf(aVar.s()), aVar);
            }
        }
        return hashMap;
    }

    public boolean I() {
        return this.f16024d;
    }

    public boolean Q() {
        return this.f16025e;
    }

    public final String a0() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f16022b, f16020s);
            Iterator it = this.f16022b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).s());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f16023c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f16024d);
            jSONObject.put("forceCodeForRefreshToken", this.f16026f);
            jSONObject.put("serverAuthRequested", this.f16025e);
            if (!TextUtils.isEmpty(this.f16027g)) {
                jSONObject.put("serverClientId", this.f16027g);
            }
            if (!TextUtils.isEmpty(this.f16028h)) {
                jSONObject.put("hostedDomain", this.f16028h);
            }
            return jSONObject.toString();
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0048, code lost:            if (r1.equals(r4.l()) != false) goto L22;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r1 = r3.f16029i     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            java.util.ArrayList r1 = r4.f16029i     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L18
            goto L90
        L18:
            java.util.ArrayList r1 = r3.f16022b     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.v()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList r1 = r3.f16022b     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.v()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.f16023c     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.l()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.l()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.f16027g     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.y()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.f16027g     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.y()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f16026f     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.z()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f16024d     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.I()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f16025e     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.Q()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.f16030j     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.u()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f16022b;
        int size = arrayList2.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(((Scope) arrayList2.get(i8)).s());
        }
        Collections.sort(arrayList);
        K.b bVar = new K.b();
        bVar.a(arrayList);
        bVar.a(this.f16023c);
        bVar.a(this.f16027g);
        bVar.c(this.f16026f);
        bVar.c(this.f16024d);
        bVar.c(this.f16025e);
        bVar.a(this.f16030j);
        return bVar.b();
    }

    public Account l() {
        return this.f16023c;
    }

    public ArrayList s() {
        return this.f16029i;
    }

    public String u() {
        return this.f16030j;
    }

    public ArrayList v() {
        return new ArrayList(this.f16022b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f16021a;
        int a9 = R.c.a(parcel);
        R.c.k(parcel, 1, i9);
        R.c.u(parcel, 2, v(), false);
        R.c.p(parcel, 3, l(), i8, false);
        R.c.c(parcel, 4, I());
        R.c.c(parcel, 5, Q());
        R.c.c(parcel, 6, z());
        R.c.q(parcel, 7, y(), false);
        R.c.q(parcel, 8, this.f16028h, false);
        R.c.u(parcel, 9, s(), false);
        R.c.q(parcel, 10, u(), false);
        R.c.b(parcel, a9);
    }

    public String y() {
        return this.f16027g;
    }

    public boolean z() {
        return this.f16026f;
    }

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Set f16032a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f16033b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f16034c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f16035d;

        /* renamed from: e, reason: collision with root package name */
        private String f16036e;

        /* renamed from: f, reason: collision with root package name */
        private Account f16037f;

        /* renamed from: g, reason: collision with root package name */
        private String f16038g;

        /* renamed from: h, reason: collision with root package name */
        private Map f16039h;

        /* renamed from: i, reason: collision with root package name */
        private String f16040i;

        public a() {
            this.f16032a = new HashSet();
            this.f16039h = new HashMap();
        }

        private final String h(String str) {
            AbstractC1396p.f(str);
            String str2 = this.f16036e;
            boolean z8 = true;
            if (str2 != null && !str2.equals(str)) {
                z8 = false;
            }
            AbstractC1396p.b(z8, "two different server client ids provided");
            return str;
        }

        public GoogleSignInOptions a() {
            if (this.f16032a.contains(GoogleSignInOptions.f16019r)) {
                Set set = this.f16032a;
                Scope scope = GoogleSignInOptions.f16018q;
                if (set.contains(scope)) {
                    this.f16032a.remove(scope);
                }
            }
            if (this.f16035d && (this.f16037f == null || !this.f16032a.isEmpty())) {
                c();
            }
            return new GoogleSignInOptions(new ArrayList(this.f16032a), this.f16037f, this.f16035d, this.f16033b, this.f16034c, this.f16036e, this.f16038g, this.f16039h, this.f16040i);
        }

        public a b() {
            this.f16032a.add(GoogleSignInOptions.f16016o);
            return this;
        }

        public a c() {
            this.f16032a.add(GoogleSignInOptions.f16017p);
            return this;
        }

        public a d(String str) {
            this.f16035d = true;
            h(str);
            this.f16036e = str;
            return this;
        }

        public a e() {
            this.f16032a.add(GoogleSignInOptions.f16015n);
            return this;
        }

        public a f(Scope scope, Scope... scopeArr) {
            this.f16032a.add(scope);
            this.f16032a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a g(String str) {
            this.f16040i = str;
            return this;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.f16032a = new HashSet();
            this.f16039h = new HashMap();
            AbstractC1396p.l(googleSignInOptions);
            this.f16032a = new HashSet(googleSignInOptions.f16022b);
            this.f16033b = googleSignInOptions.f16025e;
            this.f16034c = googleSignInOptions.f16026f;
            this.f16035d = googleSignInOptions.f16024d;
            this.f16036e = googleSignInOptions.f16027g;
            this.f16037f = googleSignInOptions.f16023c;
            this.f16038g = googleSignInOptions.f16028h;
            this.f16039h = GoogleSignInOptions.h0(googleSignInOptions.f16029i);
            this.f16040i = googleSignInOptions.f16030j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInOptions(int i8, ArrayList arrayList, Account account, boolean z8, boolean z9, boolean z10, String str, String str2, ArrayList arrayList2, String str3) {
        this(i8, arrayList, account, z8, z9, z10, str, str2, h0(arrayList2), str3);
    }

    private GoogleSignInOptions(int i8, ArrayList arrayList, Account account, boolean z8, boolean z9, boolean z10, String str, String str2, Map map, String str3) {
        this.f16021a = i8;
        this.f16022b = arrayList;
        this.f16023c = account;
        this.f16024d = z8;
        this.f16025e = z9;
        this.f16026f = z10;
        this.f16027g = str;
        this.f16028h = str2;
        this.f16029i = new ArrayList(map.values());
        this.f16031k = map;
        this.f16030j = str3;
    }
}
