package R5;

import d6.InterfaceC2768b;
import java.util.AbstractCollection;
import java.util.Collection;

/* renamed from: R5.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1421e extends AbstractCollection implements Collection, InterfaceC2768b {
    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
