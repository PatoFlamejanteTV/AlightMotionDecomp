package androidx.compose.material3;

import U5.d;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class PinnedScrollBehavior implements TopAppBarScrollBehavior {
    private final Function0 canScroll;
    private final DecayAnimationSpec<Float> flingAnimationSpec;
    private final boolean isPinned;
    private NestedScrollConnection nestedScrollConnection;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final TopAppBarState state;

    /* renamed from: androidx.compose.material3.PinnedScrollBehavior$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public PinnedScrollBehavior(TopAppBarState state, Function0 canScroll) {
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(canScroll, "canScroll");
        this.state = state;
        this.canScroll = canScroll;
        this.isPinned = true;
        this.nestedScrollConnection = new NestedScrollConnection() { // from class: androidx.compose.material3.PinnedScrollBehavior$nestedScrollConnection$1
            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostFling-RZ2iAVY */
            public /* synthetic */ Object mo432onPostFlingRZ2iAVY(long j8, long j9, d dVar) {
                return androidx.compose.ui.input.nestedscroll.a.a(this, j8, j9, dVar);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public long mo433onPostScrollDzOQY0M(long j8, long j9, int i8) {
                if (!((Boolean) PinnedScrollBehavior.this.getCanScroll().invoke()).booleanValue()) {
                    return Offset.Companion.m2728getZeroF1C5BW0();
                }
                if (Offset.m2713getYimpl(j8) == 0.0f && Offset.m2713getYimpl(j9) > 0.0f) {
                    PinnedScrollBehavior.this.getState().setContentOffset(0.0f);
                } else {
                    TopAppBarState state2 = PinnedScrollBehavior.this.getState();
                    state2.setContentOffset(state2.getContentOffset() + Offset.m2713getYimpl(j8));
                }
                return Offset.Companion.m2728getZeroF1C5BW0();
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreFling-QWom1Mo */
            public /* synthetic */ Object mo434onPreFlingQWom1Mo(long j8, d dVar) {
                return androidx.compose.ui.input.nestedscroll.a.c(this, j8, dVar);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreScroll-OzD1aCk */
            public /* synthetic */ long mo435onPreScrollOzD1aCk(long j8, int i8) {
                return androidx.compose.ui.input.nestedscroll.a.d(this, j8, i8);
            }
        };
    }

    public final Function0 getCanScroll() {
        return this.canScroll;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public DecayAnimationSpec<Float> getFlingAnimationSpec() {
        return this.flingAnimationSpec;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public AnimationSpec<Float> getSnapAnimationSpec() {
        return this.snapAnimationSpec;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public TopAppBarState getState() {
        return this.state;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public boolean isPinned() {
        return this.isPinned;
    }

    public void setNestedScrollConnection(NestedScrollConnection nestedScrollConnection) {
        AbstractC3292y.i(nestedScrollConnection, "<set-?>");
        this.nestedScrollConnection = nestedScrollConnection;
    }

    public /* synthetic */ PinnedScrollBehavior(TopAppBarState topAppBarState, Function0 function0, int i8, AbstractC3284p abstractC3284p) {
        this(topAppBarState, (i8 & 2) != 0 ? AnonymousClass1.INSTANCE : function0);
    }
}
