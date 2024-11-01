package j4;

import R5.AbstractC1435t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import r4.InterfaceC3924x;

/* loaded from: classes4.dex */
public final class J0 implements InterfaceC3924x {

    /* renamed from: a, reason: collision with root package name */
    private final int f33865a;

    /* renamed from: b, reason: collision with root package name */
    private final List f33866b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33867c;

    /* renamed from: d, reason: collision with root package name */
    private final List f33868d;

    /* renamed from: e, reason: collision with root package name */
    private final List f33869e;

    public J0(int i8, List items) {
        AbstractC3292y.i(items, "items");
        this.f33865a = i8;
        this.f33866b = items;
        this.f33867c = "simple_dropdown";
        List list = items;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((V) it.next()).a());
        }
        this.f33868d = arrayList;
        List list2 = this.f33866b;
        ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((V) it2.next()).b());
        }
        this.f33869e = arrayList2;
    }

    @Override // r4.InterfaceC3924x
    public int b() {
        return this.f33865a;
    }

    @Override // r4.InterfaceC3924x
    public String f(String rawValue) {
        Object obj;
        String b9;
        AbstractC3292y.i(rawValue, "rawValue");
        Iterator it = this.f33866b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3292y.d(((V) obj).a(), rawValue)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        V v8 = (V) obj;
        if (v8 == null || (b9 = v8.b()) == null) {
            return ((V) this.f33866b.get(0)).b();
        }
        return b9;
    }

    @Override // r4.InterfaceC3924x
    public String g(int i8) {
        return (String) i().get(i8);
    }

    @Override // r4.InterfaceC3924x
    public boolean h() {
        return InterfaceC3924x.a.a(this);
    }

    @Override // r4.InterfaceC3924x
    public List i() {
        return this.f33869e;
    }

    @Override // r4.InterfaceC3924x
    public List j() {
        return this.f33868d;
    }

    @Override // r4.InterfaceC3924x
    public boolean k() {
        return InterfaceC3924x.a.b(this);
    }
}
