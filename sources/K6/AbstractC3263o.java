package k6;

import R5.AbstractC1435t;
import d6.InterfaceC2767a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: k6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3263o extends AbstractC3262n {

    /* renamed from: k6.o$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterable, InterfaceC2767a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3255g f34541a;

        public a(InterfaceC3255g interfaceC3255g) {
            this.f34541a = interfaceC3255g;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f34541a.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k6.o$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f34542a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj == null);
        }
    }

    public static Comparable A(InterfaceC3255g interfaceC3255g) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        Iterator it = interfaceC3255g.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static InterfaceC3255g B(InterfaceC3255g interfaceC3255g, int i8) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        if (i8 >= 0) {
            if (i8 == 0) {
                return AbstractC3258j.e();
            }
            if (interfaceC3255g instanceof InterfaceC3250b) {
                return ((InterfaceC3250b) interfaceC3255g).a(i8);
            }
            return new C3264p(interfaceC3255g, i8);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static InterfaceC3255g C(InterfaceC3255g interfaceC3255g, Function1 predicate) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        AbstractC3292y.i(predicate, "predicate");
        return new C3265q(interfaceC3255g, predicate);
    }

    public static List D(InterfaceC3255g interfaceC3255g) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        Iterator it = interfaceC3255g.iterator();
        if (!it.hasNext()) {
            return AbstractC1435t.m();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC1435t.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static boolean l(InterfaceC3255g interfaceC3255g) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        return interfaceC3255g.iterator().hasNext();
    }

    public static Iterable m(InterfaceC3255g interfaceC3255g) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        return new a(interfaceC3255g);
    }

    public static boolean n(InterfaceC3255g interfaceC3255g, Object obj) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        if (t(interfaceC3255g, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static int o(InterfaceC3255g interfaceC3255g) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        Iterator it = interfaceC3255g.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            it.next();
            i8++;
            if (i8 < 0) {
                AbstractC1435t.v();
            }
        }
        return i8;
    }

    public static InterfaceC3255g p(InterfaceC3255g interfaceC3255g, Function1 predicate) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        AbstractC3292y.i(predicate, "predicate");
        return new C3252d(interfaceC3255g, false, predicate);
    }

    public static InterfaceC3255g q(InterfaceC3255g interfaceC3255g) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        InterfaceC3255g p8 = AbstractC3258j.p(interfaceC3255g, b.f34542a);
        AbstractC3292y.g(p8, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return p8;
    }

    public static Object r(InterfaceC3255g interfaceC3255g) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        Iterator it = interfaceC3255g.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static Object s(InterfaceC3255g interfaceC3255g) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        Iterator it = interfaceC3255g.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static final int t(InterfaceC3255g interfaceC3255g, Object obj) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        int i8 = 0;
        for (Object obj2 : interfaceC3255g) {
            if (i8 < 0) {
                AbstractC1435t.w();
            }
            if (AbstractC3292y.d(obj, obj2)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final Appendable u(InterfaceC3255g interfaceC3255g, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 function1) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        AbstractC3292y.i(buffer, "buffer");
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (Object obj : interfaceC3255g) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            l6.n.a(buffer, obj, function1);
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String v(InterfaceC3255g interfaceC3255g, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 function1) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(truncated, "truncated");
        String sb = ((StringBuilder) u(interfaceC3255g, new StringBuilder(), separator, prefix, postfix, i8, truncated, function1)).toString();
        AbstractC3292y.h(sb, "toString(...)");
        return sb;
    }

    public static /* synthetic */ String w(InterfaceC3255g interfaceC3255g, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Function1 function1, int i9, Object obj) {
        CharSequence charSequence5;
        int i10;
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i9 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i9 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i9 & 8) != 0) {
            i10 = -1;
        } else {
            i10 = i8;
        }
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            function1 = null;
        }
        return v(interfaceC3255g, charSequence, charSequence5, charSequence6, i10, charSequence7, function1);
    }

    public static Object x(InterfaceC3255g interfaceC3255g) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        Iterator it = interfaceC3255g.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static InterfaceC3255g y(InterfaceC3255g interfaceC3255g, Function1 transform) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        AbstractC3292y.i(transform, "transform");
        return new C3266r(interfaceC3255g, transform);
    }

    public static InterfaceC3255g z(InterfaceC3255g interfaceC3255g, Function1 transform) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        AbstractC3292y.i(transform, "transform");
        return AbstractC3258j.q(new C3266r(interfaceC3255g, transform));
    }
}
