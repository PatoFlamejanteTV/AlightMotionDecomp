package R5;

import d6.InterfaceC2770d;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: R5.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1423g extends AbstractMap implements Map, InterfaceC2770d {
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<Object, Object>> entrySet() {
        return getEntries();
    }

    public abstract Set getEntries();

    public abstract /* bridge */ Set getKeys();

    public abstract /* bridge */ int getSize();

    public abstract /* bridge */ Collection getValues();

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return getKeys();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }
}
