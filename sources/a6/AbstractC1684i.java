package a6;

import Q5.I;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC3258j;
import k6.InterfaceC3255g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: a6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1684i {

    /* renamed from: a6.i$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f14134a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList arrayList) {
            super(1);
            this.f14134a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return I.f8786a;
        }

        public final void invoke(String it) {
            AbstractC3292y.i(it, "it");
            this.f14134a.add(it);
        }
    }

    public static final long a(Reader reader, Writer out, int i8) {
        AbstractC3292y.i(reader, "<this>");
        AbstractC3292y.i(out, "out");
        char[] cArr = new char[i8];
        int read = reader.read(cArr);
        long j8 = 0;
        while (read >= 0) {
            out.write(cArr, 0, read);
            j8 += read;
            read = reader.read(cArr);
        }
        return j8;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 8192;
        }
        return a(reader, writer, i8);
    }

    public static final void c(Reader reader, Function1 action) {
        BufferedReader bufferedReader;
        AbstractC3292y.i(reader, "<this>");
        AbstractC3292y.i(action, "action");
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader, 8192);
        }
        try {
            Iterator it = d(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            I i8 = I.f8786a;
            AbstractC1677b.a(bufferedReader, null);
        } finally {
        }
    }

    public static final InterfaceC3255g d(BufferedReader bufferedReader) {
        AbstractC3292y.i(bufferedReader, "<this>");
        return AbstractC3258j.d(new C1683h(bufferedReader));
    }

    public static final List e(Reader reader) {
        AbstractC3292y.i(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        c(reader, new a(arrayList));
        return arrayList;
    }

    public static final String f(Reader reader) {
        AbstractC3292y.i(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        AbstractC3292y.h(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
