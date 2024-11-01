package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SkippableUpdater<T> {
    private final Composer composer;

    private /* synthetic */ SkippableUpdater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ SkippableUpdater m2462boximpl(Composer composer) {
        return new SkippableUpdater(composer);
    }

    /* renamed from: constructor-impl */
    public static <T> Composer m2463constructorimpl(Composer composer) {
        return composer;
    }

    /* renamed from: equals-impl */
    public static boolean m2464equalsimpl(Composer composer, Object obj) {
        return (obj instanceof SkippableUpdater) && AbstractC3292y.d(composer, ((SkippableUpdater) obj).m2469unboximpl());
    }

    /* renamed from: equals-impl0 */
    public static final boolean m2465equalsimpl0(Composer composer, Composer composer2) {
        return AbstractC3292y.d(composer, composer2);
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m2466hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: toString-impl */
    public static String m2467toStringimpl(Composer composer) {
        return "SkippableUpdater(composer=" + composer + ')';
    }

    /* renamed from: update-impl */
    public static final void m2468updateimpl(Composer composer, Function1 function1) {
        composer.startReplaceableGroup(509942095);
        function1.invoke(Updater.m2472boximpl(Updater.m2473constructorimpl(composer)));
        composer.endReplaceableGroup();
    }

    public boolean equals(Object obj) {
        return m2464equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m2466hashCodeimpl(this.composer);
    }

    public String toString() {
        return m2467toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ Composer m2469unboximpl() {
        return this.composer;
    }
}
