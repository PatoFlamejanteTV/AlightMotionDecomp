package androidx.compose.foundation.lazy.layout;

import Q5.C1413h;
import Q5.p;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;

/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierLocal implements ModifierLocalProvider<BeyondBoundsLayout>, BeyondBoundsLayout {
    public static final Companion Companion = new Companion(null);
    private static final LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1 emptyBeyondBoundsScope = new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1
        private final boolean hasMoreContent;

        @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    };
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final LayoutDirection layoutDirection;
    private final Orientation orientation;
    private final boolean reverseLayout;
    private final LazyLayoutBeyondBoundsState state;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LazyLayoutBeyondBoundsModifierLocal(LazyLayoutBeyondBoundsState state, LazyLayoutBeyondBoundsInfo beyondBoundsInfo, boolean z8, LayoutDirection layoutDirection, Orientation orientation) {
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(beyondBoundsInfo, "beyondBoundsInfo");
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        AbstractC3292y.i(orientation, "orientation");
        this.state = state;
        this.beyondBoundsInfo = beyondBoundsInfo;
        this.reverseLayout = z8;
        this.layoutDirection = layoutDirection;
        this.orientation = orientation;
    }

    /* renamed from: addNextInterval-FR3nfPY, reason: not valid java name */
    private final LazyLayoutBeyondBoundsInfo.Interval m725addNextIntervalFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i8) {
        int start = interval.getStart();
        int end = interval.getEnd();
        if (m727isForward4vf7U8o(i8)) {
            end++;
        } else {
            start--;
        }
        return this.beyondBoundsInfo.addInterval(start, end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hasMoreContent-FR3nfPY, reason: not valid java name */
    public final boolean m726hasMoreContentFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i8) {
        if (m728isOppositeToOrientation4vf7U8o(i8)) {
            return false;
        }
        if (m727isForward4vf7U8o(i8)) {
            if (interval.getEnd() >= this.state.getItemCount() - 1) {
                return false;
            }
        } else if (interval.getStart() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: isForward-4vf7U8o, reason: not valid java name */
    private final boolean m727isForward4vf7U8o(int i8) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        if (BeyondBoundsLayout.LayoutDirection.m4088equalsimpl0(i8, companion.m4094getBeforehoxUOeE())) {
            return false;
        }
        if (!BeyondBoundsLayout.LayoutDirection.m4088equalsimpl0(i8, companion.m4093getAfterhoxUOeE())) {
            if (BeyondBoundsLayout.LayoutDirection.m4088equalsimpl0(i8, companion.m4092getAbovehoxUOeE())) {
                return this.reverseLayout;
            }
            if (BeyondBoundsLayout.LayoutDirection.m4088equalsimpl0(i8, companion.m4095getBelowhoxUOeE())) {
                if (this.reverseLayout) {
                    return false;
                }
            } else if (BeyondBoundsLayout.LayoutDirection.m4088equalsimpl0(i8, companion.m4096getLefthoxUOeE())) {
                int i9 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
                if (i9 != 1) {
                    if (i9 == 2) {
                        if (this.reverseLayout) {
                            return false;
                        }
                    } else {
                        throw new p();
                    }
                } else {
                    return this.reverseLayout;
                }
            } else {
                if (!BeyondBoundsLayout.LayoutDirection.m4088equalsimpl0(i8, companion.m4097getRighthoxUOeE())) {
                    LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
                    throw new C1413h();
                }
                int i10 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        return this.reverseLayout;
                    }
                    throw new p();
                }
                if (this.reverseLayout) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: isOppositeToOrientation-4vf7U8o, reason: not valid java name */
    private final boolean m728isOppositeToOrientation4vf7U8o(int i8) {
        boolean m4088equalsimpl0;
        boolean m4088equalsimpl02;
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        boolean z8 = true;
        if (BeyondBoundsLayout.LayoutDirection.m4088equalsimpl0(i8, companion.m4092getAbovehoxUOeE())) {
            m4088equalsimpl0 = true;
        } else {
            m4088equalsimpl0 = BeyondBoundsLayout.LayoutDirection.m4088equalsimpl0(i8, companion.m4095getBelowhoxUOeE());
        }
        if (m4088equalsimpl0) {
            if (this.orientation == Orientation.Horizontal) {
                return true;
            }
        } else {
            if (BeyondBoundsLayout.LayoutDirection.m4088equalsimpl0(i8, companion.m4096getLefthoxUOeE())) {
                m4088equalsimpl02 = true;
            } else {
                m4088equalsimpl02 = BeyondBoundsLayout.LayoutDirection.m4088equalsimpl0(i8, companion.m4097getRighthoxUOeE());
            }
            if (m4088equalsimpl02) {
                if (this.orientation == Orientation.Vertical) {
                    return true;
                }
            } else {
                if (!BeyondBoundsLayout.LayoutDirection.m4088equalsimpl0(i8, companion.m4094getBeforehoxUOeE())) {
                    z8 = BeyondBoundsLayout.LayoutDirection.m4088equalsimpl0(i8, companion.m4093getAfterhoxUOeE());
                }
                if (!z8) {
                    LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
                    throw new C1413h();
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, InterfaceC2072n interfaceC2072n) {
        return androidx.compose.ui.b.c(this, obj, interfaceC2072n);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, InterfaceC2072n interfaceC2072n) {
        return androidx.compose.ui.b.d(this, obj, interfaceC2072n);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal<BeyondBoundsLayout> getKey() {
        return BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public BeyondBoundsLayout getValue() {
        return this;
    }

    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    /* renamed from: layout-o7g1Pn8, reason: not valid java name */
    public <T> T mo729layouto7g1Pn8(final int i8, Function1 block) {
        int firstPlacedIndex;
        AbstractC3292y.i(block, "block");
        if (this.state.getItemCount() > 0 && this.state.getHasVisibleItems()) {
            if (m727isForward4vf7U8o(i8)) {
                firstPlacedIndex = this.state.getLastPlacedIndex();
            } else {
                firstPlacedIndex = this.state.getFirstPlacedIndex();
            }
            final T t8 = new T();
            t8.f34573a = this.beyondBoundsInfo.addInterval(firstPlacedIndex, firstPlacedIndex);
            T t9 = null;
            while (t9 == null && m726hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) t8.f34573a, i8)) {
                LazyLayoutBeyondBoundsInfo.Interval m725addNextIntervalFR3nfPY = m725addNextIntervalFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) t8.f34573a, i8);
                this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) t8.f34573a);
                t8.f34573a = m725addNextIntervalFR3nfPY;
                this.state.remeasure();
                t9 = (T) block.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$layout$2
                    @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                    public boolean getHasMoreContent() {
                        boolean m726hasMoreContentFR3nfPY;
                        m726hasMoreContentFR3nfPY = LazyLayoutBeyondBoundsModifierLocal.this.m726hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) t8.f34573a, i8);
                        return m726hasMoreContentFR3nfPY;
                    }
                });
            }
            this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) t8.f34573a);
            this.state.remeasure();
            return t9;
        }
        return (T) block.invoke(emptyBeyondBoundsScope);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
