package R5;

import d6.InterfaceC2771e;
import java.util.AbstractSet;
import java.util.Set;

/* renamed from: R5.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1424h extends AbstractSet implements Set, InterfaceC2771e {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(Object obj);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
