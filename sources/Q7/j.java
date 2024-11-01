package Q7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class j extends h {

    /* renamed from: e, reason: collision with root package name */
    public final List f9061e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9062f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9063g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9064h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9065i;

    /* renamed from: j, reason: collision with root package name */
    public final String f9066j;

    /* renamed from: k, reason: collision with root package name */
    public final String f9067k;

    /* renamed from: l, reason: collision with root package name */
    public final String f9068l;

    /* renamed from: m, reason: collision with root package name */
    public final String f9069m;

    public /* synthetic */ j(List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i8) {
        this((i8 & 1) != 0 ? new ArrayList() : list, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3, (i8 & 16) != 0 ? null : str4, (i8 & 32) != 0 ? null : str5, (i8 & 64) != 0 ? null : str6, (i8 & 128) != 0 ? null : str7, (i8 & 256) == 0 ? str8 : null);
    }

    @Override // Q7.h
    public String a() {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f9061e.iterator();
        while (it.hasNext()) {
            arrayList.add(new JSONObject(((o) it.next()).a()));
        }
        jSONObject.put("userEvents", new JSONArray((Collection) arrayList));
        jSONObject.putOpt("acceptanceState", this.f9062f);
        jSONObject.putOpt("objectionState", this.f9063g);
        jSONObject.putOpt("tcData", this.f9064h);
        jSONObject.putOpt("gppData", this.f9065i);
        jSONObject.putOpt("state", this.f9066j);
        jSONObject.putOpt("jurisdiction", this.f9067k);
        jSONObject.putOpt("nonIabConsentData", this.f9068l);
        jSONObject.putOpt("uspData", this.f9069m);
        jSONObject.put("clientTimestamp", this.f9051a);
        jSONObject.put("operationType", this.f9052b.f9029a);
        jSONObject.putOpt("sessionId", this.f9053c);
        jSONObject.put("domain", this.f9054d);
        String jSONObject2 = jSONObject.toString();
        AbstractC3292y.h(jSONObject2, "JSONObject().apply {\n   … domain)\n    }.toString()");
        return jSONObject2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (AbstractC3292y.d(this.f9061e, jVar.f9061e) && AbstractC3292y.d(this.f9062f, jVar.f9062f) && AbstractC3292y.d(this.f9063g, jVar.f9063g) && AbstractC3292y.d(this.f9064h, jVar.f9064h) && AbstractC3292y.d(this.f9065i, jVar.f9065i) && AbstractC3292y.d(this.f9066j, jVar.f9066j) && AbstractC3292y.d(this.f9067k, jVar.f9067k) && AbstractC3292y.d(this.f9068l, jVar.f9068l) && AbstractC3292y.d(this.f9069m, jVar.f9069m)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = this.f9061e.hashCode() * 31;
        String str = this.f9062f;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode8 + hashCode) * 31;
        String str2 = this.f9063g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f9064h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f9065i;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f9066j;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str6 = this.f9067k;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str7 = this.f9068l;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str8 = this.f9069m;
        if (str8 != null) {
            i8 = str8.hashCode();
        }
        return i15 + i8;
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("TrackingUserDoneLog(userEvents=");
        a9.append(this.f9061e);
        a9.append(", acceptanceState=");
        a9.append((Object) this.f9062f);
        a9.append(", objectionState=");
        a9.append((Object) this.f9063g);
        a9.append(", tcData=");
        a9.append((Object) this.f9064h);
        a9.append(", gppData=");
        a9.append((Object) this.f9065i);
        a9.append(", state=");
        a9.append((Object) this.f9066j);
        a9.append(", jurisdiction=");
        a9.append((Object) this.f9067k);
        a9.append(", nonIabConsentData=");
        a9.append((Object) this.f9068l);
        a9.append(", uspData=");
        a9.append((Object) this.f9069m);
        a9.append(')');
        return a9.toString();
    }

    public j(List userEvents, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AbstractC3292y.i(userEvents, "userEvents");
        this.f9061e = userEvents;
        this.f9062f = str;
        this.f9063g = str2;
        this.f9064h = str3;
        this.f9065i = str4;
        this.f9066j = str5;
        this.f9067k = str6;
        this.f9068l = str7;
        this.f9069m = str8;
    }
}
