package C6;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class K extends T {

    /* renamed from: c, reason: collision with root package name */
    private final A6.f f1012c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(y6.b kSerializer, y6.b vSerializer) {
        super(kSerializer, vSerializer, null);
        AbstractC3292y.i(kSerializer, "kSerializer");
        AbstractC3292y.i(vSerializer, "vSerializer");
        this.f1012c = new J(kSerializer.a(), vSerializer.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap p(Map map) {
        LinkedHashMap linkedHashMap;
        AbstractC3292y.i(map, "<this>");
        if (map instanceof LinkedHashMap) {
            linkedHashMap = (LinkedHashMap) map;
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return new LinkedHashMap(map);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Map q(LinkedHashMap linkedHashMap) {
        AbstractC3292y.i(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // C6.T, y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return this.f1012c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap f() {
        return new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int g(LinkedHashMap linkedHashMap) {
        AbstractC3292y.i(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(LinkedHashMap linkedHashMap, int i8) {
        AbstractC3292y.i(linkedHashMap, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Iterator i(Map map) {
        AbstractC3292y.i(map, "<this>");
        return map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public int j(Map map) {
        AbstractC3292y.i(map, "<this>");
        return map.size();
    }
}
