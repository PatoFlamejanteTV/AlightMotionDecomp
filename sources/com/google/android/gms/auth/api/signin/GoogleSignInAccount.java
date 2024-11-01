package com.google.android.gms.auth.api.signin;

import Q.AbstractC1396p;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes3.dex */
public class GoogleSignInAccount extends R.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    /* renamed from: n, reason: collision with root package name */
    public static final V.d f15999n = V.g.b();

    /* renamed from: a, reason: collision with root package name */
    final int f16000a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16001b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16002c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16003d;

    /* renamed from: e, reason: collision with root package name */
    private final String f16004e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f16005f;

    /* renamed from: g, reason: collision with root package name */
    private String f16006g;

    /* renamed from: h, reason: collision with root package name */
    private final long f16007h;

    /* renamed from: i, reason: collision with root package name */
    private final String f16008i;

    /* renamed from: j, reason: collision with root package name */
    final List f16009j;

    /* renamed from: k, reason: collision with root package name */
    private final String f16010k;

    /* renamed from: l, reason: collision with root package name */
    private final String f16011l;

    /* renamed from: m, reason: collision with root package name */
    private final Set f16012m = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInAccount(int i8, String str, String str2, String str3, String str4, Uri uri, String str5, long j8, String str6, List list, String str7, String str8) {
        this.f16000a = i8;
        this.f16001b = str;
        this.f16002c = str2;
        this.f16003d = str3;
        this.f16004e = str4;
        this.f16005f = uri;
        this.f16006g = str5;
        this.f16007h = j8;
        this.f16008i = str6;
        this.f16009j = list;
        this.f16010k = str7;
        this.f16011l = str8;
    }

    public static GoogleSignInAccount W(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l8, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l8.longValue(), AbstractC1396p.f(str7), new ArrayList((Collection) AbstractC1396p.l(set)), str5, str6);
    }

    public static GoogleSignInAccount X(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            hashSet.add(new Scope(jSONArray.getString(i8)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has(NotificationCompat.CATEGORY_EMAIL)) {
            str3 = jSONObject.optString(NotificationCompat.CATEGORY_EMAIL);
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        GoogleSignInAccount W8 = W(optString2, str2, str3, str4, str5, str6, uri, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        W8.f16006g = str7;
        return W8;
    }

    public Uri I() {
        return this.f16005f;
    }

    public Set Q() {
        HashSet hashSet = new HashSet(this.f16009j);
        hashSet.addAll(this.f16012m);
        return hashSet;
    }

    public String U() {
        return this.f16006g;
    }

    public final String Y() {
        return this.f16008i;
    }

    public final String Z() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (getId() != null) {
                jSONObject.put("id", getId());
            }
            if (z() != null) {
                jSONObject.put("tokenId", z());
            }
            if (u() != null) {
                jSONObject.put(NotificationCompat.CATEGORY_EMAIL, u());
            }
            if (s() != null) {
                jSONObject.put("displayName", s());
            }
            if (y() != null) {
                jSONObject.put("givenName", y());
            }
            if (v() != null) {
                jSONObject.put("familyName", v());
            }
            Uri I8 = I();
            if (I8 != null) {
                jSONObject.put("photoUrl", I8.toString());
            }
            if (U() != null) {
                jSONObject.put("serverAuthCode", U());
            }
            jSONObject.put("expirationTime", this.f16007h);
            jSONObject.put("obfuscatedIdentifier", this.f16008i);
            JSONArray jSONArray = new JSONArray();
            List list = this.f16009j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: J.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).s().compareTo(((Scope) obj2).s());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.s());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f16008i.equals(this.f16008i) || !googleSignInAccount.Q().equals(Q())) {
            return false;
        }
        return true;
    }

    public String getId() {
        return this.f16001b;
    }

    public int hashCode() {
        return ((this.f16008i.hashCode() + 527) * 31) + Q().hashCode();
    }

    public String s() {
        return this.f16004e;
    }

    public String u() {
        return this.f16003d;
    }

    public String v() {
        return this.f16011l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.k(parcel, 1, this.f16000a);
        R.c.q(parcel, 2, getId(), false);
        R.c.q(parcel, 3, z(), false);
        R.c.q(parcel, 4, u(), false);
        R.c.q(parcel, 5, s(), false);
        R.c.p(parcel, 6, I(), i8, false);
        R.c.q(parcel, 7, U(), false);
        R.c.n(parcel, 8, this.f16007h);
        R.c.q(parcel, 9, this.f16008i, false);
        R.c.u(parcel, 10, this.f16009j, false);
        R.c.q(parcel, 11, y(), false);
        R.c.q(parcel, 12, v(), false);
        R.c.b(parcel, a9);
    }

    public String y() {
        return this.f16010k;
    }

    public String z() {
        return this.f16002c;
    }
}
