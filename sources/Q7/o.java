package Q7;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class o extends h {

    /* renamed from: e, reason: collision with root package name */
    public long f9106e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9107f;

    public o(long j8, String event) {
        AbstractC3292y.i(event, "event");
        this.f9106e = j8;
        this.f9107f = event;
    }

    @Override // Q7.h
    public String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("clientTimestamp", Long.valueOf(this.f9106e));
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, this.f9107f);
        jSONObject.putOpt("sessionId", this.f9053c);
        String jSONObject2 = jSONObject.toString();
        AbstractC3292y.h(jSONObject2, "JSONObject().apply {\n   …ssionId)\n    }.toString()");
        return jSONObject2;
    }

    @Override // Q7.h
    public void b(long j8) {
        this.f9106e = j8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f9106e == oVar.f9106e && AbstractC3292y.d(this.f9107f, oVar.f9107f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9107f.hashCode() + (androidx.collection.a.a(this.f9106e) * 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("UserEvent(clientTimestamp=");
        a9.append(this.f9106e);
        a9.append(", event=");
        a9.append(this.f9107f);
        a9.append(')');
        return a9.toString();
    }
}
