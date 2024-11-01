package W5;

import R5.AbstractC1419c;
import R5.AbstractC1428l;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class c extends AbstractC1419c implements a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Enum[] f10784a;

    public c(Enum[] entries) {
        AbstractC3292y.i(entries, "entries");
        this.f10784a = entries;
    }

    public boolean c(Enum element) {
        AbstractC3292y.i(element, "element");
        if (((Enum) AbstractC1428l.k0(this.f10784a, element.ordinal())) == element) {
            return true;
        }
        return false;
    }

    @Override // R5.AbstractC1417a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        return c((Enum) obj);
    }

    @Override // R5.AbstractC1419c, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Enum get(int i8) {
        AbstractC1419c.Companion.b(i8, this.f10784a.length);
        return this.f10784a[i8];
    }

    public int g(Enum element) {
        AbstractC3292y.i(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) AbstractC1428l.k0(this.f10784a, ordinal)) != element) {
            return -1;
        }
        return ordinal;
    }

    @Override // R5.AbstractC1419c, R5.AbstractC1417a
    public int getSize() {
        return this.f10784a.length;
    }

    @Override // R5.AbstractC1419c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return g((Enum) obj);
    }

    public int j(Enum element) {
        AbstractC3292y.i(element, "element");
        return indexOf(element);
    }

    @Override // R5.AbstractC1419c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return j((Enum) obj);
    }
}
