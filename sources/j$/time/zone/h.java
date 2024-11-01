package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class h implements PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f33043a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(ArrayList arrayList) {
        this.f33043a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property == null) {
            j.d(new i());
            return null;
        }
        try {
            j jVar = (j) j.class.cast(Class.forName(property, true, j.class.getClassLoader()).newInstance());
            j.d(jVar);
            this.f33043a.add(jVar);
            return null;
        } catch (Exception e8) {
            throw new Error(e8);
        }
    }
}
