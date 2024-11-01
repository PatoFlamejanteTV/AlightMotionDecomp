package K6;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public interface n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f5058a = new a();

    /* loaded from: classes5.dex */
    final class a implements n {
        a() {
        }

        @Override // K6.n
        public List lookup(String str) {
            if (str != null) {
                try {
                    return Arrays.asList(InetAddress.getAllByName(str));
                } catch (NullPointerException e8) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e8);
                    throw unknownHostException;
                }
            }
            throw new UnknownHostException("hostname == null");
        }
    }

    List lookup(String str);
}
