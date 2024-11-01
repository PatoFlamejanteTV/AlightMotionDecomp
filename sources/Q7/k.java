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
public final class k extends h {

    /* renamed from: e, reason: collision with root package name */
    public final List f9070e;

    public k(List userEvents) {
        AbstractC3292y.i(userEvents, "userEvents");
        this.f9070e = userEvents;
    }

    @Override // Q7.h
    public String a() {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f9070e.iterator();
        while (it.hasNext()) {
            arrayList.add(new JSONObject(((o) it.next()).a()));
        }
        jSONObject.put("userEvents", new JSONArray((Collection) arrayList));
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
        if ((obj instanceof k) && AbstractC3292y.d(this.f9070e, ((k) obj).f9070e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9070e.hashCode();
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("TrackingUserEventsLog(userEvents=");
        a9.append(this.f9070e);
        a9.append(')');
        return a9.toString();
    }
}
