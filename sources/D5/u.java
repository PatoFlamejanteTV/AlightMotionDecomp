package D5;

import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class u extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final String f1440a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1441b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String fieldName, String fieldValue, String msg) {
        super("invalid value " + fieldValue + " passed for " + fieldName + ' ' + msg);
        AbstractC3292y.i(fieldName, "fieldName");
        AbstractC3292y.i(fieldValue, "fieldValue");
        AbstractC3292y.i(msg, "msg");
        this.f1440a = fieldName;
        this.f1441b = fieldValue;
        this.f1442c = msg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (AbstractC3292y.d(this.f1440a, uVar.f1440a) && AbstractC3292y.d(this.f1441b, uVar.f1441b) && AbstractC3292y.d(this.f1442c, uVar.f1442c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1442c.hashCode() + t.a(this.f1441b, this.f1440a.hashCode() * 31, 31);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("TCModelError(fieldName=");
        a9.append(this.f1440a);
        a9.append(", fieldValue=");
        a9.append(this.f1441b);
        a9.append(", msg=");
        a9.append(this.f1442c);
        a9.append(')');
        return a9.toString();
    }
}
