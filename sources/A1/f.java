package A1;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static List f106a;

    /* renamed from: b, reason: collision with root package name */
    public static Map f107b;

    static {
        HashMap hashMap = new HashMap();
        f107b = hashMap;
        hashMap.put(Integer.valueOf(h.f114d), h.f116f);
        f107b.put(Integer.valueOf(g.f108d), g.f110f);
        f107b.put(Integer.valueOf(o.f144b), o.f146d);
        f107b.put(Integer.valueOf(l.f132d), l.f134f);
        f107b.put(Integer.valueOf(i.f120d), i.f122f);
        f107b.put(Integer.valueOf(n.f140d), n.f142f);
        f107b.put(Integer.valueOf(j.f124d), j.f126f);
        f107b.put(Integer.valueOf(m.f136d), m.f138f);
        f107b.put(Integer.valueOf(k.f128d), k.f130f);
        f106a = (List) Collection.EL.stream(new ArrayList(f107b.keySet())).sorted().map(new Function() { // from class: A1.e
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String b9;
                b9 = f.b((Integer) obj);
                return b9;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b(Integer num) {
        return (String) f107b.get(num);
    }
}
