package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class ImageVector {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int imageVectorCount;
    private final boolean autoMirror;
    private final float defaultHeight;
    private final float defaultWidth;
    private final int genId;
    private final String name;
    private final VectorGroup root;
    private final int tintBlendMode;
    private final long tintColor;
    private final float viewportHeight;
    private final float viewportWidth;

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Builder {
        public static final int $stable = 8;
        private final boolean autoMirror;
        private final float defaultHeight;
        private final float defaultWidth;
        private boolean isConsumed;
        private final String name;
        private final ArrayList<GroupParams> nodes;
        private GroupParams root;
        private final int tintBlendMode;
        private final long tintColor;
        private final float viewportHeight;
        private final float viewportWidth;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class GroupParams {
            private List<VectorNode> children;
            private List<? extends PathNode> clipPathData;
            private String name;
            private float pivotX;
            private float pivotY;
            private float rotate;
            private float scaleX;
            private float scaleY;
            private float translationX;
            private float translationY;

            public GroupParams() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            }

            public final List<VectorNode> getChildren() {
                return this.children;
            }

            public final List<PathNode> getClipPathData() {
                return this.clipPathData;
            }

            public final String getName() {
                return this.name;
            }

            public final float getPivotX() {
                return this.pivotX;
            }

            public final float getPivotY() {
                return this.pivotY;
            }

            public final float getRotate() {
                return this.rotate;
            }

            public final float getScaleX() {
                return this.scaleX;
            }

            public final float getScaleY() {
                return this.scaleY;
            }

            public final float getTranslationX() {
                return this.translationX;
            }

            public final float getTranslationY() {
                return this.translationY;
            }

            public final void setChildren(List<VectorNode> list) {
                this.children = list;
            }

            public final void setClipPathData(List<? extends PathNode> list) {
                this.clipPathData = list;
            }

            public final void setName(String str) {
                this.name = str;
            }

            public final void setPivotX(float f8) {
                this.pivotX = f8;
            }

            public final void setPivotY(float f8) {
                this.pivotY = f8;
            }

            public final void setRotate(float f8) {
                this.rotate = f8;
            }

            public final void setScaleX(float f8) {
                this.scaleX = f8;
            }

            public final void setScaleY(float f8) {
                this.scaleY = f8;
            }

            public final void setTranslationX(float f8) {
                this.translationX = f8;
            }

            public final void setTranslationY(float f8) {
                this.translationY = f8;
            }

            public GroupParams(String str, float f8, float f9, float f10, float f11, float f12, float f13, float f14, List<? extends PathNode> list, List<VectorNode> list2) {
                this.name = str;
                this.rotate = f8;
                this.pivotX = f9;
                this.pivotY = f10;
                this.scaleX = f11;
                this.scaleY = f12;
                this.translationX = f13;
                this.translationY = f14;
                this.clipPathData = list;
                this.children = list2;
            }

            public /* synthetic */ GroupParams(String str, float f8, float f9, float f10, float f11, float f12, float f13, float f14, List list, List list2, int i8, AbstractC3284p abstractC3284p) {
                this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? 0.0f : f8, (i8 & 4) != 0 ? 0.0f : f9, (i8 & 8) != 0 ? 0.0f : f10, (i8 & 16) != 0 ? 1.0f : f11, (i8 & 32) == 0 ? f12 : 1.0f, (i8 & 64) != 0 ? 0.0f : f13, (i8 & 128) == 0 ? f14 : 0.0f, (i8 & 256) != 0 ? VectorKt.getEmptyPath() : list, (i8 & 512) != 0 ? new ArrayList() : list2);
            }
        }

        public /* synthetic */ Builder(String str, float f8, float f9, float f10, float f11, long j8, int i8, AbstractC3284p abstractC3284p) {
            this(str, f8, f9, f10, f11, j8, i8);
        }

        public static /* synthetic */ Builder addGroup$default(Builder builder, String str, float f8, float f9, float f10, float f11, float f12, float f13, float f14, List list, int i8, Object obj) {
            String str2;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            List list2;
            if ((i8 & 1) != 0) {
                str2 = "";
            } else {
                str2 = str;
            }
            float f20 = 0.0f;
            if ((i8 & 2) != 0) {
                f15 = 0.0f;
            } else {
                f15 = f8;
            }
            if ((i8 & 4) != 0) {
                f16 = 0.0f;
            } else {
                f16 = f9;
            }
            if ((i8 & 8) != 0) {
                f17 = 0.0f;
            } else {
                f17 = f10;
            }
            float f21 = 1.0f;
            if ((i8 & 16) != 0) {
                f18 = 1.0f;
            } else {
                f18 = f11;
            }
            if ((i8 & 32) == 0) {
                f21 = f12;
            }
            if ((i8 & 64) != 0) {
                f19 = 0.0f;
            } else {
                f19 = f13;
            }
            if ((i8 & 128) == 0) {
                f20 = f14;
            }
            if ((i8 & 256) != 0) {
                list2 = VectorKt.getEmptyPath();
            } else {
                list2 = list;
            }
            return builder.addGroup(str2, f15, f16, f17, f18, f21, f19, f20, list2);
        }

        /* renamed from: addPath-oIyEayM$default, reason: not valid java name */
        public static /* synthetic */ Builder m3499addPathoIyEayM$default(Builder builder, List list, int i8, String str, Brush brush, float f8, Brush brush2, float f9, float f10, int i9, int i10, float f11, float f12, float f13, float f14, int i11, Object obj) {
            int i12;
            String str2;
            Brush brush3;
            float f15;
            float f16;
            float f17;
            int i13;
            int i14;
            float f18;
            float f19;
            if ((i11 & 2) != 0) {
                i12 = VectorKt.getDefaultFillType();
            } else {
                i12 = i8;
            }
            if ((i11 & 4) != 0) {
                str2 = "";
            } else {
                str2 = str;
            }
            Brush brush4 = null;
            if ((i11 & 8) != 0) {
                brush3 = null;
            } else {
                brush3 = brush;
            }
            float f20 = 1.0f;
            if ((i11 & 16) != 0) {
                f15 = 1.0f;
            } else {
                f15 = f8;
            }
            if ((i11 & 32) == 0) {
                brush4 = brush2;
            }
            if ((i11 & 64) != 0) {
                f16 = 1.0f;
            } else {
                f16 = f9;
            }
            float f21 = 0.0f;
            if ((i11 & 128) != 0) {
                f17 = 0.0f;
            } else {
                f17 = f10;
            }
            if ((i11 & 256) != 0) {
                i13 = VectorKt.getDefaultStrokeLineCap();
            } else {
                i13 = i9;
            }
            if ((i11 & 512) != 0) {
                i14 = VectorKt.getDefaultStrokeLineJoin();
            } else {
                i14 = i10;
            }
            if ((i11 & 1024) != 0) {
                f18 = 4.0f;
            } else {
                f18 = f11;
            }
            if ((i11 & 2048) != 0) {
                f19 = 0.0f;
            } else {
                f19 = f12;
            }
            if ((i11 & 4096) == 0) {
                f20 = f13;
            }
            if ((i11 & 8192) == 0) {
                f21 = f14;
            }
            return builder.m3500addPathoIyEayM(list, i12, str2, brush3, f15, brush4, f16, f17, i13, i14, f18, f19, f20, f21);
        }

        private final VectorGroup asVectorGroup(GroupParams groupParams) {
            return new VectorGroup(groupParams.getName(), groupParams.getRotate(), groupParams.getPivotX(), groupParams.getPivotY(), groupParams.getScaleX(), groupParams.getScaleY(), groupParams.getTranslationX(), groupParams.getTranslationY(), groupParams.getClipPathData(), groupParams.getChildren());
        }

        private final void ensureNotConsumed() {
            if (!this.isConsumed) {
            } else {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
            }
        }

        private final GroupParams getCurrentGroup() {
            return (GroupParams) ImageVectorKt.access$peek(this.nodes);
        }

        public final Builder addGroup(String str, float f8, float f9, float f10, float f11, float f12, float f13, float f14, List<? extends PathNode> list) {
            ensureNotConsumed();
            ImageVectorKt.access$push(this.nodes, new GroupParams(str, f8, f9, f10, f11, f12, f13, f14, list, null, 512, null));
            return this;
        }

        /* renamed from: addPath-oIyEayM, reason: not valid java name */
        public final Builder m3500addPathoIyEayM(List<? extends PathNode> list, int i8, String str, Brush brush, float f8, Brush brush2, float f9, float f10, int i9, int i10, float f11, float f12, float f13, float f14) {
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(new VectorPath(str, list, i8, brush, f8, brush2, f9, f10, i9, i10, f11, f12, f13, f14, null));
            return this;
        }

        public final ImageVector build() {
            ensureNotConsumed();
            while (this.nodes.size() > 1) {
                clearGroup();
            }
            ImageVector imageVector = new ImageVector(this.name, this.defaultWidth, this.defaultHeight, this.viewportWidth, this.viewportHeight, asVectorGroup(this.root), this.tintColor, this.tintBlendMode, this.autoMirror, 0, 512, null);
            this.isConsumed = true;
            return imageVector;
        }

        public final Builder clearGroup() {
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(asVectorGroup((GroupParams) ImageVectorKt.access$pop(this.nodes)));
            return this;
        }

        public /* synthetic */ Builder(String str, float f8, float f9, float f10, float f11, long j8, int i8, boolean z8, AbstractC3284p abstractC3284p) {
            this(str, f8, f9, f10, f11, j8, i8, z8);
        }

        private Builder(String str, float f8, float f9, float f10, float f11, long j8, int i8, boolean z8) {
            this.name = str;
            this.defaultWidth = f8;
            this.defaultHeight = f9;
            this.viewportWidth = f10;
            this.viewportHeight = f11;
            this.tintColor = j8;
            this.tintBlendMode = i8;
            this.autoMirror = z8;
            ArrayList<GroupParams> arrayList = new ArrayList<>();
            this.nodes = arrayList;
            GroupParams groupParams = new GroupParams(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.root = groupParams;
            ImageVectorKt.access$push(arrayList, groupParams);
        }

        public /* synthetic */ Builder(String str, float f8, float f9, float f10, float f11, long j8, int i8, boolean z8, int i9, AbstractC3284p abstractC3284p) {
            this((i9 & 1) != 0 ? "" : str, f8, f9, f10, f11, (i9 & 32) != 0 ? Color.Companion.m2984getUnspecified0d7_KjU() : j8, (i9 & 64) != 0 ? BlendMode.Companion.m2894getSrcIn0nO6VwU() : i8, (i9 & 128) != 0 ? false : z8, (AbstractC3284p) null);
        }

        public /* synthetic */ Builder(String str, float f8, float f9, float f10, float f11, long j8, int i8, int i9, AbstractC3284p abstractC3284p) {
            this((i9 & 1) != 0 ? "" : str, f8, f9, f10, f11, (i9 & 32) != 0 ? Color.Companion.m2984getUnspecified0d7_KjU() : j8, (i9 & 64) != 0 ? BlendMode.Companion.m2894getSrcIn0nO6VwU() : i8, (AbstractC3284p) null);
        }

        private Builder(String str, float f8, float f9, float f10, float f11, long j8, int i8) {
            this(str, f8, f9, f10, f11, j8, i8, false, (AbstractC3284p) null);
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final int generateImageVectorId$ui_release() {
            int i8;
            synchronized (this) {
                i8 = ImageVector.imageVectorCount;
                ImageVector.imageVectorCount = i8 + 1;
            }
            return i8;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ ImageVector(String str, float f8, float f9, float f10, float f11, VectorGroup vectorGroup, long j8, int i8, boolean z8, int i9, AbstractC3284p abstractC3284p) {
        this(str, f8, f9, f10, f11, vectorGroup, j8, i8, z8, i9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageVector)) {
            return false;
        }
        ImageVector imageVector = (ImageVector) obj;
        if (AbstractC3292y.d(this.name, imageVector.name) && Dp.m5160equalsimpl0(this.defaultWidth, imageVector.defaultWidth) && Dp.m5160equalsimpl0(this.defaultHeight, imageVector.defaultHeight) && this.viewportWidth == imageVector.viewportWidth && this.viewportHeight == imageVector.viewportHeight && AbstractC3292y.d(this.root, imageVector.root) && Color.m2949equalsimpl0(this.tintColor, imageVector.tintColor) && BlendMode.m2865equalsimpl0(this.tintBlendMode, imageVector.tintBlendMode) && this.autoMirror == imageVector.autoMirror) {
            return true;
        }
        return false;
    }

    public final boolean getAutoMirror() {
        return this.autoMirror;
    }

    /* renamed from: getDefaultHeight-D9Ej5fM, reason: not valid java name */
    public final float m3495getDefaultHeightD9Ej5fM() {
        return this.defaultHeight;
    }

    /* renamed from: getDefaultWidth-D9Ej5fM, reason: not valid java name */
    public final float m3496getDefaultWidthD9Ej5fM() {
        return this.defaultWidth;
    }

    public final int getGenId$ui_release() {
        return this.genId;
    }

    public final String getName() {
        return this.name;
    }

    public final VectorGroup getRoot() {
        return this.root;
    }

    /* renamed from: getTintBlendMode-0nO6VwU, reason: not valid java name */
    public final int m3497getTintBlendMode0nO6VwU() {
        return this.tintBlendMode;
    }

    /* renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    public final long m3498getTintColor0d7_KjU() {
        return this.tintColor;
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    public int hashCode() {
        return (((((((((((((((this.name.hashCode() * 31) + Dp.m5161hashCodeimpl(this.defaultWidth)) * 31) + Dp.m5161hashCodeimpl(this.defaultHeight)) * 31) + Float.floatToIntBits(this.viewportWidth)) * 31) + Float.floatToIntBits(this.viewportHeight)) * 31) + this.root.hashCode()) * 31) + Color.m2955hashCodeimpl(this.tintColor)) * 31) + BlendMode.m2866hashCodeimpl(this.tintBlendMode)) * 31) + androidx.compose.foundation.a.a(this.autoMirror);
    }

    private ImageVector(String str, float f8, float f9, float f10, float f11, VectorGroup vectorGroup, long j8, int i8, boolean z8, int i9) {
        this.name = str;
        this.defaultWidth = f8;
        this.defaultHeight = f9;
        this.viewportWidth = f10;
        this.viewportHeight = f11;
        this.root = vectorGroup;
        this.tintColor = j8;
        this.tintBlendMode = i8;
        this.autoMirror = z8;
        this.genId = i9;
    }

    public /* synthetic */ ImageVector(String str, float f8, float f9, float f10, float f11, VectorGroup vectorGroup, long j8, int i8, boolean z8, int i9, int i10, AbstractC3284p abstractC3284p) {
        this(str, f8, f9, f10, f11, vectorGroup, j8, i8, z8, (i10 & 512) != 0 ? Companion.generateImageVectorId$ui_release() : i9, null);
    }
}
