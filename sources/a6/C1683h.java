package a6;

import d6.InterfaceC2767a;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import k6.InterfaceC3255g;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a6.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1683h implements InterfaceC3255g {

    /* renamed from: a, reason: collision with root package name */
    private final BufferedReader f14130a;

    /* renamed from: a6.h$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC2767a {

        /* renamed from: a, reason: collision with root package name */
        private String f14131a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f14132b;

        a() {
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (hasNext()) {
                String str = this.f14131a;
                this.f14131a = null;
                AbstractC3292y.f(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f14131a == null && !this.f14132b) {
                String readLine = C1683h.this.f14130a.readLine();
                this.f14131a = readLine;
                if (readLine == null) {
                    this.f14132b = true;
                }
            }
            if (this.f14131a != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1683h(BufferedReader reader) {
        AbstractC3292y.i(reader, "reader");
        this.f14130a = reader;
    }

    @Override // k6.InterfaceC3255g
    public Iterator iterator() {
        return new a();
    }
}
