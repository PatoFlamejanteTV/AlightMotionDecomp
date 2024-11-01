package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class X {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f34577a;

    public X(int i8) {
        this.f34577a = new ArrayList(i8);
    }

    public void a(Object obj) {
        this.f34577a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList arrayList = this.f34577a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f34577a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f34577a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f34577a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f34577a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f34577a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f34577a.toArray(objArr);
    }
}
