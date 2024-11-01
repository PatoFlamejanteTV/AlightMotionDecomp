package androidx.compose.ui.graphics.vector;

import Q5.I;
import R5.Q;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableOpenTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.vector.VectorProperty;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import c6.InterfaceC2074p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class VectorPainterKt {
    public static final String RootGroupName = "VectorRootGroup";

    @ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    @Composable
    public static final void RenderVectorGroup(VectorGroup vectorGroup, Map<String, ? extends VectorConfig> map, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        Map<String, ? extends VectorConfig> map2;
        Map<String, ? extends VectorConfig> map3;
        Composer composer2;
        Map<String, ? extends VectorConfig> map4;
        Composer startRestartGroup = composer.startRestartGroup(-446179233);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(vectorGroup)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        int i12 = i9 & 2;
        if (i12 != 0) {
            i10 |= 16;
        }
        if (i12 == 2 && (i10 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            map3 = map;
            composer2 = startRestartGroup;
        } else {
            if (i12 != 0) {
                map2 = Q.h();
            } else {
                map2 = map;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-446179233, i10, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:426)");
            }
            Iterator<VectorNode> it = vectorGroup.iterator();
            while (it.hasNext()) {
                VectorNode next = it.next();
                if (next instanceof VectorPath) {
                    startRestartGroup.startReplaceableGroup(-326282007);
                    VectorPath vectorPath = (VectorPath) next;
                    VectorConfig vectorConfig = map2.get(vectorPath.getName());
                    if (vectorConfig == null) {
                        vectorConfig = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$1
                            @Override // androidx.compose.ui.graphics.vector.VectorConfig
                            public /* synthetic */ Object getOrDefault(VectorProperty vectorProperty, Object obj) {
                                return a.a(this, vectorProperty, obj);
                            }
                        };
                    }
                    VectorConfig vectorConfig2 = vectorConfig;
                    Composer composer3 = startRestartGroup;
                    VectorComposeKt.m3513Path9cdaXJ4((List) vectorConfig2.getOrDefault(VectorProperty.PathData.INSTANCE, vectorPath.getPathData()), vectorPath.m3532getPathFillTypeRgk1Os(), vectorPath.getName(), (Brush) vectorConfig2.getOrDefault(VectorProperty.Fill.INSTANCE, vectorPath.getFill()), ((Number) vectorConfig2.getOrDefault(VectorProperty.FillAlpha.INSTANCE, Float.valueOf(vectorPath.getFillAlpha()))).floatValue(), (Brush) vectorConfig2.getOrDefault(VectorProperty.Stroke.INSTANCE, vectorPath.getStroke()), ((Number) vectorConfig2.getOrDefault(VectorProperty.StrokeAlpha.INSTANCE, Float.valueOf(vectorPath.getStrokeAlpha()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.StrokeLineWidth.INSTANCE, Float.valueOf(vectorPath.getStrokeLineWidth()))).floatValue(), vectorPath.m3533getStrokeLineCapKaPHkGw(), vectorPath.m3534getStrokeLineJoinLxFBmk8(), vectorPath.getStrokeLineMiter(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TrimPathStart.INSTANCE, Float.valueOf(vectorPath.getTrimPathStart()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TrimPathEnd.INSTANCE, Float.valueOf(vectorPath.getTrimPathEnd()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TrimPathOffset.INSTANCE, Float.valueOf(vectorPath.getTrimPathOffset()))).floatValue(), composer3, 8, 0, 0);
                    composer3.endReplaceableGroup();
                    it = it;
                    map2 = map2;
                    startRestartGroup = composer3;
                } else {
                    Iterator<VectorNode> it2 = it;
                    Map<String, ? extends VectorConfig> map5 = map2;
                    Composer composer4 = startRestartGroup;
                    if (next instanceof VectorGroup) {
                        composer4.startReplaceableGroup(-326280149);
                        VectorGroup vectorGroup2 = (VectorGroup) next;
                        map4 = map5;
                        VectorConfig vectorConfig3 = map4.get(vectorGroup2.getName());
                        if (vectorConfig3 == null) {
                            vectorConfig3 = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$2
                                @Override // androidx.compose.ui.graphics.vector.VectorConfig
                                public /* synthetic */ Object getOrDefault(VectorProperty vectorProperty, Object obj) {
                                    return a.a(this, vectorProperty, obj);
                                }
                            };
                        }
                        VectorComposeKt.Group(vectorGroup2.getName(), ((Number) vectorConfig3.getOrDefault(VectorProperty.Rotation.INSTANCE, Float.valueOf(vectorGroup2.getRotation()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.PivotX.INSTANCE, Float.valueOf(vectorGroup2.getPivotX()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.PivotY.INSTANCE, Float.valueOf(vectorGroup2.getPivotY()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.ScaleX.INSTANCE, Float.valueOf(vectorGroup2.getScaleX()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.ScaleY.INSTANCE, Float.valueOf(vectorGroup2.getScaleY()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.TranslateX.INSTANCE, Float.valueOf(vectorGroup2.getTranslationX()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.TranslateY.INSTANCE, Float.valueOf(vectorGroup2.getTranslationY()))).floatValue(), (List) vectorConfig3.getOrDefault(VectorProperty.PathData.INSTANCE, vectorGroup2.getClipPathData()), ComposableLambdaKt.composableLambda(composer4, 1450046638, true, new VectorPainterKt$RenderVectorGroup$1(next, map4)), composer4, 939524096, 0);
                        composer4.endReplaceableGroup();
                    } else {
                        map4 = map5;
                        composer4.startReplaceableGroup(-326278679);
                        composer4.endReplaceableGroup();
                    }
                    startRestartGroup = composer4;
                    map2 = map4;
                    it = it2;
                }
            }
            map3 = map2;
            composer2 = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new VectorPainterKt$RenderVectorGroup$2(vectorGroup, map3, i8, i9));
        }
    }

    /* renamed from: configureVectorPainter-T4PVSW8, reason: not valid java name */
    public static final VectorPainter m3525configureVectorPainterT4PVSW8(VectorPainter vectorPainter, long j8, long j9, String str, ColorFilter colorFilter, boolean z8) {
        vectorPainter.m3521setSizeuvyYCjk$ui_release(j8);
        vectorPainter.setAutoMirror$ui_release(z8);
        vectorPainter.setIntrinsicColorFilter$ui_release(colorFilter);
        vectorPainter.m3522setViewportSizeuvyYCjk$ui_release(j9);
        vectorPainter.setName$ui_release(str);
        return vectorPainter;
    }

    /* renamed from: configureVectorPainter-T4PVSW8$default, reason: not valid java name */
    public static /* synthetic */ VectorPainter m3526configureVectorPainterT4PVSW8$default(VectorPainter vectorPainter, long j8, long j9, String str, ColorFilter colorFilter, boolean z8, int i8, Object obj) {
        String str2;
        boolean z9;
        if ((i8 & 4) != 0) {
            str2 = RootGroupName;
        } else {
            str2 = str;
        }
        if ((i8 & 16) != 0) {
            z9 = false;
        } else {
            z9 = z8;
        }
        return m3525configureVectorPainterT4PVSW8(vectorPainter, j8, j9, str2, colorFilter, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createColorFilter-xETnrds, reason: not valid java name */
    public static final ColorFilter m3527createColorFilterxETnrds(long j8, int i8) {
        if (j8 != Color.Companion.m2984getUnspecified0d7_KjU()) {
            return ColorFilter.Companion.m2992tintxETnrds(j8, i8);
        }
        return null;
    }

    public static final GroupComponent createGroupComponent(GroupComponent groupComponent, VectorGroup vectorGroup) {
        int size = vectorGroup.getSize();
        for (int i8 = 0; i8 < size; i8++) {
            VectorNode vectorNode = vectorGroup.get(i8);
            if (vectorNode instanceof VectorPath) {
                PathComponent pathComponent = new PathComponent();
                VectorPath vectorPath = (VectorPath) vectorNode;
                pathComponent.setPathData(vectorPath.getPathData());
                pathComponent.m3506setPathFillTypeoQ8Xj4U(vectorPath.m3532getPathFillTypeRgk1Os());
                pathComponent.setName(vectorPath.getName());
                pathComponent.setFill(vectorPath.getFill());
                pathComponent.setFillAlpha(vectorPath.getFillAlpha());
                pathComponent.setStroke(vectorPath.getStroke());
                pathComponent.setStrokeAlpha(vectorPath.getStrokeAlpha());
                pathComponent.setStrokeLineWidth(vectorPath.getStrokeLineWidth());
                pathComponent.m3507setStrokeLineCapBeK7IIE(vectorPath.m3533getStrokeLineCapKaPHkGw());
                pathComponent.m3508setStrokeLineJoinWw9F2mQ(vectorPath.m3534getStrokeLineJoinLxFBmk8());
                pathComponent.setStrokeLineMiter(vectorPath.getStrokeLineMiter());
                pathComponent.setTrimPathStart(vectorPath.getTrimPathStart());
                pathComponent.setTrimPathEnd(vectorPath.getTrimPathEnd());
                pathComponent.setTrimPathOffset(vectorPath.getTrimPathOffset());
                groupComponent.insertAt(i8, pathComponent);
            } else if (vectorNode instanceof VectorGroup) {
                GroupComponent groupComponent2 = new GroupComponent();
                VectorGroup vectorGroup2 = (VectorGroup) vectorNode;
                groupComponent2.setName(vectorGroup2.getName());
                groupComponent2.setRotation(vectorGroup2.getRotation());
                groupComponent2.setScaleX(vectorGroup2.getScaleX());
                groupComponent2.setScaleY(vectorGroup2.getScaleY());
                groupComponent2.setTranslationX(vectorGroup2.getTranslationX());
                groupComponent2.setTranslationY(vectorGroup2.getTranslationY());
                groupComponent2.setPivotX(vectorGroup2.getPivotX());
                groupComponent2.setPivotY(vectorGroup2.getPivotY());
                groupComponent2.setClipPathData(vectorGroup2.getClipPathData());
                createGroupComponent(groupComponent2, vectorGroup2);
                groupComponent.insertAt(i8, groupComponent2);
            }
        }
        return groupComponent;
    }

    public static final VectorPainter createVectorPainterFromImageVector(Density density, ImageVector imageVector, GroupComponent groupComponent) {
        long m3528obtainSizePxVpY3zN4 = m3528obtainSizePxVpY3zN4(density, imageVector.m3496getDefaultWidthD9Ej5fM(), imageVector.m3495getDefaultHeightD9Ej5fM());
        return m3525configureVectorPainterT4PVSW8(new VectorPainter(groupComponent), m3528obtainSizePxVpY3zN4, m3529obtainViewportSizePq9zytI(m3528obtainSizePxVpY3zN4, imageVector.getViewportWidth(), imageVector.getViewportHeight()), imageVector.getName(), m3527createColorFilterxETnrds(imageVector.m3498getTintColor0d7_KjU(), imageVector.m3497getTintBlendMode0nO6VwU()), imageVector.getAutoMirror());
    }

    private static final void mirror(DrawScope drawScope, Function1 function1) {
        long mo3390getCenterF1C5BW0 = drawScope.mo3390getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo3397getSizeNHjbRc = drawContext.mo3397getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3404scale0AR0LA0(-1.0f, 1.0f, mo3390getCenterF1C5BW0);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo3398setSizeuvyYCjk(mo3397getSizeNHjbRc);
    }

    /* renamed from: obtainSizePx-VpY3zN4, reason: not valid java name */
    private static final long m3528obtainSizePxVpY3zN4(Density density, float f8, float f9) {
        return SizeKt.Size(density.mo425toPx0680j_4(f8), density.mo425toPx0680j_4(f9));
    }

    /* renamed from: obtainViewportSize-Pq9zytI, reason: not valid java name */
    private static final long m3529obtainViewportSizePq9zytI(long j8, float f8, float f9) {
        if (Float.isNaN(f8)) {
            f8 = Size.m2781getWidthimpl(j8);
        }
        if (Float.isNaN(f9)) {
            f9 = Size.m2778getHeightimpl(j8);
        }
        return SizeKt.Size(f8, f9);
    }

    @Composable
    public static final VectorPainter rememberVectorPainter(ImageVector imageVector, Composer composer, int i8) {
        composer.startReplaceableGroup(1413834416);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1413834416, i8, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:168)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object valueOf = Integer.valueOf(imageVector.getGenId$ui_release());
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(valueOf) | composer.changed(density);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            GroupComponent groupComponent = new GroupComponent();
            createGroupComponent(groupComponent, imageVector.getRoot());
            I i9 = I.f8786a;
            rememberedValue = createVectorPainterFromImageVector(density, imageVector, groupComponent);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        VectorPainter vectorPainter = (VectorPainter) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return vectorPainter;
    }

    @Composable
    @ComposableOpenTarget(index = -1)
    /* renamed from: rememberVectorPainter-mlNsNFs, reason: not valid java name */
    public static final VectorPainter m3530rememberVectorPaintermlNsNFs(float f8, float f9, float f10, float f11, String str, long j8, int i8, InterfaceC2074p interfaceC2074p, Composer composer, int i9, int i10) {
        float f12;
        float f13;
        String str2;
        long j9;
        int i11;
        composer.startReplaceableGroup(-964365210);
        if ((i10 & 4) != 0) {
            f12 = Float.NaN;
        } else {
            f12 = f10;
        }
        if ((i10 & 8) != 0) {
            f13 = Float.NaN;
        } else {
            f13 = f11;
        }
        if ((i10 & 16) != 0) {
            str2 = RootGroupName;
        } else {
            str2 = str;
        }
        if ((i10 & 32) != 0) {
            j9 = Color.Companion.m2984getUnspecified0d7_KjU();
        } else {
            j9 = j8;
        }
        if ((i10 & 64) != 0) {
            i11 = BlendMode.Companion.m2894getSrcIn0nO6VwU();
        } else {
            i11 = i8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-964365210, i9, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:85)");
        }
        VectorPainter m3531rememberVectorPaintervIP8VLU = m3531rememberVectorPaintervIP8VLU(f8, f9, f12, f13, str2, j9, i11, false, interfaceC2074p, composer, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m3531rememberVectorPaintervIP8VLU;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fa, code lost:            if (r4 == r8.getEmpty()) goto L41;     */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableOpenTarget(index = -1)
    /* renamed from: rememberVectorPainter-vIP8VLU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.graphics.vector.VectorPainter m3531rememberVectorPaintervIP8VLU(float r16, float r17, float r18, float r19, java.lang.String r20, long r21, int r23, boolean r24, c6.InterfaceC2074p r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorPainterKt.m3531rememberVectorPaintervIP8VLU(float, float, float, float, java.lang.String, long, int, boolean, c6.p, androidx.compose.runtime.Composer, int, int):androidx.compose.ui.graphics.vector.VectorPainter");
    }
}
