package androidx.compose.ui;

import R5.AbstractC1428l;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class Actual_jvmKt {
    public static final boolean areObjectsOfSameType(Object obj, Object obj2) {
        if (obj.getClass() == obj2.getClass()) {
            return true;
        }
        return false;
    }

    public static final void tryPopulateReflectively(InspectorInfo inspectorInfo, ModifierNodeElement<?> modifierNodeElement) {
        List Q02 = AbstractC1428l.Q0(modifierNodeElement.getClass().getDeclaredFields(), new Comparator() { // from class: androidx.compose.ui.Actual_jvmKt$tryPopulateReflectively$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t8, T t9) {
                return T5.a.a(((Field) t8).getName(), ((Field) t9).getName());
            }
        });
        int size = Q02.size();
        for (int i8 = 0; i8 < size; i8++) {
            Field field = (Field) Q02.get(i8);
            if (!field.getDeclaringClass().isAssignableFrom(ModifierNodeElement.class)) {
                try {
                    field.setAccessible(true);
                    inspectorInfo.getProperties().set(field.getName(), field.get(modifierNodeElement));
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }
}
