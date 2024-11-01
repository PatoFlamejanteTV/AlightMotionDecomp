package D0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
abstract class q {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final C1038c f1198a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f1199b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set f1200c = new HashSet();

        b(C1038c c1038c) {
            this.f1198a = c1038c;
        }

        void a(b bVar) {
            this.f1199b.add(bVar);
        }

        void b(b bVar) {
            this.f1200c.add(bVar);
        }

        C1038c c() {
            return this.f1198a;
        }

        Set d() {
            return this.f1199b;
        }

        boolean e() {
            return this.f1199b.isEmpty();
        }

        boolean f() {
            return this.f1200c.isEmpty();
        }

        void g(b bVar) {
            this.f1200c.remove(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final F f1201a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f1202b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.f1201a.equals(this.f1201a) || cVar.f1202b != this.f1202b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f1201a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f1202b).hashCode();
        }

        private c(F f8, boolean z8) {
            this.f1201a = f8;
            this.f1202b = z8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(List list) {
        Set<b> c8 = c(list);
        Set b9 = b(c8);
        int i8 = 0;
        while (!b9.isEmpty()) {
            b bVar = (b) b9.iterator().next();
            b9.remove(bVar);
            i8++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    b9.add(bVar2);
                }
            }
        }
        if (i8 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : c8) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new s(arrayList);
    }

    private static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set c(List list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                C1038c c1038c = (C1038c) it.next();
                b bVar = new b(c1038c);
                for (F f8 : c1038c.j()) {
                    c cVar = new c(f8, !c1038c.p());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (!set2.isEmpty() && !cVar.f1202b) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", f8));
                    }
                    set2.add(bVar);
                }
            } else {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar2 : (Set) it2.next()) {
                        for (r rVar : bVar2.c().g()) {
                            if (rVar.e() && (set = (Set) hashMap.get(new c(rVar.c(), rVar.g()))) != null) {
                                for (b bVar3 : set) {
                                    bVar2.a(bVar3);
                                    bVar3.b(bVar2);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
        }
    }
}
