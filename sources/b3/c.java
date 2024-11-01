package B3;

import D3.f;
import R5.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f566a;

    /* renamed from: b, reason: collision with root package name */
    private final f.a f567b;

    public c(Map fieldValuePairs, f.a userRequestedReuse) {
        AbstractC3292y.i(fieldValuePairs, "fieldValuePairs");
        AbstractC3292y.i(userRequestedReuse, "userRequestedReuse");
        this.f566a = fieldValuePairs;
        this.f567b = userRequestedReuse;
    }

    public final Map a() {
        return this.f566a;
    }

    public final f.a b() {
        return this.f567b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3292y.d(this.f566a, cVar.f566a) && this.f567b == cVar.f567b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f566a.hashCode() * 31) + this.f567b.hashCode();
    }

    public String toString() {
        return "FormFieldValues(fieldValuePairs=" + this.f566a + ", userRequestedReuse=" + this.f567b + ")";
    }

    public /* synthetic */ c(Map map, f.a aVar, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? Q.h() : map, aVar);
    }
}
