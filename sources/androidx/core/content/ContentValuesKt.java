package androidx.core.content;

import android.content.ContentValues;

/* loaded from: classes.dex */
public final class ContentValuesKt {
    public static final ContentValues contentValuesOf(Q5.r... rVarArr) {
        ContentValues contentValues = new ContentValues(rVarArr.length);
        for (Q5.r rVar : rVarArr) {
            String str = (String) rVar.a();
            Object b9 = rVar.b();
            if (b9 == null) {
                contentValues.putNull(str);
            } else if (b9 instanceof String) {
                contentValues.put(str, (String) b9);
            } else if (b9 instanceof Integer) {
                contentValues.put(str, (Integer) b9);
            } else if (b9 instanceof Long) {
                contentValues.put(str, (Long) b9);
            } else if (b9 instanceof Boolean) {
                contentValues.put(str, (Boolean) b9);
            } else if (b9 instanceof Float) {
                contentValues.put(str, (Float) b9);
            } else if (b9 instanceof Double) {
                contentValues.put(str, (Double) b9);
            } else if (b9 instanceof byte[]) {
                contentValues.put(str, (byte[]) b9);
            } else if (b9 instanceof Byte) {
                contentValues.put(str, (Byte) b9);
            } else if (b9 instanceof Short) {
                contentValues.put(str, (Short) b9);
            } else {
                throw new IllegalArgumentException("Illegal value type " + b9.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return contentValues;
    }
}
