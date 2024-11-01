package Q7;

import D5.t;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class i extends h {

    /* renamed from: e, reason: collision with root package name */
    public final String f9055e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9056f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9057g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9058h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9059i;

    /* renamed from: j, reason: collision with root package name */
    public final String f9060j;

    public i(String accountId, String publisher, int i8, String cmpVersion, String displayType, String configurationHashCode) {
        AbstractC3292y.i(accountId, "accountId");
        AbstractC3292y.i(publisher, "publisher");
        AbstractC3292y.i(cmpVersion, "cmpVersion");
        AbstractC3292y.i(displayType, "displayType");
        AbstractC3292y.i(configurationHashCode, "configurationHashCode");
        this.f9055e = accountId;
        this.f9056f = publisher;
        this.f9057g = i8;
        this.f9058h = cmpVersion;
        this.f9059i = displayType;
        this.f9060j = configurationHashCode;
    }

    @Override // Q7.h
    public String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("accountId", this.f9055e);
        jSONObject.put("publisher", this.f9056f);
        jSONObject.put("cmpId", this.f9057g);
        jSONObject.put("cmpVersion", this.f9058h);
        jSONObject.put("displayType", this.f9059i);
        jSONObject.put("configurationHashCode", this.f9060j);
        jSONObject.put("clientTimestamp", this.f9051a);
        jSONObject.put("operationType", this.f9052b.f9029a);
        jSONObject.put("sessionId", this.f9053c);
        jSONObject.put("domain", this.f9054d);
        String jSONObject2 = jSONObject.toString();
        AbstractC3292y.h(jSONObject2, "JSONObject().apply {\n   … domain)\n    }.toString()");
        return jSONObject2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (AbstractC3292y.d(this.f9055e, iVar.f9055e) && AbstractC3292y.d(this.f9056f, iVar.f9056f) && this.f9057g == iVar.f9057g && AbstractC3292y.d(this.f9058h, iVar.f9058h) && AbstractC3292y.d(this.f9059i, iVar.f9059i) && AbstractC3292y.d(this.f9060j, iVar.f9060j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9060j.hashCode() + t.a(this.f9059i, t.a(this.f9058h, H6.k.a(this.f9057g, t.a(this.f9056f, this.f9055e.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("TrackingInitLog(accountId=");
        a9.append(this.f9055e);
        a9.append(", publisher=");
        a9.append(this.f9056f);
        a9.append(", cmpId=");
        a9.append(this.f9057g);
        a9.append(", cmpVersion=");
        a9.append(this.f9058h);
        a9.append(", displayType=");
        a9.append(this.f9059i);
        a9.append(", configurationHashCode=");
        a9.append(this.f9060j);
        a9.append(')');
        return a9.toString();
    }
}
