package com.uptodown.activities;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import c5.C2041f;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import q5.AbstractC3768A;
import q5.C3784i;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public final class z extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f30668a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f30669b;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f30670a;

        public a(ArrayList positives) {
            AbstractC3292y.i(positives, "positives");
            this.f30670a = positives;
        }

        public final ArrayList a() {
            return this.f30670a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3292y.d(this.f30670a, ((a) obj).f30670a);
        }

        public int hashCode() {
            return this.f30670a.hashCode();
        }

        public String toString() {
            return "SecurityData(positives=" + this.f30670a + ')';
        }
    }

    public z() {
        q6.w a9 = AbstractC3815N.a(AbstractC3768A.a.f37253a);
        this.f30668a = a9;
        this.f30669b = a9;
    }

    public final void a(Context context) {
        AbstractC3292y.i(context, "context");
        ArrayList arrayList = new ArrayList();
        ArrayList C8 = new C3784i().C(context);
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (aVar.w() != null) {
            ArrayList w8 = aVar.w();
            AbstractC3292y.f(w8);
            Iterator it = w8.iterator();
            AbstractC3292y.h(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                c5.F f8 = (c5.F) next;
                Iterator it2 = C8.iterator();
                AbstractC3292y.h(it2, "iterator(...)");
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    AbstractC3292y.h(next2, "next(...)");
                    C2041f c2041f = (C2041f) next2;
                    if (AbstractC3292y.d(f8.c(), c2041f.X())) {
                        c2041f.E0(f8);
                        arrayList.add(c2041f);
                    }
                }
            }
        }
        C3784i.f37274a.d(arrayList, context);
        this.f30668a.setValue(new AbstractC3768A.c(new a(arrayList)));
    }

    public final InterfaceC3813L b() {
        return this.f30669b;
    }
}
