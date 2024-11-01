package b8;

import D5.t;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final G6.f f15122a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f15123b;

    /* renamed from: c, reason: collision with root package name */
    public final f f15124c;

    /* renamed from: d, reason: collision with root package name */
    public e f15125d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15126e;

    /* renamed from: f, reason: collision with root package name */
    public String f15127f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f15128g;

    public d(G6.f value, Boolean bool, f viewType, e itemType, boolean z8, String text, Integer num) {
        AbstractC3292y.i(value, "value");
        AbstractC3292y.i(viewType, "viewType");
        AbstractC3292y.i(itemType, "itemType");
        AbstractC3292y.i(text, "text");
        this.f15122a = value;
        this.f15123b = bool;
        this.f15124c = viewType;
        this.f15125d = itemType;
        this.f15126e = z8;
        this.f15127f = text;
        this.f15128g = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3292y.d(this.f15122a, dVar.f15122a) && AbstractC3292y.d(this.f15123b, dVar.f15123b) && this.f15124c == dVar.f15124c && this.f15125d == dVar.f15125d && this.f15126e == dVar.f15126e && AbstractC3292y.d(this.f15127f, dVar.f15127f) && AbstractC3292y.d(this.f15128g, dVar.f15128g)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f15122a.hashCode() * 31;
        Boolean bool = this.f15123b;
        int i8 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int hashCode3 = (this.f15125d.hashCode() + ((this.f15124c.hashCode() + ((hashCode2 + hashCode) * 31)) * 31)) * 31;
        boolean z8 = this.f15126e;
        int i9 = z8;
        if (z8 != 0) {
            i9 = 1;
        }
        int a9 = t.a(this.f15127f, (hashCode3 + i9) * 31, 31);
        Integer num = this.f15128g;
        if (num != null) {
            i8 = num.hashCode();
        }
        return a9 + i8;
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("SwitchItemData(value=");
        a9.append(this.f15122a);
        a9.append(", selectedState=");
        a9.append(this.f15123b);
        a9.append(", viewType=");
        a9.append(this.f15124c);
        a9.append(", itemType=");
        a9.append(this.f15125d);
        a9.append(", isTagEnabled=");
        a9.append(this.f15126e);
        a9.append(", text=");
        a9.append(this.f15127f);
        a9.append(", counter=");
        a9.append(this.f15128g);
        a9.append(')');
        return a9.toString();
    }

    public /* synthetic */ d(G6.f fVar, Boolean bool, f fVar2, e eVar, boolean z8, String str, Integer num, int i8) {
        this((i8 & 1) != 0 ? new G6.f(0, null, 3) : fVar, (i8 & 2) != 0 ? null : bool, (i8 & 4) != 0 ? f.NORMAL : fVar2, (i8 & 8) != 0 ? e.IAB_VENDOR : eVar, (i8 & 16) != 0 ? true : z8, (i8 & 32) != 0 ? "" : str, (i8 & 64) == 0 ? num : null);
    }
}
