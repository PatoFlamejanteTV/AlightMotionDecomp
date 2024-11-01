package androidx.compose.runtime;

import Q5.I;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class Updater<T> {
    private final Composer composer;

    private /* synthetic */ Updater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Updater m2472boximpl(Composer composer) {
        return new Updater(composer);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m2473constructorimpl(Composer composer) {
        return composer;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2474equalsimpl(Composer composer, Object obj) {
        return (obj instanceof Updater) && AbstractC3292y.d(composer, ((Updater) obj).m2484unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2475equalsimpl0(Composer composer, Composer composer2) {
        return AbstractC3292y.d(composer, composer2);
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2476hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: init-impl, reason: not valid java name */
    public static final void m2477initimpl(Composer composer, Function1 function1) {
        if (composer.getInserting()) {
            composer.apply(I.f8786a, new Updater$init$1(function1));
        }
    }

    /* renamed from: reconcile-impl, reason: not valid java name */
    public static final void m2478reconcileimpl(Composer composer, Function1 function1) {
        composer.apply(I.f8786a, new Updater$reconcile$1(function1));
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m2479setimpl(Composer composer, int i8, InterfaceC2072n interfaceC2072n) {
        if (composer.getInserting() || !AbstractC3292y.d(composer.rememberedValue(), Integer.valueOf(i8))) {
            composer.updateRememberedValue(Integer.valueOf(i8));
            composer.apply(Integer.valueOf(i8), interfaceC2072n);
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2481toStringimpl(Composer composer) {
        return "Updater(composer=" + composer + ')';
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final void m2482updateimpl(Composer composer, int i8, InterfaceC2072n interfaceC2072n) {
        boolean inserting = composer.getInserting();
        if (inserting || !AbstractC3292y.d(composer.rememberedValue(), Integer.valueOf(i8))) {
            composer.updateRememberedValue(Integer.valueOf(i8));
            if (inserting) {
                return;
            }
            composer.apply(Integer.valueOf(i8), interfaceC2072n);
        }
    }

    public boolean equals(Object obj) {
        return m2474equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m2476hashCodeimpl(this.composer);
    }

    public String toString() {
        return m2481toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Composer m2484unboximpl() {
        return this.composer;
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final <V> void m2480setimpl(Composer composer, V v8, InterfaceC2072n interfaceC2072n) {
        if (composer.getInserting() || !AbstractC3292y.d(composer.rememberedValue(), v8)) {
            composer.updateRememberedValue(v8);
            composer.apply(v8, interfaceC2072n);
        }
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final <V> void m2483updateimpl(Composer composer, V v8, InterfaceC2072n interfaceC2072n) {
        boolean inserting = composer.getInserting();
        if (inserting || !AbstractC3292y.d(composer.rememberedValue(), v8)) {
            composer.updateRememberedValue(v8);
            if (inserting) {
                return;
            }
            composer.apply(v8, interfaceC2072n);
        }
    }
}
