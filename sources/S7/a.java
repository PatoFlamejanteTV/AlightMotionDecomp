package S7;

import D5.t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9778a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9779b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9780c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9781d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9782e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9783f;

    public a(String title, List body, String deleteDataLinkText, String accessDataLinkText, String privacyPolicyLinkText, String backLabel) {
        AbstractC3292y.i(title, "title");
        AbstractC3292y.i(body, "body");
        AbstractC3292y.i(deleteDataLinkText, "deleteDataLinkText");
        AbstractC3292y.i(accessDataLinkText, "accessDataLinkText");
        AbstractC3292y.i(privacyPolicyLinkText, "privacyPolicyLinkText");
        AbstractC3292y.i(backLabel, "backLabel");
        this.f9778a = title;
        this.f9779b = body;
        this.f9780c = deleteDataLinkText;
        this.f9781d = accessDataLinkText;
        this.f9782e = privacyPolicyLinkText;
        this.f9783f = backLabel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3292y.d(this.f9778a, aVar.f9778a) && AbstractC3292y.d(this.f9779b, aVar.f9779b) && AbstractC3292y.d(this.f9780c, aVar.f9780c) && AbstractC3292y.d(this.f9781d, aVar.f9781d) && AbstractC3292y.d(this.f9782e, aVar.f9782e) && AbstractC3292y.d(this.f9783f, aVar.f9783f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9783f.hashCode() + t.a(this.f9782e, t.a(this.f9781d, t.a(this.f9780c, H6.l.a(this.f9779b, this.f9778a.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("CCPAScreen(title=");
        a9.append(this.f9778a);
        a9.append(", body=");
        a9.append(this.f9779b);
        a9.append(", deleteDataLinkText=");
        a9.append(this.f9780c);
        a9.append(", accessDataLinkText=");
        a9.append(this.f9781d);
        a9.append(", privacyPolicyLinkText=");
        a9.append(this.f9782e);
        a9.append(", backLabel=");
        a9.append(this.f9783f);
        a9.append(')');
        return a9.toString();
    }
}
