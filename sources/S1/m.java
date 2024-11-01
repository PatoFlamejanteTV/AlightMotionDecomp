package S1;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private Set f9387a = Collections.emptySet();

    public void a(O1.m mVar) {
        if (d(mVar)) {
        } else {
            throw new O1.f("Unsupported critical header parameter(s)");
        }
    }

    public Set b() {
        return DesugarCollections.unmodifiableSet(this.f9387a);
    }

    public Set c() {
        return Collections.singleton("b64");
    }

    public boolean d(O1.e eVar) {
        if (eVar.c() == null) {
            return true;
        }
        for (String str : eVar.c()) {
            if (!c().contains(str) && !b().contains(str)) {
                return false;
            }
        }
        return true;
    }

    public void e(Set set) {
        if (set == null) {
            this.f9387a = Collections.emptySet();
        } else {
            this.f9387a = set;
        }
    }
}
