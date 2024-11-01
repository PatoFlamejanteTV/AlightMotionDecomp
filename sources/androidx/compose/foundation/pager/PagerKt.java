package androidx.compose.foundation.pager;

import U5.h;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import i6.m;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.M;

/* loaded from: classes.dex */
public final class PagerKt {
    private static final ConsumeAllFlingOnDirection ConsumeHorizontalFlingNestedScrollConnection = new ConsumeAllFlingOnDirection(Orientation.Horizontal);
    private static final ConsumeAllFlingOnDirection ConsumeVerticalFlingNestedScrollConnection = new ConsumeAllFlingOnDirection(Orientation.Vertical);
    private static final boolean DEBUG = false;
    private static final int LowVelocityAnimationDefaultDuration = 500;

    /* JADX WARN: Removed duplicated region for block: B:104:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0230  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: HorizontalPager-AlbwjTQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m785HorizontalPagerAlbwjTQ(int r35, androidx.compose.ui.Modifier r36, androidx.compose.foundation.pager.PagerState r37, androidx.compose.foundation.layout.PaddingValues r38, androidx.compose.foundation.pager.PageSize r39, int r40, float r41, androidx.compose.ui.Alignment.Vertical r42, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r43, boolean r44, boolean r45, kotlin.jvm.functions.Function1 r46, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r47, c6.InterfaceC2074p r48, androidx.compose.runtime.Composer r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m785HorizontalPagerAlbwjTQ(int, androidx.compose.ui.Modifier, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, c6.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0298  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: HorizontalPager-xYaah8o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m786HorizontalPagerxYaah8o(androidx.compose.foundation.pager.PagerState r37, androidx.compose.ui.Modifier r38, androidx.compose.foundation.layout.PaddingValues r39, androidx.compose.foundation.pager.PageSize r40, int r41, float r42, androidx.compose.ui.Alignment.Vertical r43, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r44, boolean r45, boolean r46, kotlin.jvm.functions.Function1 r47, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r48, c6.InterfaceC2074p r49, androidx.compose.runtime.Composer r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m786HorizontalPagerxYaah8o(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, c6.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final PagerState pagerState, final PagerSnapDistance pagerSnapDistance, final DecayAnimationSpec<Float> decayAnimationSpec, final float f8) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.pager.PagerKt$SnapLayoutInfoProvider$1
            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(Density density, float f9) {
                int firstVisiblePage$foundation_release;
                PageInfo pageInfo;
                int i8;
                double floor;
                AbstractC3292y.i(density, "<this>");
                int pageSize$foundation_release = PagerState.this.getPageSize$foundation_release() + PagerState.this.getPageSpacing$foundation_release();
                float calculateTargetValue = DecayAnimationSpecKt.calculateTargetValue(decayAnimationSpec, 0.0f, f9);
                if (f9 < 0.0f) {
                    firstVisiblePage$foundation_release = PagerState.this.getFirstVisiblePage$foundation_release() + 1;
                } else {
                    firstVisiblePage$foundation_release = PagerState.this.getFirstVisiblePage$foundation_release();
                }
                List<PageInfo> visiblePagesInfo = getLayoutInfo().getVisiblePagesInfo();
                int size = visiblePagesInfo.size();
                int i9 = 0;
                while (true) {
                    if (i9 < size) {
                        pageInfo = visiblePagesInfo.get(i9);
                        if (pageInfo.getIndex() == firstVisiblePage$foundation_release) {
                            break;
                        }
                        i9++;
                    } else {
                        pageInfo = null;
                        break;
                    }
                }
                PageInfo pageInfo2 = pageInfo;
                if (pageInfo2 != null) {
                    i8 = pageInfo2.getOffset();
                } else {
                    i8 = 0;
                }
                float f10 = ((firstVisiblePage$foundation_release * pageSize$foundation_release) + calculateTargetValue) / pageSize$foundation_release;
                if (f9 > 0.0f) {
                    floor = Math.ceil(f10);
                } else {
                    floor = Math.floor(f10);
                }
                int d8 = m.d(Math.abs((m.k(pagerSnapDistance.calculateTargetPage(firstVisiblePage$foundation_release, m.k((int) floor, 0, PagerState.this.getPageCount()), f9, PagerState.this.getPageSize$foundation_release(), PagerState.this.getPageSpacing$foundation_release()), 0, PagerState.this.getPageCount()) - firstVisiblePage$foundation_release) * pageSize$foundation_release) - Math.abs(i8), 0);
                if (d8 == 0) {
                    return d8;
                }
                return d8 * Math.signum(f9);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapStepSize(Density density) {
                AbstractC3292y.i(density, "<this>");
                return getLayoutInfo().getPageSize();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnappingOffset(Density density, float f9) {
                boolean isScrollingForward;
                float dragGestureDelta;
                AbstractC3292y.i(density, "<this>");
                List<PageInfo> visiblePagesInfo = getLayoutInfo().getVisiblePagesInfo();
                int size = visiblePagesInfo.size();
                float f10 = Float.NEGATIVE_INFINITY;
                float f11 = Float.POSITIVE_INFINITY;
                for (int i8 = 0; i8 < size; i8++) {
                    PageInfo pageInfo = visiblePagesInfo.get(i8);
                    float calculateDistanceToDesiredSnapPosition = SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(density, PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), getLayoutInfo().getPageSize(), pageInfo.getOffset(), pageInfo.getIndex(), PagerStateKt.getSnapAlignmentStartToStart());
                    if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f10) {
                        f10 = calculateDistanceToDesiredSnapPosition;
                    }
                    if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f11) {
                        f11 = calculateDistanceToDesiredSnapPosition;
                    }
                }
                isScrollingForward = PagerKt.isScrollingForward(PagerState.this);
                dragGestureDelta = PagerKt.dragGestureDelta(PagerState.this);
                float pageSize = (dragGestureDelta / getLayoutInfo().getPageSize()) - ((int) r2);
                float signum = Math.signum(f9);
                if (signum != 0.0f) {
                    if (signum != 1.0f) {
                        if (signum != -1.0f) {
                            f10 = 0.0f;
                        }
                    }
                } else {
                    f10 = Math.abs(pageSize) > f8 ? f11 : f11;
                }
                if (!isValidDistance(f10)) {
                    return 0.0f;
                }
                return f10;
            }

            public final PagerLayoutInfo getLayoutInfo() {
                return PagerState.this.getLayoutInfo$foundation_release();
            }

            public final boolean isValidDistance(float f9) {
                return (f9 == Float.POSITIVE_INFINITY || f9 == Float.NEGATIVE_INFINITY) ? false : true;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0230  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: VerticalPager-AlbwjTQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m787VerticalPagerAlbwjTQ(int r34, androidx.compose.ui.Modifier r35, androidx.compose.foundation.pager.PagerState r36, androidx.compose.foundation.layout.PaddingValues r37, androidx.compose.foundation.pager.PageSize r38, int r39, float r40, androidx.compose.ui.Alignment.Horizontal r41, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r42, boolean r43, boolean r44, kotlin.jvm.functions.Function1 r45, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r46, c6.InterfaceC2074p r47, androidx.compose.runtime.Composer r48, int r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m787VerticalPagerAlbwjTQ(int, androidx.compose.ui.Modifier, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, c6.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0298  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: VerticalPager-xYaah8o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m788VerticalPagerxYaah8o(androidx.compose.foundation.pager.PagerState r37, androidx.compose.ui.Modifier r38, androidx.compose.foundation.layout.PaddingValues r39, androidx.compose.foundation.pager.PageSize r40, int r41, float r42, androidx.compose.ui.Alignment.Horizontal r43, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r44, boolean r45, boolean r46, kotlin.jvm.functions.Function1 r47, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r48, c6.InterfaceC2074p r49, androidx.compose.runtime.Composer r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m788VerticalPagerxYaah8o(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, c6.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final void debugLog(Function0 function0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float dragGestureDelta(PagerState pagerState) {
        if (pagerState.getLayoutInfo$foundation_release().getOrientation() == Orientation.Horizontal) {
            return Offset.m2712getXimpl(pagerState.m796getUpDownDifferenceF1C5BW0$foundation_release());
        }
        return Offset.m2713getYimpl(pagerState.m796getUpDownDifferenceF1C5BW0$foundation_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScrollingForward(PagerState pagerState) {
        if (dragGestureDelta(pagerState) < 0.0f) {
            return true;
        }
        return false;
    }

    @Composable
    public static final Modifier pagerSemantics(Modifier modifier, PagerState state, boolean z8, Composer composer, int i8) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(state, "state");
        composer.startReplaceableGroup(1509835088);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1509835088, i8, -1, "androidx.compose.foundation.pager.pagerSemantics (Pager.kt:842)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(h.f10149a, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        Modifier then = modifier.then(SemanticsModifierKt.semantics$default(Modifier.Companion, false, new PagerKt$pagerSemantics$1(z8, state, coroutineScope), 1, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performBackwardPaging(PagerState pagerState, M m8) {
        if (pagerState.getCanScrollBackward()) {
            AbstractC3462k.d(m8, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3, null);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performForwardPaging(PagerState pagerState, M m8) {
        if (pagerState.getCanScrollForward()) {
            AbstractC3462k.d(m8, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3, null);
            return true;
        }
        return false;
    }
}
