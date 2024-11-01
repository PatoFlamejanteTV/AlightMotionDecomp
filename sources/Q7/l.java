package Q7;

import Q5.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class l extends h {

    /* renamed from: e, reason: collision with root package name */
    public final List f9071e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9072f;

    /* renamed from: g, reason: collision with root package name */
    public final List f9073g;

    public l(List userEvents, String str, List list) {
        AbstractC3292y.i(userEvents, "userEvents");
        this.f9071e = userEvents;
        this.f9072f = str;
        this.f9073g = list;
    }

    @Override // Q7.h
    public String a() {
        ArrayList arrayList;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f9071e.iterator();
        while (it.hasNext()) {
            arrayList2.add(new JSONObject(((o) it.next()).a()));
        }
        jSONObject.put("userEvents", new JSONArray((Collection) arrayList2));
        jSONObject.putOpt("acceptanceState", this.f9072f);
        if (this.f9073g == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (r rVar : this.f9073g) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(String.valueOf(((Number) rVar.c()).intValue()), rVar.d());
                arrayList.add(jSONObject2);
            }
        }
        jSONObject.putOpt("gbcData", new JSONArray((Collection) arrayList));
        jSONObject.put("clientTimestamp", this.f9051a);
        jSONObject.put("operationType", this.f9052b.f9029a);
        jSONObject.putOpt("sessionId", this.f9053c);
        jSONObject.put("domain", this.f9054d);
        String jSONObject3 = jSONObject.toString();
        AbstractC3292y.h(jSONObject3, "JSONObject().apply {\n   … domain)\n    }.toString()");
        return jSONObject3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3292y.d(this.f9071e, lVar.f9071e) && AbstractC3292y.d(this.f9072f, lVar.f9072f) && AbstractC3292y.d(this.f9073g, lVar.f9073g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f9071e.hashCode() * 31;
        String str = this.f9072f;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode2 + hashCode) * 31;
        List list = this.f9073g;
        if (list != null) {
            i8 = list.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("TrackingUserGBCDoneLog(userEvents=");
        a9.append(this.f9071e);
        a9.append(", acceptanceState=");
        a9.append((Object) this.f9072f);
        a9.append(", gbcData=");
        a9.append(this.f9073g);
        a9.append(')');
        return a9.toString();
    }
}
