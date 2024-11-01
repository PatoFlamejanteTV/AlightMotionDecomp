package L0;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final List f5268a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final int f5269b;

    public j(int i8) {
        this.f5269b = i8;
    }

    public List a() {
        List b9 = b();
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < b9.size(); i8++) {
            arrayList.add(((i) b9.get(i8)).h());
        }
        return arrayList;
    }

    public synchronized List b() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.f5268a));
    }

    public synchronized boolean c(List list) {
        this.f5268a.clear();
        if (list.size() > this.f5269b) {
            G0.g.f().k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f5269b);
            return this.f5268a.addAll(list.subList(0, this.f5269b));
        }
        return this.f5268a.addAll(list);
    }
}
