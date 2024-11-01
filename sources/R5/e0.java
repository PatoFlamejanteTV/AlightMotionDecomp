package R5;

import c6.InterfaceC2072n;
import java.util.Iterator;
import k6.AbstractC3257i;
import k6.AbstractC3258j;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class e0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.k implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f9329a;

        /* renamed from: b, reason: collision with root package name */
        Object f9330b;

        /* renamed from: c, reason: collision with root package name */
        int f9331c;

        /* renamed from: d, reason: collision with root package name */
        int f9332d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f9333e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f9334f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f9335g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Iterator f9336h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f9337i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f9338j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8, int i9, Iterator it, boolean z8, boolean z9, U5.d dVar) {
            super(2, dVar);
            this.f9334f = i8;
            this.f9335g = i9;
            this.f9336h = it;
            this.f9337i = z8;
            this.f9338j = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            a aVar = new a(this.f9334f, this.f9335g, this.f9336h, this.f9337i, this.f9338j, dVar);
            aVar.f9333e = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00ad  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0146 -> B:12:0x0149). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0118 -> B:30:0x011b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00a2 -> B:50:0x0055). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 360
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: R5.e0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(AbstractC3257i abstractC3257i, U5.d dVar) {
            return ((a) create(abstractC3257i, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public static final void a(int i8, int i9) {
        String str;
        if (i8 > 0 && i9 > 0) {
            return;
        }
        if (i8 != i9) {
            str = "Both size " + i8 + " and step " + i9 + " must be greater than zero.";
        } else {
            str = "size " + i8 + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public static final Iterator b(Iterator iterator, int i8, int i9, boolean z8, boolean z9) {
        AbstractC3292y.i(iterator, "iterator");
        if (!iterator.hasNext()) {
            return F.f9297a;
        }
        return AbstractC3258j.a(new a(i8, i9, iterator, z9, z8, null));
    }
}
