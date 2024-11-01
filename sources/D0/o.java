package D0;

import D0.o;
import android.util.Log;
import c1.InterfaceC2008a;
import c1.InterfaceC2009b;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class o implements InterfaceC1040e, U0.a {

    /* renamed from: i, reason: collision with root package name */
    private static final InterfaceC2009b f1184i = new InterfaceC2009b() { // from class: D0.k
        @Override // c1.InterfaceC2009b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Map f1185a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f1186b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f1187c;

    /* renamed from: d, reason: collision with root package name */
    private final List f1188d;

    /* renamed from: e, reason: collision with root package name */
    private Set f1189e;

    /* renamed from: f, reason: collision with root package name */
    private final v f1190f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f1191g;

    /* renamed from: h, reason: collision with root package name */
    private final j f1192h;

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f1188d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC2009b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f1192h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (w e8) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e8);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C1038c) it2.next()).j().toArray();
                int length = array.length;
                int i8 = 0;
                while (true) {
                    if (i8 < length) {
                        Object obj = array[i8];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f1189e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f1189e.add(obj.toString());
                        }
                        i8++;
                    }
                }
            }
            if (this.f1185a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f1185a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final C1038c c1038c = (C1038c) it3.next();
                this.f1185a.put(c1038c, new x(new InterfaceC2009b() { // from class: D0.l
                    @Override // c1.InterfaceC2009b
                    public final Object get() {
                        Object r8;
                        r8 = o.this.r(c1038c);
                        return r8;
                    }
                }));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        u();
    }

    private void o(Map map, boolean z8) {
        for (Map.Entry entry : map.entrySet()) {
            C1038c c1038c = (C1038c) entry.getKey();
            InterfaceC2009b interfaceC2009b = (InterfaceC2009b) entry.getValue();
            if (c1038c.n() || (c1038c.o() && z8)) {
                interfaceC2009b.get();
            }
        }
        this.f1190f.d();
    }

    private static List q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(C1038c c1038c) {
        return c1038c.h().a(new G(c1038c, this));
    }

    private void u() {
        Boolean bool = (Boolean) this.f1191g.get();
        if (bool != null) {
            o(this.f1185a, bool.booleanValue());
        }
    }

    private void v() {
        for (C1038c c1038c : this.f1185a.keySet()) {
            for (r rVar : c1038c.g()) {
                if (rVar.g() && !this.f1187c.containsKey(rVar.c())) {
                    this.f1187c.put(rVar.c(), y.b(Collections.emptySet()));
                } else if (this.f1186b.containsKey(rVar.c())) {
                    continue;
                } else if (!rVar.f()) {
                    if (!rVar.g()) {
                        this.f1186b.put(rVar.c(), D.e());
                    }
                } else {
                    throw new z(String.format("Unsatisfied dependency for component %s: %s", c1038c, rVar.c()));
                }
            }
        }
    }

    private List w(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1038c c1038c = (C1038c) it.next();
            if (c1038c.p()) {
                final InterfaceC2009b interfaceC2009b = (InterfaceC2009b) this.f1185a.get(c1038c);
                for (F f8 : c1038c.j()) {
                    if (!this.f1186b.containsKey(f8)) {
                        this.f1186b.put(f8, interfaceC2009b);
                    } else {
                        final D d8 = (D) ((InterfaceC2009b) this.f1186b.get(f8));
                        arrayList.add(new Runnable() { // from class: D0.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                D.this.j(interfaceC2009b);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    private List x() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f1185a.entrySet()) {
            C1038c c1038c = (C1038c) entry.getKey();
            if (!c1038c.p()) {
                InterfaceC2009b interfaceC2009b = (InterfaceC2009b) entry.getValue();
                for (F f8 : c1038c.j()) {
                    if (!hashMap.containsKey(f8)) {
                        hashMap.put(f8, new HashSet());
                    }
                    ((Set) hashMap.get(f8)).add(interfaceC2009b);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f1187c.containsKey(entry2.getKey())) {
                this.f1187c.put((F) entry2.getKey(), y.b((Collection) entry2.getValue()));
            } else {
                final y yVar = (y) this.f1187c.get(entry2.getKey());
                for (final InterfaceC2009b interfaceC2009b2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: D0.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            y.this.a(interfaceC2009b2);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // D0.InterfaceC1040e
    public /* synthetic */ Object a(Class cls) {
        return AbstractC1039d.b(this, cls);
    }

    @Override // D0.InterfaceC1040e
    public /* synthetic */ Object b(F f8) {
        return AbstractC1039d.a(this, f8);
    }

    @Override // D0.InterfaceC1040e
    public /* synthetic */ InterfaceC2009b c(Class cls) {
        return AbstractC1039d.d(this, cls);
    }

    @Override // D0.InterfaceC1040e
    public InterfaceC2008a d(F f8) {
        InterfaceC2009b f9 = f(f8);
        if (f9 == null) {
            return D.e();
        }
        if (f9 instanceof D) {
            return (D) f9;
        }
        return D.i(f9);
    }

    @Override // D0.InterfaceC1040e
    public /* synthetic */ Set e(Class cls) {
        return AbstractC1039d.f(this, cls);
    }

    @Override // D0.InterfaceC1040e
    public synchronized InterfaceC2009b f(F f8) {
        E.c(f8, "Null interface requested.");
        return (InterfaceC2009b) this.f1186b.get(f8);
    }

    @Override // D0.InterfaceC1040e
    public synchronized InterfaceC2009b g(F f8) {
        y yVar = (y) this.f1187c.get(f8);
        if (yVar != null) {
            return yVar;
        }
        return f1184i;
    }

    @Override // D0.InterfaceC1040e
    public /* synthetic */ Set h(F f8) {
        return AbstractC1039d.e(this, f8);
    }

    @Override // D0.InterfaceC1040e
    public /* synthetic */ InterfaceC2008a i(Class cls) {
        return AbstractC1039d.c(this, cls);
    }

    public void p(boolean z8) {
        HashMap hashMap;
        if (!androidx.compose.animation.core.d.a(this.f1191g, null, Boolean.valueOf(z8))) {
            return;
        }
        synchronized (this) {
            hashMap = new HashMap(this.f1185a);
        }
        o(hashMap, z8);
    }

    private o(Executor executor, Iterable iterable, Collection collection, j jVar) {
        this.f1185a = new HashMap();
        this.f1186b = new HashMap();
        this.f1187c = new HashMap();
        this.f1189e = new HashSet();
        this.f1191g = new AtomicReference();
        v vVar = new v(executor);
        this.f1190f = vVar;
        this.f1192h = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1038c.s(vVar, v.class, Z0.d.class, Z0.c.class));
        arrayList.add(C1038c.s(this, U0.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C1038c c1038c = (C1038c) it.next();
            if (c1038c != null) {
                arrayList.add(c1038c);
            }
        }
        this.f1188d = q(iterable);
        n(arrayList);
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f1193a;

        /* renamed from: b, reason: collision with root package name */
        private final List f1194b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List f1195c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private j f1196d = j.f1177a;

        b(Executor executor) {
            this.f1193a = executor;
        }

        public b b(C1038c c1038c) {
            this.f1195c.add(c1038c);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f1194b.add(new InterfaceC2009b() { // from class: D0.p
                @Override // c1.InterfaceC2009b
                public final Object get() {
                    ComponentRegistrar f8;
                    f8 = o.b.f(ComponentRegistrar.this);
                    return f8;
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f1194b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f1193a, this.f1194b, this.f1195c, this.f1196d);
        }

        public b g(j jVar) {
            this.f1196d = jVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
