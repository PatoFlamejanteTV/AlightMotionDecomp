package N7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes5.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private static final String f6888c = M7.b.i(h.class);

    /* renamed from: a, reason: collision with root package name */
    private final LinkedBlockingDeque f6889a = new LinkedBlockingDeque();

    /* renamed from: b, reason: collision with root package name */
    private final i f6890b;

    public h(i iVar) {
        this.f6890b = iVar;
    }

    public void a(g gVar) {
        this.f6889a.add(gVar);
    }

    public void b(List list) {
        this.f6889a.drainTo(list);
    }

    public boolean c() {
        if (this.f6889a.isEmpty() && this.f6890b.d()) {
            return true;
        }
        return false;
    }

    public void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f6889a.offerFirst((g) it.next());
        }
    }

    public boolean e(boolean z8) {
        if (z8) {
            List f8 = this.f6890b.f();
            ListIterator listIterator = f8.listIterator(f8.size());
            while (listIterator.hasPrevious()) {
                this.f6889a.offerFirst((g) listIterator.previous());
            }
            V7.a.b(f6888c).a("Switched state to ONLINE, uncached %d events from disk.", Integer.valueOf(f8.size()));
        } else if (!this.f6889a.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            this.f6889a.drainTo(arrayList);
            this.f6890b.a(arrayList);
            V7.a.b(f6888c).a("Switched state to OFFLINE, caching %d events to disk.", Integer.valueOf(arrayList.size()));
        }
        if (!z8 || this.f6889a.isEmpty()) {
            return false;
        }
        return true;
    }
}
