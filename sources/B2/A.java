package B2;

import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONException;
import org.json.JSONObject;
import x2.C4208b;

/* loaded from: classes4.dex */
public abstract class A {
    public static final JSONObject a(H h8) {
        String str;
        AbstractC3292y.i(h8, "<this>");
        String str2 = (String) h8.a();
        if (str2 != null) {
            try {
                return new JSONObject(str2);
            } catch (JSONException e8) {
                int b9 = h8.b();
                z d8 = h8.d();
                List c8 = h8.c("Content-Type");
                if (c8 != null) {
                    str = (String) AbstractC1435t.o0(c8);
                } else {
                    str = null;
                }
                throw new C4208b(null, null, 0, l6.n.e("\n                    Exception while parsing response body.\n                      Status code: " + b9 + "\n                      Request-Id: " + d8 + "\n                      Content-Type: " + str + "\n                      Body: \"" + str2 + "\"\n                "), e8, 7, null);
            }
        }
        return new JSONObject();
    }
}
