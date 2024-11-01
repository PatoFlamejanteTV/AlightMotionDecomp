package w0;

import j$.util.Objects;
import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class l {

    /* loaded from: classes3.dex */
    static class a implements k, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final k f40661a;

        /* renamed from: b, reason: collision with root package name */
        volatile transient boolean f40662b;

        /* renamed from: c, reason: collision with root package name */
        transient Object f40663c;

        a(k kVar) {
            this.f40661a = (k) h.i(kVar);
        }

        @Override // w0.k
        public Object get() {
            if (!this.f40662b) {
                synchronized (this) {
                    try {
                        if (!this.f40662b) {
                            Object obj = this.f40661a.get();
                            this.f40663c = obj;
                            this.f40662b = true;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return e.a(this.f40663c);
        }

        public String toString() {
            Object obj;
            if (this.f40662b) {
                String valueOf = String.valueOf(this.f40663c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            } else {
                obj = this.f40661a;
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes3.dex */
    static class b implements k {

        /* renamed from: a, reason: collision with root package name */
        volatile k f40664a;

        /* renamed from: b, reason: collision with root package name */
        volatile boolean f40665b;

        /* renamed from: c, reason: collision with root package name */
        Object f40666c;

        b(k kVar) {
            this.f40664a = (k) h.i(kVar);
        }

        @Override // w0.k
        public Object get() {
            if (!this.f40665b) {
                synchronized (this) {
                    try {
                        if (!this.f40665b) {
                            k kVar = this.f40664a;
                            Objects.requireNonNull(kVar);
                            Object obj = kVar.get();
                            this.f40666c = obj;
                            this.f40665b = true;
                            this.f40664a = null;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return e.a(this.f40666c);
        }

        public String toString() {
            Object obj = this.f40664a;
            if (obj == null) {
                String valueOf = String.valueOf(this.f40666c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes3.dex */
    private static class c implements k, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Object f40667a;

        c(Object obj) {
            this.f40667a = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return f.a(this.f40667a, ((c) obj).f40667a);
            }
            return false;
        }

        @Override // w0.k
        public Object get() {
            return this.f40667a;
        }

        public int hashCode() {
            return f.b(this.f40667a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f40667a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Suppliers.ofInstance(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static k a(k kVar) {
        if (!(kVar instanceof b) && !(kVar instanceof a)) {
            if (kVar instanceof Serializable) {
                return new a(kVar);
            }
            return new b(kVar);
        }
        return kVar;
    }

    public static k b(Object obj) {
        return new c(obj);
    }
}
