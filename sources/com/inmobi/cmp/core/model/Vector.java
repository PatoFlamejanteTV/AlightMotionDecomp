package com.inmobi.cmp.core.model;

import Q5.I;
import R5.AbstractC1435t;
import c6.InterfaceC2072n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import l6.n;
import w5.AbstractC4157a;

/* loaded from: classes4.dex */
public final class Vector {

    /* renamed from: a, reason: collision with root package name */
    public Map<Integer, Boolean> f19078a;

    /* renamed from: b, reason: collision with root package name */
    public int f19079b;

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {
        public a() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            if (((Boolean) obj2).booleanValue()) {
                Vector.this.set(intValue);
            } else {
                Vector.this.unset(intValue);
            }
            return I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {
        public b() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (Vector.this.getMap().containsKey(Integer.valueOf(intValue))) {
                if (booleanValue) {
                    Vector.this.set(intValue);
                } else {
                    Vector.this.unset(intValue);
                }
            }
            return I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Vector f19083b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Vector vector) {
            super(2);
            this.f19083b = vector;
        }

        @Override // c6.InterfaceC2072n
        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            ((Boolean) obj2).booleanValue();
            Vector vector = Vector.this;
            if (vector != null && !vector.contains(intValue)) {
                this.f19083b.unset(intValue);
            }
            return I.f8786a;
        }
    }

    public Vector() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Vector copy$default(Vector vector, Map map, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            map = vector.f19078a;
        }
        return vector.copy(map);
    }

    public final void clear() {
        this.f19078a.clear();
    }

    public final Map<Integer, Boolean> component1() {
        return this.f19078a;
    }

    public final boolean contains(int i8) {
        return this.f19078a.containsKey(Integer.valueOf(i8));
    }

    public final Vector copy(Map<Integer, Boolean> map) {
        AbstractC3292y.i(map, "map");
        return new Vector(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Vector) && AbstractC3292y.d(this.f19078a, ((Vector) obj).f19078a);
    }

    public final void forEach(InterfaceC2072n action) {
        AbstractC3292y.i(action, "action");
        for (Map.Entry<Integer, Boolean> entry : this.f19078a.entrySet()) {
            action.invoke(entry.getKey(), entry.getValue());
        }
    }

    public final Boolean get(int i8) {
        return this.f19078a.get(Integer.valueOf(i8));
    }

    public final Set<Integer> getAcceptedItems() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = getMap().keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (AbstractC3292y.d(get(intValue), Boolean.TRUE)) {
                linkedHashSet.add(Integer.valueOf(intValue));
            }
        }
        return linkedHashSet;
    }

    public final int getBitLength() {
        return this.f19079b;
    }

    public final Set<Integer> getKeys() {
        return this.f19078a.keySet();
    }

    public final Map<Integer, Boolean> getMap() {
        return this.f19078a;
    }

    public final int getMaxId() {
        Integer num = (Integer) AbstractC1435t.A0(this.f19078a.keySet());
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int hashCode() {
        return this.f19078a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f19078a.isEmpty();
    }

    public final void set(int i8) {
        this.f19078a.put(Integer.valueOf(i8), Boolean.TRUE);
    }

    public final void setAllOwnedItems() {
        Iterator<Map.Entry<Integer, Boolean>> it = this.f19078a.entrySet().iterator();
        while (it.hasNext()) {
            set(it.next().getKey().intValue());
        }
    }

    public final void setBitLength(int i8) {
        this.f19079b = i8;
    }

    public final void setItems(Set<Integer> ids) {
        AbstractC3292y.i(ids, "ids");
        Iterator<T> it = ids.iterator();
        while (it.hasNext()) {
            getMap().put(Integer.valueOf(((Number) it.next()).intValue()), Boolean.TRUE);
            setBitLength(0);
        }
    }

    public final void setMap(Map<Integer, Boolean> map) {
        AbstractC3292y.i(map, "<set-?>");
        this.f19078a = map;
    }

    public final void setOwnedItems(Vector vector) {
        if (vector != null) {
            vector.forEach(new b());
        }
    }

    public final int size() {
        return this.f19078a.size();
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("Vector(map=");
        a9.append(this.f19078a);
        a9.append(')');
        return a9.toString();
    }

    public final void unset(int i8) {
        this.f19078a.put(Integer.valueOf(i8), Boolean.FALSE);
        this.f19079b = 0;
    }

    public final void unsetAllOwnedItems() {
        Iterator<Map.Entry<Integer, Boolean>> it = this.f19078a.entrySet().iterator();
        while (it.hasNext()) {
            unset(it.next().getKey().intValue());
        }
    }

    public Vector(Map<Integer, Boolean> map) {
        AbstractC3292y.i(map, "map");
        this.f19078a = map;
    }

    public final void set(Vector vector) {
        if (vector == null) {
            return;
        }
        vector.forEach(new a());
    }

    public final void set(Set<String> ids) {
        AbstractC3292y.i(ids, "ids");
        Iterator<T> it = ids.iterator();
        while (it.hasNext()) {
            Integer i8 = n.i((String) it.next());
            if (i8 != null) {
                getMap().put(Integer.valueOf(i8.intValue()), Boolean.TRUE);
                setBitLength(0);
            }
        }
    }

    public final void unset(Vector vector) {
        forEach(new c(this));
    }

    public /* synthetic */ Vector(Map map, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? new LinkedHashMap() : map);
    }

    public final void unset(Set<Integer> ids) {
        AbstractC3292y.i(ids, "ids");
        Iterator<T> it = ids.iterator();
        while (it.hasNext()) {
            getMap().put(Integer.valueOf(((Number) it.next()).intValue()), Boolean.FALSE);
            setBitLength(0);
        }
    }
}
