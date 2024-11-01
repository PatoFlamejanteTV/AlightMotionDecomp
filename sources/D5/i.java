package D5;

import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final a f1381c = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f1382a;

    /* renamed from: b, reason: collision with root package name */
    public k f1383b;

    /* loaded from: classes5.dex */
    public static final class a {
        public final i a(String hash) {
            k kVar;
            AbstractC3292y.i(hash, "hash");
            List s02 = l6.n.s0(hash, new String[]{"-"}, false, 0, 6, null);
            if (s02.size() == 2) {
                int parseInt = Integer.parseInt((String) s02.get(0));
                int parseInt2 = Integer.parseInt((String) s02.get(1));
                if (parseInt2 != 1) {
                    if (parseInt2 != 2) {
                        kVar = k.NOT_ALLOWED;
                    } else {
                        kVar = k.REQUIRE_LI;
                    }
                } else {
                    kVar = k.REQUIRE_CONSENT;
                }
                return new i(parseInt, kVar);
            }
            StringBuilder sb = new StringBuilder();
            a aVar = i.f1381c;
            sb.append((Object) "f.i");
            sb.append(": TCModelError, hash: ");
            sb.append(hash);
            throw new F5.e(sb.toString());
        }
    }

    public i(int i8, k restrictionType) {
        AbstractC3292y.i(restrictionType, "restrictionType");
        this.f1382a = i8;
        this.f1383b = restrictionType;
    }

    public final String a() {
        if (this.f1382a > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f1382a);
            sb.append('-');
            sb.append(this.f1383b.f1392a);
            return sb.toString();
        }
        throw new F5.e(AbstractC3292y.q("f.i", ": TCModelError, cannot hash invalid PurposeRestriction"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f1382a == iVar.f1382a && this.f1383b == iVar.f1383b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1383b.hashCode() + (this.f1382a * 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("PurposeRestriction(purposeId=");
        a9.append(this.f1382a);
        a9.append(", restrictionType=");
        a9.append(this.f1383b);
        a9.append(')');
        return a9.toString();
    }
}
