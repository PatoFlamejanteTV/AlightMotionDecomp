package androidx.compose.foundation.lazy.layout;

import Q5.I;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ LazyLayoutItemContentFactory this$0;
    final /* synthetic */ LazyLayoutItemContentFactory.CachedItemContent this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3293z implements Function1 {
        final /* synthetic */ LazyLayoutItemContentFactory.CachedItemContent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
            super(1);
            this.this$0 = cachedItemContent;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
            AbstractC3292y.i(DisposableEffect, "$this$DisposableEffect");
            final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this.this$0;
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    LazyLayoutItemContentFactory.CachedItemContent.this._content = null;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
        super(2);
        this.this$0 = lazyLayoutItemContentFactory;
        this.this$1 = cachedItemContent;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        SaveableStateHolder saveableStateHolder;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1403994769, i8, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:90)");
        }
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.this$0.getItemProvider().invoke();
        int index = this.this$1.getIndex();
        if ((index >= lazyLayoutItemProvider.getItemCount() || !AbstractC3292y.d(lazyLayoutItemProvider.getKey(index), this.this$1.getKey())) && (index = lazyLayoutItemProvider.getIndex(this.this$1.getKey())) != -1) {
            this.this$1.index = index;
        }
        int i9 = index;
        boolean z8 = i9 != -1;
        LazyLayoutItemContentFactory lazyLayoutItemContentFactory = this.this$0;
        LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this.this$1;
        composer.startReusableGroup(ComposerKt.reuseKey, Boolean.valueOf(z8));
        boolean changed = composer.changed(z8);
        if (z8) {
            saveableStateHolder = lazyLayoutItemContentFactory.saveableStateHolder;
            LazyLayoutItemContentFactoryKt.m730SkippableItemJVlU9Rs(lazyLayoutItemProvider, StableValue.m738constructorimpl(saveableStateHolder), i9, StableValue.m738constructorimpl(cachedItemContent.getKey()), composer, 0);
        } else {
            composer.deactivateToEndGroup(changed);
        }
        composer.endReusableGroup();
        EffectsKt.DisposableEffect(this.this$1.getKey(), new AnonymousClass2(this.this$1), composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
