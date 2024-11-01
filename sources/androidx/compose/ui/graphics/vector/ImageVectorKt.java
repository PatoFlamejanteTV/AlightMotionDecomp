package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.vector.ImageVector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ImageVectorKt {
    public static final ImageVector.Builder group(ImageVector.Builder builder, String str, float f8, float f9, float f10, float f11, float f12, float f13, float f14, List<? extends PathNode> list, Function1 function1) {
        builder.addGroup(str, f8, f9, f10, f11, f12, f13, f14, list);
        function1.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    public static /* synthetic */ ImageVector.Builder group$default(ImageVector.Builder builder, String str, float f8, float f9, float f10, float f11, float f12, float f13, float f14, List list, Function1 function1, int i8, Object obj) {
        String str2;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        List list2;
        if ((i8 & 1) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
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
        if ((i8 & 128) != 0) {
            f20 = 0.0f;
        } else {
            f20 = f14;
        }
        if ((i8 & 256) != 0) {
            list2 = VectorKt.getEmptyPath();
        } else {
            list2 = list;
        }
        builder.addGroup(str2, f15, f16, f17, f18, f21, f19, f20, list2);
        function1.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    /* renamed from: path-R_LF-3I */
    public static final ImageVector.Builder m3501pathR_LF3I(ImageVector.Builder builder, String str, Brush brush, float f8, Brush brush2, float f9, float f10, int i8, int i9, float f11, int i10, Function1 function1) {
        PathBuilder pathBuilder = new PathBuilder();
        function1.invoke(pathBuilder);
        return ImageVector.Builder.m3499addPathoIyEayM$default(builder, pathBuilder.getNodes(), i10, str, brush, f8, brush2, f9, f10, i8, i9, f11, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* renamed from: path-R_LF-3I$default */
    public static /* synthetic */ ImageVector.Builder m3502pathR_LF3I$default(ImageVector.Builder builder, String str, Brush brush, float f8, Brush brush2, float f9, float f10, int i8, int i9, float f11, int i10, Function1 function1, int i11, Object obj) {
        String str2;
        Brush brush3;
        float f12;
        Brush brush4;
        float f13;
        float f14;
        int i12;
        int i13;
        float f15;
        int i14;
        if ((i11 & 1) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        if ((i11 & 2) != 0) {
            brush3 = null;
        } else {
            brush3 = brush;
        }
        if ((i11 & 4) != 0) {
            f12 = 1.0f;
        } else {
            f12 = f8;
        }
        if ((i11 & 8) != 0) {
            brush4 = null;
        } else {
            brush4 = brush2;
        }
        if ((i11 & 16) != 0) {
            f13 = 1.0f;
        } else {
            f13 = f9;
        }
        if ((i11 & 32) != 0) {
            f14 = 0.0f;
        } else {
            f14 = f10;
        }
        if ((i11 & 64) != 0) {
            i12 = VectorKt.getDefaultStrokeLineCap();
        } else {
            i12 = i8;
        }
        if ((i11 & 128) != 0) {
            i13 = VectorKt.getDefaultStrokeLineJoin();
        } else {
            i13 = i9;
        }
        if ((i11 & 256) != 0) {
            f15 = 4.0f;
        } else {
            f15 = f11;
        }
        if ((i11 & 512) != 0) {
            i14 = VectorKt.getDefaultFillType();
        } else {
            i14 = i10;
        }
        PathBuilder pathBuilder = new PathBuilder();
        function1.invoke(pathBuilder);
        return ImageVector.Builder.m3499addPathoIyEayM$default(builder, pathBuilder.getNodes(), i14, str2, brush3, f12, brush4, f13, f14, i12, i13, f15, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    public static final <T> T peek(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    public static final <T> T pop(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    public static final <T> boolean push(ArrayList<T> arrayList, T t8) {
        return arrayList.add(t8);
    }
}
