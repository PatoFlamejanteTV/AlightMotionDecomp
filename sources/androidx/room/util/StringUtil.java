package androidx.room.util;

import R5.AbstractC1435t;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.room.Room;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class StringUtil {
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    public static final void appendPlaceholders(StringBuilder builder, int i8) {
        AbstractC3292y.i(builder, "builder");
        for (int i9 = 0; i9 < i8; i9++) {
            builder.append("?");
            if (i9 < i8 - 1) {
                builder.append(",");
            }
        }
    }

    public static /* synthetic */ void getEMPTY_STRING_ARRAY$annotations() {
    }

    public static final String joinIntoString(List<Integer> list) {
        if (list != null) {
            return AbstractC1435t.w0(list, ",", null, null, 0, null, null, 62, null);
        }
        return null;
    }

    public static final StringBuilder newStringBuilder() {
        return new StringBuilder();
    }

    public static final List<Integer> splitToIntList(String str) {
        List r02;
        Integer num;
        if (str == null || (r02 = n.r0(str, new char[]{','}, false, 0, 6, null)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = r02.iterator();
        while (it.hasNext()) {
            try {
                num = Integer.valueOf(Integer.parseInt((String) it.next()));
            } catch (NumberFormatException e8) {
                Log.e(Room.LOG_TAG, "Malformed integer list", e8);
                num = null;
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }
}
