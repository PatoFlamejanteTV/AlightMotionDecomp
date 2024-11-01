package androidx.compose.ui;

import U5.d;
import androidx.annotation.RestrictTo;
import c6.InterfaceC2072n;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.InterfaceC3488x0;
import n6.N;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@InternalComposeUiApi
/* loaded from: classes.dex */
public final class SessionMutex<T> {
    private final AtomicReference<Session<T>> currentSessionHolder;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class Session<T> {
        private final InterfaceC3488x0 job;
        private final T value;

        public Session(InterfaceC3488x0 interfaceC3488x0, T t8) {
            this.job = interfaceC3488x0;
            this.value = t8;
        }

        public final InterfaceC3488x0 getJob() {
            return this.job;
        }

        public final T getValue() {
            return this.value;
        }
    }

    private /* synthetic */ SessionMutex(AtomicReference atomicReference) {
        this.currentSessionHolder = atomicReference;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SessionMutex m2587boximpl(AtomicReference atomicReference) {
        return new SessionMutex(atomicReference);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static <T> AtomicReference<Session<T>> m2589constructorimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2590equalsimpl(AtomicReference<Session<T>> atomicReference, Object obj) {
        return (obj instanceof SessionMutex) && AbstractC3292y.d(atomicReference, ((SessionMutex) obj).m2596unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2591equalsimpl0(AtomicReference<Session<T>> atomicReference, AtomicReference<Session<T>> atomicReference2) {
        return AbstractC3292y.d(atomicReference, atomicReference2);
    }

    /* renamed from: getCurrentSession-impl, reason: not valid java name */
    public static final T m2592getCurrentSessionimpl(AtomicReference<Session<T>> atomicReference) {
        Session<T> session = atomicReference.get();
        if (session != null) {
            return session.getValue();
        }
        return null;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2593hashCodeimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2594toStringimpl(AtomicReference<Session<T>> atomicReference) {
        return "SessionMutex(currentSessionHolder=" + atomicReference + ')';
    }

    /* renamed from: withSessionCancellingPrevious-impl, reason: not valid java name */
    public static final <R> Object m2595withSessionCancellingPreviousimpl(AtomicReference<Session<T>> atomicReference, Function1 function1, InterfaceC2072n interfaceC2072n, d dVar) {
        return N.e(new SessionMutex$withSessionCancellingPrevious$2(function1, atomicReference, interfaceC2072n, null), dVar);
    }

    public boolean equals(Object obj) {
        return m2590equalsimpl(this.currentSessionHolder, obj);
    }

    public int hashCode() {
        return m2593hashCodeimpl(this.currentSessionHolder);
    }

    public String toString() {
        return m2594toStringimpl(this.currentSessionHolder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ AtomicReference m2596unboximpl() {
        return this.currentSessionHolder;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> AtomicReference<Session<T>> m2588constructorimpl() {
        return m2589constructorimpl(new AtomicReference(null));
    }
}
