package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.InterfaceC3255g;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ValueElementSequence implements InterfaceC3255g {
    public static final int $stable = 8;
    private final List<ValueElement> elements = new ArrayList();

    @Override // k6.InterfaceC3255g
    public Iterator<ValueElement> iterator() {
        return this.elements.iterator();
    }

    public final void set(String str, Object obj) {
        this.elements.add(new ValueElement(str, obj));
    }
}
