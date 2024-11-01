package D0;

import c1.InterfaceC2009b;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class y implements InterfaceC2009b {

    /* renamed from: b, reason: collision with root package name */
    private volatile Set f1215b = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile Set f1214a = Collections.newSetFromMap(new ConcurrentHashMap());

    y(Collection collection) {
        this.f1214a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y b(Collection collection) {
        return new y((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator it = this.f1214a.iterator();
            while (it.hasNext()) {
                this.f1215b.add(((InterfaceC2009b) it.next()).get());
            }
            this.f1214a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(InterfaceC2009b interfaceC2009b) {
        try {
            if (this.f1215b == null) {
                this.f1214a.add(interfaceC2009b);
            } else {
                this.f1215b.add(interfaceC2009b.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // c1.InterfaceC2009b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f1215b == null) {
            synchronized (this) {
                try {
                    if (this.f1215b == null) {
                        this.f1215b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f1215b);
    }
}
