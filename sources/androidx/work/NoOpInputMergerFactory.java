package androidx.work;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class NoOpInputMergerFactory extends InputMergerFactory {
    public static final NoOpInputMergerFactory INSTANCE = new NoOpInputMergerFactory();

    private NoOpInputMergerFactory() {
    }

    /* renamed from: createInputMerger, reason: collision with other method in class */
    public Void m5458createInputMerger(String className) {
        AbstractC3292y.i(className, "className");
        return null;
    }

    @Override // androidx.work.InputMergerFactory
    public /* bridge */ /* synthetic */ InputMerger createInputMerger(String str) {
        return (InputMerger) m5458createInputMerger(str);
    }
}
